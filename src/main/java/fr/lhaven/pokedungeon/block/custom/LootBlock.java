package fr.lhaven.pokedungeon.block.custom;

import com.cobblemon.mod.common.CobblemonSounds;
import fr.lhaven.pokedungeon.item.PokeDungeonItems;
import fr.lhaven.pokedungeon.utils.LootTable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class LootBlock extends Block {

    public LootBlock(Properties pProperties ){
        super(pProperties);

    }

    public InteractionResult use(BlockState pState , Level plevel , BlockPos pPos , Player pPlayer , InteractionHand pHand , BlockHitResult pHit){ {

   //on click of the block
      pPlayer.displayClientMessage(Component.nullToEmpty("You found a loot block!"), true);
      plevel.setBlock(pPos, Blocks.AIR.defaultBlockState(), 3);
      pPlayer.playSound(CobblemonSounds.GUI_CLICK, 1.0F, 1.0F);

        plevel.addParticle(ParticleTypes.WAX_OFF , pPos.getX(), pPos.getY()+1, pPos.getZ(), 0.5D, 0.5D, 0.5D);
// Loot
        ItemStack PokeballStack = LootTable.getPokeBalls();
        ItemStack EvolutionStack = LootTable.getEvolution();
        ItemStack HeldItemStack = LootTable.getHeldItems();
        ItemStack keystack = new ItemStack(PokeDungeonItems.POKEKEY_ITEM.get(), 1);
        pPlayer.getInventory().add(keystack);
        pPlayer.getInventory().add(HeldItemStack);
        pPlayer.getInventory().add(EvolutionStack);
        pPlayer.getInventory().add(PokeballStack);
        };

        return InteractionResult.SUCCESS;

 
    }

}



