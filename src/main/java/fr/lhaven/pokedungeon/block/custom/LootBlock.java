package fr.lhaven.pokedungeon.block.custom;

import com.cobblemon.mod.common.CobblemonItems;
import com.cobblemon.mod.common.CobblemonSounds;
import com.cobblemon.mod.common.api.tags.CobblemonItemTags;
import com.cobblemon.mod.common.item.PokeBallItem;
import fr.lhaven.pokedungeon.item.PokeDungeonItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
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
      pPlayer.displayClientMessage(Component.nullToEmpty("You found a loot block!"), true);
        plevel.setBlock(pPos, Blocks.AIR.defaultBlockState(), 3);
        pPlayer.playSound(CobblemonSounds.GUI_CLICK, 1.0F, 1.0F);
        ItemStack keystack = new ItemStack(PokeDungeonItems.POKEKEY_ITEM.get(), 1);
        ItemStack cobblemonStack = new ItemStack(CobblemonItems.DAWN_STONE, 1);
        pPlayer.getInventory().add(keystack);
        pPlayer.getInventory().add(cobblemonStack);

       return InteractionResult.SUCCESS;

 
    }


}}

