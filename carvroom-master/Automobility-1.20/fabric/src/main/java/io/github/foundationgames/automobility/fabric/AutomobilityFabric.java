package io.github.foundationgames.automobility.fabric;

import io.github.foundationgames.automobility.Automobility;
import io.github.foundationgames.automobility.entity.AutomobileEntity;
import io.github.foundationgames.automobility.util.RegistryQueue;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.players.PlayerList;

import static net.minecraft.commands.Commands.literal;


public class AutomobilityFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        FabricPlatform.init();
        Automobility.init();

        register(BuiltInRegistries.BLOCK);
        register(BuiltInRegistries.BLOCK_ENTITY_TYPE);
        register(BuiltInRegistries.ITEM);
        register(BuiltInRegistries.ENTITY_TYPE);
        register(BuiltInRegistries.PARTICLE_TYPE);
        register(BuiltInRegistries.SOUND_EVENT);
        register(BuiltInRegistries.MENU);
        register(BuiltInRegistries.RECIPE_TYPE);
        register(BuiltInRegistries.RECIPE_SERIALIZER);
        register(BuiltInRegistries.CREATIVE_MODE_TAB);

        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("start")
                .executes(context -> {
                    if (context.getSource().hasPermission(4)) {
                        for(ServerPlayer serverPlayer : context.getSource().getServer().getPlayerList().getPlayers()) {
                            if (serverPlayer.getRootVehicle() instanceof AutomobileEntity vehicle) {
                                vehicle.stop();
                            }
                        }
                    }
                    return 1;
                })));
    }


    public static <V> void register(Registry<V> registry) {
        RegistryQueue.getQueue(registry).forEach(e -> Registry.register(registry, e.rl(), e.entry().create()));
    }
}
