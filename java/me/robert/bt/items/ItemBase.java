package me.robert.bt.items;

import me.robert.bt.init.ModItems;
import net.minecraft.item.Item;

public class ItemBase extends Item {

	public ItemBase(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
	}

	public String getName() {
		return this.getUnlocalizedName().substring(5);
	}
}
