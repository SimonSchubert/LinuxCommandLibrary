# TAGLINE

Cross-platform terminal system monitor

# TLDR

**Start** resource monitor

```btm```

**Basic** mode (less features)

```btm -b```

**Specific** refresh rate

```btm -r [2000]```

# SYNOPSIS

**btm** [_options_]

# DESCRIPTION

**btm** (bottom) is a cross-platform graphical process/system monitor for the terminal. It provides information about CPU, memory, disk, network, and processes with a customizable interface.

The tool offers an alternative to htop and top with modern features and aesthetics.

# PARAMETERS

**-b**, **--basic**
> Basic mode (disable graphs)

**-r**, **--rate** _ms_
> Refresh rate in milliseconds (default: 1000)

**-a**, **--hide_avg_cpu**
> Hide average CPU usage

**-m**, **--hide_time**
> Hide time graph

**-t**, **--default_time_value** _ms_
> Default time range

**-c**, **--config** _path_
> Configuration file

# FEATURES

- CPU usage per core
- Memory and swap monitoring
- Disk I/O and usage
- Network I/O
- Process list with sorting
- Process tree view
- Battery monitoring
- Temperature sensors
- Customizable widgets
- Mouse support

# KEYBINDINGS

- **q/Ctrl+C** - Quit
- **/** - Filter
- **dd** - Kill process
- **e** - Expand widget
- **+/-** - Zoom time graph
- **Tab** - Switch widgets
- **?** - Help

# CONFIGURATION

**~/.config/bottom/bottom.toml**
> Main configuration file for flags, colors, layout, and widget settings.

# CAVEATS

Requires modern terminal with Unicode support. Some features platform-specific. Higher resource usage than minimal tools. Configuration can be complex.

# HISTORY

**bottom** was created by Clement Tsang around **2019** as a modern, customizable system monitor written in Rust.

# SEE ALSO

[htop](/man/htop)(1), [btop](/man/btop)(1), [top](/man/top)(1)
