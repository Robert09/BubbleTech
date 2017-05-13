package me.robert.bt.event;

import me.robert.bt.init.ModItems;
import me.robert.bt.init.ModTools;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventSoulStealer {

	@SubscribeEvent
	public void onEvent(LivingHurtEvent event) {
		if (event.getSource().getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getSource().getEntity();

			if (player.getHeldItemMainhand().getItem() == ModTools.soulstealer) {
				BlockPos pos = event.getEntity().getPosition();
				EntityItem item = new EntityItem(player.getEntityWorld(), pos.getX(), pos.getY(), pos.getZ(),
						new ItemStack(ModItems.heart, 1));

				player.getEntityWorld().spawnEntity(item);
			}
		}
	}
}
