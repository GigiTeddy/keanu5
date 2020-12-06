package me.TeddyTheGamer.KeanuMod.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import me.TeddyTheGamer.KeanuMod.entities.CyberKeanu;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class CyberKeanuModel <T extends CyberKeanu> extends EntityModel<T> {
	private final ModelRenderer head;
	private final ModelRenderer headwear;
	private final ModelRenderer body;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public CyberKeanuModel() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		headwear = new ModelRenderer(this);
		headwear.setRotationPoint(0.0F, 0.0F, 0.0F);
		headwear.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.25F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-8.0F, 2.0F, 0.0F);
		right_arm.setTextureOffset(40, 16).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(40, 32).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(8.0F, 2.0F, 0.0F);
		left_arm.setTextureOffset(32, 48).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(48, 48).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		right_leg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.0F, 12.0F, 0.0F);
		left_leg.setTextureOffset(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
	}
	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		this.head.rotateAngleX = headPitch * ((float)Math.PI /180f);
		this.head.rotateAngleY = headPitch * ((float)Math.PI /180f);
		this.headwear.rotateAngleX = headPitch * ((float)Math.PI /180f);
		this.headwear.rotateAngleY = headPitch * ((float)Math.PI /180f);
		this.body.rotateAngleX = ((float)Math.PI /2f);
		this.left_arm.rotateAngleX = MathHelper.cos(limbSwing * 0.662F) *1.6F *limbSwingAmount;
		this.right_arm.rotateAngleX = MathHelper.cos(limbSwing * 0.662F) *1.6F *limbSwingAmount;
		this.left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.662F) *1.4F *limbSwingAmount;
		this.right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.662F) *1.4F *limbSwingAmount;
		
		
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		headwear.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}


	

}
