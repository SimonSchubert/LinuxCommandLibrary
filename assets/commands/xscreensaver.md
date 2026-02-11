# TAGLINE

X11 screen saver and locker

# TLDR

**Start the screensaver daemon**

```xscreensaver &```

**Start with no splash screen**

```xscreensaver --no-splash &```

**Activate the screensaver immediately**

```xscreensaver-command -activate```

**Lock the screen**

```xscreensaver-command -lock```

**Deactivate the screensaver** (unlock without password prompt)

```xscreensaver-command -deactivate```

**Open the preferences GUI**

```xscreensaver-settings```

**Preview a specific screensaver**

```xscreensaver-command -select [saver_number]```

**Restart the daemon** with new settings

```xscreensaver-command -restart```

# SYNOPSIS

**xscreensaver** [_--no-splash_] [_--verbose_] [_--log file_]

**xscreensaver-command** [_-activate_] [_-lock_] [_-deactivate_] [_-restart_] [_-exit_] [_-select n_]

# PARAMETERS

**--no-splash**
> Do not display the splash screen at startup.

**--verbose**
> Print diagnostics to stderr.

**--log** _file_
> Append diagnostics to the specified log file.

**-display** _host:n_
> Connect to the specified X display.

# COMMANDS (xscreensaver-command)

**-activate**
> Turn on the screensaver immediately.

**-deactivate**
> Turn off the screensaver if it is active.

**-lock**
> Lock the screen immediately.

**-select** _n_
> Switch to screensaver number n.

**-next**
> Switch to the next screensaver in the cycle.

**-prev**
> Switch to the previous screensaver.

**-restart**
> Restart the screensaver daemon with current settings.

**-exit**
> Terminate the xscreensaver daemon.

**-time**
> Print time since last user activity.

**-watch**
> Print a line each time the screensaver state changes.

# DESCRIPTION

**XScreenSaver** is the standard screen saver and locker for the X Window System. It consists of a background daemon that monitors user activity and triggers screensavers, plus a collection of over 200 display hacks (individual screensaver programs).

The daemon should be started at login, typically from **.xinitrc**, **.xsession**, or a desktop autostart entry. It monitors keyboard and mouse activity to determine idle time. When the idle threshold is reached, it blanks the screen and runs a screensaver. Screen locking can occur automatically after additional idle time or be triggered manually.

Configuration is managed through **xscreensaver-settings** (formerly xscreensaver-demo), a GTK-based GUI that allows selecting which screensavers to run, adjusting timing, and previewing effects. Settings are stored in **~/.xscreensaver**.

The project includes screensavers ranging from classic effects (flying toasters, matrix) to OpenGL visualizations and physics simulations. Each saver is a standalone executable that can also be run independently.

# CAVEATS

Requires the daemon to be running for any commands to work. Some desktop environments (GNOME, KDE) have their own screen lockers that may conflict. OpenGL screensavers require working 3D acceleration. The daemon must be restarted to pick up configuration changes. Power management (DPMS) settings may interact unexpectedly with screensaver timing.

# HISTORY

**XScreenSaver** was created by Jamie Zawinski (jwz) with the first release in **1992**. It became the de facto standard screensaver for Unix systems, replacing earlier fragmented solutions. The project has been continuously maintained for over 30 years, with new screensavers and security fixes added regularly. Zawinski has been vocal about the importance of XScreenSaver's security model, particularly regarding screen locking.

# SEE ALSO

[xscreensaver-command](/man/xscreensaver-command)(1), [xscreensaver-settings](/man/xscreensaver-settings)(1), [xlock](/man/xlock)(1), [xset](/man/xset)(1)
