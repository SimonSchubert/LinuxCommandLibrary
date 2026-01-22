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

**ctop** provides a real-time view of container metrics including CPU, memory, network, and block I/O usage. It works with Docker, containerd, and other container runtimes.

The interface is interactive, allowing sorting by different metrics and drilling down into individual container details.

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

Requires access to the container runtime socket (usually /var/run/docker.sock). May need to run with sudo or as a user in the docker group.

# SEE ALSO

[docker](/man/docker)(1), [top](/man/top)(1), [htop](/man/htop)(1)
