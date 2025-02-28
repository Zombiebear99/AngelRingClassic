package org.zombie.angelring;

import mod.azure.azurelib.common.api.common.config.Config;
import mod.azure.azurelib.common.internal.common.config.Configurable;

@Config(id = CommonMod.MOD_ID)
public class DoomAngelRingConfig {

//	@Configurable
//	@Configurable.Synchronized
//	@Configurable.Range(min = 1)
//	public int max_ring_durability = 900;
//	@Configurable
//	@Configurable.Synchronized
//	@Configurable.Range(min = 1)
//	public int ticks_until_damage = 20;
//	@Configurable
//	@Configurable.Synchronized
//	@Configurable.Range(min = 1)
//	public int ring_damage_on_tick = 1;
	@Configurable
	@Configurable.Synchronized
	public boolean keep_ring_on_death = false;
}
