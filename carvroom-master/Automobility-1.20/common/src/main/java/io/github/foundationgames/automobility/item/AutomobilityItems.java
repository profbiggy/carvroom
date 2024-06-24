package io.github.foundationgames.automobility.item;

import io.github.foundationgames.automobility.Automobility;
import io.github.foundationgames.automobility.automobile.AutomobileEngine;
import io.github.foundationgames.automobility.automobile.AutomobileFrame;
import io.github.foundationgames.automobility.automobile.AutomobilePrefab;
import io.github.foundationgames.automobility.automobile.AutomobileWheel;
import io.github.foundationgames.automobility.util.Eventual;
import io.github.foundationgames.automobility.util.RegistryQueue;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public enum AutomobilityItems {;
    public static final Eventual<Item> CROWBAR = register("crowbar", () -> new TooltipItem(Component.translatable("tooltip.item.automobility.crowbar").withStyle(ChatFormatting.BLUE), new Item.Properties().stacksTo(1)), Automobility.TAB);
    public static final Eventual<Item> AUTOMOBILE = register("automobile", () -> new AutomobileItem(new Item.Properties().stacksTo(1)), Automobility.PREFAB_TAB);

    public static final Eventual<Item> AUTOMOBILE2 = register("automobile2", () -> new AutomobileItem2(new Item.Properties().stacksTo(1)), Automobility.PREFAB_TAB);

    public static final Eventual<Item> BANANA_THROWABLE = register("banana_throwable", () -> new BananaItem(new Item.Properties().stacksTo(2)), Automobility.PREFAB_TAB);

    public static final Eventual<Item> SHELL_THROWABLE = register("shell_throwable", () -> new ShellItem(new Item.Properties().stacksTo(2)), Automobility.PREFAB_TAB);

    public static final Eventual<Item> MUSHROOM_THROWABLE = register("mushroom_throwable", () -> new MushroomItem(new Item.Properties().stacksTo(1)), Automobility.PREFAB_TAB);

    public static final Eventual<Item> BOMB_THROWABLE = register("bomb_throwable", () -> new BombItem(new Item.Properties().stacksTo(1)), Automobility.PREFAB_TAB);

    public static final Eventual<Item> LIGHTNING_THROWABLE = register("lightning_throwable", () -> new LightningItem(new Item.Properties().stacksTo(1)), Automobility.PREFAB_TAB);

    public static final Eventual<AutomobileFrameItem> AUTOMOBILE_FRAME = register("automobile_frame", () -> new AutomobileFrameItem(new Item.Properties().stacksTo(16)), Automobility.TAB);
    public static final Eventual<AutomobileWheelItem> AUTOMOBILE_WHEEL = register("automobile_wheel", () -> new AutomobileWheelItem(new Item.Properties()), Automobility.TAB);
    public static final Eventual<AutomobileEngineItem> AUTOMOBILE_ENGINE = register("automobile_engine", () -> new AutomobileEngineItem(new Item.Properties().stacksTo(16)), Automobility.TAB);
    public static final Eventual<FrontAttachmentItem> FRONT_ATTACHMENT = register("front_attachment", () -> new FrontAttachmentItem(new Item.Properties().stacksTo(1)), Automobility.TAB);
    public static final Eventual<RearAttachmentItem> REAR_ATTACHMENT = register("rear_attachment", () -> new RearAttachmentItem(new Item.Properties().stacksTo(1)), Automobility.TAB);

    public static void init() {
        AutomobileItem.addPrefabs(
                new AutomobilePrefab(Automobility.rl("wooden_motorcar"), AutomobileFrame.WOODEN_MOTORCAR, AutomobileWheel.CARRIAGE, AutomobileEngine.STONE),
                new AutomobilePrefab(Automobility.rl("copper_motorcar"), AutomobileFrame.COPPER_MOTORCAR, AutomobileWheel.PLATED, AutomobileEngine.COPPER),
                new AutomobilePrefab(Automobility.rl("steel_motorcar"), AutomobileFrame.STEEL_MOTORCAR, AutomobileWheel.STREET, AutomobileEngine.IRON),
                new AutomobilePrefab(Automobility.rl("golden_motorcar"), AutomobileFrame.GOLDEN_MOTORCAR, AutomobileWheel.GILDED, AutomobileEngine.GOLD),
                new AutomobilePrefab(Automobility.rl("bejeweled_motorcar"), AutomobileFrame.BEJEWELED_MOTORCAR, AutomobileWheel.BEJEWELED, AutomobileEngine.IRON),
                new AutomobilePrefab(Automobility.rl("standard_white"), AutomobileFrame.STANDARD_WHITE, AutomobileWheel.STANDARD, AutomobileEngine.DIAMOND),
                new AutomobilePrefab(Automobility.rl("standard_orange"), AutomobileFrame.STANDARD_ORANGE, AutomobileWheel.STANDARD, AutomobileEngine.DIAMOND),
                new AutomobilePrefab(Automobility.rl("standard_light_blue"), AutomobileFrame.STANDARD_LIGHT_BLUE, AutomobileWheel.STANDARD, AutomobileEngine.DIAMOND),
                new AutomobilePrefab(Automobility.rl("standard_yellow"), AutomobileFrame.STANDARD_YELLOW, AutomobileWheel.STANDARD, AutomobileEngine.DIAMOND),
                new AutomobilePrefab(Automobility.rl("standard_lime"), AutomobileFrame.STANDARD_LIME, AutomobileWheel.STANDARD, AutomobileEngine.DIAMOND),
                new AutomobilePrefab(Automobility.rl("standard_pink"), AutomobileFrame.STANDARD_PINK, AutomobileWheel.STANDARD, AutomobileEngine.DIAMOND),
                new AutomobilePrefab(Automobility.rl("standard_gray"), AutomobileFrame.STANDARD_GRAY, AutomobileWheel.STANDARD, AutomobileEngine.DIAMOND),
                new AutomobilePrefab(Automobility.rl("standard_cyan"), AutomobileFrame.STANDARD_CYAN, AutomobileWheel.STANDARD, AutomobileEngine.DIAMOND),
                new AutomobilePrefab(Automobility.rl("standard_blue"), AutomobileFrame.STANDARD_BLUE, AutomobileWheel.STANDARD, AutomobileEngine.DIAMOND),
                new AutomobilePrefab(Automobility.rl("standard_green"), AutomobileFrame.STANDARD_GREEN, AutomobileWheel.STANDARD, AutomobileEngine.DIAMOND),
                new AutomobilePrefab(Automobility.rl("standard_red"), AutomobileFrame.STANDARD_RED, AutomobileWheel.STANDARD, AutomobileEngine.DIAMOND),
                new AutomobilePrefab(Automobility.rl("amethyst_rickshaw"), AutomobileFrame.AMETHYST_RICKSHAW, AutomobileWheel.BEJEWELED, AutomobileEngine.STONE),
                new AutomobilePrefab(Automobility.rl("quartz_rickshaw"), AutomobileFrame.QUARTZ_RICKSHAW, AutomobileWheel.GILDED, AutomobileEngine.GOLD),
                new AutomobilePrefab(Automobility.rl("prismarine_rickshaw"), AutomobileFrame.PRISMARINE_RICKSHAW, AutomobileWheel.PLATED, AutomobileEngine.COPPER),
                new AutomobilePrefab(Automobility.rl("echo_rickshaw"), AutomobileFrame.ECHO_RICKSHAW, AutomobileWheel.STREET, AutomobileEngine.STONE),
                new AutomobilePrefab(Automobility.rl("pineapple"), AutomobileFrame.PINEAPPLE, AutomobileWheel.TRACTOR, AutomobileEngine.GOLD)
        );
    }

    public static <T extends Item> Eventual<T> register(String name, Supplier<T> item, CreativeTabQueue tab) {
        var itemPromise = RegistryQueue.register(BuiltInRegistries.ITEM, Automobility.rl(name), item);
        tab.queue(itemPromise);
        return itemPromise;
    }
}
