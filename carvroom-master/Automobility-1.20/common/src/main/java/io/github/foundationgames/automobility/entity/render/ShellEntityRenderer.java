package io.github.foundationgames.automobility.entity.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import io.github.foundationgames.automobility.entity.ShellEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class ShellEntityRenderer extends EntityRenderer<ShellEntity> {

    public static ShellModel model;
    public ShellEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx);
        model = new ShellModel(ctx.bakeLayer(ShellModel.MODEL_LAYER));
    }

    @Override
    public ResourceLocation getTextureLocation(ShellEntity var1) {
        return new ResourceLocation("mariokart", "textures/shell/shell.png");
    }

    @Override

    public void render(ShellEntity entity, float yaw, float tickDelta, PoseStack pose, MultiBufferSource buffers, int light) {

        float time = entity.timeSinceThrown + tickDelta;

        pose.pushPose();
        pose.mulPose(Axis.XP.rotation((float) Math.PI));
        pose.translate(0,-1.87,0);
        pose.scale(1.25f,1.25f,1.25f);
        pose.mulPose(Axis.YP.rotation(time/2));

        model.renderToBuffer(pose, buffers.getBuffer(model.renderType(new ResourceLocation("mariokart", "textures/shell/shell.png"))), light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
        pose.popPose();


        super.render(entity, yaw, tickDelta, pose, buffers, light);
    }
}

