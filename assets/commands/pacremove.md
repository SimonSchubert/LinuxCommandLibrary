# TAGLINE

convenience alias for **pactrans --remove** that removes packages

# TLDR

**Remove** a package

```sudo pacremove [package]```

**Preview** the transaction without changing anything

```sudo pacremove --print-only [package]```

Also remove **unneeded dependencies**

```sudo pacremove --recursive [package]```

Also remove packages that **depend on** the target

```sudo pacremove --cascade [package]```

Remove without saving **.pacsave** backups

```sudo pacremove --no-backup [package]```

# SYNOPSIS

**pacremove** [_options_] _package_...

# PARAMETERS

**--cascade**
> Uninstall all installed packages that depend on a package being uninstalled.

**--recursive**
> Uninstall dependencies of removed packages that no other package requires.

**--unneeded**
> Do not uninstall packages required by an installed package.

**--no-backup**
> Do not save .pacsave backups.

**--print-only**
> Display what the transaction would do and exit.

**--no-confirm**
> Assume default responses to all prompts.

**--dbonly**
> Change the database without actually removing any files.

**--nodeps**
> Ignore dependency versions. Pass twice to skip dependency checks altogether.

**--no-scriptlet**
> Do not run package install scripts.

**--no-hooks**
> Do not run transaction hooks.

**--config=**_path_
> Set an alternate configuration file path.

**--help**
> Display usage information and exit.

**--version**
> Display version information and exit.

# DESCRIPTION

**pacremove** is a convenience alias for **pactrans --remove** that removes packages from the system. It behaves identically to pactrans and differs only in interpreting targets as package names to uninstall by default.

If stdin is not connected to a terminal, targets are read from stdin. Operation options such as **--install** still apply to the targets that follow them.

# HISTORY

Part of **pacutils**, a collection of utilities for Arch Linux package management built on libalpm.

# INSTALL

```pacman: sudo pacman -S pacutils```

<!-- packages: 2026-11-08 -->

# SEE ALSO

[pactrans](/man/pactrans)(1), [pacinstall](/man/pacinstall)(1), [pacman](/man/pacman)(8)

# RESOURCES

```[Source code](https://github.com/andrewgregory/pacutils)```

```[Documentation](https://man.archlinux.org/man/pactrans.1)```

<!-- verified: 2026-11-08 -->
