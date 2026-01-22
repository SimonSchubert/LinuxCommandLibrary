# TLDR

**Install** a package

```pamac install [package]```

**Remove** package with orphans

```pamac remove --orphans [package]```

**Search** for a package

```pamac search [package]```

**List** installed packages

```pamac list --installed```

**Check** for updates

```pamac checkupdates```

**Upgrade** all packages

```pamac upgrade```

# SYNOPSIS

**pamac** [**install**|**remove**|**search**|**list**|**upgrade**|**checkupdates**] [_options_] [_packages_...]

# COMMANDS

**install**
> Install packages from repositories or AUR

**remove**
> Remove installed packages

**search**
> Search package databases

**list**
> List packages (installed, orphans, etc.)

**upgrade**
> Upgrade installed packages

**checkupdates**
> Check for available updates

**build**
> Build packages from AUR

**clean**
> Clean package cache

# PARAMETERS

**--orphans**
> Include orphaned dependencies in removal

**--aur**
> Include AUR in operations

**--no-confirm**
> Skip confirmation prompts

**-a, --all**
> Apply to all packages

**--installed**
> Filter to installed packages only

# DESCRIPTION

**pamac** is a graphical and command-line package manager for Arch-based distributions, primarily Manjaro. It provides a user-friendly interface to pacman and supports AUR (Arch User Repository) integration.

The tool combines package installation, removal, searching, and system updates in a unified interface. AUR support must be enabled in /etc/pamac.conf or through the GUI settings.

# CAVEATS

AUR packages require enabling in configuration. Some operations require root privileges. Build dependencies for AUR packages may need manual handling. Updates may require system restart.

# HISTORY

**pamac** was developed by the **Manjaro** team as an alternative to pacman with better user experience. It provides both GTK and CLI interfaces, making package management accessible to users unfamiliar with command-line tools.

# SEE ALSO

[pacman](/man/pacman)(8), [yay](/man/yay)(1), [paru](/man/paru)(1)
