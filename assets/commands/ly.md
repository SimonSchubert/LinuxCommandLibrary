# TAGLINE

Lightweight TUI display manager for Linux and BSD

# TLDR

**Start the display manager**

```ly```

**Start on a specific tty**

```ly -c [tty2]```

# SYNOPSIS

**ly** [_options_]

# PARAMETERS

**-c**, **--config-tty** _TTY_
> Set the tty to operate on.

# DESCRIPTION

**ly** is a lightweight TUI display manager for Linux and BSD that stays in the framebuffer console as an interactive text-based login screen. It supports both X11 and Wayland sessions and uses PAM for authentication. It does not require systemd to run.

Users navigate with arrow keys to change fields and select desktop environments, enter credentials, and launch sessions. The interface is minimal by design, avoiding the overhead of graphical display managers.

# CONFIGURATION

**/etc/ly/config.ini**
> Configuration file with default values for customizing the login screen appearance and behavior, including animation, colors, and session paths.

# CAVEATS

Runs in the framebuffer console -- does not launch a graphical environment for the login screen itself. Some terminal features may vary depending on the framebuffer driver. Typically managed as a systemd service (**ly.service**) or via an init system.

# HISTORY

**ly** is developed by the **fairyglade** project and is written in **Zig**. It was designed as a minimal alternative to graphical display managers like GDM and SDDM.

# SEE ALSO

[lemurs](/man/lemurs)(1), [gdm](/man/gdm)(1), [startx](/man/startx)(1), [xinit](/man/xinit)(1)
