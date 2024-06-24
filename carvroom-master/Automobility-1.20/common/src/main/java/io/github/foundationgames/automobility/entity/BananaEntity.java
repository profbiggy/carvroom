package io.github.foundationgames.automobility.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.List;

public class BananaEntity extends Entity {
    public BananaEntity(EntityType<?> type, Level level) {
        super(type, level);
    }

    public BananaEntity(Level level) {
        super(AutomobilityEntities.BANANA.require(), level);
    }

    @Override
    public void tick() {
        super.tick();
        this.move(MoverType.SELF, this.getDeltaMovement());
        setDeltaMovement(getDeltaMovement().multiply(0.99f,.99F,.99f).add(0, -0.08f, 0));
        if(this.onGround()) {
            this.setDeltaMovement(Vec3.ZERO);
        }

        if(!level().isClientSide) {
            List<AutomobileEntity> vehicles = level().getEntitiesOfClass(AutomobileEntity.class, this.getBoundingBox());
            if (!vehicles.isEmpty()) {
                AutomobileEntity vehicle = vehicles.get(0);
                vehicle.spinOut();

                this.discard();
            }
        }
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
        this.shoot((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
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
