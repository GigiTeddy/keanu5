package me.TeddyTheGamer.KeanuMod.entities;

import net.minecraft.block.BlockState;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CyberKeanu extends CreatureEntity{


	public CyberKeanu(EntityType<? extends CreatureEntity> type, World worldIn) {
		super(type, worldIn);
		
	}
	public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
		return MobEntity.registerAttributes()
				.createMutableAttribute(Attributes.MAX_HEALTH, 100)
				.createMutableAttribute(Attributes.MOVEMENT_SPEED, 1.1);
	}
	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(0, new SwimGoal(this));
		this.goalSelector.addGoal(1, new LookAtGoal(this, PlayerEntity.class, 10F));
		this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
	}
	@Override
	protected int getExperiencePoints (PlayerEntity player) {
		return 10653;
	}
	@Override
	protected SoundEvent getAmbientSound() {
		return super.getAmbientSound();
		// return SoundEvents.#######;
		
	}
	@Override
	protected SoundEvent getDeathSound() {
		return super.getDeathSound();
		// return SoundEvents.#######;
	}
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.ENTITY_BEE_HURT;
	}
	@Override
	protected void playStepSound(BlockPos po, BlockState blockIn) {
		this.playSound(SoundEvents.ENTITY_ZOMBIE_STEP, 0.15F, 1.0F);
	}
	
}
