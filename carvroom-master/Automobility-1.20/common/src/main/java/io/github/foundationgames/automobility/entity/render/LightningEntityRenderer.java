package io.github.foundationgames.automobility.entity.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import io.github.foundationgames.automobility.entity.LightningEntity;
import io.github.foundationgames.automobility.entity.MushroomEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class LightningEntityRenderer extends EntityRenderer<LightningEntity> {

    public static LightningModel model;
    public LightningEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx);
        model = new LightningModel(ctx.bakeLayer(LightningModel.MODEL_LAYER));
    }

    @Override
    public ResourceLocation getTextureLocation(LightningEntity var1) {
        return new ResourceLocation("mariokart", "textures/lightning/lightning.png");
    }

    @Override

    public void render(LightningEntity entity, float yaw, float tickDelta, PoseStack pose, MultiBufferSource buffers, int light) {

        pose.pushPose();
        pose.mulPose(Axis.XP.rotation((float) Math.PI));
        pose.translate(0,-1.87,0);
        pose.scale(1.25f,1.25f,1.25f);

        model.renderToBuffer(pose, buffers.getBuffer(model.renderType(new ResourceLocation("mariokart", "textures/lightning/lightning.png"))), light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
        pose.popPose();

        super.render(entity, yaw, tickDelta, pose, buffers, light);
    }
}

