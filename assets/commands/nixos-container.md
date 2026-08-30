# TAGLINE

manages lightweight NixOS containers using Linux namespaces

# TLDR

List the containers that exist

```sudo nixos-container list```

Create one from an **inline configuration**

```sudo nixos-container create [name] --config '{ services.openssh.enable = true; }'```

Create one from a **configuration file**

```sudo nixos-container create [name] --config-file [path/to/configuration.nix]```

Give it **fixed private addresses** on both sides of the link

```sudo nixos-container create [name] --local-address [10.233.4.2] --host-address [10.233.4.1]```

Have it **start automatically at boot**

```sudo nixos-container create [name] --auto-start```

**Start** a container

```sudo nixos-container start [name]```

Check whether it is **running**

```sudo nixos-container status [name]```

Find its **IP address**

```sudo nixos-container show-ip [name]```

Open a **root shell** inside it

```sudo nixos-container root-login [name]```

Run **one command** inside it

```sudo nixos-container run [name] -- [command]```

**Rebuild** it after editing its configuration

```sudo nixos-container update [name]```

**Stop** it

```sudo nixos-container stop [name]```

**Kill** it without a clean shutdown

```sudo nixos-container terminate [name]```

**Delete** it along with its filesystem

```sudo nixos-container destroy [name]```

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

# INSTALL

```nix: nix profile install nixpkgs#nixos-container```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[nixos-rebuild](/man/nixos-rebuild)(8), [systemd-nspawn](/man/systemd-nspawn)(1), [machinectl](/man/machinectl)(1)
