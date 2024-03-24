package fr.lhaven.pokedungeon.block.entity;

import com.cobblemon.mod.common.CobblemonSounds;
import fr.lhaven.pokedungeon.item.PokeDungeonItems;
import fr.lhaven.pokedungeon.utils.LootTable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;


public class LootBallLegendary extends BaseEntityBlock implements SimpleWaterloggedBlock {


    public static final VoxelShape SHAPE = Block.box(6, 0, 6, 11, 5, 11);
    public static DirectionProperty FACING = DirectionProperty.create("facing",
            Direction.NORTH,
            Direction.EAST,
            Direction.SOUTH,
            Direction.WEST);
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;


    public LootBallLegendary(Properties pProperties) {
        super(pProperties);
}
    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
}
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        boolean isWatter = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER; // check if the block is waterlogged
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(BlockStateProperties.WATERLOGGED, isWatter);
    }
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
        builder.add(WATERLOGGED);
        super.createBlockStateDefinition(builder);

    }
    @Override
    public RenderShape getRenderShape(BlockState pstate) {
        return RenderShape.MODEL;
    }

    public InteractionResult use(BlockState pState , Level plevel , BlockPos pPos , Player pPlayer , InteractionHand pHand , BlockHitResult pHit){ {

        //on click of the block
        pPlayer.displayClientMessage(Component.nullToEmpty("You found a Legendary Loot !"), true);
        plevel.removeBlock(pPos, false);

        pPlayer.playSound(CobblemonSounds.GUI_CLICK, 1.0F, 1.0F);
        plevel.addParticle(ParticleTypes.WAX_OFF , pPos.getX()+0.5, pPos.getY()+0.5, pPos.getZ()+0.5, 0.5D, 0.5D, 0.5D);

// Give the player a random item from the loot table
        ItemStack PokeballStack = LootTable.GetLegendary();

            pPlayer.drop(PokeballStack, false);


       int random = (int) (Math.random() * 100);
       if (random < 5) {
          ItemStack keystack = new ItemStack(PokeDungeonItems.POKEKEY_ITEM.get(), 1);
         pPlayer.drop(keystack , false);
      }
    }
        return InteractionResult.SUCCESS;
    }

    public FluidState getFluidState(BlockState state) {
        return state.getValue(BlockStateProperties.WATERLOGGED) ? Fluids.WATER.getSource(false) : Fluids.EMPTY.defaultFluidState();
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return null;
    }
}
