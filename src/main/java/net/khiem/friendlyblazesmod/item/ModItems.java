package net.khiem.friendlyblazesmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.khiem.friendlyblazesmod.FriendlyBlazesMod;
import net.khiem.friendlyblazesmod.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BLAZE_BOTTLE = registerItem("blaze_bottle", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FriendlyBlazesMod.MOD_ID,"blaze_bottle")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FriendlyBlazesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FriendlyBlazesMod.LOGGER.info("Registering Mod Items for " + FriendlyBlazesMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(BLAZE_BOTTLE);
        });
    }
}
