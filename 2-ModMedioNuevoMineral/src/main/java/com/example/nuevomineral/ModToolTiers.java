package com.example.nuevomineral;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

public enum ModToolTiers implements Tier {
    MISTICO(3, 250, 7.0f, 2.5f, 10, Ingredient.of(ModItems.MINERAL.get()));

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
