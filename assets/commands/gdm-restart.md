# TAGLINE

restart the GNOME Display Manager service

# TLDR

**Restart GNOME Display Manager**

```sudo gdm-restart```

# SYNOPSIS

**gdm-restart**

# DESCRIPTION

**gdm-restart** restarts the GNOME Display Manager service, terminating all active graphical user sessions and returning to the login screen. This command is useful for applying configuration changes, recovering from display issues, or resetting the graphical environment without a full system reboot.

When executed, all logged-in users will be forcibly logged out, and any unsaved work will be lost. The display manager then reinitializes, presenting a fresh login screen. On modern systems using systemd, this is typically a wrapper for "systemctl restart gdm".

# CAVEATS

Restarting GDM will terminate all user sessions. Save your work before running this command.

# SEE ALSO

[gdm](/man/gdm)(8), [gdm-stop](/man/gdm-stop)(1)

