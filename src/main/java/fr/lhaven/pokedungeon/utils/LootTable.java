package fr.lhaven.pokedungeon.utils;

import com.cobblemon.mod.common.CobblemonItems;
import fr.lhaven.pokedungeon.item.PokeDungeonItems;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class LootTable {
    public  static final List<ItemStack> RARE = new ArrayList<>();
    public  static final List<ItemStack> COMMON = new ArrayList<>();
    public  static final List<ItemStack> EPIC = new ArrayList<>();
    public  static final List<ItemStack> LEGENDARY = new ArrayList<>();

   public LootTable () {

   }

    public static ItemStack GetCommon() {
        COMMON.add(new ItemStack(CobblemonItems.X_SP_DEF));
        COMMON.add(new ItemStack(CobblemonItems.X_SP_ATK));
        COMMON.add(new ItemStack(CobblemonItems.X_SPEED));
        COMMON.add(new ItemStack(CobblemonItems.X_ATTACK));
        COMMON.add(new ItemStack(CobblemonItems.X_DEFENSE));
        COMMON.add(new ItemStack(CobblemonItems.X_ACCURACY));
        COMMON.add(new ItemStack(CobblemonItems.EXPERIENCE_CANDY_XS));
        COMMON.add(new ItemStack(CobblemonItems.BLACK_APRICORN));
        COMMON.add(new ItemStack(CobblemonItems.BLUE_APRICORN));
        COMMON.add(new ItemStack(CobblemonItems.GREEN_APRICORN));
        COMMON.add(new ItemStack(CobblemonItems.PINK_APRICORN));
        COMMON.add(new ItemStack(CobblemonItems.RED_APRICORN));
        COMMON.add(new ItemStack(CobblemonItems.WHITE_APRICORN));
        COMMON.add(new ItemStack(CobblemonItems.BERRY_JUICE));
        COMMON.add(new ItemStack(CobblemonItems.ORAN_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.POTION));
        COMMON.add(new ItemStack(CobblemonItems.BABIRI_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.CHARTI_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.CHERI_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.CHESTO_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.CHILAN_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.COBA_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.COLBUR_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.CORNN_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.CUSTAP_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.DURIN_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.ENIGMA_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.FIGY_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.GANLON_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.GREPA_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.HABAN_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.HONDEW_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.IAPAPA_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.JABOCA_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.KASIB_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.KEBIA_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.KELPSY_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.LANSAT_BERRY));
        COMMON.add(new ItemStack(CobblemonItems.LEPPA_BERRY));

        return randomable(COMMON);
    }

    public static ItemStack GetRare() {
       RARE.add(new ItemStack(CobblemonItems.SUPER_POTION));
         RARE.add(new ItemStack(CobblemonItems.HYPER_POTION));
            RARE.add(new ItemStack(CobblemonItems.REMEDY));
            RARE.add(new ItemStack(CobblemonItems.FULL_HEAL));
            RARE.add(new ItemStack(CobblemonItems.BEAST_BALL));
            RARE.add(new ItemStack(CobblemonItems.LUXURY_BALL));
            RARE.add(new ItemStack(CobblemonItems.PREMIER_BALL));
            RARE.add(new ItemStack(CobblemonItems.DREAM_BALL));
            RARE.add(new ItemStack(CobblemonItems.HEAL_BALL));
            RARE.add(new ItemStack(CobblemonItems.QUICK_BALL));
            RARE.add(new ItemStack(CobblemonItems.SAFARI_BALL));
            RARE.add(new ItemStack(CobblemonItems.SPORT_BALL));
            RARE.add(new ItemStack(CobblemonItems.FAST_BALL));
            RARE.add(new ItemStack(CobblemonItems.LEVEL_BALL));
            RARE.add(new ItemStack(CobblemonItems.LURE_BALL));
            RARE.add(new ItemStack(CobblemonItems.HEAVY_BALL));
            RARE.add(new ItemStack(CobblemonItems.LOVE_BALL));
            RARE.add(new ItemStack(CobblemonItems.FRIEND_BALL));
            RARE.add(new ItemStack(CobblemonItems.MOON_BALL));
            RARE.add(new ItemStack(CobblemonItems.BIG_ROOT));
            RARE.add(new ItemStack(CobblemonItems.BRIGHT_POWDER));
            RARE.add(new ItemStack(CobblemonItems.REVIVE));

        return randomable(RARE);
    }

    public static ItemStack GetEpic() {
        EPIC.add(new ItemStack(CobblemonItems.MAX_POTION));
        EPIC.add(new ItemStack(CobblemonItems.FULL_RESTORE));
        EPIC.add(new ItemStack(CobblemonItems.MAX_REVIVE));
        EPIC.add(new ItemStack(CobblemonItems.ETHER));
        EPIC.add(new ItemStack(CobblemonItems.MAX_ETHER));
        EPIC.add(new ItemStack(CobblemonItems.ELIXIR));
        EPIC.add(new ItemStack(CobblemonItems.MAX_ELIXIR));
        EPIC.add(new ItemStack(CobblemonItems.RARE_CANDY));
        EPIC.add(new ItemStack(CobblemonItems.PP_UP));
        EPIC.add(new ItemStack(CobblemonItems.PP_MAX));
        EPIC.add(new ItemStack(CobblemonItems.BERRY_JUICE));
        EPIC.add(new ItemStack(CobblemonItems.ORAN_BERRY));
        EPIC.add(new ItemStack(CobblemonItems.MAGNET));
        EPIC.add(new ItemStack(CobblemonItems.METAL_COAT));
        EPIC.add(new ItemStack(CobblemonItems.MIRACLE_SEED));
        EPIC.add(new ItemStack(CobblemonItems.MYSTIC_WATER));
        EPIC.add(new ItemStack(CobblemonItems.NEVER_MELT_ICE));
        EPIC.add(new ItemStack(CobblemonItems.POISON_BARB));
        EPIC.add(new ItemStack(CobblemonItems.CHARCOAL));

        return randomable(EPIC);
    }

    public static ItemStack GetLegendary() {
        LEGENDARY.add(new ItemStack(CobblemonItems.LIFE_ORB));
        LEGENDARY.add(new ItemStack(CobblemonItems.DESTINY_KNOT));
        LEGENDARY.add(new ItemStack(CobblemonItems.EVERSTONE));
        LEGENDARY.add(new ItemStack(CobblemonItems.EXP_SHARE));
        LEGENDARY.add(new ItemStack(CobblemonItems.FOCUS_BAND));
        LEGENDARY.add(new ItemStack(CobblemonItems.LEFTOVERS));
        LEGENDARY.add(new ItemStack(CobblemonItems.LIGHT_CLAY));
        LEGENDARY.add(new ItemStack(CobblemonItems.LUCKY_EGG));
        LEGENDARY.add(new ItemStack(CobblemonItems.ULTRA_BALL));
        LEGENDARY.add(new ItemStack(CobblemonItems.MASTER_BALL));
        LEGENDARY.add(new ItemStack(CobblemonItems.DAWN_STONE));
        LEGENDARY.add(new ItemStack(CobblemonItems.DUSK_STONE));
        LEGENDARY.add(new ItemStack(CobblemonItems.FIRE_STONE));
        LEGENDARY.add(new ItemStack(CobblemonItems.LEAF_STONE));
        LEGENDARY.add(new ItemStack(CobblemonItems.MOON_STONE));
        LEGENDARY.add(new ItemStack(CobblemonItems.SUN_STONE));
        LEGENDARY.add(new ItemStack(CobblemonItems.THUNDER_STONE));
        LEGENDARY.add(new ItemStack(CobblemonItems.WATER_STONE));
        LEGENDARY.add(new ItemStack(CobblemonItems.OVAL_STONE));
        LEGENDARY.add(new ItemStack(CobblemonItems.SHINY_STONE));
        LEGENDARY.add(new ItemStack(CobblemonItems.ADAMANT_MINT));
        LEGENDARY.add(new ItemStack(CobblemonItems.BOLD_MINT));
        LEGENDARY.add(new ItemStack(CobblemonItems.BRAVE_MINT));
        LEGENDARY.add(new ItemStack(CobblemonItems.CALM_MINT));
        LEGENDARY.add(new ItemStack(CobblemonItems.CAREFUL_MINT));
        LEGENDARY.add(new ItemStack(CobblemonItems.GENTLE_MINT));
        LEGENDARY.add(new ItemStack(CobblemonItems.HASTY_MINT));
        LEGENDARY.add(new ItemStack(CobblemonItems.IMPISH_MINT));
        LEGENDARY.add(new ItemStack(CobblemonItems.JOLLY_MINT));
        LEGENDARY.add(new ItemStack(CobblemonItems.LAX_MINT));
        LEGENDARY.add(new ItemStack(CobblemonItems.LONELY_MINT));
        LEGENDARY.add(new ItemStack(CobblemonItems.MILD_MINT));
        LEGENDARY.add(new ItemStack(CobblemonItems.MODEST_MINT));
        return randomable(LEGENDARY);
    }

    public static ItemStack GetKey() {
            return new ItemStack(PokeDungeonItems.POKEKEY_ITEM.get());
    }
        private static ItemStack randomable(List<ItemStack> collection) {
      int size = collection.size();
        int index = (int) (Math.random() * size);
        ItemStack itemStack = collection.get(index);
        return itemStack;
    }
}


