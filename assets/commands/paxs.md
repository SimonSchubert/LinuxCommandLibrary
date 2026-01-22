# TLDR

**Search** for a package

```paxs [search_term]```

**Upgrade** all packages

```paxs -u```

**Install** a package (prompts for source)

```paxs -i [package]```

**Remove** a package

```paxs -r [package]```

**Check** for updates

```paxs -c```

Display **help**

```paxs -h```

# SYNOPSIS

**paxs** [**-u**|**--upgrade-all**] [**-i**|**--install** _pkg_] [**-r**|**--remove** _pkg_] [**-c**|**--check-update**] [_search_term_]

# PARAMETERS

**-u, --upgrade-all**
> Upgrade all packages across all package managers

**-i, --install _package_**
> Install package (prompts for source if available in multiple)

**-r, --remove _package_**
> Remove package (prompts for source if in multiple)

**-c, --check-update**
> Check for updates across all managers

**-h, --help**
> Display help information

# DESCRIPTION

**paxs** is a meta-package manager that unifies operations across Yay (AUR), Flatpak, and Snap. It allows searching, installing, removing, and upgrading packages from multiple sources through a single interface.

When a package exists in multiple sources, paxs prompts the user to select which source to use. This simplifies package management on systems using multiple package formats.

# CAVEATS

Requires yay, flatpak, and/or snap to be installed. Only manages packages through supported package managers. Some operations may require root privileges depending on the underlying manager.

# HISTORY

**paxs** was created by **zamhedonia** to address the complexity of managing multiple package managers on modern Linux systems. It provides a unified interface without replacing the underlying package managers.

# SEE ALSO

[yay](/man/yay)(1), [flatpak](/man/flatpak)(1), [snap](/man/snap)(1), [pacman](/man/pacman)(8)
