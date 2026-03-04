# TAGLINE

Cross-platform graphical system and process monitor

# TLDR

**Launch** the system monitor

```btm```

**Launch** with **Celsius** temperature units

```btm -C```

**Launch** in **basic mode** (no charts)

```btm -b```

**Set update rate** in milliseconds

```btm -r [500]```

**Show only specific widgets** (CPU, memory, network)

```btm --default_widget_type [cpu]```

**Enable** group processes mode

```btm -g```

**Launch** with a custom config file

```btm -C [path/to/config.toml]```

# SYNOPSIS

**btm** [_options_]

# PARAMETERS

**-b**, **--basic**
> Use basic mode without charts.

**-C**, **--celsius**
> Use Celsius for temperature.

**-F**, **--fahrenheit**
> Use Fahrenheit for temperature.

**-g**, **--group**
> Group processes with the same name.

**-r** _MS_, **--rate** _MS_
> Set refresh rate in milliseconds (default: 1000).

**-t**, **--tree**
> Show processes as a tree.

**--default_widget_type** _TYPE_
> Set the default widget to focus on startup.

**-C** _FILE_, **--config** _FILE_
> Use a custom configuration file.

**--color** _SCHEME_
> Use a color scheme (default, gruvbox, nord, etc.).

**--mem_as_value**
> Show memory usage as values rather than percentages.

**--battery**
> Show battery widget.

**-h**, **--help**
> Show help information.

**-V**, **--version**
> Show version.

# DESCRIPTION

**bottom** (binary name **btm**) is a cross-platform graphical system monitor for the terminal. It displays real-time information about CPU usage, memory consumption, disk I/O, network traffic, temperatures, and running processes with interactive charts and graphs.

The interface supports mouse and keyboard navigation, process searching and filtering, process signal sending, and multiple layout configurations. It provides both graphical chart mode and a simpler basic text mode for environments where Unicode support is limited.

bottom is written in **Rust** and designed as a modern alternative to tools like top and htop, with a focus on visual presentation and cross-platform support across Linux, macOS, and Windows.

# CONFIGURATION

Configuration is stored in **~/.config/bottom/bottom.toml**. Options include custom color themes, widget layouts, default behaviors, temperature units, and disk/network filters. All command-line flags can be set as defaults in the config file.

# CAVEATS

The binary name is **btm**, not **bottom**. Some features like temperature sensors and battery monitoring may not be available on all platforms. High refresh rates can increase CPU usage.

# HISTORY

**bottom** was created by **Clement Tsang** and first released in **2019**. Written in **Rust**, it was designed to provide a visually appealing and highly customizable alternative to traditional system monitors, inspired by tools like gtop and gotop.

# SEE ALSO

[htop](/man/htop)(1), [top](/man/top)(1), [btop](/man/btop)(1), [glances](/man/glances)(1)
