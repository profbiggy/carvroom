package io.github.foundationgames.automobility.automobile.render.engine;

import io.github.foundationgames.automobility.Automobility;
import io.github.foundationgames.automobility.automobile.render.BaseModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class IronEngineModel extends BaseModel {
    public static final ModelLayerLocation MODEL_LAYER = new ModelLayerLocation(Automobility.rl("automobile/engine/iron"), "main");

    public IronEngineModel(EntityRendererProvider.Context ctx) {
        super(RenderType::entityCutout, ctx, MODEL_LAYER);
    }
}
