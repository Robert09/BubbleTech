package me.robert.bt.init;

import me.robert.bt.blocks.BlockBase;
import me.robert.bt.blocks.ores.BlockOreCopper;
import me.robert.bt.blocks.ores.BlockOreTin;
import me.robert.bt.util.Reference;
import me.robert.bt.util.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static void init() {
	}

	public static void registerBlocks() {
	}

	public static void registerBlock(BlockBase block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		Utils.getLogger().info(String.format("Registered block: %s", block.getName()));
	}

	public static void registerRenders() {
	}

	public static void registerRender(BlockBase block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(
				new ResourceLocation(Reference.MOD_ID, block.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info(String.format("Registered render block: %s", block.getName()));
	}
}
