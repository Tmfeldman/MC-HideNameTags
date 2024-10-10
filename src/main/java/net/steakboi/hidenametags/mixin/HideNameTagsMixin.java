package net.steakboi.hidenametags.mixin;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.steakboi.hidenametags.HideNameTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityRenderer.class)
public abstract class HideNameTagsMixin {
    @Inject(method = {"renderNameTag"}, at = @At("HEAD"), cancellable = true)
    protected void HideNameTags(CallbackInfo ci) {
        if (HideNameTags.hideNameTags) {
            ci.cancel();
        }
    }
}