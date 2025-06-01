package net.khiem.friendlyblazesmod;

import net.fabricmc.api.ModInitializer;

import net.khiem.friendlyblazesmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FriendlyBlazesMod implements ModInitializer {
	public static final String MOD_ID = "friendlyblazesmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}