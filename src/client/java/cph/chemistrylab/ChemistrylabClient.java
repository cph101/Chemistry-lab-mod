package cph.chemistrylab;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

public class ChemistrylabClient implements ClientModInitializer {

	@Override
	public void onInitializeClient(ModContainer mod) {
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> tintIndex == 0 ? 0x01ABDD : -1, ModItems.FILLED_BEAKER);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> tintIndex == 0 ? 0x01ABDD : -1, ModItems.FILLED_TEST_TUBE);
	}
}