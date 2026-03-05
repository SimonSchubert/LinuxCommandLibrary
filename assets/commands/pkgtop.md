# TAGLINE

Interactive package manager and resource monitor for GNU/Linux

# TLDR

**Launch the package dashboard**

```pkgtop```

**List packages alphabetically**

```pkgtop -a```

# SYNOPSIS

**pkgtop** [_options_]

# PARAMETERS

**-a**
> List packages alphabetically instead of by size.

# DESCRIPTION

**pkgtop** is an interactive terminal dashboard for managing packages and monitoring system resources on GNU/Linux. It lists installed packages by size, shows package information, and allows installing, upgrading, removing, and searching packages. The dashboard also displays disk usage and general system information.

# CAVEATS

Linux only. Supports Arch, Debian, Ubuntu, Fedora, CentOS, openSUSE, Void, Gentoo, NixOS, Guix, and their derivatives.

# HISTORY

**pkgtop** was created by **Orhun Parmaksiz** (orhun) and is written in **Go**.

# SEE ALSO

[apt](/man/apt)(8), [pacman](/man/pacman)(8), [dnf](/man/dnf)(8), [htop](/man/htop)(1)
