# TAGLINE

Gentoo Linux package manager

# TLDR

**Synchronize** all packages

```sudo emerge --sync```

**Update** all packages including dependencies

```sudo emerge [-avuDN|--ask --verbose --update --deep --newuse] @world```

**Resume** a failed update, skipping failing package

```sudo emerge --resume --skipfirst```

**Install** a new package with confirmation

```sudo emerge [-av|--ask --verbose] [package]```

**Remove** a package with dependencies

```sudo emerge [-avc|--ask --verbose --depclean] [package]```

Remove **orphaned** packages

```sudo emerge [-avc|--ask --verbose --depclean]```

**Search** the package database

```emerge [-S|--searchdesc] [keyword]```

# SYNOPSIS

**emerge** [_options_] [_atoms_]

# DESCRIPTION

**emerge** is the Gentoo Linux package manager. It installs, updates, and removes packages by compiling them from source according to USE flags and system configuration.

Manages the entire software lifecycle including dependency resolution and slot conflicts.

# PARAMETERS

**--sync**
> Synchronize package database

**-a, --ask**
> Ask before proceeding

**-v, --verbose**
> Verbose output

**-u, --update**
> Update packages

**-D, --deep**
> Consider entire dependency tree

**-N, --newuse**
> Rebuild for USE flag changes

**--depclean**
> Remove unneeded packages

**-S, --searchdesc**
> Search package descriptions

**--resume**
> Resume interrupted operation

**--skipfirst**
> Skip first package when resuming

# CONFIGURATION

**/etc/portage/make.conf**
> Global Portage configuration including USE flags, compiler flags, and system settings.

**/etc/portage/package.use**
> Per-package USE flag overrides.

**/etc/portage/package.accept_keywords**
> Accept unstable packages or specific versions.

# CAVEATS

Gentoo Linux specific. Compiles from source, which can be time-consuming. Requires proper /etc/portage configuration. Use `emerge --sync` or `emaint sync` before updates.

# SEE ALSO

[emaint](/man/emaint)(1), [equery](/man/equery)(1), [eix](/man/eix)(1), [portage](/man/portage)(5)
