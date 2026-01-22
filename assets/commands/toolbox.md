# TLDR

**Enter** a Toolbx container interactively

```toolbox enter [container]```

**Remove** one or more containers

```toolbox rm [container1] [container2]```

**Remove** one or more images

```toolbox rmi [image1] [image2]```

**Display** help for a specific subcommand

```toolbox help [subcommand]```

# SYNOPSIS

**toolbox** [_command_] [_options_]

# PARAMETERS

**create**
> Create a new Toolbx container

**enter**
> Enter a container for interactive use

**list**
> List existing containers and images

**rm**
> Remove one or more containers

**rmi**
> Remove one or more images

**run**
> Run a command in a container

**-h, --help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**toolbox** (or Toolbx) provides containerized command-line environments on Linux, primarily for Fedora Silverblue, CoreOS, and other immutable/ostree-based distributions. It creates mutable containers that seamlessly integrate with the host system.

Containers have access to the user's home directory, networking, and graphical environment while being isolated from the immutable host OS. This allows installing and using development tools without modifying the base system.

# CAVEATS

Requires Podman as the container runtime. Best suited for immutable Linux distributions. Container images are distribution-specific. Integration with the host may vary.

# SEE ALSO

[podman](/man/podman)(1), [distrobox](/man/distrobox)(1)
