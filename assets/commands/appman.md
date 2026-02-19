# TAGLINE

AppImage and portable application manager for local installations

# TLDR

**Search and install** a package by name

```appman -i [package_name]```

**Update all** installed applications

```appman -u```

**Remove** an installed application

```appman -r [package_name]```

**Search** available packages by keyword

```appman -q [keyword]```

**List all installed** applications

```appman -f```

**Show information** about an installed application

```appman -a [package_name]```

# SYNOPSIS

**appman** [_option_] [_package_name_]

# PARAMETERS

**-i**, **install** _package_
> Install one or more applications locally in the user home directory

**-ia**, **install-appimage** _package_
> Install AppImage packages specifically

**-r**, **remove** _package_
> Remove one or more installed applications

**-u**, **update**
> Update all installed applications and AppMan itself. Use **--apps** to update only programs

**-l**, **list**
> List all available applications in the database

**-q**, **query** _keyword_
> Search available applications by keyword

**-f**, **files**
> Show all locally installed applications

**-a**, **about** _package_
> View the description and source information for an application

**-d**, **download** _package_
> Download and read the installation script without installing

**-b**, **backup** _package_
> Create a snapshot of an installed application for rollback

**-o**, **overwrite** _package_
> Overwrite an existing installation with a fresh copy

**-e**, **extra** _url_
> Install applications from external GitHub repositories

**-c**, **clean**
> Remove temporary and cached files

**-s**, **sync**
> Update AppMan modules and core script

**--rollback** _package_
> Revert an application to a previous version

**--sandbox** _package_
> Enable Bubblewrap sandboxing for an AppImage via Aisap

**--disable-sandbox** _package_
> Remove sandbox isolation from an AppImage

**--launcher** _package_
> Integrate an application with desktop menus and launchers

**--relocate**
> Change the local installation directory for apps

**-h**, **help**
> Show all available options

**-v**, **version**
> Print version information

# DESCRIPTION

**appman** is a rootless, portable package manager for AppImages and other portable Linux applications. It is a redistribution of the **AM Application Manager** that does not require root privileges, installing and managing all applications locally within the user's home directory.

AppMan downloads installation scripts from the AM database and converts them for local use. Applications are stored in a user-chosen directory (e.g. **~/Applications**), with executable links placed in **~/.local/bin/** and desktop entries in **~/.local/share/applications/**. The database lists over 2500 AppImages and portable programs.

AppMan supports the same commands as AM — simply replace **am** with **appman**. It handles installation, updates, removal, sandboxing, rollback, and desktop integration without ever requiring sudo access.

# CAVEATS

AppMan relies on installation scripts from a community-maintained database. These scripts download binaries from third-party sources and are not audited by a central authority — always review scripts with **-d** before installing. Sandboxing via Aisap requires Bubblewrap to be available on the system. Some applications may not update correctly if upstream changes their release format or download URLs.

# HISTORY

AppMan was created by **ivan-hc** as a companion to the **AM Application Manager**, first appearing on GitHub around **2022**. AM itself was inspired by the AUR model for Arch Linux, aiming to bring a similar community-driven package management experience to AppImages and portable apps across all GNU/Linux distributions. AppMan was introduced to provide the same functionality without requiring root privileges, making it suitable for restricted environments and multi-user systems.

# SEE ALSO

[flatpak](/man/flatpak)(1), [snap](/man/snap)(1), [wget](/man/wget)(1)
