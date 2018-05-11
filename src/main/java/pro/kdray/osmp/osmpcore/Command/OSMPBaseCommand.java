package pro.kdray.osmp.osmpcore.Command;

import cn.nukkit.command.CommandSender;

public interface OSMPBaseCommand {
    boolean executeCommand(CommandSender sender, String label, String[] args);
}
