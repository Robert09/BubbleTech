package me.robert.bt.items;

import java.util.List;

import me.robert.bt.util.Utils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class ItemHeart extends ItemBase {

	public ItemHeart(String unlocalizedName) {
		super(unlocalizedName);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		if (player.getHealth() < player.getMaxHealth()) {
			player.heal(2);
			player.getHeldItem(hand).shrink(1);
		}
		return super.onItemRightClick(world, player, hand);
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		super.addInformation(stack, playerIn, tooltip, advanced);
		tooltip.add(TextFormatting.AQUA + Utils.getLang().localize("heart.tooltip"));
	}
}
