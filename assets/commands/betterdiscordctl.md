# TAGLINE

Manage BetterDiscord installation on Linux

# TLDR

Install BetterDiscord into **Discord Stable**

```sudo betterdiscordctl install```

Install it into **Canary**

```sudo betterdiscordctl --d-flavors canary install```

Install it into **PTB**

```sudo betterdiscordctl --d-flavors ptb install```

Install where Discord came from **Flatpak**

```sudo betterdiscordctl --d-install flatpak install```

Install where Discord came from **Snap**

```sudo betterdiscordctl --d-install snap install```

Check **whether it is installed** and which version

```betterdiscordctl status```

**Update** BetterDiscord after Discord updates itself

```sudo betterdiscordctl upgrade```

**Reinstall** when a Discord update breaks the injection

```sudo betterdiscordctl reinstall```

**Remove** it again

```sudo betterdiscordctl uninstall```

Update **betterdiscordctl itself**

```sudo betterdiscordctl self-upgrade```

# SYNOPSIS

**betterdiscordctl** [_options_] _command_

# DESCRIPTION

**betterdiscordctl** manages BetterDiscord installation on Linux systems. BetterDiscord is a client modification for Discord that enables themes, plugins, and additional customization features.

The tool handles installation, updates, and removal of BetterDiscord across different Discord variants (Stable, Canary, PTB) and installation methods (native, Flatpak, Snap).

# SUBCOMMANDS

**install**
> Install BetterDiscord.

**reinstall**
> Reinstall BetterDiscord, removing the old files.

**uninstall**
> Remove BetterDiscord.

**update**
> Update BetterDiscord, updating your local repository if present.

**status**
> Show current Discord patch state.

**self-upgrade**
> Upgrade betterdiscordctl itself.

# PARAMETERS

**-f**, **--d-flavors** _flavor_
> Specify Discord flavor: stable, canary, or ptb.

**-i**, **--d-install** _method_
> Specify installation method: system, flatpak, or snap.

**-p**, **--d-appdir** _path_
> Specify custom Discord app directory.

**-v**, **--verbose**
> Increase verbosity level.

**-q**, **--quiet**
> Decrease verbosity level.

**-V**, **--version**
> Display version and exit.

**-h**, **--help**
> Display help message and exit.

# CAVEATS

Requires root privileges. BetterDiscord may break after Discord updates; reinstallation is often necessary. Using client modifications may violate Discord's Terms of Service.

# INSTALL

```aur: yay -S betterdiscordctl```

```nix: nix profile install nixpkgs#betterdiscordctl```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[discord](/man/discord)(1), [flatpak](/man/flatpak)(1), [snap](/man/snap)(1)
