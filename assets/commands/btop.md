# TLDR

**Start** resource monitor

```btop```

# SYNOPSIS

**btop**

# DESCRIPTION

**btop++** (btop) is a resource monitor written in C++ showing CPU, memory, disks, network, and processes with a visually polished terminal UI. It's the successor to bashtop and bpytop, offering better performance and more features.

The tool provides comprehensive system monitoring with GPU support, mouse interaction, and extensive customization.

# FEATURES

- CPU usage per core with graphs
- Memory and swap monitoring
- Disk I/O and usage
- Network bandwidth
- Process management
- GPU monitoring (NVIDIA, AMD)
- Mouse support
- Vim-like keybindings
- Customizable themes
- Process filtering and tree view
- Battery monitoring

# KEYBINDINGS

- **q** - Quit
- **ESC/m** - Menu
- **f** - Filter processes
- **t** - Tree view
- **k** - Kill process
- **+/-** - Adjust update interval
- **Arrow keys** - Navigate
- **Mouse** - Click to interact

# INTERFACE BOXES

**CPU**
> Per-core usage, temperature, frequency

**Memory**
> RAM, swap, cache with graphs

**Disks**
> I/O activity, space usage

**Network**
> Bandwidth by interface

**Processes**
> Detailed sortable list

# CONFIGURATION

Config file: `~/.config/btop/btop.conf`

Themes directory: `~/.config/btop/themes/`

# CAVEATS

Requires modern terminal with true color support. GPU monitoring needs appropriate drivers. Higher resource usage than minimal tools like top. Some features platform-specific.

# HISTORY

**btop++** was created by Jakob Palme (aristocratos) in **2021** as a C++ rewrite of bpytop, providing significantly better performance and additional features.

# SEE ALSO

[htop](/man/htop)(1), [bpytop](/man/bpytop)(1), [top](/man/top)(1)
