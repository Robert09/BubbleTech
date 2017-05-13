package me.robert.bt.items.tools;

import me.robert.bt.util.Reference;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;

public class ItemModSword extends ItemSword {

	public ItemModSword(ToolMaterial material, String unlocalizedName) {
		super(material);
		unlocalizedName += "_sword";
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}
}
