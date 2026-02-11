# TAGLINE

Idle management daemon for Sway

# TLDR

**Lock screen on idle**

```swayidle timeout [300] 'swaylock -f'```

**Turn off display**

```swayidle timeout [600] 'swaymsg "output * dpms off"' resume 'swaymsg "output * dpms on"'```

**Lock before sleep**

```swayidle before-sleep 'swaylock -f'```

**Multiple timeouts**

```swayidle timeout [300] 'swaylock -f' timeout [600] 'systemctl suspend'```

**With lock event**

```swayidle lock 'swaylock -f'```

# SYNOPSIS

**swayidle** [_options_] [_events_]

# PARAMETERS

**timeout** _SECONDS_ _COMMAND_
> Run after idle time.

**resume** _COMMAND_
> Run on activity.

**before-sleep** _COMMAND_
> Run before suspend.

**after-resume** _COMMAND_
> Run after wake.

**lock** _COMMAND_
> Run on lock event.

**unlock** _COMMAND_
> Run on unlock.

**-w**
> Wait for command.

# DESCRIPTION

**swayidle** is an idle management daemon for the Sway Wayland compositor that triggers commands based on user inactivity. It supports multiple timeout events that execute commands after specified periods of idle time, enabling staged power management such as dimming the screen, locking, and eventually suspending.

Resume actions execute when user activity is detected after a timeout, allowing reversal of timeout effects like turning displays back on. The before-sleep and after-resume events integrate with systemd sleep/wake cycles, commonly used to ensure the screen is locked before the system suspends.

Lock and unlock events respond to session lock signals from logind, enabling coordination with external lock requests such as those from the system settings or other applications.

# CAVEATS

Wayland/Sway only. Commands run as shell. Audio may prevent idle.

# HISTORY

**swayidle** is the idle manager for **Sway** compositor. It handles power management and screen locking triggers.

# SEE ALSO

[sway](/man/sway)(1), [swaylock](/man/swaylock)(1), [systemd](/man/systemd)(1)
