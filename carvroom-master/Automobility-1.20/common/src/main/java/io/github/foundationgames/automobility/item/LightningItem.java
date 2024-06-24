package io.github.foundationgames.automobility.item;

import io.github.foundationgames.automobility.entity.AutomobileEntity;
import io.github.foundationgames.automobility.entity.BombEntity;
import io.github.foundationgames.automobility.entity.LightningEntity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class LightningItem extends Item {

    public LightningItem(Item.Properties properties) {
        super(properties);
    }

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        ItemStack itemStack = player.getItemInHand(usedHand);
        //level.playSound((Player)null, player.getX(), player.getY(), player.getZ(), SoundEvents.FIRECHARGE_USE, SoundSource.NEUTRAL, 0.5F, 0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));

        if (!level.isClientSide) {
            for(ServerPlayer serverPlayer : player.getServer().getPlayerList().getPlayers()) {
                if(serverPlayer != player){
                    LightningBolt lightning = new LightningBolt(EntityType.LIGHTNING_BOLT, level);
                    lightning.setVisualOnly(true);
                    lightning.setPos(serverPlayer.getX(), serverPlayer.getY() + 1, serverPlayer.getZ());
                    level.addFreshEntity(lightning);
                    if (serverPlayer.getRootVehicle() instanceof AutomobileEntity vehicle) {
                        vehicle.spinOut();
                    }
                }
            }
        }

        player.awardStat(Stats.ITEM_USED.get(this));
        if (!player.getAbilities().instabuild) {
            itemStack.shrink(1);
        }

        return InteractionResultHolder.sidedSuccess(itemStack, level.isClientSide());
    }
}
