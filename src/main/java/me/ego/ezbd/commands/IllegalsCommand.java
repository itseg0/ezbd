package me.ego.ezbd.commands;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class IllegalsCommand extends SimpleSubCommand {


	protected IllegalsCommand(SimpleCommandGroup parent) {
		super(parent, "illegals|illegal|i");

		setMinArguments(0);
		setUsage("&fGive 64 of each illegal block.");

	}

	@Override
	protected void onCommand() {

		checkConsole();

		if (args.length == 0) {

			Player player = (Player) sender;

			ItemStack bedrock = new ItemStack(Material.BEDROCK, 64);
			ItemStack barriers = new ItemStack(Material.COMMAND_BLOCK, 64);
			ItemStack commandblocks = new ItemStack(Material.BARRIER, 64);


			player.getInventory().addItem(bedrock, barriers, commandblocks);

		} else
			return;
	}
}

