# TLDR

Open the **user interface**

```nmtui```

**List available connections**, with the option to activate or deactivate them

```nmtui connect```

**Connect** to a given network

```nmtui connect [name|uuid|device|SSID]```

**Edit/Add/Delete** a given network

```nmtui edit [name|id]```

Set the **system hostname**

```nmtui hostname```

# SYNOPSIS

**nmtui** [_command_] [_argument_]

# PARAMETERS

**connect**
> List connections and allow activation/deactivation

**edit**
> Add, modify, or delete network connections

**hostname**
> Change the system hostname

# DESCRIPTION

**nmtui** (NetworkManager Text User Interface) provides a curses-based interface for configuring network connections managed by NetworkManager. It offers a more user-friendly alternative to **nmcli** for users who prefer visual navigation.

Use arrow keys to navigate menus, Enter to select items, and Escape to go back or cancel. The interface allows configuring Ethernet, Wi-Fi, VPN, and other connection types supported by NetworkManager.

Without arguments, nmtui presents a main menu with options to edit connections, activate connections, or set the hostname. Subcommands can jump directly to specific functions.

# CAVEATS

Requires NetworkManager as the network management daemon. Terminal must support curses (most do). Some advanced options available in nmcli or graphical tools may not be exposed in nmtui. Changes take effect immediately when saved.

# SEE ALSO

[nmcli](/man/nmcli)(1), [nm-online](/man/nm-online)(1), [NetworkManager](/man/NetworkManager)(8), [nm-connection-editor](/man/nm-connection-editor)(1)
