package me.ego.ezbd.commands;

import org.mineacademy.fo.command.SimpleCommandGroup;

public class EZBDCommandGroup extends SimpleCommandGroup {
	@Override
	protected void registerSubcommands() {
		registerSubcommand(new BedrockCommand(this));
		registerSubcommand(new IllegalsCommand(this));
		registerSubcommand(new OpCommand(this));

	}


	@Override
	protected String getCredits() {
		return "Please do /ezbd ? for help.\n   Add &c&lEg0" + "#" + "&c&l1337 " + "&fon Discord for more information or help.";
	}
}
