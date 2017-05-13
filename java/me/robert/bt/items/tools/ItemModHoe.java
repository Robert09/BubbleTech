package me.robert.bt.items.tools;

import me.robert.bt.util.Reference;
import net.minecraft.item.ItemHoe;
import net.minecraft.util.ResourceLocation;

public class ItemModHoe extends ItemHoe {

	public ItemModHoe(ToolMaterial material, String unlocalizedName) {
		super(material);
		unlocalizedName += "_hoe";
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}
}
