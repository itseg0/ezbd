package me.ego.ezbd;

import me.ego.ezbd.commands.EZBDCommandGroup;
import org.mineacademy.fo.plugin.SimplePlugin;

public class EZBDPlugin extends SimplePlugin {


	@Override
	protected void onPluginStart() {
		Filter.inject();

		registerCommands("ezbd", new EZBDCommandGroup());
	}
}
