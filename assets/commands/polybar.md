# TAGLINE

Customizable status bar for X11 window managers

# TLDR

**Start polybar with default bar**

```polybar```

**Start specific bar**

```polybar [bar_name]```

**Start with config file**

```polybar -c [~/.config/polybar/config.ini] [bar_name]```

**List available bars**

```polybar -m```

**Reload configuration**

```polybar-msg cmd restart```

**Send action to module**

```polybar-msg action [module_name] [action]```

**Check configuration**

```polybar -c [config.ini] --check```

# SYNOPSIS

**polybar** [_-c config_] [_-m_] [_--check_] [_bar_name_]

# PARAMETERS

**-c**, **--config** _FILE_
> Path to configuration file.

**-m**, **--list-monitors**
> List available monitors/outputs.

**-r**, **--reload**
> Reload when config changes.

**-q**, **--quiet**
> Suppress output.

**-l**, **--log** _LEVEL_
> Log level: error, warning, info, trace.

**--check**
> Verify configuration syntax.

**-w**, **--print-wmname**
> Print WM name and exit.

# MODULES

**internal/battery**
> Battery status and capacity.

**internal/network**
> Network connection info.

**internal/cpu**
> CPU usage.

**internal/memory**
> Memory usage.

**internal/date**
> Date and time.

**internal/volume** / **internal/pulseaudio**
> Audio volume control.

**internal/xworkspaces**
> Workspace indicator.

**internal/temperature**
> System temperature.

**custom/script**
> Custom script output.

**custom/ipc**
> Inter-process communication.

# DESCRIPTION

**Polybar** is a fast, customizable status bar for X11 window managers. It displays system information, workspace indicators, and custom content through a modular configuration.

Configuration uses INI format with sections for bars and modules. Bars define appearance (colors, fonts, position) and which modules to include. Modules provide content - built-in for system info, custom for scripts.

The bar is divided into left, center, and right sections. Modules can display text, icons (via icon fonts), progress bars, and clickable areas. Formatting uses tags for colors, fonts, and spacing.

Custom script modules execute external commands and display output. IPC modules enable real-time updates from external programs via polybar-msg.

Multiple bars can run simultaneously on different monitors. The -m flag lists available outputs for multi-monitor configuration.

# CONFIGURATION

**~/.config/polybar/config.ini**
> Main configuration file in INI format defining bars, modules, colors, and fonts.

**~/.config/polybar/launch.sh**
> Common launch script for starting polybar with window manager.

# CAVEATS

X11 only - no native Wayland support (use Waybar). Requires icon fonts for symbols. Complex configurations can be verbose. Some window managers need specific settings. Reloading loses some state. CPU usage increases with many script modules.

# HISTORY

**Polybar** was created by **Michael Carlberg** around **2016** as a rewrite of lemonbar with easier configuration. It aimed to provide a powerful status bar without requiring shell scripting knowledge. Written in C++, it became popular in the r/unixporn community for desktop customization.

# SEE ALSO

[waybar](/man/waybar)(1), [i3status](/man/i3status)(1), [lemonbar](/man/lemonbar)(1), [dunst](/man/dunst)(1)
