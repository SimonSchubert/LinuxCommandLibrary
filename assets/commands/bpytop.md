# TLDR

**Start** resource monitor

```bpytop```

# SYNOPSIS

**bpytop** [_options_]

# DESCRIPTION

**bpytop** is a resource monitor written in Python showing CPU, memory, disks, network, and processes in a visually appealing terminal UI. It's a Python rewrite of bashtop with improved performance and additional features.

The tool provides comprehensive system monitoring with mouse support and customizable themes.

# FEATURES

- CPU usage per core with graphs
- Memory and swap statistics
- Disk I/O and usage
- Network bandwidth monitoring
- Process management
- Mouse support
- Customizable themes
- Configuration menu (ESC)
- Process filtering and sorting
- Tree view for processes

# INTERFACE SECTIONS

**CPU**
> Usage graphs per core, temperature

**Memory**
> RAM and swap with graphs

**Disks**
> I/O activity and space usage

**Network**
> Bandwidth by interface

**Processes**
> Detailed process list

# KEYBINDINGS

- **ESC** - Configuration menu
- **q** - Quit
- **f** - Filter processes
- **t** - Tree view toggle
- **+/-** - Adjust update speed
- **Mouse** - Click to interact
- **Arrow keys** - Navigate

# THEMES

Built-in themes:
- Default
- Default-light
- Gruvbox dark/light
- Nord
- Monokai

# CAVEATS

Requires Python 3.6+. Higher CPU usage than native tools. Superseded by btop++ (C++ rewrite). May not show all metrics on all systems. GPU monitoring limited.

# HISTORY

**bpytop** was created by Jakob Palme (aristocratos) in **2020** as a Python rewrite of bashtop, later superseded by btop++ in **2021**.

# SEE ALSO

[btop](/man/btop)(1), [htop](/man/htop)(1), [bashtop](/man/bashtop)(1)
