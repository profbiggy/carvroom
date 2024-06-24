package io.github.foundationgames.automobility.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import io.github.foundationgames.automobility.item.AutomobilityItems;
import io.github.foundationgames.automobility.item.BananaItem;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BoxEntity extends EndCrystal {

    public int timeSincePickup = 0;
    public BoxEntity(EntityType<?> type, Level level) {
        super((EntityType<EndCrystal>)type, level);
    }

    public BoxEntity(Level level) {
        super(AutomobilityEntities.BOX.require(), level);
    }

    public BoxEntity(Level $$0, double $$1, double $$2, double $$3) {
        this($$0);
        setPos($$1, $$2, $$3);
    }

    @Override
    public boolean hurt(DamageSource $$0, float $$1) {
        return true;
    }

    @Override
    public void tick() {
        super.tick();

        List<AutomobileEntity> vehicles = level().getEntitiesOfClass(AutomobileEntity.class, this.getBoundingBox());

        if(timeSincePickup >= 20 && !vehicles.isEmpty()){
            AutomobileEntity vehicle = vehicles.get(0);
            level().playSound(null, getX(), getY(), getZ(), SoundEvents.GLASS_BREAK, SoundSource.BLOCKS, 1.0F, level().getRandom().nextFloat() * 0.1F + 0.9F);
            //level().addParticle();

            if(!level().isClientSide){
                var passenger = vehicle.getControllingPassenger();
                if(passenger instanceof Player){

                    List<ItemStack> items = new ArrayList<>();

                    items.add(new ItemStack(AutomobilityItems.BANANA_THROWABLE.require(), 2));
                    items.add(new ItemStack(AutomobilityItems.SHELL_THROWABLE.require(), 2));
                  items.add(new ItemStack(AutomobilityItems.MUSHROOM_THROWABLE.require(), 1));
                   items.add(new ItemStack(AutomobilityItems.BOMB_THROWABLE.require(), 1));
                    items.add(new ItemStack(AutomobilityItems.LIGHTNING_THROWABLE.require(), 1));

                    if (((Player) passenger).getInventory().getFreeSlot() < 2) {
                        ((Player) passenger).getInventory().add(items.get(new Random().nextInt(items.size())));
                    }
                }
            }
            timeSincePickup = 0;
        }
        else {
            timeSincePickup++;
        }
    }
}