package com.example.nuevomineral;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, MiMod.MOD_ID);

    public static final RegistryObject<Item> MINERAL = ITEMS.register("mineral",
        () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> PICO_MISTICO = ITEMS.register("pico_mistico",
        () -> new MisticaPico(ModToolTiers.MISTICO, 2, -2.8f, new Item.Properties()));
}
