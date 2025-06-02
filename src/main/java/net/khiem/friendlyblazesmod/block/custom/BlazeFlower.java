package net.khiem.friendlyblazesmod.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.*;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class BlazeFlower extends FlowerBlock {

    public BlazeFlower(RegistryEntry<StatusEffect> stewEffect, float effectLengthInSeconds, Settings settings) {
        super(stewEffect, effectLengthInSeconds, settings);
    }

    @Override
    protected void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity, EntityCollisionHandler handler) {
        if (entity instanceof LivingEntity) {
            entity.slowMovement(state, new Vec3d(0.8F, 0.75, 0.8F));
            if (world instanceof ServerWorld serverWorld) {
                Vec3d vec3d = entity.isControlledByPlayer() ? entity.getMovement() : entity.getLastRenderPos().subtract(entity.getPos());
                if (vec3d.horizontalLengthSquared() > 0.0) {
                    double d = Math.abs(vec3d.getX());
                    double e = Math.abs(vec3d.getZ());
                    if (d >= 0.003F || e >= 0.003F) {
                        entity.damage(serverWorld, world.getDamageSources().sweetBerryBush(), 1.0F);
                    }
                }
            }
        }
        handler.addEvent(CollisionEvent.FIRE_IGNITE);
        handler.addPostCallback(CollisionEvent.FIRE_IGNITE, entityx -> entityx.serverDamage(entityx.getWorld().getDamageSources().inFire(), 1));
    }
}
