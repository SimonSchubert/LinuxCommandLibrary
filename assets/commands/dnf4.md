# TAGLINE

legacy DNF version 4 package manager

# TLDR

**Upgrade** all packages

```sudo dnf4 upgrade```

**Search** for packages

```dnf4 search [keyword1] [keyword2]```

Display package **info**

```dnf4 info [package]```

**Install** packages

```sudo dnf4 install [package1] [package2]```

**Remove** packages

```sudo dnf4 remove [package1] [package2]```

List **installed** packages

```dnf4 list --installed```

Find package **providing** a command

```dnf4 provides [command]```

View **history**

```dnf4 history```

# SYNOPSIS

**dnf4** _command_ [_options_] [_packages_]

# DESCRIPTION

**dnf4** is the DNF version 4 package manager for RHEL 8/9 and older Fedora versions (pre-41). It's the successor to yum and manages RPM packages.

On Fedora 41+, dnf defaults to version 5. Use dnf4 explicitly for the older version.

# PARAMETERS

**upgrade**
> Upgrade installed packages

**search** _keywords_
> Search package names and summaries

**info** _package_
> Display package details

**install** _packages_
> Install packages

**remove** _packages_
> Remove packages

**list**
> List packages

**provides** _file_
> Find package owning file

**history**
> View transaction history

# CAVEATS

Legacy version, newer systems use dnf5. Command abbreviations supported (in, rm, se, etc.).

# SEE ALSO

[dnf](/man/dnf)(8), [dnf5](/man/dnf5)(8), [rpm](/man/rpm)(8)
