# TLDR

**Install** packages via aptd

```aptdcon --install [package1] [package2]```

**Remove** packages

```aptdcon --remove [package]```

**Upgrade** all packages

```aptdcon --safe-upgrade```

**Refresh** package cache

```aptdcon --refresh```

Run with **progress** display

```aptdcon --install [package] --show-terminal```

# SYNOPSIS

**aptdcon** [_--install packages_] [_--remove packages_] [_--upgrade_] [_options_]

# DESCRIPTION

**aptdcon** is a command-line client for the aptd daemon. It communicates with aptd via D-Bus to perform package management operations, providing a terminal interface to the same backend used by GUI package managers.

Operations are queued and executed by aptd, with authentication handled through PolicyKit.

# PARAMETERS

**-i** _pkgs_, **--install** _pkgs_
> Install packages

**-r** _pkgs_, **--remove** _pkgs_
> Remove packages

**--upgrade**
> Upgrade all packages

**--safe-upgrade**
> Safe upgrade (don't remove packages)

**--refresh**
> Update package cache

**--show-terminal**
> Show dpkg terminal output

**--version-detailed**
> Show detailed version information

**-h**, **--help**
> Show help

# CAVEATS

Requires aptd to be running. Uses D-Bus for communication. May require PolicyKit authentication. Less capable than direct apt commands.

# HISTORY

**aptdcon** was created as a command-line interface to the aptd daemon, allowing terminal users to leverage the same infrastructure as GUI tools.

# SEE ALSO

[aptd](/man/aptd)(1), [apt](/man/apt)(8), [apt-get](/man/apt-get)(8)
