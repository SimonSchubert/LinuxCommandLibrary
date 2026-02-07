# TAGLINE

Real-time container metrics monitor

# TLDR

Show only **active** containers

```ctop -a```

**Reverse** container sort order

```ctop -r```

**Invert** the default colors

```ctop -i```

Display **help**

```ctop -h```

# SYNOPSIS

**ctop** [_options_]

# DESCRIPTION

**ctop** provides a top-like interface for monitoring container metrics in real-time. It displays CPU usage, memory consumption, network I/O, and block I/O statistics for all containers on the system.

The tool works with Docker, containerd, and other container runtimes by connecting to their respective sockets. The interface is fully interactive, allowing users to sort containers by different metrics, filter active vs all containers, and drill down into individual container logs and stats.

ctop is particularly useful for DevOps workflows, debugging performance issues, and monitoring containerized applications without needing to remember complex docker stats commands. It provides a consolidated view across all containers similar to how htop works for system processes.

# PARAMETERS

**-a**
> Show only active (running) containers

**-r**
> Reverse sort order

**-i**
> Invert default colors

**-h**
> Display help

**-s** _field_
> Select initial sort field

# KEYBINDINGS

**q**
> Quit

**s**
> Select sort field

**r**
> Reverse sort order

**Enter**
> View container details

# CAVEATS

Requires access to the container runtime socket (usually /var/run/docker.sock). May need to run with sudo or as a user in the docker group. Performance metrics depend on the container runtime's capabilities.

# HISTORY

**ctop** was created by **bcicen** and released as an open-source project in **2016**. It quickly gained popularity in the container community as a user-friendly alternative to docker stats, providing a more intuitive interface for container monitoring.

# SEE ALSO

[docker](/man/docker)(1), [top](/man/top)(1), [htop](/man/htop)(1)
