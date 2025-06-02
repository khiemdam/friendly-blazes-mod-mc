package net.khiem.friendlyblazesmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.khiem.friendlyblazesmod.block.ModBlocks;
import net.khiem.friendlyblazesmod.item.ModItemGroups;
import net.khiem.friendlyblazesmod.item.ModItems;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FriendlyBlazesMod implements ModInitializer {
	public static final String MOD_ID = "friendlyblazesmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.BLAZE_FLOWER);
	}
}