package com.example.nuevomineral;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("nuevomineralmod")
public class MiMod {
    public static final String MOD_ID = "nuevomineralmod";

    public MiMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
    }

    private void setup(final FMLCommonSetupEvent event) {
        System.out.println("Configuración del mod Nuevo Mineral.");
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        System.out.println("Configuración cliente para Nuevo Mineral.");
    }
}
