package pro.kdray.osmp.osmpcore.Command;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public abstract class OSMPAbstractCommand extends Command implements OSMPBaseCommand {

    Commands command;

    public OSMPAbstractCommand(Commands command) {
        super(command.getName(), command.getDescription(), command.getUsage());
        this.command = command;
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] strings) {
        if (commandSender.hasPermission(command.getPermission().getPermission())) {
            commandSender.sendMessage("You do not have permission to execute this command.");
            return false;
        }

        return executeCommand(commandSender, s, strings);
    }
}
