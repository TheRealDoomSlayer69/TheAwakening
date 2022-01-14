package io.github.TheRealDoomSlayer.theawakening;

import io.github.TheRealDoomSlayer.theawakening.core.init.BlockInit;
import io.github.TheRealDoomSlayer.theawakening.core.init.ItemInit;
import io.github.TheRealDoomSlayer.theawakening.core.init.SoundInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = TheAwakening.MODID )
public class TheAwakening {
    public static final String MODID = "theawakening";

    public TheAwakening() {
    	// TODO Auto-generated constructor stub
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();



        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        SoundInit.SOUNDS.register(bus);

    }

    public static final CreativeModeTab THE_AWAKENING_MATERIALS = new CreativeModeTab(MODID) { // itemGroup.theawakening
    	@Override
        public ItemStack makeIcon() {
            return ItemInit.PYRIUM_INGOT.get().getDefaultInstance();
		}
    };


}