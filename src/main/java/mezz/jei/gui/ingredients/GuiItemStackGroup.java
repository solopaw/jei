package mezz.jei.gui.ingredients;

import javax.annotation.Nullable;

import net.minecraft.item.ItemStack;

import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.ingredients.VanillaTypes;
import mezz.jei.gui.Focus;
import mezz.jei.plugins.vanilla.ingredients.item.ItemStackRenderer;

public class GuiItemStackGroup extends GuiIngredientGroup<ItemStack> implements IGuiItemStackGroup {
	private static final ItemStackRenderer renderer = new ItemStackRenderer();

	public GuiItemStackGroup(@Nullable Focus<ItemStack> focus, int cycleOffset) {
		super(VanillaTypes.ITEM, focus, cycleOffset);
	}

	@Override
	public void init(int slotIndex, boolean input, int xPosition, int yPosition) {
		init(slotIndex, input, renderer, xPosition, yPosition, GuiIngredientProperties.getWidth(1), GuiIngredientProperties.getHeight(1), 1, 1);
	}

}
