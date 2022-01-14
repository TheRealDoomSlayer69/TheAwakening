package io.github.TheRealDoomSlayer.theawakening.core.init;

import io.github.TheRealDoomSlayer.theawakening.core.BaseToolMaterial;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public final class ToolMaterialInit {
    private ToolMaterialInit() {
    }
   
    protected static final Tier PYRIUM = new BaseToolMaterial(9f, 1, 4, 1.7f, 1500,
    		() -> Ingredient.of(ItemInit.PYRIUM_INGOT.get()));
    
}
