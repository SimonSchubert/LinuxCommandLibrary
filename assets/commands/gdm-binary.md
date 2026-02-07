# TAGLINE

GNOME Display Manager daemon process

# TLDR

**Start GNOME Display Manager**

```gdm-binary```

**Start with debugging**

```gdm-binary --debug```

# SYNOPSIS

**gdm-binary** [_options_]

# PARAMETERS

**--debug**
> Enable debug output.

**--nodaemon**
> Don't become a daemon.

**--preserve-ld-vars**
> Preserve LD_* environment variables.

# DESCRIPTION

**gdm-binary** is the actual daemon executable for the GNOME Display Manager. It handles the low-level operations of managing graphical login screens, authenticating users, and launching desktop sessions. This binary is the core GDM process that runs with elevated privileges to manage display servers and user session creation.

On modern systems, gdm-binary is typically started and managed by systemd rather than being invoked directly by users or administrators. The gdm service wrapper handles process management, while gdm-binary performs the actual display manager functions.

Users rarely need to interact with gdm-binary directly, as system management commands like systemctl or the gdm wrapper script are the preferred interfaces for controlling the display manager.

# SEE ALSO

[gdm](/man/gdm)(8), [gdm-restart](/man/gdm-restart)(1)

