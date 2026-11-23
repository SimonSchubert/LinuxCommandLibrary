# TAGLINE

Gentoo Linux package manager

# TLDR

**Synchronize** the package repositories

```sudo emerge --sync```

**Update** all packages including dependencies

```sudo emerge [-avuDN|--ask --verbose --update --deep --newuse] @world```

**Resume** a failed update, skipping failing package

```sudo emerge --resume --skipfirst```

**Install** a new package with confirmation

```sudo emerge [-av|--ask --verbose] [category/package]```

**Preview** what would be installed without doing it

```emerge [-pv|--pretend --verbose] [package]```

**Rebuild** a package without adding it to the world file

```sudo emerge [-1|--oneshot] [package]```

**Remove** a package if nothing else depends on it

```sudo emerge [-avc|--ask --verbose --depclean] [package]```

Remove **orphaned** packages

```sudo emerge [-avc|--ask --verbose --depclean]```

**Search** package names and descriptions

```emerge [-S|--searchdesc] [keyword]```

**Rebuild** packages linked against removed libraries

```sudo emerge @preserved-rebuild```

# SYNOPSIS

**emerge** [_options_] [_atoms_]

# DESCRIPTION

**emerge** is the Gentoo Linux package manager. It installs, updates, and removes packages by compiling them from source according to USE flags and system configuration.

It is the main front-end of **Portage**, Gentoo's package management system, and handles dependency resolution, slots, USE flag changes, and the **@world** set of explicitly installed packages. Binary packages can also be built and installed with **--buildpkg** and **--getbinpkg**.

# PARAMETERS

**--sync**
> Synchronize the configured repositories (equivalent to **emaint sync --auto**).

**-a**, **--ask**
> Ask before proceeding.

**-p**, **--pretend**
> Show what would be done without doing it.

**-1**, **--oneshot**
> Merge without recording the package in the world file.

**-n**, **--noreplace**
> Skip packages that are already installed.

**-v**, **--verbose**
> Verbose output, including USE flags.

**-u**, **--update**
> Update packages to the best available version.

**-D**, **--deep**
> Consider the entire dependency tree.

**-N**, **--newuse**
> Rebuild packages whose USE flags changed, including added or removed flags.

**-U**, **--changed-use**
> Rebuild only when enabled USE flags changed.

**-c**, **--depclean**
> Remove packages not required by the world set or the system profile.

**-C**, **--unmerge**
> Remove the given packages without dependency checks (dangerous).

**-s**, **--search**
> Search package names.

**-S**, **--searchdesc**
> Search package names and descriptions.

**-j**, **--jobs** [_N_]
> Build up to N packages in parallel.

**--keep-going**
> Continue with remaining packages after a build failure.

**--info**
> Print system and Portage information for bug reports.

**-r**, **--resume**
> Resume the last interrupted merge.

**--skipfirst**
> Skip the first package when resuming.

# CONFIGURATION

**/etc/portage/make.conf**
> Global Portage configuration including USE flags, compiler flags, and system settings.

**/etc/portage/package.use**
> Per-package USE flag overrides.

**/etc/portage/package.accept_keywords**
> Accept unstable packages or specific versions.

# CAVEATS

Gentoo Linux specific. Compiles from source, which can be time-consuming. Requires proper **/etc/portage** configuration. Run **emerge --sync** before updates and read **eselect news** after syncing. Always check **--depclean** output with **--pretend** or **--ask** before removing packages.

# HISTORY

Portage and **emerge** were written for Gentoo Linux, founded by **Daniel Robbins** around **1999**; Portage was inspired by the FreeBSD ports collection. It is written in **Python** and Bash and is maintained by the Gentoo Portage project.

# SEE ALSO

[emaint](/man/emaint)(1), [equery](/man/equery)(1), [eix](/man/eix)(1), [portageq](/man/portageq)(1), [ebuild](/man/ebuild)(1), [eselect](/man/eselect)(1), [eclean](/man/eclean)(1)

# RESOURCES

```[Source code](https://github.com/gentoo/portage)```

```[Homepage](https://wiki.gentoo.org/wiki/Portage)```

```[Documentation](https://wiki.gentoo.org/wiki/Emerge)```

<!-- verified: 2026-11-23 -->
