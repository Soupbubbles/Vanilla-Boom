package phrille.vanillaboom.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class IceCreamItem extends Item
{
    public IceCreamItem(Item.Properties builder)
    {
        super(builder);
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World world, LivingEntity entityLiving)
    {
        ItemStack itemstack = super.onItemUseFinish(stack, world, entityLiving);
        return entityLiving instanceof PlayerEntity && ((PlayerEntity) entityLiving).abilities.isCreativeMode ? itemstack : new ItemStack(Items.STICK);
    }
}
