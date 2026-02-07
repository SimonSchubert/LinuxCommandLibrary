# TAGLINE

Terminal-based resource monitor written in bash

# TLDR

**Start** resource monitor

```bashtop```

# SYNOPSIS

**bashtop** [_options_]

# DESCRIPTION

**bashtop** is a resource monitor written in bash showing CPU, memory, disk, network, and process information in a terminal UI. It provides an attractive, mouse-enabled interface for system monitoring.

The tool offers game-like visuals and interactivity while remaining a pure bash script.

# FEATURES

- CPU usage with core breakdown
- Memory and swap usage
- Disk I/O statistics
- Network bandwidth
- Process list with filtering
- Mouse support
- Customizable themes
- Configuration menu

# INTERFACE

Display sections:
- **CPU** - Usage graphs per core
- **Memory** - RAM and swap usage
- **Disks** - I/O and space usage
- **Network** - Bandwidth by interface
- **Processes** - Sortable process list

# KEYBINDINGS

- **q** - Quit
- **m** - Configuration menu
- **f** - Filter processes
- **p/n** - Sort processes
- **Arrow keys** - Navigate
- **Mouse** - Click to interact

# CONFIGURATION

**~/.config/bashtop/bashtop.cfg**
> User configuration file. Controls theme, update interval, process sorting, and display options.

# CAVEATS

Written in pure bash (performance limitations). Superseded by bpytop (Python) and btop++ (C++). Requires bash 4.4+. High CPU usage for monitoring itself. No longer actively maintained.

# HISTORY

**bashtop** was created by Jakob Palme (aristocratos) in **2020** as a proof-of-concept system monitor in pure bash, later rewritten as bpytop and btop++.

# SEE ALSO

[btop](/man/btop)(1), [htop](/man/htop)(1), [top](/man/top)(1)
