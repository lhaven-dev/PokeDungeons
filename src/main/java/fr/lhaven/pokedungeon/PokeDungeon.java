package fr.lhaven.pokedungeon;

import com.mojang.logging.LogUtils;
import fr.lhaven.pokedungeon.block.PokeDungeonBlocks;
import fr.lhaven.pokedungeon.item.PokeDungeonCreativeModTabs;
import fr.lhaven.pokedungeon.item.PokeDungeonItems;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;
import thedarkcolour.kotlinforforge.KotlinModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PokeDungeon.MODID)
public class PokeDungeon {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "pokedungeon";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "pokedungeon" namespace

    public PokeDungeon() {
        IEventBus modEventBus = KotlinModLoadingContext.Companion.get().getKEventBus();

      PokeDungeonCreativeModTabs.register(modEventBus);

        PokeDungeonItems.register(modEventBus);
        PokeDungeonBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == PokeDungeonCreativeModTabs.POKEDUNGEON_TAB.getKey()) {
            event.accept(PokeDungeonItems.POKEKEY_ITEM.get());
            event.accept(PokeDungeonBlocks.POKELOOT_POKEBALL_BLOCK.get());
        }
    }
    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)

    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
