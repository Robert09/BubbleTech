package me.robert.bt.handlers;

import me.robert.bt.init.ModItems;
import me.robert.bt.init.ModOres;
import me.robert.bt.init.ModTools;
import me.robert.bt.util.Utils;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {

	public static void registerCraftingRecipes() {
		GameRegistry.addRecipe(new ItemStack(ModTools.soulstealer),
				new Object[] { "SAS", "ADA", "SAS", 'S', Items.STICK, 'A', Items.STRING, 'D', Items.DIAMOND });
		registerToolRecipe(ModItems.ingot_tin, ModTools.tin_axe, ModTools.tin_hoe, ModTools.tin_pickaxe,
				ModTools.tin_spade, ModTools.tin_sword);
		Utils.getLogger().info("Registered crafting recipes");
	}

	public static void registerSmeltingRecipes() {
		GameRegistry.addSmelting(ModOres.ore_copper, new ItemStack(ModItems.ingot_copper), 0.7f);
		GameRegistry.addSmelting(ModOres.ore_tin, new ItemStack(ModItems.ingot_tin), 0.7f);
		Utils.getLogger().info("Registered smelting recipes");
	}

	private static void registerToolRecipe(Item ingot, Item axe, Item hoe, Item pickaxe, Item spade, Item sword) {
		GameRegistry.addRecipe(new ItemStack(axe), new Object[] { "II ", "IS ", " S ", 'S', Items.STICK, 'I', ingot });
		GameRegistry.addRecipe(new ItemStack(axe), new Object[] { " II", " SI", " S ", 'S', Items.STICK, 'I', ingot });
		GameRegistry.addRecipe(new ItemStack(hoe), new Object[] { "II ", " S ", " S ", 'S', Items.STICK, 'I', ingot });
		GameRegistry.addRecipe(new ItemStack(hoe), new Object[] { " II", " S ", " S ", 'S', Items.STICK, 'I', ingot });
		GameRegistry.addRecipe(new ItemStack(pickaxe),
				new Object[] { "III", " S ", " S ", 'S', Items.STICK, 'I', ingot });
		GameRegistry.addRecipe(new ItemStack(spade), new Object[] { "I", "S", "S", 'S', Items.STICK, 'I', ingot });
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] { "I", "I", "S", 'S', Items.STICK, 'I', ingot });
	}
}
