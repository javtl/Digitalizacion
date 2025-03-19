package com.example.rubymineral;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("rubymineralmod")
public class MiMod {
    public static final String MOD_ID = "rubymineralmod";

    public MiMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
    }

    private void setup(final FMLCommonSetupEvent event) {
        System.out.println("Configuración del mod Ruby Mineral.");
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        System.out.println("Configuración cliente para Ruby Mineral.");
    }
}
