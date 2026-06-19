# TAGLINE

Terminal-based resource monitor with graphs

# TLDR

**Start** resource monitor

```bpytop```

**Start** with a low update interval (milliseconds)

```bpytop --update [1000]```

**Force** the TTY-friendly box-drawing mode

```bpytop --low-color```

**Open** the in-app help

```bpytop --help```

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

# CONFIGURATION

**~/.config/bpytop/bpytop.conf**
> Main configuration file for themes, update interval, process sorting, and display options.

# CAVEATS

Requires Python 3.6+. Higher CPU usage than native tools. Superseded by btop++ (C++ rewrite). May not show all metrics on all systems. GPU monitoring limited.

# HISTORY

**bpytop** was created by Jakob P. Liljenberg (aristocratos) in **2020** as a Python rewrite of bashtop. The same author later began btop++ (a C++ rewrite, btop) in **2021**, which is now the actively developed successor; bpytop receives little ongoing development.

# SEE ALSO

[btop](/man/btop)(1), [htop](/man/htop)(1), [bashtop](/man/bashtop)(1), [glances](/man/glances)(1), [top](/man/top)(1)

# RESOURCES

```[Source code](https://github.com/aristocratos/bpytop)```

```[Documentation](https://pypi.org/project/bpytop/)```

<!-- verified: 2026-06-19 -->
