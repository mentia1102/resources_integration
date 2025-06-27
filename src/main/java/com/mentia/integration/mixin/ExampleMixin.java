package com.mentia.integration.mixin;

import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public class ExampleMixin {
	@Inject(method = "getMaxCount()I",at=@At("HEAD"), cancellable = true)
	private void getCunstomMaxCount(CallbackInfoReturnable<Integer> cir) {
//		ItemStack stack = (ItemStack) (Object) this;
//		if (stack.getItem().getClass().getName().contains("board_resource")) {
//			cir.setReturnValue(stack.getItem().getMaxCount());
//		}
		// This code is injected into the start of MinecraftServer.loadWorld()V
	}
}