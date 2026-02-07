# TAGLINE

Tiling window manager based on binary space partitioning

# TLDR

**Start** bspwm with a configuration file

```bspwm -c [path/to/config]```

# SYNOPSIS

**bspwm** [_options_]

# DESCRIPTION

**bspwm** is a tiling window manager based on binary space partitioning. It organizes windows in a full binary tree structure, recursively splitting the screen into regions.

The window manager is controlled entirely through **bspc**, which sends commands via a socket. Configuration is done through shell scripts that run bspc commands, typically at **~/.config/bspwm/bspwmrc**.

Hotkey binding is handled separately by tools like **sxhkd** (Simple X Hotkey Daemon).

# PARAMETERS

**-c** _config_
> Path to configuration file (default: ~/.config/bspwm/bspwmrc)

**-s** _socket_
> Path to the socket file

**-o** _count_
> Number of monitors

# CONFIGURATION

**~/.config/bspwm/bspwmrc**
> Shell script executed at startup to configure bspwm via bspc commands.

**~/.config/sxhkd/sxhkdrc**
> Hotkey configuration for sxhkd, the companion hotkey daemon.

# CAVEATS

Must not be started when another window manager is running. Requires a separate hotkey daemon (sxhkd) for keyboard shortcuts. Configuration is shell scripts, not config files.

# HISTORY

**bspwm** was created by Bastien Dejean and follows the Unix philosophy of doing one thing well. It delegates hotkey handling and bar display to separate programs.

# SEE ALSO

[bspc](/man/bspc)(1), [sxhkd](/man/sxhkd)(1), [polybar](/man/polybar)(1), [i3](/man/i3)(1)
