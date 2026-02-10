# TAGLINE

builds Arch Linux packages in a clean chroot environment

# TLDR

**Build package in chroot**

```makechrootpkg -c -r [/var/lib/archbuild/extra-x86_64]```

**Build without cleaning**

```makechrootpkg -r [/var/lib/archbuild/extra-x86_64]```

**Update chroot before build**

```makechrootpkg -u -r [/var/lib/archbuild/extra-x86_64]```

**Install dependencies to chroot**

```makechrootpkg -r [chroot] -I [package.pkg.tar.zst]```

# SYNOPSIS

**makechrootpkg** [_options_] -r _chroot_ [--] [_makepkg-args_]

# PARAMETERS

**-r** _dir_
> Chroot directory.

**-c**
> Clean chroot before building.

**-u**
> Update chroot before building.

**-I** _pkg_
> Install package to chroot.

**-d** _dir_
> Bind mount directory.

**-l** _name_
> Working copy name.

**-n**
> Run namcap on package.

# DESCRIPTION

**makechrootpkg** builds Arch Linux packages in a clean chroot environment. This ensures reproducible builds by isolating the build from the host system's installed packages.

It uses the devtools package and is the standard method for official Arch package building.

# SETUP

```bash
# Create chroot
mkarchroot /var/lib/archbuild/extra-x86_64/root base-devel

# Build package
cd package-dir
makechrootpkg -c -r /var/lib/archbuild/extra-x86_64
```

# CAVEATS

Requires devtools package. Chroot must be initialized first. Needs root privileges. Slower than direct makepkg but cleaner.

# HISTORY

makechrootpkg is part of Arch Linux **devtools**, maintained by Arch developers for building official packages in reproducible environments.

# SEE ALSO

[makepkg](/man/makepkg)(8), [mkarchroot](/man/mkarchroot)(1), [pacman](/man/pacman)(8), [devtools](/man/devtools)(7)
