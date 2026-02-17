package net.beholderface.patternmastersfix.mixin;

import at.petrak.hexcasting.api.casting.PatternShapeMatch;
import at.petrak.hexcasting.api.casting.eval.CastingEnvironment;
import at.petrak.hexcasting.api.casting.math.HexPattern;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import ram.talia.moreiotas.common.casting.actions.strings.OpActionString;

@Mixin(OpActionString.class)
public class PatternmasterFixMixin {
    @WrapOperation(method = "execute", at = @At(value = "INVOKE",
            target = "Lat/petrak/hexcasting/common/casting/PatternRegistryManifest;matchPattern(Lat/petrak/hexcasting/api/casting/math/HexPattern;Lat/petrak/hexcasting/api/casting/eval/CastingEnvironment;Z)Lat/petrak/hexcasting/api/casting/PatternShapeMatch;",
    remap = false), remap = false)
    public PatternShapeMatch matchPatternNoAlternateOrders(HexPattern key, CastingEnvironment env, boolean environment, Operation<PatternShapeMatch> original){
        return original.call(key, env, false);
    }
}
