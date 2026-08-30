# TAGLINE

curses-based TUI for NetworkManager

# TLDR

Open the full text interface

```nmtui```

Jump straight to the **connection list**, where connections can be brought up or down

```nmtui connect```

**Activate** one connection by name, UUID, device or SSID

```nmtui connect [name]```

Open the **editor** to create, change or delete connections

```nmtui edit```

Edit **one named connection** directly

```nmtui edit [connection_name]```

Change the **system hostname**

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

Requires NetworkManager as the network management daemon. Terminal must support curses (most do). Some advanced options available in nmcli or graphical tools may not be exposed in nmtui. Changes take effect immediately when saved. Requires root or appropriate polkit privileges for modifying connections.

# HISTORY

**nmtui** was introduced as part of **NetworkManager 0.9.10** in **2014** to provide a lightweight text-mode alternative to the GNOME network settings GUI and the nmcli command-line tool.

# INSTALL

```apt: sudo apt install network-manager```

```apk: sudo apk add networkmanager-tui```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[nmcli](/man/nmcli)(1), [nm-online](/man/nm-online)(1), [NetworkManager](/man/NetworkManager)(8), [nm-connection-editor](/man/nm-connection-editor)(1)
