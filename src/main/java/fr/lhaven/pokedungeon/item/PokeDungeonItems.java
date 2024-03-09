package fr.lhaven.pokedungeon.item;

import fr.lhaven.pokedungeon.PokeDungeon;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PokeDungeonItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PokeDungeon.MODID);
    public static final RegistryObject<Item> POKEKEY_ITEM = ITEMS.register("pokekey",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
