package me.robert.bt.init;

import me.robert.bt.items.ItemBase;
import me.robert.bt.items.ItemHeart;
import me.robert.bt.items.ItemIngotCopper;
import me.robert.bt.items.ItemIngotTin;
import me.robert.bt.util.Reference;
import me.robert.bt.util.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	/* - Ingots - */
	public static ItemBase ingot_copper, ingot_tin;

	/* - Misc - */
	public static ItemBase heart;

	public static void init() {
		ingot_copper = new ItemIngotCopper("ingot_copper");
		ingot_tin = new ItemIngotTin("ingot_tin");

		heart = new ItemHeart("heart");
	}

	public static void registerItems() {
		registerItem(ingot_copper);
		registerItem(ingot_tin);

		registerItem(heart);
	}

	public static void registerRenders() {
		registerRender(ingot_copper);
		registerRender(ingot_tin);

		registerRender(heart);
	}

	public static void registerItem(ItemBase item) {
		GameRegistry.register(item);
		Utils.getLogger().info(String.format("Registered the item: %s", item.getName()));
	}

	public static void registerRender(ItemBase item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(
				new ResourceLocation(Reference.MOD_ID, item.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info(String.format("Registered render for item: %s", item.getName()));
	}
}
