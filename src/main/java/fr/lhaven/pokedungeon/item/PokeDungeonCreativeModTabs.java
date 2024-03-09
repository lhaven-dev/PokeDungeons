package fr.lhaven.pokedungeon.item;

import fr.lhaven.pokedungeon.PokeDungeon;
import fr.lhaven.pokedungeon.block.PokeDungeonBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class PokeDungeonCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PokeDungeon.MODID);

    public static final RegistryObject<CreativeModeTab> POKEDUNGEON_TAB = CREATIVE_MODE_TABS.register("pokedungeon_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(PokeDungeonItems.POKEKEY_ITEM.get()))
                    .title(Component.translatable("PokeDungeon"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(PokeDungeonItems.POKEKEY_ITEM.get());
                        pOutput.accept(new ItemStack(PokeDungeonBlocks.POKELOOT_POKEBALL_BLOCK.get()));
                    })
                    .build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

