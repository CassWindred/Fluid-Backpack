package cassanoahvah.fluidbackpack.items;

import cassanoahvah.fluidbackpack.FluidBackpack;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemFluidHoover extends Item {
    public ItemFluidHoover() {
        this.setRegistryName(new ResourceLocation("fluidbackpack:fluid_hoover"));
        this.setUnlocalizedName("fluid_hoover");
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.TOOLS);
    }
}
