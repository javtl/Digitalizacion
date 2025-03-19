package com.example.rubymineral;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class RubyPhantom extends Monster {
    public RubyPhantom(EntityType<? extends Monster> type, Level level) {
        super(type, level);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        // Aquí se definirían los comportamientos del mob, como atacar al jugador.
    }
}
