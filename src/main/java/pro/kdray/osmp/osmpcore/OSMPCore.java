package pro.kdray.osmp.osmpcore;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandMap;
import cn.nukkit.permission.Permission;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginManager;
import pro.kdray.osmp.osmpcore.Command.Commands;
import pro.kdray.osmp.osmpcore.Command.Permissions;

public final class OSMPCore extends PluginBase {

    @Override
    public void onEnable() {
        // Plugin startup logic

        this.saveDefaultConfig();
        this.reloadConfig();

        //Registering permissions
        PluginManager pm = this.getServer().getPluginManager();
        Permission basePerm = new Permission("OSMP.*");
        pm.addPermission(basePerm);
        for (Permissions permission : Permissions.values()) {
            Permission perm = new Permission(permission.getNode(), permission.getDiscription());
            perm.setDefault(permission.getDefaultValue());
            perm.addParent(basePerm, permission.getDefaultValue().equalsIgnoreCase("OP") || permission.getDefaultValue().equalsIgnoreCase("TRUE"));
            pm.addPermission(perm);
        }

        CommandMap cm = this.getServer().getCommandMap();

        for (Commands command : Commands.values()) {
            try {
                cm.register(command.getName(), (Command) command.getCommandClass().newInstance());
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
