package cassanoahvah.fluidbackpack;

import cassanoahvah.fluidbackpack.items.ItemFluidHoover;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.Logger;


@Mod(modid = FluidBackpack.MODID, name = FluidBackpack.NAME, version = FluidBackpack.VERSION)
public class FluidBackpack
{
    public static final String MODID = "fluidbackpack";
    public static final String NAME = "Fluid Backpack";
    public static final String VERSION = "0.1";

    private static Logger logger;

    //ITEMS
    public static Item fluid_hoover;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    @Mod.EventBusSubscriber(modid=MODID)
    public static class Registration {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            IForgeRegistry<Item> r = event.getRegistry();

            //Fluid Hoover Main Item
            fluid_hoover = new ItemFluidHoover();
            event.getRegistry().registerAll(fluid_hoover);
            ModelResourceLocation modloc = new ModelResourceLocation("fluidbackpack:fluid_hoover");
            ModelLoader.setCustomModelResourceLocation(fluid_hoover, 0, modloc);
        }
    }
}
