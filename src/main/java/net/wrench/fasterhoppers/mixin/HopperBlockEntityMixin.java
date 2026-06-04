package net.wrench.fasterhoppers.mixin;

import net.minecraft.block.entity.HopperBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(HopperBlockEntity.class)
public class HopperBlockEntityMixin {
    @ModifyConstant(method = "insertAndExtract", constant = @Constant(intValue = 8), require = 0)
    private static int maxSpeed(int original) {
        return 1;
    }
}
