package net.steakboi.hidenametags.mixin;

import net.minecraft.client.render.entity.EntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.steakboi.hidenametags.HideNameTags;

@Mixin(EntityRenderer.class)
public abstract class HideNameTagsMixin {
	@Inject(method = {"renderLabelIfPresent"}, at = @At("HEAD"), cancellable = true)
	protected void HideNameTags(CallbackInfo ci) {
		if (HideNameTags.hideNameTags) {
			ci.cancel();
		}
	}
}