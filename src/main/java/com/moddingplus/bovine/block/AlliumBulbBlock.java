/* =====================================================================
 * This class is distributed as part of the Bovine Mod.
 * Get the Source Code on github: https://github.com/Modding-Plus/Bovine
 *
 * Bovine is Open Source and distributed under the
 * MIT License: https://opensource.org/licenses/MIT
 *
 * File: AlliumBulbBlock.java
 * Date: 2020-01-24
 * Revision:
 * Author: Trikzon
 * ===================================================================== */
package com.moddingplus.bovine.block;

import com.moddingplus.bovine.Bovine;
import com.moddingplus.bovine.registry.BovineObjects;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.*;

import javax.annotation.Nullable;
import java.util.Random;

public class AlliumBulbBlock extends Block implements IWaterLoggable
{
    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    public static final IntegerProperty BULBS_1_3 = IntegerProperty.create("bulbs", 1, 3);
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    protected static VoxelShape UP_SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 8.0D, 14.0D);
    protected static VoxelShape DOWN_SHAPE = Block.makeCuboidShape(2.0D, 8.0D, 2.0D, 14.0D, 16.0D, 14.0D);
    protected static VoxelShape EAST_SHAPE = Block.makeCuboidShape(0.0D, 2.0D, 2.0D, 8.0, 14.0D, 14.0D);
    protected static VoxelShape SOUTH_SHAPE = Block.makeCuboidShape(2.0D, 2.0D, 0.0D, 14.0, 14.0D, 8.0D);
    protected static VoxelShape WEST_SHAPE = Block.makeCuboidShape(8.0D, 2.0D, 2.0D, 16.0, 14.0D, 14.0D);
    protected static VoxelShape NORTH_SHAPE = Block.makeCuboidShape(2.0D, 2.0D, 8.0D, 14.0, 14.0D, 16.0D);

    public AlliumBulbBlock()
    {
        // TODO(Trikzon): Hardness and Resistance
        super(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.25F).sound(SoundType.CLOTH));
        this.setRegistryName(new ResourceLocation(Bovine.MOD_ID, "allium_bulb"));
        this.setDefaultState(
                this.stateContainer.getBaseState()
                        .with(FACING, Direction.UP)
                        .with(BULBS_1_3, 1)
                        .with(WATERLOGGED, false)
        );
    }

    /**
     * Returns the blockstate with the given rotation from the passed blockstate. If inapplicable, returns the passed
     * blockstate.
     *
     * @deprecated call via IBlockState#withRotation(Rotation) whenever possible. Implementing/overriding is
     * fine.
     */
    @Override
    public BlockState rotate(BlockState state, Rotation rotation)
    {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    /**
     * Returns the blockstate with the given mirror of the passed blockstate. If inapplicable, returns the passed
     * blockstate.
     *
     * @deprecated call via @link IBlockState#withMirror(Mirror) whenever possible. Implementing/overriding is fine.
     */
    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn)
    {
        return state.with(FACING, mirrorIn.mirror(state.get(FACING)));
    }

    // TODO: Make custom shape
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context)
    {
        int bulbCount = state.get(BULBS_1_3);
        Direction direction = state.get(FACING);

        switch (direction)
        {
            case DOWN:
                return DOWN_SHAPE;
            case EAST:
                return EAST_SHAPE;
            case SOUTH:
                return SOUTH_SHAPE;
            case WEST:
                return WEST_SHAPE;
            case NORTH:
                return NORTH_SHAPE;
            default:
                return UP_SHAPE;
        }
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        return getDefaultState().with(FACING, context.getFace()).with(BULBS_1_3, 1);
    }

    @Override
    public boolean onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult rayTraceResult)
    {
        ItemStack heldItem = player.getHeldItem(hand);
        if (heldItem.getItem() != BovineObjects.Items.ALLIUM_BULB) return false;

        int bulbCount = state.get(BULBS_1_3);
        if (bulbCount >= 3) return false;

        world.playSound(player, pos, SoundEvents.BLOCK_WOOL_PLACE, SoundCategory.BLOCKS, 1.0f, 1.0f);
        world.setBlockState(pos, state.with(BULBS_1_3, state.get(BULBS_1_3) + 1));
        // DESCISION: Do I want it to break if it isn't a valid position and you increase the bulb count?
//        if (!isValidPosition(state, world, pos)) {
//            world.destroyBlock(pos, world.getGameRules().get(GameRules.DO_TILE_DROPS).get());
//        }
        if (!player.isCreative()) heldItem.shrink(1);
        return true;
    }

    // TODO(all): Could make it emit particles like an end rod

    /**
     * Called periodically clientside on blocks near the player to show effects (like furnace fire particles). Note that
     * this method is unrelated to randomTick and #needsRandomTick, and will always be called regardless
     * of whether the block can receive random update ticks
     */
    @Override
    public void animateTick(BlockState p_180655_1_, World p_180655_2_, BlockPos p_180655_3_, Random p_180655_4_)
    {
        super.animateTick(p_180655_1_, p_180655_2_, p_180655_3_, p_180655_4_);
    }

    /**
     * Gets the render layer this block will render on. SOLID for solid blocks, CUTOUT or CUTOUT_MIPPED for on-off
     * transparency (glass, reeds), TRANSLUCENT for fully blended transparency (stained glass)
     */
    @Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        super.fillStateContainer(builder);
        builder.add(FACING, BULBS_1_3, WATERLOGGED);
    }

    /**
     * @deprecated call via IBlockState#getMobilityFlag() whenever possible. Implementing/overriding is fine.
     */
    @Override
    public PushReaction getPushReaction(BlockState p_149656_1_)
    {
        return PushReaction.DESTROY;
    }

    @Override
    public IFluidState getFluidState(BlockState state)
    {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }

    // TODO(Trikzon): Make it so it breaks if not on a block
    @Override
    public boolean isValidPosition(BlockState state, IWorldReader world, BlockPos pos)
    {
        Direction direction = state.get(FACING);
        BlockPos posOn = pos.offset(direction.getOpposite());
        return !(world.getBlockState(posOn).getCollisionShape(world, posOn).project(direction).isEmpty());
    }

    /**
     * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
     * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
     * returns its solidified counterpart.
     * Note that this method should ideally consider only the specific face passed in.
     */
    @Override
    public BlockState updatePostPlacement(BlockState state, Direction direction, BlockState facingState, IWorld world, BlockPos currentPos, BlockPos facingPos)
    {
        if (!state.isValidPosition(world, currentPos))
        {
            // TODO: See if this is needed. (once drops are implemented)
            world.destroyBlock(currentPos, true);
            return Blocks.AIR.getDefaultState();
        }
        return super.updatePostPlacement(state, direction, facingState, world, currentPos, facingPos);
    }
}