# TAGLINE

TUI for deploying NixOS systems based on flakes

# TLDR

**Launch the deployment TUI** in a flake directory

```labcoat```

**Deploy from a specific flake** directory

```labcoat [path/to/flake]```

**Run without installing**

```nix run github:jhillyerd/labcoat```

**Write the default configuration** to a file

```labcoat -defaults > [~/.config/labcoat/config.toml]```

**Use a specific configuration file**

```labcoat -config [path/to/config.toml]```

# SYNOPSIS

**labcoat** [_options_] [_flake-dir_]

# PARAMETERS

_flake-dir_
> Directory containing flake.nix (default: the current directory)

**-config** _path_
> Path to a TOML configuration file

**-defaults**
> Print the default configuration to stdout and exit

**-log** _path_
> File to write debug logs to

**-help**
> Print argument help

# DESCRIPTION

**labcoat** is a terminal user interface for deploying NixOS systems based on flakes. It fetches the list of **nixosConfigurations** from your flake and gives one-touch access to deploy and inspect those machines.

Features include building and deploying to target hosts, interactive SSH access, running a command on a target, rebooting with confirmation, showing host status on hover, per-node command and deployment history, and external pager support.

The tool is designed for NixOS lab environments of up to a couple dozen machines, especially during development when you do not yet know if a configuration works correctly.

# CONFIGURATION

**$XDG_CONFIG_HOME/labcoat/config.toml**
> Optional TOML configuration, usually **~/.config/labcoat/config.toml**. It is layered on top of the built-in defaults, so it only needs the values you want to change.

# CAVEATS

Requires a NixOS flake configuration. The project describes itself as incomplete and alpha quality. For production environments with many instances of the same configuration, a parallel deployment tool is a better fit.

# HISTORY

**labcoat** was created by **jhillyerd** and is written in **Go**.

# SEE ALSO

[nixos-rebuild](/man/nixos-rebuild)(8), [nix](/man/nix)(1), [ssh](/man/ssh)(1)

# RESOURCES

```[Source code](https://github.com/jhillyerd/labcoat)```

<!-- verified: 2026-11-09 -->
