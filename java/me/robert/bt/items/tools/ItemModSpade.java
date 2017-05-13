package me.robert.bt.items.tools;

import me.robert.bt.util.Reference;
import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;

public class ItemModSpade extends ItemSpade {

	public ItemModSpade(ToolMaterial material, String unlocalizedName) {
		super(material);
		unlocalizedName += "_spade";
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}
}
