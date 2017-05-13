package me.robert.bt.items.tools;

import me.robert.bt.util.Reference;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;

public class ItemModPickaxe extends ItemPickaxe {

	public ItemModPickaxe(ToolMaterial material, String unlocalizedName) {
		super(material);
		unlocalizedName += "_pickaxe";
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}
}
