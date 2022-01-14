package io.github.TheRealDoomSlayer.theawakening.core.world.features;

import io.github.TheRealDoomSlayer.theawakening.TheAwakening;
import io.github.TheRealDoomSlayer.theawakening.core.world.features.gen.OreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;



@Mod.EventBusSubscriber(modid = TheAwakening.MODID)
public class WorldGenerationEvents {
    @SubscribeEvent
    public static void ModWorldGeneration(final BiomeLoadingEvent event) {
        OreGeneration.generateOres(event);

    }
}
