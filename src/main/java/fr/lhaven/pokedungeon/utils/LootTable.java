package fr.lhaven.pokedungeon.utils;

import com.cobblemon.mod.common.CobblemonItems;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class LootTable {

    public static final List<ItemStack> EVOLUTION = new ArrayList<>();
    public  static final List<ItemStack> POKEBALLS = new ArrayList<>();
    public  static final List<ItemStack> HELD_ITEMS = new ArrayList<>();



   public LootTable () {

   }
    public static ItemStack getLoot() {
        return randomable(EVOLUTION);
   }

    public static ItemStack getEvolution() {
        EVOLUTION.add(new ItemStack(CobblemonItems.DAWN_STONE));
        EVOLUTION.add(new ItemStack(CobblemonItems.DUSK_STONE));
        EVOLUTION.add(new ItemStack(CobblemonItems.FIRE_STONE));
        EVOLUTION.add(new ItemStack(CobblemonItems.LEAF_STONE));
        EVOLUTION.add(new ItemStack(CobblemonItems.MOON_STONE));
        EVOLUTION.add(new ItemStack(CobblemonItems.SUN_STONE));
        EVOLUTION.add(new ItemStack(CobblemonItems.THUNDER_STONE));
        EVOLUTION.add(new ItemStack(CobblemonItems.WATER_STONE));
        EVOLUTION.add(new ItemStack(CobblemonItems.OVAL_STONE));
        EVOLUTION.add(new ItemStack(CobblemonItems.SHINY_STONE));
        return randomable(EVOLUTION);

    }

    public static ItemStack getPokeBalls() {
        POKEBALLS.add(new ItemStack(CobblemonItems.POKE_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.GREAT_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.ULTRA_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.MASTER_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.DUSK_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.QUICK_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.REPEAT_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.DIVE_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.NEST_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.LUXURY_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.PREMIER_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.DREAM_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.HEAL_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.QUICK_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.SAFARI_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.SPORT_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.FAST_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.LEVEL_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.LURE_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.HEAVY_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.LOVE_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.FRIEND_BALL));
        POKEBALLS.add(new ItemStack(CobblemonItems.MOON_BALL));
      return randomable(POKEBALLS);
    }

    public static ItemStack getHeldItems() {
        HELD_ITEMS.add(new ItemStack(CobblemonItems.BIG_ROOT));
        HELD_ITEMS.add(new ItemStack(CobblemonItems.BRIGHT_POWDER));
        HELD_ITEMS.add(new ItemStack(CobblemonItems.CHARCOAL));
        HELD_ITEMS.add(new ItemStack(CobblemonItems.DESTINY_KNOT));
        HELD_ITEMS.add(new ItemStack(CobblemonItems.EVERSTONE));
        HELD_ITEMS.add(new ItemStack(CobblemonItems.EXP_SHARE));
        HELD_ITEMS.add(new ItemStack(CobblemonItems.FOCUS_BAND));
        HELD_ITEMS.add(new ItemStack(CobblemonItems.LEFTOVERS));
        HELD_ITEMS.add(new ItemStack(CobblemonItems.LIGHT_CLAY));
        HELD_ITEMS.add(new ItemStack(CobblemonItems.LUCKY_EGG));
        HELD_ITEMS.add(new ItemStack(CobblemonItems.MAGNET));
        HELD_ITEMS.add(new ItemStack(CobblemonItems.METAL_COAT));
        HELD_ITEMS.add(new ItemStack(CobblemonItems.MIRACLE_SEED));
        HELD_ITEMS.add(new ItemStack(CobblemonItems.MYSTIC_WATER));
        HELD_ITEMS.add(new ItemStack(CobblemonItems.NEVER_MELT_ICE));
        HELD_ITEMS.add(new ItemStack(CobblemonItems.POISON_BARB));

        return randomable(HELD_ITEMS);
    }
    private static ItemStack randomable(List<ItemStack> collection) {


      int size = collection.size();
        int index = (int) (Math.random() * size);
        ItemStack itemStack = collection.get(index);
        System.out.print("Item: " + itemStack.getDisplayName() + " Index: " + index + " Size: " + size);
        System.out.print("Item: " + itemStack.getDisplayName() + " Index: " + index + " Size: " + size);
        System.out.print("Item: " + itemStack.getDisplayName() + " Index: " + index + " Size: " + size);
        System.out.print("Item: " + itemStack.getDisplayName() + " Index: " + index + " Size: " + size);
        System.out.print("Item: " + itemStack.getDisplayName() + " Index: " + index + " Size: " + size);
        System.out.print("Item: " + itemStack.getDisplayName() + " Index: " + index + " Size: " + size);
        System.out.print("Item: " + itemStack.getDisplayName() + " Index: " + index + " Size: " + size);


        return itemStack;
    }
}


