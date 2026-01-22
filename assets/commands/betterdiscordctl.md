# TLDR

**Install** BetterDiscord on Discord Stable

```sudo betterdiscordctl install```

Install BetterDiscord on **Discord Canary**

```sudo betterdiscordctl -f canary install```

Install BetterDiscord on **Discord PTB**

```sudo betterdiscordctl -f ptb install```

Install BetterDiscord on Discord installed with **Flatpak**

```sudo betterdiscordctl -i flatpak install```

Install BetterDiscord on Discord installed with **Snap**

```sudo betterdiscordctl -i snap install```

# SYNOPSIS

**betterdiscordctl** [_options_] _command_

# DESCRIPTION

**betterdiscordctl** manages BetterDiscord installation on Linux systems. BetterDiscord is a client modification for Discord that enables themes, plugins, and additional customization features.

The tool handles installation, updates, and removal of BetterDiscord across different Discord variants (Stable, Canary, PTB) and installation methods (native, Flatpak, Snap).

# SUBCOMMANDS

**install**
> Install BetterDiscord

**reinstall**
> Reinstall BetterDiscord

**uninstall**
> Remove BetterDiscord

**status**
> Show current BetterDiscord status

# PARAMETERS

**-f, --d-flavors** _flavor_
> Specify Discord flavor: stable, canary, or ptb

**-i, --d-install** _method_
> Specify installation method: system, flatpak, or snap

**-p, --d-appdir** _path_
> Specify custom Discord app directory

# CAVEATS

Requires root privileges. BetterDiscord may break after Discord updates; reinstallation is often necessary. Using client modifications may violate Discord's Terms of Service.

# SEE ALSO

[discord](/man/discord)(1), [flatpak](/man/flatpak)(1), [snap](/man/snap)(1)
