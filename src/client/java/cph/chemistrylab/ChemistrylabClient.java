package cph.chemistrylab;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.item.ItemStack;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

public class ChemistrylabClient implements ClientModInitializer {

	public Integer getItemTint(ItemStack stack) {
		return 0x01ABDD;
		// This will eventually changed based on element
	}

	@Override
	public void onInitializeClient(ModContainer mod) {

		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> tintIndex == 0 ? getItemTint(stack) : -1, ModItems.FILLED_BEAKER);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> tintIndex == 0 ? getItemTint(stack) : -1, ModItems.FILLED_TEST_TUBE);
	}
}
