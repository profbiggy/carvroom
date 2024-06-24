package io.github.foundationgames.automobility.entity.render;

import com.mojang.blaze3d.vertex.PoseStack;
import io.github.foundationgames.automobility.entity.BoxEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EndCrystalRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class BoxEntityRenderer extends EntityRenderer<BoxEntity> {
    private final EndCrystalRenderer endCrystalRenderer;

    public BoxEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx);
        endCrystalRenderer = new EndCrystalRenderer(ctx);
    }

    public void render(BoxEntity entity, float $$1, float tickDelta, PoseStack $$3, MultiBufferSource $$4, int $$5) {
        super.render(entity, $$1, tickDelta, $$3, $$4, $$5);
        float multiplier;

        float time = entity.timeSincePickup + tickDelta;
        if(time < 20){
            return;
        }
        else if(time <= 29){
            multiplier = .1f * time - 1.9f;
            $$3.scale(.1f * time - 1.9f,.1f * time - 1.9f,.1f * time - 1.9f);
        }
        else{
            multiplier = 1;
        }


        endCrystalRenderer.render(entity, $$1, tickDelta, $$3, renderType -> new AlphaMultiplierVertexConsumer($$4.getBuffer(RenderType.entityTranslucent(new ResourceLocation("mariokart", "textures/box/box.png"))), (multiplier)), $$5);
    }

    public ResourceLocation getTextureLocation(BoxEntity entity) {
        return null;
    }
}