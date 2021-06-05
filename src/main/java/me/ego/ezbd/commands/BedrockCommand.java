package me.ego.ezbd.commands;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class BedrockCommand extends SimpleSubCommand {


	protected BedrockCommand(SimpleCommandGroup parent) {
		super(parent, "bedrock|bed|br");

		setMinArguments(0);
		setUsage("&fGive 64 bedrock to player.");

	}

	@Override
	protected void onCommand() {

		checkConsole();

		if (args.length == 0) {

			Player player = (Player) sender;

			ItemStack bedrock = new ItemStack(Material.BEDROCK, 64);


			player.getInventory().addItem(bedrock);

		} else
			return;
	}
}

