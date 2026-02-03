# TLDR

**Install package**

```tlmgr install [package]```

**Install multiple packages**

```tlmgr install [package1] [package2]```

**Install with dependencies**

```tlmgr install --with-doc --with-src [package]```

**Dry run**

```tlmgr install --dry-run [package]```

# SYNOPSIS

**tlmgr install** [_options_] _package_...

# PARAMETERS

**--with-doc**
> Include documentation.

**--with-src**
> Include source files.

**--dry-run**
> Show what would be installed.

**--file**
> Package is a local file.

**--reinstall**
> Reinstall package.

# DESCRIPTION

**tlmgr install** installs TeX Live packages from CTAN repositories. Resolves dependencies automatically. Part of TeX Live Manager for managing LaTeX packages and fonts.

# SEE ALSO

[tlmgr-remove](/man/tlmgr-remove)(1), [tlmgr-update](/man/tlmgr-update)(1), [tlmgr](/man/tlmgr)(1)

