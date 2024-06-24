package io.github.foundationgames.automobility.entity;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class ShellEntity extends Entity {

    public int timeSinceThrown = 0;

    public int bankCount = 0;

    public ShellEntity(EntityType<?> type, Level level) {
        super(type, level);
        setMaxUpStep(.5f);
    }

    public ShellEntity(Level level) {
        super(AutomobilityEntities.SHELL.require(), level);
        setMaxUpStep(.5f);
    }

    @Override
    public void tick() {
        super.tick();
        var deltaMovement = this.getDeltaMovement();
        this.move(MoverType.SELF, this.getDeltaMovement());

        if(getDeltaMovement().x == 0) {
            setDeltaMovement(-deltaMovement.x, getDeltaMovement().y, getDeltaMovement().z);
            bankCount++;
        }
        if(getDeltaMovement().z == 0) {
            setDeltaMovement(getDeltaMovement().x, getDeltaMovement().y, -deltaMovement.z);
            bankCount++;
        }

        setDeltaMovement(getDeltaMovement().add(0, -0.08f, 0));

        //setYRot(getYRot() + 18);

        if(!level().isClientSide) {
            List<AutomobileEntity> vehicles = level().getEntitiesOfClass(AutomobileEntity.class, this.getBoundingBox().inflate(0.2, 0, 0.2));
            if (!vehicles.isEmpty()) {
                AutomobileEntity vehicle = vehicles.get(0);
                vehicle.spinOut();

                this.discard();
            }
        }

        if(bankCount == 6){
            this.discard();
        }

        timeSinceThrown++;
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

    public void shootFromRotation(Entity $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        float $$6 = -Mth.sin($$2 * (float) (Math.PI / 180.0)) * Mth.cos($$1 * (float) (Math.PI / 180.0));
        float $$7 = -Mth.sin(($$1 + $$3) * (float) (Math.PI / 180.0));
        float $$8 = Mth.cos($$2 * (float) (Math.PI / 180.0)) * Mth.cos($$1 * (float) (Math.PI / 180.0));
        this.shoot((double)$$6, (double)$$7, (double)$$8, $$4*1.8f, $$5); //SPEED $$4
        Vec3 $$9 = $$0.getDeltaMovement();
        this.setDeltaMovement(this.getDeltaMovement().add($$9.x, $$0.onGround() ? 0.0 : $$9.y, $$9.z));
    }

    public void shoot(double $$0, double $$1, double $$2, float $$3, float $$4) {
        Vec3 $$5 = new Vec3($$0, $$1, $$2)
                .normalize()
                .add(
                        this.random.triangle(0.0, 0.0172275 * (double)$$4),
                        this.random.triangle(0.0, 0.0172275 * (double)$$4),
                        this.random.triangle(0.0, 0.0172275 * (double)$$4)
                )
                .scale((double)$$3);
        this.setDeltaMovement($$5);
        double $$6 = $$5.horizontalDistance();
        this.setYRot((float)(Mth.atan2($$5.x, $$5.z) * 180.0F / (float)Math.PI));
        this.setXRot((float)(Mth.atan2($$5.y, $$6) * 180.0F / (float)Math.PI));
        this.yRotO = this.getYRot();
        this.xRotO = this.getXRot();
    }
}








