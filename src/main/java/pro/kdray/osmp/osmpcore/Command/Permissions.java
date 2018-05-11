package pro.kdray.osmp.osmpcore.Command;

import cn.nukkit.permission.Permission;

public enum Permissions {

    OSMP("OSMPCommand", "Main OSMPCommand command", "OP");

    private String node;
    private String discription;
    private String defaultValue;
    private Permission permission;

    Permissions(String node, String discription, String defaultValue) {
        node = "OSMPCommand." + node;
        this.permission = new Permission(node, discription, defaultValue);
        this.node = node;
        this.discription = discription;
        this.defaultValue = defaultValue;
    }

    public String getNode() {
        return node;
    }

    public String getDiscription() {
        return discription;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public Permission getPermission() {
        return permission;
    }
}
