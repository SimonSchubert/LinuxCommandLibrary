# TAGLINE

Prevent the system from sleeping

# TLDR

Prevent the desktop from **sleeping**

```caffeinate```

# SYNOPSIS

**caffeinate**

# DESCRIPTION

**caffeinate** prevents the desktop from entering sleep or idle state. It inhibits screen savers, suspend, and other power-saving features while running.

Press Ctrl+C to exit and restore normal power management behavior.

# CAVEATS

Only prevents sleep while the command is running. May consume more power on battery-powered devices. Different implementations exist on Linux and macOS with varying options.

# SEE ALSO

[caffeine](/man/caffeine)(1), [xset](/man/xset)(1), [systemd-inhibit](/man/systemd-inhibit)(1)
