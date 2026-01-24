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

**swayidle** manages idle behavior for Sway. It triggers actions based on inactivity.

Timeout actions run after idle period. Lock screen, suspend, etc.

Resume actions reverse timeout effects. Re-enable displays.

Sleep integration handles suspend/resume. Lock before sleep is common.

Multiple timeouts enable staged actions. Dim, then lock, then suspend.

# CAVEATS

Wayland/Sway only. Commands run as shell. Audio may prevent idle.

# HISTORY

**swayidle** is the idle manager for **Sway** compositor. It handles power management and screen locking triggers.

# SEE ALSO

[sway](/man/sway)(1), [swaylock](/man/swaylock)(1), [systemd](/man/systemd)(1)
