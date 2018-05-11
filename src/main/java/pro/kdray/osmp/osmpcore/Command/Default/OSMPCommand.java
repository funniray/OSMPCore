package pro.kdray.osmp.osmpcore.Command.Default;

import cn.nukkit.command.CommandSender;
import pro.kdray.osmp.osmpcore.Command.Commands;
import pro.kdray.osmp.osmpcore.Command.OSMPAbstractCommand;

public class OSMPCommand extends OSMPAbstractCommand {
    public OSMPCommand() {
        super(Commands.OSMP);
    }

    @Override
    public boolean executeCommand(CommandSender sender, String label, String[] args) {
        return false;
    }
}
