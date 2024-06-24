package io.github.foundationgames.automobility.entity.render;

import com.mojang.blaze3d.vertex.VertexConsumer;

public class AlphaMultiplierVertexConsumer implements VertexConsumer {

    VertexConsumer vertexConsumer;
    float multiplier;

    public AlphaMultiplierVertexConsumer(VertexConsumer vertexConsumer, float multiplier){
            this.vertexConsumer = vertexConsumer;
            this.multiplier = multiplier;
    }

    @Override
    public VertexConsumer vertex(double var1, double var3, double var5) {
        return vertexConsumer.vertex(var1, var3, var5);
    }

    @Override
    public VertexConsumer color(int var1, int var2, int var3, int var4) {
        return vertexConsumer.color(var1, var2, var3, (int)(var4*multiplier));
    }

    @Override
    public VertexConsumer uv(float var1, float var2) {
        return vertexConsumer.uv(var1, var2);
    }

    @Override
    public VertexConsumer overlayCoords(int var1, int var2) {
        return vertexConsumer.overlayCoords(var1, var2);
    }

    @Override
    public VertexConsumer uv2(int var1, int var2) {
        return vertexConsumer.uv2(var1, var2);
    }

    @Override
    public VertexConsumer normal(float var1, float var2, float var3) {
        return vertexConsumer.normal(var1, var2, var3);
    }

    @Override
    public void endVertex() {
        vertexConsumer.endVertex();
    }

    @Override
    public void defaultColor(int var1, int var2, int var3, int var4) {
        vertexConsumer.defaultColor(var1, var2, var3, var4);
    }

    @Override
    public void unsetDefaultColor() {
        vertexConsumer.unsetDefaultColor();
    }
}