package io.github.foundationgames.automobility.entity.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.foundationgames.automobility.entity.ShellEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class ShellModel extends EntityModel<ShellEntity> {

    public static final ModelLayerLocation MODEL_LAYER = new ModelLayerLocation(new ResourceLocation("mariokart", "shell"), "main");

    private final ModelPart base;

    public ShellModel(ModelPart modelPart) {
        this.base = modelPart.getChild("main");
    }

    @Override
    public void setupAnim(ShellEntity var1, float var2, float var3, float var4, float var5, float var6) {
    }

    @Override
    public void renderToBuffer(PoseStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        base.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }

    public static LayerDefinition createLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(4.0F, 28.4F, -8.1F));

        PartDefinition bone3 = main.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-4.0F, -8.0F, 8.0F));

        PartDefinition bone2 = bone3.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

        PartDefinition hexadecagon9 = bone2.addOrReplaceChild("hexadecagon9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 0.7F, 0.0F, 0.0F, 0.0F, -0.2182F));

        PartDefinition hexadecagon_r1 = hexadecagon9.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(11, 32).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, -1.3526F));

        PartDefinition hexadecagon_r2 = hexadecagon9.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(23, 2).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(32, 19).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 0).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, -1.3526F));

        PartDefinition hexadecagon_r3 = hexadecagon9.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(23, 4).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(57, 22).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, -1.3526F));

        PartDefinition hexadecagon_r4 = hexadecagon9.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(24, 35).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, -1.3526F));

        PartDefinition hexadecagon_r5 = hexadecagon9.addOrReplaceChild("hexadecagon_r5", CubeListBuilder.create().texOffs(30, 35).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, -1.3526F));

        PartDefinition hexadecagon10 = bone2.addOrReplaceChild("hexadecagon10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 0.7F, 0.0F, 0.0F, 0.0F, -0.2182F));

        PartDefinition hexadecagon_r6 = hexadecagon10.addOrReplaceChild("hexadecagon_r6", CubeListBuilder.create().texOffs(17, 22).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(3, 32).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, -1.309F));

        PartDefinition hexadecagon_r7 = hexadecagon10.addOrReplaceChild("hexadecagon_r7", CubeListBuilder.create().texOffs(22, 19).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(43, 1).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 44).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, -1.309F));

        PartDefinition hexadecagon_r8 = hexadecagon10.addOrReplaceChild("hexadecagon_r8", CubeListBuilder.create().texOffs(21, 22).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(0, 35).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, -1.309F));

        PartDefinition hexadecagon_r9 = hexadecagon10.addOrReplaceChild("hexadecagon_r9", CubeListBuilder.create().texOffs(57, 26).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, -1.309F));

        PartDefinition hexadecagon_r10 = hexadecagon10.addOrReplaceChild("hexadecagon_r10", CubeListBuilder.create().texOffs(35, 20).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, -1.309F));

        PartDefinition hexadecagon11 = bone2.addOrReplaceChild("hexadecagon11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 0.7F, 0.0F, 0.0F, 0.0F, -0.2182F));

        PartDefinition hexadecagon_r11 = hexadecagon11.addOrReplaceChild("hexadecagon_r11", CubeListBuilder.create().texOffs(7, 22).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(7, 32).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, -1.0472F));

        PartDefinition hexadecagon_r12 = hexadecagon11.addOrReplaceChild("hexadecagon_r12", CubeListBuilder.create().texOffs(22, 9).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, -1.0472F));

        PartDefinition hexadecagon_r13 = hexadecagon11.addOrReplaceChild("hexadecagon_r13", CubeListBuilder.create().texOffs(11, 22).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(21, 34).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, -1.0472F));

        PartDefinition hexadecagon_r14 = hexadecagon11.addOrReplaceChild("hexadecagon_r14", CubeListBuilder.create().texOffs(57, 26).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, -1.0472F));

        PartDefinition hexadecagon_r15 = hexadecagon11.addOrReplaceChild("hexadecagon_r15", CubeListBuilder.create().texOffs(33, 34).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, -1.0472F));

        PartDefinition hexadecagon12 = bone2.addOrReplaceChild("hexadecagon12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 0.7F, 0.0F, 0.0F, 0.0F, -0.2182F));

        PartDefinition hexadecagon_r16 = hexadecagon12.addOrReplaceChild("hexadecagon_r16", CubeListBuilder.create().texOffs(21, 16).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(17, 32).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, -0.7854F));

        PartDefinition hexadecagon_r17 = hexadecagon12.addOrReplaceChild("hexadecagon_r17", CubeListBuilder.create().texOffs(22, 0).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(3, 0).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition hexadecagon_r18 = hexadecagon12.addOrReplaceChild("hexadecagon_r18", CubeListBuilder.create().texOffs(3, 22).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(57, 22).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, -0.7854F));

        PartDefinition hexadecagon_r19 = hexadecagon12.addOrReplaceChild("hexadecagon_r19", CubeListBuilder.create().texOffs(57, 26).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, -0.7854F));

        PartDefinition hexadecagon_r20 = hexadecagon12.addOrReplaceChild("hexadecagon_r20", CubeListBuilder.create().texOffs(34, 17).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, -0.7854F));

        PartDefinition hexadecagon13 = bone2.addOrReplaceChild("hexadecagon13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 0.7F, 0.0F, 0.0F, 0.0F, -0.2182F));

        PartDefinition hexadecagon_r21 = hexadecagon13.addOrReplaceChild("hexadecagon_r21", CubeListBuilder.create().texOffs(21, 7).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(11, 34).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, -0.5236F));

        PartDefinition hexadecagon_r22 = hexadecagon13.addOrReplaceChild("hexadecagon_r22", CubeListBuilder.create().texOffs(14, 21).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition hexadecagon_r23 = hexadecagon13.addOrReplaceChild("hexadecagon_r23", CubeListBuilder.create().texOffs(21, 14).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(51, 22).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, -0.5236F));

        PartDefinition hexadecagon_r24 = hexadecagon13.addOrReplaceChild("hexadecagon_r24", CubeListBuilder.create().texOffs(30, 50).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, -0.5236F));

        PartDefinition hexadecagon_r25 = hexadecagon13.addOrReplaceChild("hexadecagon_r25", CubeListBuilder.create().texOffs(34, 9).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, -0.5236F));

        PartDefinition hexadecagon14 = bone2.addOrReplaceChild("hexadecagon14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 0.7F, 0.0F, 0.0F, 0.0F, -0.2182F));

        PartDefinition hexadecagon_r26 = hexadecagon14.addOrReplaceChild("hexadecagon_r26", CubeListBuilder.create().texOffs(20, 11).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(34, 4).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, -0.2618F));

        PartDefinition hexadecagon_r27 = hexadecagon14.addOrReplaceChild("hexadecagon_r27", CubeListBuilder.create().texOffs(19, 20).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(43, 4).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(3, 44).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition hexadecagon_r28 = hexadecagon14.addOrReplaceChild("hexadecagon_r28", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(57, 22).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, -0.2618F));

        PartDefinition hexadecagon_r29 = hexadecagon14.addOrReplaceChild("hexadecagon_r29", CubeListBuilder.create().texOffs(57, 18).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, -0.2618F));

        PartDefinition hexadecagon_r30 = hexadecagon14.addOrReplaceChild("hexadecagon_r30", CubeListBuilder.create().texOffs(3, 34).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, -0.2618F));

        PartDefinition hexadecagon15 = bone2.addOrReplaceChild("hexadecagon15", CubeListBuilder.create().texOffs(42, 43).addBox(-0.5F, -1.3962F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(43, 20).addBox(-0.5F, -1.3962F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 20).addBox(-0.5F, -4.2F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.7F, 0.0F, 0.0F, 0.0F, -0.2182F));

        PartDefinition hexadecagon_r31 = hexadecagon15.addOrReplaceChild("hexadecagon_r31", CubeListBuilder.create().texOffs(20, 5).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(30, 33).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r32 = hexadecagon15.addOrReplaceChild("hexadecagon_r32", CubeListBuilder.create().texOffs(11, 20).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(52, 46).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r33 = hexadecagon15.addOrReplaceChild("hexadecagon_r33", CubeListBuilder.create().texOffs(55, 38).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r34 = hexadecagon15.addOrReplaceChild("hexadecagon_r34", CubeListBuilder.create().texOffs(33, 28).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition hexadecagon16 = bone2.addOrReplaceChild("hexadecagon16", CubeListBuilder.create().texOffs(36, 43).addBox(-0.5F, -1.3962F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 43).addBox(-0.5F, -1.3962F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(3, 20).addBox(-0.5F, -4.2F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, 0.7F, 0.0F));

        PartDefinition hexadecagon_r35 = hexadecagon16.addOrReplaceChild("hexadecagon_r35", CubeListBuilder.create().texOffs(19, 18).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(24, 33).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r36 = hexadecagon16.addOrReplaceChild("hexadecagon_r36", CubeListBuilder.create().texOffs(20, 3).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(33, 2).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r37 = hexadecagon16.addOrReplaceChild("hexadecagon_r37", CubeListBuilder.create().texOffs(57, 31).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r38 = hexadecagon16.addOrReplaceChild("hexadecagon_r38", CubeListBuilder.create().texOffs(33, 14).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone = bone3.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(4.0F, 8.0F, -8.0F));

        PartDefinition hexadecagon6 = bone.addOrReplaceChild("hexadecagon6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9F, -7.3F, 8.0F, 0.0F, 0.0F, -0.2182F));

        PartDefinition hexadecagon_r39 = hexadecagon6.addOrReplaceChild("hexadecagon_r39", CubeListBuilder.create().texOffs(23, 12).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(36, 13).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, -1.0472F));

        PartDefinition hexadecagon_r40 = hexadecagon6.addOrReplaceChild("hexadecagon_r40", CubeListBuilder.create().texOffs(14, 23).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, -1.0472F));

        PartDefinition hexadecagon_r41 = hexadecagon6.addOrReplaceChild("hexadecagon_r41", CubeListBuilder.create().texOffs(3, 24).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(3, 36).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, -1.0472F));

        PartDefinition hexadecagon_r42 = hexadecagon6.addOrReplaceChild("hexadecagon_r42", CubeListBuilder.create().texOffs(7, 36).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, -1.0472F));

        PartDefinition hexadecagon_r43 = hexadecagon6.addOrReplaceChild("hexadecagon_r43", CubeListBuilder.create().texOffs(11, 36).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, -1.0472F));

        PartDefinition hexadecagon5 = bone.addOrReplaceChild("hexadecagon5", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9F, -7.3F, 8.0F, 0.0F, 0.0F, -0.2182F));

        PartDefinition hexadecagon_r44 = hexadecagon5.addOrReplaceChild("hexadecagon_r44", CubeListBuilder.create().texOffs(24, 6).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(36, 25).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, -0.7854F));

        PartDefinition hexadecagon_r45 = hexadecagon5.addOrReplaceChild("hexadecagon_r45", CubeListBuilder.create().texOffs(7, 24).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(3, 1).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition hexadecagon_r46 = hexadecagon5.addOrReplaceChild("hexadecagon_r46", CubeListBuilder.create().texOffs(11, 24).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(36, 15).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, -0.7854F));

        PartDefinition hexadecagon_r47 = hexadecagon5.addOrReplaceChild("hexadecagon_r47", CubeListBuilder.create().texOffs(17, 36).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, -0.7854F));

        PartDefinition hexadecagon_r48 = hexadecagon5.addOrReplaceChild("hexadecagon_r48", CubeListBuilder.create().texOffs(21, 36).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, -0.7854F));

        PartDefinition hexadecagon4 = bone.addOrReplaceChild("hexadecagon4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9F, -7.3F, 8.0F, 0.0F, 0.0F, -0.2182F));

        PartDefinition hexadecagon_r49 = hexadecagon4.addOrReplaceChild("hexadecagon_r49", CubeListBuilder.create().texOffs(24, 15).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(36, 31).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, -0.5236F));

        PartDefinition hexadecagon_r50 = hexadecagon4.addOrReplaceChild("hexadecagon_r50", CubeListBuilder.create().texOffs(17, 24).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition hexadecagon_r51 = hexadecagon4.addOrReplaceChild("hexadecagon_r51", CubeListBuilder.create().texOffs(24, 17).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(27, 36).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, -0.5236F));

        PartDefinition hexadecagon_r52 = hexadecagon4.addOrReplaceChild("hexadecagon_r52", CubeListBuilder.create().texOffs(36, 27).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, -0.5236F));

        PartDefinition hexadecagon_r53 = hexadecagon4.addOrReplaceChild("hexadecagon_r53", CubeListBuilder.create().texOffs(36, 29).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, -0.5236F));

        PartDefinition hexadecagon3 = bone.addOrReplaceChild("hexadecagon3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9F, -7.3F, 8.0F, 0.0F, 0.0F, -0.2182F));

        PartDefinition hexadecagon_r54 = hexadecagon3.addOrReplaceChild("hexadecagon_r54", CubeListBuilder.create().texOffs(21, 24).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(0, 37).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, -0.2618F));

        PartDefinition hexadecagon_r55 = hexadecagon3.addOrReplaceChild("hexadecagon_r55", CubeListBuilder.create().texOffs(24, 21).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(30, 43).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(44, 9).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition hexadecagon_r56 = hexadecagon3.addOrReplaceChild("hexadecagon_r56", CubeListBuilder.create().texOffs(24, 23).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(33, 36).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, -0.2618F));

        PartDefinition hexadecagon_r57 = hexadecagon3.addOrReplaceChild("hexadecagon_r57", CubeListBuilder.create().texOffs(36, 33).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, -0.2618F));

        PartDefinition hexadecagon_r58 = hexadecagon3.addOrReplaceChild("hexadecagon_r58", CubeListBuilder.create().texOffs(36, 35).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, -0.2618F));

        PartDefinition hexadecagon2 = bone.addOrReplaceChild("hexadecagon2", CubeListBuilder.create().texOffs(11, 44).addBox(-0.5F, -1.3962F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(44, 11).addBox(-0.5F, -1.3962F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(25, 8).addBox(-0.5F, -4.2F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9F, -7.3F, 8.0F, 0.0F, 0.0F, -0.2182F));

        PartDefinition hexadecagon_r59 = hexadecagon2.addOrReplaceChild("hexadecagon_r59", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(37, 10).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r60 = hexadecagon2.addOrReplaceChild("hexadecagon_r60", CubeListBuilder.create().texOffs(25, 10).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(37, 2).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r61 = hexadecagon2.addOrReplaceChild("hexadecagon_r61", CubeListBuilder.create().texOffs(37, 5).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r62 = hexadecagon2.addOrReplaceChild("hexadecagon_r62", CubeListBuilder.create().texOffs(37, 7).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone4 = main.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-4.0F, -8.0F, 8.0F));

        PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

        PartDefinition hexadecagon18 = bone5.addOrReplaceChild("hexadecagon18", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.7F, 0.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition hexadecagon_r63 = hexadecagon18.addOrReplaceChild("hexadecagon_r63", CubeListBuilder.create().texOffs(30, 25).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(14, 37).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, 1.3526F));

        PartDefinition hexadecagon_r64 = hexadecagon18.addOrReplaceChild("hexadecagon_r64", CubeListBuilder.create().texOffs(27, 30).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(36, 37).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 31).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 1.3526F));

        PartDefinition hexadecagon_r65 = hexadecagon18.addOrReplaceChild("hexadecagon_r65", CubeListBuilder.create().texOffs(30, 27).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(27, 42).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, 1.3526F));

        PartDefinition hexadecagon_r66 = hexadecagon18.addOrReplaceChild("hexadecagon_r66", CubeListBuilder.create().texOffs(42, 27).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, 1.3526F));

        PartDefinition hexadecagon_r67 = hexadecagon18.addOrReplaceChild("hexadecagon_r67", CubeListBuilder.create().texOffs(42, 29).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, 1.3526F));

        PartDefinition hexadecagon19 = bone5.addOrReplaceChild("hexadecagon19", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.7F, 0.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition hexadecagon_r68 = hexadecagon19.addOrReplaceChild("hexadecagon_r68", CubeListBuilder.create().texOffs(17, 30).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(24, 37).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, 1.309F));

        PartDefinition hexadecagon_r69 = hexadecagon19.addOrReplaceChild("hexadecagon_r69", CubeListBuilder.create().texOffs(21, 30).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(44, 23).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(45, 34).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 1.309F));

        PartDefinition hexadecagon_r70 = hexadecagon19.addOrReplaceChild("hexadecagon_r70", CubeListBuilder.create().texOffs(30, 23).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(17, 42).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, 1.309F));

        PartDefinition hexadecagon_r71 = hexadecagon19.addOrReplaceChild("hexadecagon_r71", CubeListBuilder.create().texOffs(42, 17).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, 1.309F));

        PartDefinition hexadecagon_r72 = hexadecagon19.addOrReplaceChild("hexadecagon_r72", CubeListBuilder.create().texOffs(21, 42).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, 1.309F));

        PartDefinition hexadecagon20 = bone5.addOrReplaceChild("hexadecagon20", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.7F, 0.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition hexadecagon_r73 = hexadecagon20.addOrReplaceChild("hexadecagon_r73", CubeListBuilder.create().texOffs(30, 3).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(37, 18).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, 1.0472F));

        PartDefinition hexadecagon_r74 = hexadecagon20.addOrReplaceChild("hexadecagon_r74", CubeListBuilder.create().texOffs(7, 30).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition hexadecagon_r75 = hexadecagon20.addOrReplaceChild("hexadecagon_r75", CubeListBuilder.create().texOffs(11, 30).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(11, 42).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, 1.0472F));

        PartDefinition hexadecagon_r76 = hexadecagon20.addOrReplaceChild("hexadecagon_r76", CubeListBuilder.create().texOffs(42, 13).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, 1.0472F));

        PartDefinition hexadecagon_r77 = hexadecagon20.addOrReplaceChild("hexadecagon_r77", CubeListBuilder.create().texOffs(42, 15).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, 1.0472F));

        PartDefinition hexadecagon21 = bone5.addOrReplaceChild("hexadecagon21", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.7F, 0.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition hexadecagon_r78 = hexadecagon21.addOrReplaceChild("hexadecagon_r78", CubeListBuilder.create().texOffs(29, 20).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(30, 37).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, 0.7854F));

        PartDefinition hexadecagon_r79 = hexadecagon21.addOrReplaceChild("hexadecagon_r79", CubeListBuilder.create().texOffs(24, 29).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(5, 0).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition hexadecagon_r80 = hexadecagon21.addOrReplaceChild("hexadecagon_r80", CubeListBuilder.create().texOffs(3, 30).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(36, 41).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, 0.7854F));

        PartDefinition hexadecagon_r81 = hexadecagon21.addOrReplaceChild("hexadecagon_r81", CubeListBuilder.create().texOffs(3, 42).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, 0.7854F));

        PartDefinition hexadecagon_r82 = hexadecagon21.addOrReplaceChild("hexadecagon_r82", CubeListBuilder.create().texOffs(7, 42).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, 0.7854F));

        PartDefinition hexadecagon22 = bone5.addOrReplaceChild("hexadecagon22", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.7F, 0.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition hexadecagon_r83 = hexadecagon22.addOrReplaceChild("hexadecagon_r83", CubeListBuilder.create().texOffs(14, 29).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(30, 41).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, 0.5236F));

        PartDefinition hexadecagon_r84 = hexadecagon22.addOrReplaceChild("hexadecagon_r84", CubeListBuilder.create().texOffs(29, 14).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.5236F));

        PartDefinition hexadecagon_r85 = hexadecagon22.addOrReplaceChild("hexadecagon_r85", CubeListBuilder.create().texOffs(29, 18).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(41, 22).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, 0.5236F));

        PartDefinition hexadecagon_r86 = hexadecagon22.addOrReplaceChild("hexadecagon_r86", CubeListBuilder.create().texOffs(24, 41).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, 0.5236F));

        PartDefinition hexadecagon_r87 = hexadecagon22.addOrReplaceChild("hexadecagon_r87", CubeListBuilder.create().texOffs(41, 24).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, 0.5236F));

        PartDefinition hexadecagon23 = bone5.addOrReplaceChild("hexadecagon23", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.7F, 0.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition hexadecagon_r88 = hexadecagon23.addOrReplaceChild("hexadecagon_r88", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(14, 41).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, 0.2618F));

        PartDefinition hexadecagon_r89 = hexadecagon23.addOrReplaceChild("hexadecagon_r89", CubeListBuilder.create().texOffs(29, 1).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(45, 30).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(45, 32).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.2618F));

        PartDefinition hexadecagon_r90 = hexadecagon23.addOrReplaceChild("hexadecagon_r90", CubeListBuilder.create().texOffs(14, 25).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(39, 40).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, 0.2618F));

        PartDefinition hexadecagon_r91 = hexadecagon23.addOrReplaceChild("hexadecagon_r91", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, 0.2618F));

        PartDefinition hexadecagon_r92 = hexadecagon23.addOrReplaceChild("hexadecagon_r92", CubeListBuilder.create().texOffs(41, 10).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, 0.2618F));

        PartDefinition hexadecagon24 = bone5.addOrReplaceChild("hexadecagon24", CubeListBuilder.create().texOffs(30, 45).addBox(-0.5F, -1.3962F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(45, 28).addBox(-0.5F, -1.3962F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(21, 28).addBox(-0.5F, -4.2F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.7F, 0.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition hexadecagon_r93 = hexadecagon24.addOrReplaceChild("hexadecagon_r93", CubeListBuilder.create().texOffs(17, 28).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(33, 40).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r94 = hexadecagon24.addOrReplaceChild("hexadecagon_r94", CubeListBuilder.create().texOffs(27, 28).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(40, 19).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r95 = hexadecagon24.addOrReplaceChild("hexadecagon_r95", CubeListBuilder.create().texOffs(38, 50).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r96 = hexadecagon24.addOrReplaceChild("hexadecagon_r96", CubeListBuilder.create().texOffs(27, 40).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition hexadecagon25 = bone5.addOrReplaceChild("hexadecagon25", CubeListBuilder.create().texOffs(24, 45).addBox(-0.5F, -1.3962F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(45, 18).addBox(-0.5F, -1.3962F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(11, 28).addBox(-0.5F, -4.2F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F)), PartPose.offset(-0.1F, 0.7F, 0.0F));

        PartDefinition hexadecagon_r97 = hexadecagon25.addOrReplaceChild("hexadecagon_r97", CubeListBuilder.create().texOffs(28, 9).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(17, 40).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r98 = hexadecagon25.addOrReplaceChild("hexadecagon_r98", CubeListBuilder.create().texOffs(28, 11).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(7, 40).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r99 = hexadecagon25.addOrReplaceChild("hexadecagon_r99", CubeListBuilder.create().texOffs(40, 8).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r100 = hexadecagon25.addOrReplaceChild("hexadecagon_r100", CubeListBuilder.create().texOffs(11, 40).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone6 = bone4.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-4.0F, 8.0F, -8.0F));

        PartDefinition hexadecagon29 = bone6.addOrReplaceChild("hexadecagon29", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9F, -7.3F, 8.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition hexadecagon_r101 = hexadecagon29.addOrReplaceChild("hexadecagon_r101", CubeListBuilder.create().texOffs(24, 27).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(39, 38).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, 1.0472F));

        PartDefinition hexadecagon_r102 = hexadecagon29.addOrReplaceChild("hexadecagon_r102", CubeListBuilder.create().texOffs(27, 24).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition hexadecagon_r103 = hexadecagon29.addOrReplaceChild("hexadecagon_r103", CubeListBuilder.create().texOffs(27, 26).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(39, 34).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, 1.0472F));

        PartDefinition hexadecagon_r104 = hexadecagon29.addOrReplaceChild("hexadecagon_r104", CubeListBuilder.create().texOffs(36, 39).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, 1.0472F));

        PartDefinition hexadecagon_r105 = hexadecagon29.addOrReplaceChild("hexadecagon_r105", CubeListBuilder.create().texOffs(49, 56).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, 1.0472F));

        PartDefinition hexadecagon30 = bone6.addOrReplaceChild("hexadecagon30", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9F, -7.3F, 8.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition hexadecagon_r106 = hexadecagon30.addOrReplaceChild("hexadecagon_r106", CubeListBuilder.create().texOffs(14, 27).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(39, 32).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, 0.7854F));

        PartDefinition hexadecagon_r107 = hexadecagon30.addOrReplaceChild("hexadecagon_r107", CubeListBuilder.create().texOffs(27, 16).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(3, 4).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition hexadecagon_r108 = hexadecagon30.addOrReplaceChild("hexadecagon_r108", CubeListBuilder.create().texOffs(27, 22).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(39, 28).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, 0.7854F));

        PartDefinition hexadecagon_r109 = hexadecagon30.addOrReplaceChild("hexadecagon_r109", CubeListBuilder.create().texOffs(30, 39).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, 0.7854F));

        PartDefinition hexadecagon_r110 = hexadecagon30.addOrReplaceChild("hexadecagon_r110", CubeListBuilder.create().texOffs(39, 30).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, 0.7854F));

        PartDefinition hexadecagon31 = bone6.addOrReplaceChild("hexadecagon31", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9F, -7.3F, 8.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition hexadecagon_r111 = hexadecagon31.addOrReplaceChild("hexadecagon_r111", CubeListBuilder.create().texOffs(21, 26).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(39, 26).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, 0.5236F));

        PartDefinition hexadecagon_r112 = hexadecagon31.addOrReplaceChild("hexadecagon_r112", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.5236F));

        PartDefinition hexadecagon_r113 = hexadecagon31.addOrReplaceChild("hexadecagon_r113", CubeListBuilder.create().texOffs(27, 5).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(57, 31).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, 0.5236F));

        PartDefinition hexadecagon_r114 = hexadecagon31.addOrReplaceChild("hexadecagon_r114", CubeListBuilder.create().texOffs(57, 31).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, 0.5236F));

        PartDefinition hexadecagon_r115 = hexadecagon31.addOrReplaceChild("hexadecagon_r115", CubeListBuilder.create().texOffs(24, 39).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, 0.5236F));

        PartDefinition hexadecagon32 = bone6.addOrReplaceChild("hexadecagon32", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9F, -7.3F, 8.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition hexadecagon_r116 = hexadecagon32.addOrReplaceChild("hexadecagon_r116", CubeListBuilder.create().texOffs(26, 13).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(14, 39).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, 0.2618F));

        PartDefinition hexadecagon_r117 = hexadecagon32.addOrReplaceChild("hexadecagon_r117", CubeListBuilder.create().texOffs(17, 26).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(0, 45).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 45).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.2618F));

        PartDefinition hexadecagon_r118 = hexadecagon32.addOrReplaceChild("hexadecagon_r118", CubeListBuilder.create().texOffs(26, 19).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(33, 38).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, 0.2618F));

        PartDefinition hexadecagon_r119 = hexadecagon32.addOrReplaceChild("hexadecagon_r119", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, 0.2618F));

        PartDefinition hexadecagon_r120 = hexadecagon32.addOrReplaceChild("hexadecagon_r120", CubeListBuilder.create().texOffs(39, 12).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, 0.2618F));

        PartDefinition hexadecagon33 = bone6.addOrReplaceChild("hexadecagon33", CubeListBuilder.create().texOffs(39, 44).addBox(-0.5F, -1.3962F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(33, 44).addBox(-0.5F, -1.3962F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 26).addBox(-0.5F, -4.2F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, -7.3F, 8.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition hexadecagon_r121 = hexadecagon33.addOrReplaceChild("hexadecagon_r121", CubeListBuilder.create().texOffs(26, 3).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(27, 38).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r122 = hexadecagon33.addOrReplaceChild("hexadecagon_r122", CubeListBuilder.create().texOffs(11, 26).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(57, 31).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r123 = hexadecagon33.addOrReplaceChild("hexadecagon_r123", CubeListBuilder.create().texOffs(38, 21).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r124 = hexadecagon33.addOrReplaceChild("hexadecagon_r124", CubeListBuilder.create().texOffs(38, 23).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition hexadecagon34 = bone6.addOrReplaceChild("hexadecagon34", CubeListBuilder.create().texOffs(27, 44).addBox(-0.5F, -1.3962F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(44, 25).addBox(-0.5F, -1.3962F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(26, 0).addBox(-0.5F, -4.2F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -7.3F, 8.0F));

        PartDefinition hexadecagon_r125 = hexadecagon34.addOrReplaceChild("hexadecagon_r125", CubeListBuilder.create().texOffs(24, 25).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(17, 38).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.3927F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r126 = hexadecagon34.addOrReplaceChild("hexadecagon_r126", CubeListBuilder.create().texOffs(3, 26).addBox(-0.5F, -3.5F, -0.6962F, 1.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(3, 38).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.3927F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r127 = hexadecagon34.addOrReplaceChild("hexadecagon_r127", CubeListBuilder.create().texOffs(7, 38).addBox(-0.5F, -0.6962F, 2.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.7854F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r128 = hexadecagon34.addOrReplaceChild("hexadecagon_r128", CubeListBuilder.create().texOffs(11, 38).addBox(-0.5F, -0.6962F, -3.5F, 1.0F, 1.3924F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone9 = main.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2F, 0.0F));

        PartDefinition bone7 = bone9.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(-4.0F, -7.8F, 8.0F));

        PartDefinition hexadecagon = bone7.addOrReplaceChild("hexadecagon", CubeListBuilder.create().texOffs(46, 0).addBox(-0.2044F, -0.5F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(45, 44).addBox(-0.2044F, -0.5F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 9).addBox(3.0F, -0.5F, -0.7956F, 1.0F, 1.0F, 1.5913F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition hexadecagon_r129 = hexadecagon.addOrReplaceChild("hexadecagon_r129", CubeListBuilder.create().texOffs(0, 9).addBox(3.0F, -0.5F, -0.7956F, 1.0F, 1.0F, 1.5913F, new CubeDeformation(0.0F))
                .texOffs(17, 1).addBox(-0.7956F, -0.5F, -4.0F, 1.5913F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

        PartDefinition hexadecagon_r130 = hexadecagon.addOrReplaceChild("hexadecagon_r130", CubeListBuilder.create().texOffs(4, 10).addBox(3.0F, -0.5F, -0.7956F, 1.0F, 1.0F, 1.5913F, new CubeDeformation(0.0F))
                .texOffs(16, 13).addBox(-0.7956F, -0.5F, 3.0F, 1.5913F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

        PartDefinition hexadecagon_r131 = hexadecagon.addOrReplaceChild("hexadecagon_r131", CubeListBuilder.create().texOffs(16, 15).addBox(-0.7956F, -0.5F, 3.0F, 1.5913F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition hexadecagon_r132 = hexadecagon.addOrReplaceChild("hexadecagon_r132", CubeListBuilder.create().texOffs(0, 17).addBox(-0.7956F, -0.5F, -4.0F, 1.5913F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition hexadecagon35 = bone7.addOrReplaceChild("hexadecagon35", CubeListBuilder.create().texOffs(45, 42).addBox(-0.2044F, -0.8F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 45).addBox(-0.2044F, -0.8F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 3).addBox(3.0F, -0.8F, -0.7956F, 1.0F, 1.0F, 1.5913F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition hexadecagon_r133 = hexadecagon35.addOrReplaceChild("hexadecagon_r133", CubeListBuilder.create().texOffs(8, 0).addBox(3.0F, -0.5F, -0.7956F, 1.0F, 1.0F, 1.5913F, new CubeDeformation(0.0F))
                .texOffs(11, 16).addBox(-0.7956F, -0.5F, -4.0F, 1.5913F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 0.0F, 0.0F, -0.3927F, 0.0F));

        PartDefinition hexadecagon_r134 = hexadecagon35.addOrReplaceChild("hexadecagon_r134", CubeListBuilder.create().texOffs(9, 52).addBox(3.0F, -0.5F, -0.7956F, 1.0F, 1.0F, 1.5913F, new CubeDeformation(0.0F))
                .texOffs(14, 11).addBox(-0.7956F, -0.5F, 3.0F, 1.5913F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 0.0F, 0.0F, 0.3927F, 0.0F));

        PartDefinition hexadecagon_r135 = hexadecagon35.addOrReplaceChild("hexadecagon_r135", CubeListBuilder.create().texOffs(0, 15).addBox(-0.7956F, -0.5F, 3.0F, 1.5913F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition hexadecagon_r136 = hexadecagon35.addOrReplaceChild("hexadecagon_r136", CubeListBuilder.create().texOffs(5, 16).addBox(-0.7956F, -0.5F, -4.0F, 1.5913F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition bone8 = bone9.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -8.1F, 8.0F, 0.0F, 0.0F, 2.7053F));

        PartDefinition hexadecagon36 = bone8.addOrReplaceChild("hexadecagon36", CubeListBuilder.create().texOffs(45, 40).addBox(-0.088F, -0.4815F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(45, 38).addBox(-0.088F, -0.4815F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 6).addBox(3.1164F, -0.4815F, -0.7956F, 1.0F, 1.0F, 1.5913F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition hexadecagon_r137 = hexadecagon36.addOrReplaceChild("hexadecagon_r137", CubeListBuilder.create().texOffs(4, 4).addBox(3.0F, -0.5F, -0.7956F, 1.0F, 1.0F, 1.5913F, new CubeDeformation(0.0F))
                .texOffs(11, 14).addBox(-0.7956F, -0.5F, -4.0F, 1.5913F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1164F, 0.0185F, 0.0F, 0.0F, -0.3927F, 0.0F));

        PartDefinition hexadecagon_r138 = hexadecagon36.addOrReplaceChild("hexadecagon_r138", CubeListBuilder.create().texOffs(4, 7).addBox(3.0F, -0.5F, -0.7956F, 1.0F, 1.0F, 1.5913F, new CubeDeformation(0.0F))
                .texOffs(12, 9).addBox(-0.7956F, -0.5F, 3.0F, 1.5913F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1164F, 0.0185F, 0.0F, 0.0F, 0.3927F, 0.0F));

        PartDefinition hexadecagon_r139 = hexadecagon36.addOrReplaceChild("hexadecagon_r139", CubeListBuilder.create().texOffs(0, 13).addBox(-0.7956F, -0.5F, 3.0F, 1.5913F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1164F, 0.0185F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition hexadecagon_r140 = hexadecagon36.addOrReplaceChild("hexadecagon_r140", CubeListBuilder.create().texOffs(5, 14).addBox(-0.7956F, -0.5F, -4.0F, 1.5913F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1164F, 0.0185F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition hexadecagon37 = bone8.addOrReplaceChild("hexadecagon37", CubeListBuilder.create().texOffs(21, 44).addBox(-0.088F, -0.7815F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(17, 44).addBox(-0.088F, -0.7815F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(53, 12).addBox(3.1164F, -0.7815F, -0.7956F, 1.0F, 1.0F, 1.5913F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition hexadecagon_r141 = hexadecagon37.addOrReplaceChild("hexadecagon_r141", CubeListBuilder.create().texOffs(53, 12).addBox(3.0F, -0.5F, -0.7956F, 1.0F, 1.0F, 1.5913F, new CubeDeformation(0.0F))
                .texOffs(9, 12).addBox(-0.7956F, -0.5F, -4.0F, 1.5913F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1164F, -0.2815F, 0.0F, 0.0F, -0.3927F, 0.0F));

        PartDefinition hexadecagon_r142 = hexadecagon37.addOrReplaceChild("hexadecagon_r142", CubeListBuilder.create().texOffs(4, 1).addBox(3.0F, -0.5F, -0.7956F, 1.0F, 1.0F, 1.5913F, new CubeDeformation(0.0F))
                .texOffs(12, 0).addBox(-0.7956F, -0.5F, 3.0F, 1.5913F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1164F, -0.2815F, 0.0F, 0.0F, 0.3927F, 0.0F));

        PartDefinition hexadecagon_r143 = hexadecagon37.addOrReplaceChild("hexadecagon_r143", CubeListBuilder.create().texOffs(12, 3).addBox(-0.7956F, -0.5F, 3.0F, 1.5913F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1164F, -0.2815F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition hexadecagon_r144 = hexadecagon37.addOrReplaceChild("hexadecagon_r144", CubeListBuilder.create().texOffs(12, 6).addBox(-0.7956F, -0.5F, -4.0F, 1.5913F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1164F, -0.2815F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition hexadecagon38 = main.addOrReplaceChild("hexadecagon38", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, 0.7F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, 0.7F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -1.0F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2F, -6.9F, 6.2F, 2.7585F, 0.6705F, 2.6119F));

        PartDefinition hexadecagon_r145 = hexadecagon38.addOrReplaceChild("hexadecagon_r145", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, 0.7F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, 0.7F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r146 = hexadecagon38.addOrReplaceChild("hexadecagon_r146", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, 0.7F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, 0.7F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r147 = hexadecagon38.addOrReplaceChild("hexadecagon_r147", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1989F, 0.7F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r148 = hexadecagon38.addOrReplaceChild("hexadecagon_r148", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1989F, 0.7F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

        PartDefinition hexadecagon202 = main.addOrReplaceChild("hexadecagon202", CubeListBuilder.create().texOffs(0, 10).addBox(-8.5F, -8.2984F, 6.5F, 1.0F, 0.5967F, 0.5F, new CubeDeformation(0.0F))
                .texOffs(47, 7).addBox(-8.5F, -8.2984F, 9.0F, 1.0F, 0.5967F, 0.5F, new CubeDeformation(0.0F))
                .texOffs(7, 7).addBox(-8.5F, -7.0F, 7.7016F, 1.0F, 0.5F, 0.5967F, new CubeDeformation(0.0F))
                .texOffs(11, 46).addBox(-8.5F, -9.5F, 7.7016F, 1.0F, 0.5F, 0.5967F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.0F, 2.1F, -1.4F, 1.5708F, 1.3963F, 1.5708F));

        PartDefinition hexadecagon_r149 = hexadecagon202.addOrReplaceChild("hexadecagon_r149", CubeListBuilder.create().texOffs(7, 46).addBox(-0.5F, -1.5F, -0.2984F, 1.0F, 0.5F, 0.5967F, new CubeDeformation(0.0F))
                .texOffs(23, 54).addBox(-0.5F, 1.0F, -0.2984F, 1.0F, 0.5F, 0.5967F, new CubeDeformation(0.0F))
                .texOffs(0, 47).addBox(-0.5F, -0.2984F, 1.0F, 1.0F, 0.5967F, 0.5F, new CubeDeformation(0.0F))
                .texOffs(0, 9).addBox(-0.5F, -0.2984F, -1.5F, 1.0F, 0.5967F, 0.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, -0.3927F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r150 = hexadecagon202.addOrReplaceChild("hexadecagon_r150", CubeListBuilder.create().texOffs(17, 46).addBox(-0.5F, -1.5F, -0.2984F, 1.0F, 0.5F, 0.5967F, new CubeDeformation(0.0F))
                .texOffs(3, 10).addBox(-0.5F, 1.0F, -0.2984F, 1.0F, 0.5F, 0.5967F, new CubeDeformation(0.0F))
                .texOffs(47, 10).addBox(-0.5F, -0.2984F, 1.0F, 1.0F, 0.5967F, 0.5F, new CubeDeformation(0.0F))
                .texOffs(8, 10).addBox(-0.5F, -0.2984F, -1.5F, 1.0F, 0.5967F, 0.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.3927F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r151 = hexadecagon202.addOrReplaceChild("hexadecagon_r151", CubeListBuilder.create().texOffs(45, 46).addBox(-0.5F, -0.2984F, 1.0F, 1.0F, 0.5967F, 0.5F, new CubeDeformation(0.0F))
                .texOffs(0, 7).addBox(-0.5F, -0.2984F, -1.5F, 1.0F, 0.5967F, 0.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r152 = hexadecagon202.addOrReplaceChild("hexadecagon_r152", CubeListBuilder.create().texOffs(47, 12).addBox(-0.5F, -0.2984F, 1.0F, 1.0F, 0.5967F, 0.5F, new CubeDeformation(0.0F))
                .texOffs(0, 12).addBox(-0.5F, -0.2984F, -1.5F, 1.0F, 0.5967F, 0.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.7854F, 0.0F, 0.0F));

        PartDefinition hexadecagon39 = main.addOrReplaceChild("hexadecagon39", CubeListBuilder.create(), PartPose.offsetAndRotation(-12.0F, 2.1F, -1.6F, 1.5708F, 1.3963F, 1.5708F));

        PartDefinition hexadecagon_r153 = hexadecagon39.addOrReplaceChild("hexadecagon_r153", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.5F, -0.2984F, 1.0F, 0.5F, 0.5967F, new CubeDeformation(0.0F))
                .texOffs(7, 0).addBox(-0.5F, 1.0F, -0.2984F, 1.0F, 0.5F, 0.5967F, new CubeDeformation(0.0F))
                .texOffs(46, 21).addBox(-0.5F, -0.2984F, 1.0F, 1.0F, 0.5967F, 0.5F, new CubeDeformation(0.0F))
                .texOffs(0, 1).addBox(-0.5F, -0.2984F, -1.5F, 1.0F, 0.5967F, 0.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.0F, -7.0F, 8.0F, -0.3927F, 0.0F, 2.7925F));

        PartDefinition hexadecagon_r154 = hexadecagon39.addOrReplaceChild("hexadecagon_r154", CubeListBuilder.create().texOffs(3, 46).addBox(-0.5F, -1.5F, -0.2984F, 1.0F, 0.5F, 0.5967F, new CubeDeformation(0.0F))
                .texOffs(7, 1).addBox(-0.5F, 1.0F, -0.2984F, 1.0F, 0.5F, 0.5967F, new CubeDeformation(0.0F))
                .texOffs(27, 46).addBox(-0.5F, -0.2984F, 1.0F, 1.0F, 0.5967F, 0.5F, new CubeDeformation(0.0F))
                .texOffs(0, 3).addBox(-0.5F, -0.2984F, -1.5F, 1.0F, 0.5967F, 0.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.0F, -7.0F, 8.0F, 0.0F, 0.0F, 2.7925F));

        PartDefinition hexadecagon_r155 = hexadecagon39.addOrReplaceChild("hexadecagon_r155", CubeListBuilder.create().texOffs(46, 5).addBox(-0.5F, -1.5F, -0.2984F, 1.0F, 0.5F, 0.5967F, new CubeDeformation(0.0F))
                .texOffs(3, 7).addBox(-0.5F, 1.0F, -0.2984F, 1.0F, 0.5F, 0.5967F, new CubeDeformation(0.0F))
                .texOffs(33, 46).addBox(-0.5F, -0.2984F, 1.0F, 1.0F, 0.5967F, 0.5F, new CubeDeformation(0.0F))
                .texOffs(0, 4).addBox(-0.5F, -0.2984F, -1.5F, 1.0F, 0.5967F, 0.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.0F, -7.0F, 8.0F, 0.3927F, 0.0F, 2.7925F));

        PartDefinition hexadecagon_r156 = hexadecagon39.addOrReplaceChild("hexadecagon_r156", CubeListBuilder.create().texOffs(21, 46).addBox(-0.5F, -0.2984F, 1.0F, 1.0F, 0.5967F, 0.5F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.2984F, -1.5F, 1.0F, 0.5967F, 0.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.0F, -7.0F, 8.0F, -0.7854F, 0.0F, 2.7925F));

        PartDefinition hexadecagon_r157 = hexadecagon39.addOrReplaceChild("hexadecagon_r157", CubeListBuilder.create().texOffs(39, 46).addBox(-0.5F, -0.2984F, 1.0F, 1.0F, 0.5967F, 0.5F, new CubeDeformation(0.0F))
                .texOffs(0, 6).addBox(-0.5F, -0.2984F, -1.5F, 1.0F, 0.5967F, 0.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.0F, -7.0F, 8.0F, 0.7854F, 0.0F, 2.7925F));

        PartDefinition hexadecagon41 = main.addOrReplaceChild("hexadecagon41", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6F, -6.3F, 9.3F, 2.6888F, 0.6667F, 2.6611F));

        PartDefinition hexadecagon_r158 = hexadecagon41.addOrReplaceChild("hexadecagon_r158", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, 0.7F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, 0.7F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1448F, -0.3048F, -0.7173F, 0.2726F, 1.0672F, 1.0849F));

        PartDefinition hexadecagon_r159 = hexadecagon41.addOrReplaceChild("hexadecagon_r159", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, 0.7F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, 0.7F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1448F, -0.3048F, -0.7173F, 0.6653F, 1.0672F, 1.0849F));

        PartDefinition hexadecagon_r160 = hexadecagon41.addOrReplaceChild("hexadecagon_r160", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, 0.7F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, 0.7F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1448F, -0.3048F, -0.7173F, 1.058F, 1.0672F, 1.0849F));

        PartDefinition hexadecagon_r161 = hexadecagon41.addOrReplaceChild("hexadecagon_r161", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1989F, 0.7F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1448F, -0.3048F, -0.7173F, -0.1201F, 1.0672F, 1.0849F));

        PartDefinition hexadecagon_r162 = hexadecagon41.addOrReplaceChild("hexadecagon_r162", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1989F, 0.7F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1448F, -0.3048F, -0.7173F, 1.4507F, 1.0672F, 1.0849F));

        PartDefinition hexadecagon40 = main.addOrReplaceChild("hexadecagon40", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, -7.6F, 10.2F, 0.482F, 0.1655F, 2.2896F));

        PartDefinition hexadecagon_r163 = hexadecagon40.addOrReplaceChild("hexadecagon_r163", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, 0.7F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, 0.7F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1427F, -2.3078F, -3.2014F, -0.3795F, -0.1596F, 1.4629F));

        PartDefinition hexadecagon_r164 = hexadecagon40.addOrReplaceChild("hexadecagon_r164", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, 0.7F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, 0.7F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1427F, -2.3078F, -3.2014F, -0.7722F, -0.1596F, 1.4629F));

        PartDefinition hexadecagon_r165 = hexadecagon40.addOrReplaceChild("hexadecagon_r165", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, 0.7F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, 0.7F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1427F, -2.3078F, -3.2014F, -1.1649F, -0.1596F, 1.4629F));

        PartDefinition hexadecagon_r166 = hexadecagon40.addOrReplaceChild("hexadecagon_r166", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, 0.7F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1427F, -2.3078F, -3.2014F, 0.0132F, -0.1596F, 1.4629F));

        PartDefinition hexadecagon_r167 = hexadecagon40.addOrReplaceChild("hexadecagon_r167", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, 0.7F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1427F, -2.3078F, -3.2014F, -1.5576F, -0.1596F, 1.4629F));

        PartDefinition hexadecagon43 = main.addOrReplaceChild("hexadecagon43", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, -7.6F, 10.2F, 0.482F, 0.1655F, 2.2896F));

        PartDefinition hexadecagon_r168 = hexadecagon43.addOrReplaceChild("hexadecagon_r168", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, 0.7F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, 0.7F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6427F, -0.6078F, 0.0014F, 0.2726F, 1.0672F, 1.0849F));

        PartDefinition hexadecagon_r169 = hexadecagon43.addOrReplaceChild("hexadecagon_r169", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, 0.7F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, 0.7F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6427F, -0.6078F, 0.0014F, 0.6653F, 1.0672F, 1.0849F));

        PartDefinition hexadecagon_r170 = hexadecagon43.addOrReplaceChild("hexadecagon_r170", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, 0.7F, -0.1989F, 1.0F, 0.3F, 0.3978F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, 0.7F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6427F, -0.6078F, 0.0014F, 1.058F, 1.0672F, 1.0849F));

        PartDefinition hexadecagon_r171 = hexadecagon43.addOrReplaceChild("hexadecagon_r171", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1989F, 0.7F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6427F, -0.6078F, 0.0014F, -0.1201F, 1.0672F, 1.0849F));

        PartDefinition hexadecagon_r172 = hexadecagon43.addOrReplaceChild("hexadecagon_r172", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1989F, 0.7F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6427F, -0.6078F, 0.0014F, 1.4507F, 1.0672F, 1.0849F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
