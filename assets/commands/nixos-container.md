# TLDR

**List** running containers

```sudo nixos-container list```

**Create** a NixOS container with a specific configuration file

```sudo nixos-container create [container_name] --config-file [path/to/nix_config_file]```

**Start, stop, terminate, or destroy** a specific container

```sudo nixos-container [start|stop|terminate|destroy|status] [container_name]```

**Run a command** in a running container

```sudo nixos-container run [container_name] -- [command] [arguments]```

**Update** a container configuration

```sudo nixos-container update [container_name]```

Enter an **interactive shell** session on a running container

```sudo nixos-container root-login [container_name]```

# SYNOPSIS

**nixos-container** _command_ [_options_] [_container_name_]

# PARAMETERS

**list**
> List all containers

**create _name_**
> Create a new container

**start _name_**
> Start a stopped container

**stop _name_**
> Stop a running container

**terminate _name_**
> Forcefully terminate a container

**destroy _name_**
> Remove a container and its configuration

**status _name_**
> Show container status

**run _name_ -- _command_**
> Execute a command inside the container

**root-login _name_**
> Open an interactive root shell in the container

**update _name_**
> Rebuild container after configuration changes

**--config-file _path_**
> Nix configuration file for the container

# DESCRIPTION

**nixos-container** manages lightweight NixOS containers using Linux namespaces (systemd-nspawn). Each container runs a minimal NixOS system with its own configuration, services, and network namespace.

Containers are configured using standard NixOS configuration files, enabling declarative management of containerized services. The container shares the host's kernel but has an isolated filesystem, process tree, and optionally network.

Configuration files are stored in **/var/lib/container/<name>/etc/nixos/** and can be edited directly before running **update** to apply changes.

# CAVEATS

Requires root privileges. NixOS-specific; not available on other distributions. Containers share the host kernel, so kernel modules and versions are inherited. Network configuration requires explicit setup for external connectivity.

# SEE ALSO

[nixos-rebuild](/man/nixos-rebuild)(8), [systemd-nspawn](/man/systemd-nspawn)(1), [machinectl](/man/machinectl)(1)
