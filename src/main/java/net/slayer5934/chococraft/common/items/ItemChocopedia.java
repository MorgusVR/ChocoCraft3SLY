package net.xalcon.chococraft.common.items;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.xalcon.chococraft.utils.registration.IItemModelProvider;

import javax.annotation.Nullable;
import java.util.List;

public class ItemChocopedia extends Item implements IItemModelProvider
{
    /**
     * allows items to add custom lines of information to the mouseover description
     *
     * @param stack
     * @param worldIn
     * @param tooltip
     * @param flagIn
     */
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(I18n.format(this.getUnlocalizedName(stack) + ".tooltip"));
    }
}
