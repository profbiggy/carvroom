package io.github.foundationgames.automobility.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.List;

public class MushroomEntity extends Entity {

    public MushroomEntity(EntityType<?> type, Level level) {
        super(type, level);
    }

    public MushroomEntity(Level level) {
        super(AutomobilityEntities.MUSHROOM.require(), level);
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
