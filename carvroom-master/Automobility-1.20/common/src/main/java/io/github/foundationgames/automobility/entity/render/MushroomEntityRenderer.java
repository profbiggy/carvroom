package io.github.foundationgames.automobility.entity.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import io.github.foundationgames.automobility.entity.MushroomEntity;
import io.github.foundationgames.automobility.entity.ShellEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class MushroomEntityRenderer extends EntityRenderer<MushroomEntity> {

    public static MushroomModel model;
    public MushroomEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx);
        model = new MushroomModel(ctx.bakeLayer(MushroomModel.MODEL_LAYER));
    }

    @Override
    public ResourceLocation getTextureLocation(MushroomEntity var1) {
        return new ResourceLocation("mariokart", "textures/mushroom/mushroom.png");
    }

    @Override

    public void render(MushroomEntity entity, float yaw, float tickDelta, PoseStack pose, MultiBufferSource buffers, int light) {

        pose.pushPose();
        pose.mulPose(Axis.XP.rotation((float) Math.PI));
        pose.translate(0,-1.87,0);
        pose.scale(1.25f,1.25f,1.25f);

        model.renderToBuffer(pose, buffers.getBuffer(model.renderType(new ResourceLocation("mariokart", "textures/mushroom/mushroom.png"))), light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
        pose.popPose();

        super.render(entity, yaw, tickDelta, pose, buffers, light);
    }
}

