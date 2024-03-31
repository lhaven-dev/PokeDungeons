package fr.lhaven.pokedungeon.block.custom;


import com.cobblemon.mod.common.Cobblemon;
import com.cobblemon.mod.common.api.spawning.CobblemonSpawnPools;
import com.cobblemon.mod.common.api.spawning.CobblemonSpawningProspector;
import com.cobblemon.mod.common.api.spawning.SpawnBucket;
import com.cobblemon.mod.common.api.spawning.SpawnLoader;
import com.cobblemon.mod.common.api.spawning.context.SpawningContext;
import com.cobblemon.mod.common.api.spawning.spawner.Spawner;
import com.cobblemon.mod.common.command.GivePokemon;
import com.cobblemon.mod.common.command.SpawnAllPokemon;
import com.cobblemon.mod.common.command.SpawnPokemon;
import fr.lhaven.pokedungeon.PokeDungeon;
import fr.lhaven.pokedungeon.item.PokeDungeonItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class LootBlock extends Block {

    public LootBlock(Properties pProperties ){
        super(pProperties);


    }


    @Override
    public InteractionResult use(BlockState pBlock, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pBlockHitResult ) {

     asItem().use(pLevel, pPlayer, pHand);
     if( pPlayer.getMainHandItem().is(PokeDungeonItems.POKEKEY_ITEM.get())){
         pPlayer.getMainHandItem().shrink(1);

         pPlayer.teleportTo(0, 100, 0);
    }
        return  InteractionResult.SUCCESS;
}
}



