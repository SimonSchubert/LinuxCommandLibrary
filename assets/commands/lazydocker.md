# TAGLINE

terminal UI for managing Docker containers, images, volumes, and networks

# TLDR

**Start lazydocker**

```lazydocker```

**Start with a specific Docker config**

```lazydocker -f [/path/to/config.yml]```

**Start without live updates**

```lazydocker --no-live```

# SYNOPSIS

**lazydocker** [_-f config_] [_--no-live_]

# PARAMETERS

**-f**, **--config** _file_
> Path to config file.

**--no-live**
> Disable live update of container stats.

**-v**, **--version**
> Print version information.

**-h**, **--help**
> Display help.

# KEYBOARD SHORTCUTS

**Tab / Shift+Tab**
> Switch between panels.

**↑ / ↓** or **j / k**
> Navigate list items.

**Enter**
> Focus on selected item.

**d**
> Delete/remove selected item.

**s**
> Stop container.

**r**
> Restart container.

**a**
> Attach to container.

**m**
> View container logs.

**E**
> Exec shell in container.

**b**
> View bulk commands.

**[**
> Previous tab.

**]**
> Next tab.

**/**
> Filter items.

**x**
> Open menu.

**q** or **Ctrl+c**
> Quit.

**?**
> Show help.

# DESCRIPTION

**lazydocker** is a terminal UI for managing Docker containers, images, volumes, and networks. It provides an interactive dashboard that displays real-time container stats, logs, and allows common operations without typing docker commands.

The interface is divided into panels: containers, images, volumes, and a main view area. Each panel lists resources with status indicators. Selecting an item shows details, stats, logs, or configuration in the main panel.

For containers, you can view live CPU/memory stats, stream logs, attach for interaction, or exec a shell. Bulk operations allow stopping, removing, or restarting multiple containers. Image management includes pulling, building, and pruning.

Configuration is stored in **~/.config/lazydocker/config.yml**, allowing customization of keybindings, colors, and Docker connection settings. Custom commands can be defined for frequently used operations.

The tool works with both Docker and Docker Compose projects, detecting compose files and allowing per-service operations.

# CAVEATS

Requires Docker daemon access (user must be in docker group or use sudo). Live stats increase CPU usage. Not all Docker features are exposed. Works best with modern terminal emulators. Large numbers of containers may affect performance.

# HISTORY

**lazydocker** was created by Jesse Duffield around **2019** as part of a series of "lazy" terminal UIs (including lazygit). Written in Go, it was inspired by the desire for a more visual way to manage Docker without leaving the terminal. The project has become popular among developers who prefer keyboard-driven interfaces.

# SEE ALSO

[docker](/man/docker)(1), [docker-compose](/man/docker-compose)(1), [lazygit](/man/lazygit)(1), [ctop](/man/ctop)(1)
