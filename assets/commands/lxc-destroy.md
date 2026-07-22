# TAGLINE

Delete a Linux container and its configuration

# TLDR

**Delete** a stopped container

```sudo lxc-destroy -n [container_name]```

**Force delete** a running container (stops it first)

```sudo lxc-destroy -n [container_name] -f```

**Delete container and all its snapshots**

```sudo lxc-destroy -n [container_name] -s```

Display **help**

```lxc-destroy --help```

# SYNOPSIS

**lxc-destroy** **-n** _name_ [_options_]

# DESCRIPTION

**lxc-destroy** deletes a Linux container and its configuration. The container must be stopped before destruction unless **-f** is used.

# PARAMETERS

**-n**, **--name** _NAME_
> Container name to destroy.

**-P**, **--lxcpath** _PATH_
> Use an alternate container storage directory.

**-f**, **--force**
> Force destruction of a running container (stops it first).

**-s**, **--snapshots**
> Also destroy all snapshots of the container.

**-l**, **--logpriority** _LEVEL_
> Set log priority (FATAL, CRIT, WARN, ERROR, NOTICE, INFO, DEBUG).

**-o**, **--logfile** _FILE_
> Output to alternate log file.

**-?**, **--help**
> Display help information.

# CAVEATS

Requires root privileges. Permanently deletes container and its root filesystem. Stop container first unless using --force.

# INSTALL

```apt: sudo apt install lxc```

```dnf: sudo dnf install lxc```

```pacman: sudo pacman -S lxc```

```apk: sudo apk add lxc```

```zypper: sudo zypper install lxc```

```brew: brew install lxc```

```nix: nix profile install nixpkgs#lxc```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[lxc-create](/man/lxc-create)(1), [lxc-stop](/man/lxc-stop)(1), [lxc-ls](/man/lxc-ls)(1)
