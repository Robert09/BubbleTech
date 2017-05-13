package me.robert.bt.blocks;

import me.robert.bt.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockBase extends Block {

	public BlockBase(String unlocalizedName, Material material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
		this.setHardness(20); // Sets how hard the block is to break
		this.setResistance(20); // Sets the blocks blast resitance to explosions
	}

	public String getName() {
		return this.getUnlocalizedName().substring(5);
	}
}
