package me.robert.bt.init;

import me.robert.bt.blocks.BlockBase;
import me.robert.bt.blocks.ores.BlockOreCopper;
import me.robert.bt.blocks.ores.BlockOreTin;
import me.robert.bt.util.Reference;
import me.robert.bt.util.Utils;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModOres {

	public static BlockBase ore_copper, ore_tin;

	public static void init() {
		ore_copper = new BlockOreCopper("ore_copper");
		ore_tin = new BlockOreTin("ore_tin");
	}

	public static void registerBlocks() {
		registerBlock(ore_copper);
		registerBlock(ore_tin);
	}

	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		Utils.getLogger().info(String.format("Registered block: %s", block.getUnlocalizedName().substring(5)));
	}

	public static void registerRenders() {
		registerRender(ore_copper);
		registerRender(ore_tin);
	}

	public static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(
				new ResourceLocation(Reference.MOD_ID, block.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Registered render for " + block.getUnlocalizedName().substring(5));
	}
}
