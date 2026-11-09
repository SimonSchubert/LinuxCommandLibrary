# TAGLINE

Install TeX Live packages

# TLDR

**Install package**

```tlmgr install [package]```

**Install multiple packages**

```tlmgr install [package1] [package2]```

**Add documentation and sources to an installed package**

```tlmgr install --reinstall --with-doc --with-src [package]```

**Dry run**

```tlmgr install --dry-run [package]```

**Install from a local package file**

```tlmgr install --file [package.tar.xz]```

# SYNOPSIS

**tlmgr install** [_options_] _package_...

# PARAMETERS

**--with-doc**
> Include documentation; use with **--reinstall** after an install made without it.

**--with-src**
> Include source files; use with **--reinstall** after an install made without them.

**--dry-run**
> Show what would be installed.

**--file**
> Use the TeX Live package files given on the command line instead of the repository.

**--reinstall**
> Reinstall even if the package already seems to be installed.

**--no-depends**
> Do not install dependencies.

**--no-depends-at-all**
> Also skip the platform-specific binary package. Implies **--no-depends**.

**--force**
> Install even if updates to tlmgr itself are pending. Not recommended.

# DESCRIPTION

**tlmgr install** installs TeX Live packages from CTAN repositories. Resolves dependencies automatically. Part of TeX Live Manager for managing LaTeX packages and fonts. Packages already installed are left untouched; use **tlmgr update** to get newer versions.

# CAVEATS

New symlinks in system directories are not added automatically; run **tlmgr path add** if you use that feature.

# SEE ALSO

[tlmgr-remove](/man/tlmgr-remove)(1), [tlmgr-update](/man/tlmgr-update)(1), [tlmgr](/man/tlmgr)(1)

# RESOURCES

```[Homepage](https://www.tug.org/texlive/)```

```[Documentation](https://www.tug.org/texlive/doc/tlmgr.html)```

<!-- verified: 2026-11-09 -->
