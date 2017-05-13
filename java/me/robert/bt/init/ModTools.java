package me.robert.bt.init;

import me.robert.bt.items.ItemBase;
import me.robert.bt.items.ItemSoulStealer;
import me.robert.bt.items.tools.ItemModAxe;
import me.robert.bt.items.tools.ItemModHoe;
import me.robert.bt.items.tools.ItemModPickaxe;
import me.robert.bt.items.tools.ItemModSpade;
import me.robert.bt.items.tools.ItemModSword;
import me.robert.bt.util.Reference;
import me.robert.bt.util.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTools {

	/*
	 * WOOD(0, 59, 2.0F, 0.0F, 15) STONE(1, 131, 4.0F, 1.0F, 5) IRON(2, 250,
	 * 6.0F, 2.0F, 14) DIAMOND(3, 1561, 8.0F, 3.0F, 10) GOLD(0, 32, 12.0F, 0.0F,
	 * 22);
	 */

	public static final ToolMaterial MATERIAL_TIN = EnumHelper.addToolMaterial(Reference.MOD_ID + ":tin", 1, 250, 5.0f,
			1.5f, 22);

	public static final ToolMaterial MATERIAL_COPPER = EnumHelper.addToolMaterial(Reference.MOD_ID + ":copper", 1, 350,
			6.0f, 2.0f, 22);

	/* - AXE - */
	public static ItemModAxe copper_axe, tin_axe;

	/* - HOE - */
	public static ItemHoe copper_hoe, tin_hoe;

	/* - PICKAXE - */
	public static ItemPickaxe copper_pickaxe, tin_pickaxe;

	/* - SPADE - */
	public static ItemSpade copper_spade, tin_spade;

	/* - SWORD - */
	public static ItemSword copper_sword, tin_sword;

	public static ItemSoulStealer soulstealer;

	public static void init() {
		copper_axe = new ItemModAxe(MATERIAL_COPPER, "copper");
		tin_axe = new ItemModAxe(MATERIAL_TIN, "tin");

		copper_hoe = new ItemModHoe(MATERIAL_COPPER, "copper");
		tin_hoe = new ItemModHoe(MATERIAL_TIN, "tin");

		copper_pickaxe = new ItemModPickaxe(MATERIAL_COPPER, "copper");
		tin_pickaxe = new ItemModPickaxe(MATERIAL_TIN, "tin");

		copper_spade = new ItemModSpade(MATERIAL_COPPER, "copper");
		tin_spade = new ItemModSpade(MATERIAL_TIN, "tin");

		copper_sword = new ItemModSword(MATERIAL_COPPER, "copper");
		tin_sword = new ItemModSword(MATERIAL_TIN, "tin");

		soulstealer = new ItemSoulStealer("soulstealer");
	}

	public static void registerTools() {
		registerItem(tin_axe);
		registerItem(tin_hoe);
		registerItem(tin_pickaxe);
		registerItem(tin_spade);
		registerItem(tin_sword);

		registerItem(soulstealer);
	}

	public static void registerRenders() {
		registerRender(tin_axe);
		registerRender(tin_hoe);
		registerRender(tin_pickaxe);
		registerRender(tin_spade);
		registerRender(tin_sword);

		registerRender(soulstealer);
	}

	public static void registerItem(Item item) {
		GameRegistry.register(item);
		Utils.getLogger().info(String.format("Registered the tool: %s", item.getUnlocalizedName().substring(5)));
	}

	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(
						new ResourceLocation(Reference.MOD_ID, "tools/" + item.getUnlocalizedName().substring(5)),
						"inventory"));
		Utils.getLogger().info(String.format("Registered render for tool: %s", item.getUnlocalizedName().substring(5)));
	}
}
