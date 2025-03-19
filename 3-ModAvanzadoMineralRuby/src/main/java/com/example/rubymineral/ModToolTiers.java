package com.example.rubymineral;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModToolTiers implements Tier {
    RUBY(4, 800, 9.0f, 3.5f, 15, Ingredient.of(ModItems.RUBY.get()));

    private final int level;
    private final int uses;
    private final float speed;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairMaterial;

    ModToolTiers(int level, int uses, float speed, float attackDamage, int enchantability, Ingredient repairMaterial) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getLevel() { return level; }

    @Override
    public int getUses() { return uses; }

    @Override
    public float getSpeed() { return speed; }

    @Override
    public float getAttackDamageBonus() { return attackDamage; }

    @Override
    public int getEnchantmentValue() { return enchantability; }

    @Override
    public Ingredient getRepairIngredient() { return repairMaterial; }
}
