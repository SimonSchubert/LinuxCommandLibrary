# TAGLINE

Arch Linux package building scripts

# TLDR

**Build a package in a clean chroot**

```extra-x86_64-build```

**Build testing package**

```testing-x86_64-build```

**Build staging package**

```staging-x86_64-build```

**Create a clean chroot**

```mkarchroot [/path/to/chroot/root] base-devel```

**Update packages in chroot**

```arch-nspawn [/path/to/chroot/root] pacman -Syu```

**Run command in chroot**

```arch-nspawn [/path/to/chroot/root] [command]```

**Sign a package**

```signpkg [package.pkg.tar.zst]```

# SYNOPSIS

**extra-x86_64-build** [_options_]

**mkarchroot** _chroot_ _packages_...

**arch-nspawn** _chroot_ _command_

# BUILD COMMANDS

**extra-x86_64-build**
> Build for extra repository.

**testing-x86_64-build**
> Build for testing repository.

**staging-x86_64-build**
> Build for staging repository.

**multilib-build**
> Build 32-bit multilib packages.

# CHROOT COMMANDS

**mkarchroot** _path_ _pkgs_
> Create a new chroot with specified packages.

**arch-nspawn** _chroot_ _cmd_
> Run command in existing chroot using nspawn.

**makechrootpkg** [_options_]
> Build package in chroot.

# PACKAGE TOOLS

**signpkg** _pkg_
> Sign a package with GPG.

**checkpkg**
> Compare package with repository version.

**find-libdeps** _pkg_
> Find shared library dependencies.

**sogrep** _repo_ _lib_
> Search for packages using a library.

# DESCRIPTION

**devtools** is a collection of scripts used by Arch Linux developers and Trusted Users to build packages in clean chroot environments. This ensures packages are built with correct dependencies and don't accidentally include developer system configurations.

The build scripts (extra-x86_64-build, etc.) create isolated chroots matching official repository states, build packages, and verify the results. This guarantees packages work on fresh Arch installations.

Additional tools help with package maintenance: finding dependencies, comparing versions, signing packages, and managing chroots.

# CONFIGURATION

**/etc/makepkg.conf**
> System-wide makepkg configuration affecting build behavior.

**~/.makepkg.conf**
> User-specific makepkg overrides for package building.

# CAVEATS

Requires sudo and systemd-nspawn. Initial chroot creation downloads the base system. Disk space needed for chroot (several GB). Build times depend on package complexity. Chroots should be updated before building.

# HISTORY

devtools was developed by **Arch Linux developers** to standardize package building. The scripts evolved from manual processes into automated tools. Using clean chroots became mandatory for official Arch packages to ensure reproducibility. The tools have been refined over years of use by the Arch packaging community.

# SEE ALSO

[makepkg](/man/makepkg)(8), [pacman](/man/pacman)(8), [pkgctl](/man/pkgctl)(1), [systemd-nspawn](/man/systemd-nspawn)(1)
