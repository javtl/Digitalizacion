package com.example.nuevomineral;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = 
        DeferredRegister.create(ForgeRegistries.BLOCKS, MiMod.MOD_ID);

    public static final RegistryObject<Block> NUEVO_MINERAL = BLOCKS.register("nuevo_mineral",
        () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
        .strength(3.0f)
        .requiresCorrectToolForDrops()
        .sound(SoundType.STONE)));
}
