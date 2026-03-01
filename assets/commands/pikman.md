# TAGLINE

PikaOS unified package manager

# TLDR

**Search** for a package in native repos

```pikman search [package_name]```

**Install** a package from native repos

```pikman install [package]```

**Install** a package from the **AUR** via container

```pikman --aur install [package]```

**Install** a **Flatpak** package

```pikman --flatpak install [package]```

**Update** the list of available packages

```pikman update```

**Upgrade** all system packages

```pikman upgrade```

**Remove** a package

```pikman remove [package]```

**Initialize** the Arch/AUR container for cross-distro support

```pikman --aur init```

# SYNOPSIS

**pikman** [_global options_] _command_ [_command options_] [_arguments..._]

# PARAMETERS

**--arch**, **--aur**
> Install and manage Arch Linux packages including AUR

**--fedora**, **--dnf**
> Install and manage Fedora packages

**--alpine**, **--apk**
> Install and manage Alpine Linux packages

**--flatpak**, **--fl**
> Install and manage Flatpak packages

**--name** _value_
> Specify a managed container name

**--help**, **-h**
> Display help information

**--version**, **-v**
> Show version number

# DESCRIPTION

**pikman** is the official package manager for **PikaOS**, a Debian-based Linux distribution. It provides a unified interface for managing packages across multiple packaging systems. On its native PikaOS it wraps **APT** for native package management, but can also install packages from **Arch/AUR**, **Fedora**, and **Alpine** repositories using **APX** with Podman containers under the hood. It also supports **Flatpak** packages. Applications installed from containerized distributions automatically appear in the host's application launcher.

pikman handles privilege escalation internally and must **not** be run with sudo. It refuses to run as root.

# COMMANDS

**install**, **i**
> Install the specified package(s)

**remove**, **r**
> Remove an installed package

**purge**
> Fully purge a package including config files

**search**, **s**
> Search for a package

**show**
> Show details for a package

**list**, **l**
> List installed packages (supports **--upgradable** and **--installed** filters)

**update**
> Update the list of available packages

**upgrade**
> Upgrade the system by installing/upgrading available packages

**autoremove**
> Remove all unused packages

**clean**, **cl**
> Clean the package manager cache

**init**
> Initialize a managed container for cross-distro support

**enter**
> Enter the container instance for a given package manager

**export**
> Export a program's desktop entry from the container

**unexport**
> Remove a program's desktop entry

# CAVEATS

Pikman is designed specifically for **PikaOS** and is not a general-purpose tool for other distributions. Before installing packages from other distributions (Arch, Fedora, Alpine), you must first initialize the respective container with **pikman --aur init** (or **--fedora init**, etc.). For Flatpak packages, use **pikman --flatpak update** instead of **upgrade** to match Flatpak conventions.

# HISTORY

Pikman was created as part of the **PikaOS** project, a Debian-based distribution focused on gaming and desktop use. It is written in **Go** and was originally hosted on GitHub. The repository was archived in **November 2024** with development continuing on PikaOS's own Gitea instance. There is also a GUI counterpart called **Pikman Update Manager** for graphical package management.

# SEE ALSO

[apt](/man/apt)(8), [flatpak](/man/flatpak)(1), [pacman](/man/pacman)(8), [dnf](/man/dnf)(8), [podman](/man/podman)(1)
