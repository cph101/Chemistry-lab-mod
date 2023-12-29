package cph.chemistrylab;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.registry.RegistryEntry;

public class ChemistrylabClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
			return tintIndex == 0 ? 0xfc2803 : -1;
		}, Item.byRawId(1152));
		// This might cause a crash when the item is clicked... is it this code doing it?
	}
}