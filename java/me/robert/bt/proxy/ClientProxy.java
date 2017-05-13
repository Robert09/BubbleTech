package me.robert.bt.proxy;

import me.robert.bt.init.ModBlocks;
import me.robert.bt.init.ModItems;
import me.robert.bt.init.ModTools;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders() {
		ModItems.registerRenders();
		ModTools.registerRenders();
		ModBlocks.registerRenders();
	}
}
