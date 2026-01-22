# TLDR

Print the **status line** to stdout using default configuration

```i3status```

Print status line using a **specific configuration**

```i3status -c [path/to/i3status.conf]```

Display **help** and version

```i3status -h```

# SYNOPSIS

**i3status** [_-c config_] [_-h_]

# PARAMETERS

**-c** _CONFIG_
> Use specified configuration file

**-h**
> Display help and version

# DESCRIPTION

**i3status** generates a status line for use with i3bar, dzen2, xmobar, or similar status bars. It outputs system information like battery status, network connectivity, disk usage, and time in a format suitable for piping to a status bar.

Configuration is stored in **~/.config/i3status/config** or **/etc/i3status.conf**. The config file defines which modules to display and their order.

Common modules:
- **disk** - Filesystem usage
- **wireless/ethernet** - Network status
- **battery** - Battery level and status
- **cpu_usage** - CPU utilization
- **load** - System load averages
- **time** - Date and time
- **volume** - Audio volume

# CAVEATS

Designed primarily for i3 window manager but works with other status bars. Some modules require specific kernel features or hardware. Custom scripts can extend functionality through the wrapper approach.

# HISTORY

i3status was created by Michael Stapelberg as part of the i3 window manager project, which began in **2009**. It provides a lightweight, efficient status line generator following Unix philosophy.

# SEE ALSO

[i3](/man/i3)(1), [i3bar](/man/i3bar)(1), [polybar](/man/polybar)(1), [waybar](/man/waybar)(5)
