package net.khiem.friendlyblazesmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.khiem.friendlyblazesmod.FriendlyBlazesMod;
import net.khiem.friendlyblazesmod.block.custom.BlazeFlower;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {

    public static final Block BLAZE_BLOCK = register("blaze_block", Block::new,
            Block.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .strength(0.7F)
                    .luminance(state -> 15)
                    .instrument(NoteBlockInstrument.HAT)
                    .sounds(BlockSoundGroup.GLASS));

    public static final Block BLAZE_FLOWER = register(
            "blaze_flower",settings -> new BlazeFlower(StatusEffects.FIRE_RESISTANCE, 0.35F, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_CRIMSON)
                    .ticksRandomly()
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SWEET_BERRY_BUSH)
                    .pistonBehavior(PistonBehavior.DESTROY)
	);

    private static Block register(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(FriendlyBlazesMod.MOD_ID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);
        Items.register(block);
        return block;
    }

    public static void registerModBlocks() {
        FriendlyBlazesMod.LOGGER.info("Registering Mod Blocks for " + FriendlyBlazesMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.BLAZE_BLOCK);
        });
    }
}
