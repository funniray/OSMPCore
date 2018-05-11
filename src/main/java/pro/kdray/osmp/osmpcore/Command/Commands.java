package pro.kdray.osmp.osmpcore.Command;

import pro.kdray.osmp.osmpcore.Command.Default.OSMPCommand;

public enum Commands {

    OSMP("OSMP", "OSMP's main command", "/OSMP", Permissions.OSMP, OSMPCommand.class);


    private String name;
    private String description;
    private String usage;
    private Permissions permission;
    private Class<? extends OSMPBaseCommand> commandClass;

    Commands(String name, String description, String usage, Permissions permission, Class<? extends OSMPBaseCommand> commandClass) {
        this.name = name;
        this.description = description;
        this.usage = usage;
        this.permission = permission;
        this.commandClass = commandClass;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getUsage() {
        return usage;
    }

    public Permissions getPermission() {
        return permission;
    }

    public Class<? extends OSMPBaseCommand> getCommandClass() {
        return commandClass;
    }
}
