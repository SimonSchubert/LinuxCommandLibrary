# TLDR

**Start sxhkd** with default configuration

```sxhkd &```

**Start with a custom configuration** file

```sxhkd -c [~/.config/sxhkd/custom_sxhkdrc] &```

**Start with status output** to a FIFO

```sxhkd -s [/tmp/sxhkd.fifo] &```

**Redirect command output** to a file

```sxhkd -r [/tmp/sxhkd.log] &```

**Reload configuration** without restarting

```pkill -USR1 sxhkd```

**Toggle hotkey grabbing**

```pkill -USR2 sxhkd```

**Set chord chain timeout** to 3 seconds

```sxhkd -t 3 &```

# SYNOPSIS

**sxhkd** [**-hv**] [**-m** _count_] [**-t** _timeout_] [**-c** _config_file_] [**-r** _redir_file_] [**-s** _status_fifo_] [_config_file_...]

# PARAMETERS

**-h**
> Display help and exit

**-v**
> Display version and exit

**-c** _config_file_
> Read configuration from specified file instead of default

**-r** _redir_file_
> Redirect command output to specified file

**-s** _status_fifo_
> Write status information to specified FIFO

**-t** _timeout_
> Chord chain timeout in seconds

**-m** _count_
> Handle first count mapping notify events (for keyboard layout changes)

# DESCRIPTION

**sxhkd** (Simple X Hotkey Daemon) listens for keyboard and mouse events on X11 and executes commands defined in its configuration file. It is window manager agnostic and commonly used with tiling window managers like **bspwm**.

Configuration is read from **~/.config/sxhkd/sxhkdrc** by default. Each binding consists of a hotkey line followed by a command line (indented with whitespace). Modifiers include **super**, **alt**, **ctrl**, **shift**, and **mod1-mod5**.

Key features include chorded bindings (sequences like **super + a ; b**), key release events (prefix keysym with **@**), and pointer buttons (**button1-button24**). Sequences with **{a,b,c}** expand to multiple bindings.

Commands execute via **$SXHKD_SHELL** or **$SHELL**. Send **SIGUSR1** to reload configuration and **SIGUSR2** to toggle hotkey grabbing.

# CAVEATS

sxhkd only works on X11; it does not support Wayland. Keysym names are determined by **xev**. Some key combinations may conflict with window managers or other applications grabbing the same keys.

# HISTORY

**sxhkd** was created by **Bastien Dejean** (baskerville), the same developer behind **bspwm**. It was first released around **2013** as a standalone hotkey daemon that could work with any window manager, addressing the need for a simple, scriptable keybinding system independent of the window manager.

# SEE ALSO

[xev](/man/xev)(1), [xdotool](/man/xdotool)(1), [bspwm](/man/bspwm)(1), [xbindkeys](/man/xbindkeys)(1)
