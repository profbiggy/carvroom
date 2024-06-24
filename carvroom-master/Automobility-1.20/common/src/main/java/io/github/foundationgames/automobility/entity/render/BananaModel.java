package io.github.foundationgames.automobility.entity.render;

import io.github.foundationgames.automobility.Automobility;
import io.github.foundationgames.automobility.automobile.render.BaseModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class BananaModel extends BaseModel {
    public static final ModelLayerLocation MODEL_LAYER = new ModelLayerLocation(new ResourceLocation("mariokart", "banana"), "main");

    public BananaModel(EntityRendererProvider.Context ctx) {
            super(RenderType::entityCutout, ctx, MODEL_LAYER);
    }
}

