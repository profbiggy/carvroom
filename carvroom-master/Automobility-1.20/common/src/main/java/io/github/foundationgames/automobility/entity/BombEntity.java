package io.github.foundationgames.automobility.entity;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.game.ClientboundExplodePacket;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec3;

import java.util.List;

public class BombEntity extends Entity {

    public int timeSinceThrown = 0;
    public BombEntity(EntityType<?> type, Level level) {
        super(type, level);
    }

    public BombEntity(Level level) {
        super(AutomobilityEntities.BOMB.require(), level);
    }

    @Override
    public void tick() {
        super.tick();
        this.move(MoverType.SELF, this.getDeltaMovement());
        setDeltaMovement(getDeltaMovement().multiply(0.99f,.99F,.99f).add(0, -0.08f, 0));
        if(this.onGround()) {
            setDeltaMovement(getDeltaMovement().multiply(0.5f,0f,.5f));
        }

            if(!level().isClientSide) {
                List<AutomobileEntity> vehicles = level().getEntitiesOfClass(AutomobileEntity.class, this.getBoundingBox());
                if (!vehicles.isEmpty()) {
                Explosion explosion = new Explosion(this.level(), this, null, null, this.getX(), this.getY(0.0625), this.getZ(), 4.0F, false, Explosion.BlockInteraction.DESTROY);

                explosion.finalizeExplosion(false);

                for(ServerPlayer serverPlayer : getServer().getPlayerList().getPlayers()){
                    if(serverPlayer.distanceToSqr(getX(), getY(), getZ()) < 4096.0){
                        serverPlayer.connection.send(new ClientboundExplodePacket(getX(), getY(), getZ(), 4.0F, explosion.getToBlow(), explosion.getHitPlayers().get(serverPlayer)));
                    }

                    if(serverPlayer.distanceToSqr(getX(), getY(), getZ()) < 16.0){
                        if (serverPlayer.getRootVehicle() instanceof AutomobileEntity vehicle) {
                            vehicle.spinOut();
                        }

                    }
                }
                this.discard();

            }



        }

        if(timeSinceThrown == 25){

            //this.level().addParticle(ParticleTypes.EXPLOSION, getX(), getY(), getZ(), 1.0, 0.0, 0.0);

            if(!level().isClientSide) {
                Explosion explosion = new Explosion(this.level(), this, null, null, this.getX(), this.getY(0.0625), this.getZ(), 4.0F, false, Explosion.BlockInteraction.DESTROY);

                explosion.finalizeExplosion(false);

                for(ServerPlayer serverPlayer : getServer().getPlayerList().getPlayers()){
                    if(serverPlayer.distanceToSqr(getX(), getY(), getZ()) < 4096.0){
                        serverPlayer.connection.send(new ClientboundExplodePacket(getX(), getY(), getZ(), 4.0F, explosion.getToBlow(), explosion.getHitPlayers().get(serverPlayer)));
                    }

                    if(serverPlayer.distanceToSqr(getX(), getY(), getZ()) < 16.0){
                        if (serverPlayer.getRootVehicle() instanceof AutomobileEntity vehicle) {
                            vehicle.spinOut();
                        }

                    }
                }
            }

        }

        if(timeSinceThrown == 27){
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

