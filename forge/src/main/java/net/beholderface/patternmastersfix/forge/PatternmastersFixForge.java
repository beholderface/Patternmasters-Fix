package net.beholderface.patternmastersfix.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.beholderface.patternmastersfix.PatternmastersFix;

@Mod(PatternmastersFix.MOD_ID)
public final class PatternmastersFixForge {
    public PatternmastersFixForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(PatternmastersFix.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        PatternmastersFix.init();
    }
}
