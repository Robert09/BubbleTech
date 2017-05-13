package me.robert.bt.items;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Sets;

import me.robert.bt.util.Reference;
import me.robert.bt.util.Utils;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSoulStealer extends ItemTool {

	private final static Set<Block> EFFICTIVE_BLOCKS = Sets.newHashSet(new Block[] {});

	public ItemSoulStealer(String unlocalizedName) {
		super(EnumHelper.addToolMaterial(Reference.MOD_ID + ":soul_stealer", 0, 100, 0, 1, 0), EFFICTIVE_BLOCKS);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		super.addInformation(stack, playerIn, tooltip, advanced);
		tooltip.add(TextFormatting.RED + "" + TextFormatting.BOLD + Utils.getLang().localize("soulstealer.tooltip"));
	}
}
