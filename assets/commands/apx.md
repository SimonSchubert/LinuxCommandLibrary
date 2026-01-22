# TLDR

View documentation for managing **package managers**

```apx pkgmanagers --help```

View documentation for managing **stacks**

```apx stacks --help```

View documentation for managing **subsystems**

```apx subsystems --help```

**Enter** a subsystem shell

```apx [subsystem] enter```

**Install** a package in a subsystem

```apx [subsystem] install [package]```

**Run** a command in a subsystem

```apx [subsystem] run [command]```

# SYNOPSIS

**apx** [_subsystem_] _command_ [_options_]

# DESCRIPTION

**apx** is a package management utility for Vanilla OS that supports multiple package sources through containerized subsystems. It allows installing packages from different Linux distributions (Debian, Fedora, Arch, etc.) without affecting the host system.

Packages are installed in isolated subsystems based on Podman containers. Applications can be exported to the host system and integrated with the desktop environment while maintaining separation from the immutable host OS.

# SUBCOMMANDS

**pkgmanagers**
> Manage package manager configurations

**stacks**
> Manage stack configurations (base images and package managers)

**subsystems**
> Manage subsystems (container environments)

**enter**
> Enter a subsystem's shell

**install**
> Install packages in a subsystem

**remove**
> Remove packages from a subsystem

**run**
> Run a command in a subsystem

**export**
> Export an application to the host system

# CAVEATS

Requires Podman for container management. First-time subsystem creation downloads container images which may be large. Exported applications run inside containers, which may have slight performance overhead.

# HISTORY

**apx** was developed as part of Vanilla OS, an immutable Linux distribution first released in **2022**. It provides a novel approach to package management that preserves system immutability while allowing users to install software from multiple Linux ecosystems.

# SEE ALSO

[apx-pkgmanagers](/man/apx-pkgmanagers)(1), [apx-stacks](/man/apx-stacks)(1), [apx-subsystems](/man/apx-subsystems)(1), [podman](/man/podman)(1)
