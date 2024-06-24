package io.github.foundationgames.automobility.automobile;

import io.github.foundationgames.automobility.item.AutomobilityItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import static io.github.foundationgames.automobility.automobile.AutomobileFrame.*;

public record AutomobilePrefab(ResourceLocation id, AutomobileFrame frame, AutomobileWheel wheel, AutomobileEngine engine) {
    public ItemStack toStack() {
        var stack = new ItemStack(AutomobilityItems.AUTOMOBILE.require());

        if(frame == STANDARD_WHITE || frame == STANDARD_ORANGE || frame == STANDARD_MAGENTA || frame == STANDARD_LIGHT_BLUE || frame == STANDARD_YELLOW || frame == STANDARD_LIME || frame == STANDARD_PINK || frame == STANDARD_GRAY || frame == STANDARD_LIGHT_GRAY || frame == STANDARD_CYAN || frame == STANDARD_PURPLE || frame == STANDARD_BLUE || frame == STANDARD_BROWN || frame == STANDARD_GREEN || frame == STANDARD_RED || frame == STANDARD_BLACK) {
            stack = new ItemStack(AutomobilityItems.AUTOMOBILE2.require());
        }

        var automobile = stack.getOrCreateTagElement("Automobile");
        automobile.putString("frame", frame().getId().toString());
        automobile.putString("wheels", wheel().getId().toString());
        automobile.putString("engine", engine().getId().toString());
        automobile.putBoolean("isPrefab", true);
        var display = stack.getOrCreateTagElement("display");
        display.putString("Name", String.format("{\"translate\":\"prefab.%s.%s\",\"italic\":\"false\"}", id().getNamespace(), id().getPath()));
        return stack;
    }
}
