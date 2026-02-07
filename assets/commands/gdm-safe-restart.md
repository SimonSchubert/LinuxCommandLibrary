# TAGLINE

safely restart GDM only when no sessions active

# TLDR

**Safely restart GDM**

```sudo gdm-safe-restart```

# SYNOPSIS

**gdm-safe-restart**

# DESCRIPTION

**gdm-safe-restart** provides a safer alternative to gdm-restart by only restarting the GNOME Display Manager when no users have active graphical sessions. This prevents accidentally terminating user work and ensures the restart only occurs when the system is at the login screen.

If any users are currently logged in, the command will check for active sessions and refuse to restart GDM, protecting users from losing unsaved work. This makes it appropriate for automated maintenance scripts or situations where you want to restart the display manager but only when it's safe to do so.

# SEE ALSO

[gdm-restart](/man/gdm-restart)(1), [gdm-stop](/man/gdm-stop)(1)

