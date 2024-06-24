package io.github.foundationgames.automobility.entity.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import io.github.foundationgames.automobility.Automobility;
import io.github.foundationgames.automobility.automobile.render.AutomobileModels;
import io.github.foundationgames.automobility.automobile.render.AutomobileRenderer;
import io.github.foundationgames.automobility.entity.BananaEntity;
import net.minecraft.client.model.Model;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;

public class BananaEntityRenderer extends EntityRenderer<BananaEntity> {
    public BananaEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx);
    }

    @Override
    public ResourceLocation getTextureLocation(BananaEntity bananaEntity) {
        return null;
    }

    @Override
    public void render(BananaEntity entity, float yaw, float tickDelta, PoseStack pose, MultiBufferSource buffers, int light) {
        Model model = AutomobileModels.getModel(new ResourceLocation("mariokart", "banana"));

        pose.pushPose();
        pose.mulPose(Axis.XP.rotation((float) Math.PI));
        model.renderToBuffer(pose, buffers.getBuffer(model.renderType(new ResourceLocation("mariokart", "textures/banana/banana.png"))), light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
        pose.popPose();

        super.render(entity, yaw, tickDelta, pose, buffers, light);
    }
}