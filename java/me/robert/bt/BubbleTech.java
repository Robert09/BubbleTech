package me.robert.bt;

import me.robert.bt.handlers.EventHandlers;
import me.robert.bt.handlers.RecipeHandler;
import me.robert.bt.init.ModBlocks;
import me.robert.bt.init.ModItems;
import me.robert.bt.init.ModOres;
import me.robert.bt.init.ModTools;
import me.robert.bt.proxy.CommonProxy;
import me.robert.bt.util.Reference;
import me.robert.bt.util.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION)
public class BubbleTech {

	EventHandlers eventHandler = new EventHandlers();

	@Mod.Instance(Reference.MOD_ID)
	public BubbleTech instance;

	@SidedProxy(serverSide = Reference.COMMON_PROXY, clientSide = Reference.CLIENT_PROXY)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		ModTools.init();
		ModBlocks.init();
		ModOres.init();
		ModItems.registerItems();
		ModTools.registerTools();
		ModBlocks.registerBlocks();
		ModOres.registerBlocks();

		proxy.registerRenders();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		eventHandler.registerEvents();
		RecipeHandler.registerCraftingRecipes();
		RecipeHandler.registerSmeltingRecipes();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}
