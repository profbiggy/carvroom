package io.github.foundationgames.automobility.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class LightningEntity extends Entity {

    public LightningEntity(EntityType<?> type, Level level) {
        super(type, level);
    }

    public LightningEntity(Level level) {
        super(AutomobilityEntities.LIGHTNING.require(), level);
    }

    @Override
    public void tick() {

    }

    @Override
    protected void defineSynchedData() {

    }

    @Override
    protected void readAdditionalSaveData(CompoundTag compoundTag) {

    }

    @Override
    protected void addAdditionalSaveData(CompoundTag compoundTag) {

    }

}

