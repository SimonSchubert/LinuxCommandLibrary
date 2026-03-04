# TAGLINE

Terminal dashboard for Docker container monitoring

# TLDR

**Launch** the Docker monitoring dashboard

```dtop```

**Monitor** specific containers only

```dtop [container1] [container2]```

**Refresh** every 5 seconds

```dtop --refresh 5```

**Show** all containers including stopped

```dtop --all```

# SYNOPSIS

**dtop** [_options_] [_containers_]

# PARAMETERS

**-r, --refresh** _SECONDS_
> Refresh interval in seconds (default: 2)

**-a, --all**
> Show all containers including stopped

**--no-trunc**
> Don't truncate container names

**--cpu-only**
> Show only CPU metrics

**--memory-only**
> Show only memory metrics

**--network-only**
> Show only network metrics

**-c, --config** _FILE_
> Configuration file path

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**dtop** is a terminal-based dashboard for monitoring Docker containers in real-time. It provides a top/htop-like interface specifically designed for Docker, showing CPU usage, memory consumption, network I/O, and container status.

The tool displays container metrics in a sortable table format with color-coded health indicators. It automatically refreshes to show current statistics and allows filtering to focus on specific containers or resource types.

# KEYBINDINGS

**↑/↓**
> Navigate through containers

**s**
> Change sort column

**q**
> Quit

**p**
> Pause/unpause selected container

**r**
> Restart selected container

**k**
> Kill selected container

**l**
> Show container logs

**/ or f**
> Filter/search containers

# CAVEATS

Requires Docker daemon access and appropriate permissions. Container stats are limited by Docker API capabilities. Large numbers of containers may impact performance. Network stats may vary by Docker driver.

# HISTORY

**dtop** was created to provide Docker-specific monitoring similar to what top/htop provide for system processes. It fills the gap between Docker's built-in stats command and more complex monitoring solutions.

# SEE ALSO

[docker](/man/docker)(1), [docker-stats](/man/docker-stats)(1), [ctop](/man/ctop)(1), [lazydocker](/man/lazydocker)(1)