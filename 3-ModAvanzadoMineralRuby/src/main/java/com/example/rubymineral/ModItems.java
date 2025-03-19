package com.example.rubymineral;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, MiMod.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
        () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
        () -> new SwordItem(ModToolTiers.RUBY, 7, -2.4f, new Item.Properties()));
}
