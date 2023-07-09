package youngsditch.ancientlogistics.mixin;

import net.minecraft.src.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value = TileEntityChest.class, remap = false)
public interface ChestAccessor {
  @Accessor("chestContents")
  ItemStack[] getChestContents();

  @Accessor("chestContents")
  public void setChestContents(ItemStack[] chestContents);
}