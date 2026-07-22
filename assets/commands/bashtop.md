# TAGLINE

Terminal-based resource monitor written in bash (deprecated)

# TLDR

> **bashtop** is deprecated and no longer maintained. Use **btop** (its C++ successor) instead.

**Start** resource monitor

```bashtop```

# SYNOPSIS

**bashtop**

# DESCRIPTION

**bashtop** is a resource monitor written in bash showing CPU, memory, disk, network, and process information in a terminal UI. It provides an attractive, mouse-enabled interface for system monitoring.

The tool offers game-like visuals and interactivity while remaining a pure bash script. Command-line argument parsing was never implemented, so it is launched simply as **bashtop** and configured from its in-app menu.

**bashtop** is no longer actively developed. It was first rewritten in Python as **bpytop**, and then rewritten again in C++ as **btop**, which is the recommended replacement on all platforms.

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

Written in pure bash, with the performance limitations that implies. Requires bash 4.4 or newer. Relatively high CPU overhead for the monitoring itself. **No longer maintained**: superseded by **bpytop** (Python) and then **btop** (C++).

# HISTORY

**bashtop** was created by aristocratos (Jakob Palme) in **2020** as a system monitor written entirely in bash, later rewritten as **bpytop** and then **btop**.

# INSTALL

```pacman: sudo pacman -S bashtop```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[btop](/man/btop)(1), [bpytop](/man/bpytop)(1), [htop](/man/htop)(1), [top](/man/top)(1), [glances](/man/glances)(1)

# RESOURCES

```[Source code](https://github.com/aristocratos/bashtop)```

<!-- verified: 2026-06-19 -->
