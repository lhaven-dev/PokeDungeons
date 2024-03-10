package fr.lhaven.pokedungeon.block;

import fr.lhaven.pokedungeon.PokeDungeon;
import fr.lhaven.pokedungeon.block.custom.LootBlock;
import fr.lhaven.pokedungeon.block.entity.LootBall;
import fr.lhaven.pokedungeon.item.PokeDungeonItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class PokeDungeonBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PokeDungeon.MODID);

    public static final RegistryObject<Block> POKELOOT_POKEBALL_BLOCK = registerBlock("pokeloot",
            () -> new LootBlock(BlockBehaviour.Properties.copy(Blocks.BEDROCK).sound(SoundType.EMPTY)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return PokeDungeonItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static final RegistryObject<Block> LOOT_BALL = registerBlock("lootball",
            () -> new LootBall(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }}