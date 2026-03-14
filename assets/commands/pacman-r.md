# TAGLINE

short form of **pacman --remove**, which removes packages from the system

# TLDR

**Remove a package**

```sudo pacman -R [package]```

**Remove a package and its unneeded dependencies**

```sudo pacman -Rs [package]```

**Remove a package, its dependencies, and configuration files**

```sudo pacman -Rns [package]```

**Remove a package without checking dependencies** (dangerous)

```sudo pacman -Rdd [package]```

**List packages that would be removed** (dry run)

```pacman -Rsp [package]```

View documentation for the original command

```tldr pacman remove```

# SYNOPSIS

**pacman -R** [_options_] _package(s)_

# PARAMETERS

**-c**, **--cascade**
> Remove all target packages and packages that depend on them.

**-n**, **--nosave**
> Remove configuration files that would otherwise be saved as .pacsave files.

**-s**, **--recursive**
> Remove dependencies not required by other packages.

**-u**, **--unneeded**
> Remove targets only if they are not required by any other packages.

**-p**, **--print**
> Print targets instead of performing the operation.

**-d**, **--nodeps**
> Skip dependency checks. Pass twice (-dd) to also skip required-by checks.

# DESCRIPTION

**pacman -R** is the short form of **pacman --remove**, which removes packages from the system. It handles dependency checking and can optionally remove configuration files and orphaned dependencies.

# CAVEATS

Using **-Rdd** bypasses all dependency checks and can break the system. The **-Rns** combination is the cleanest removal, also removing backup configuration files and orphaned dependencies.

# SEE ALSO

[pacman](/man/pacman)(8), [pacman-remove](/man/pacman-remove)(8)
