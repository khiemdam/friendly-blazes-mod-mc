package net.khiem.friendlyblazesmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.khiem.friendlyblazesmod.FriendlyBlazesMod;
import net.khiem.friendlyblazesmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BLAZE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FriendlyBlazesMod.MOD_ID, "blaze_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(Items.BLAZE_ROD))
                    .displayName(Text.translatable("itemgroup.friendlyblazesmod.blaze_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BLAZE_BOTTLE);
                        entries.add(ModBlocks.BLAZE_BLOCK);
                        entries.add(Items.BLAZE_ROD);
                        entries.add(Items.BLAZE_POWDER);
                    })
                    .build());

    public static void registerItemGroups() {
        FriendlyBlazesMod.LOGGER.info("Registering Item Groups for " + FriendlyBlazesMod.MOD_ID);
    }
}
