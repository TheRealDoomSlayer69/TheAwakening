package io.github.TheRealDoomSlayer.theawakening.core.init;

import io.github.TheRealDoomSlayer.theawakening.TheAwakening;
import io.github.TheRealDoomSlayer.theawakening.core.BaseArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public final class ArmorMaterialInit {
    private ArmorMaterialInit() {
    }

    public static final ArmorMaterial PYRIUM = new BaseArmorMaterial(16, new int[] {3, 7, 8, 3},
    		new int[] {3, 7, 8, 3}, 2.5f, 2f, TheAwakening.MODID + ":pyrium",SoundEvents.ARMOR_EQUIP_GENERIC,
    		() -> Ingredient.of(ItemInit.PYRIUM_INGOT.get()));

}