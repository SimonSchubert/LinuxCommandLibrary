# TAGLINE

Display TeX Live package information

# TLDR

**Show package information**

```tlmgr info [package]```

**List all packages**

```tlmgr info --list```

**List installed packages**

```tlmgr info --only-installed```

**Show package files**

```tlmgr info --files [package]```

# SYNOPSIS

**tlmgr info** [_options_] [_package_...]

# PARAMETERS

**--list**
> List all available packages.

**--only-installed**
> Show only installed packages.

**--files**
> Show package files.

**--data** _fields_
> Output specific fields (name, category, etc.).

**--json**
> Output in JSON format.

# DESCRIPTION

**tlmgr info** displays information about TeX Live packages. Shows descriptions, versions, sizes, and contained files. Part of TeX Live Manager.

# SEE ALSO

[tlmgr-search](/man/tlmgr-search)(1), [tlmgr](/man/tlmgr)(1)

