package me.robert.bt.handlers;

import me.robert.bt.event.EventSoulStealer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandlers {

	public void registerEvents() {
		MinecraftForge.EVENT_BUS.register(new EventSoulStealer());
	}
}
