# TAGLINE

builds Arch Linux packages in a clean chroot environment

# TLDR

**Build the PKGBUILD in the current directory using a clean chroot**

```makechrootpkg -c -r [/var/lib/archbuild/extra-x86_64]```

**Build without cleaning the chroot first**

```makechrootpkg -r [/var/lib/archbuild/extra-x86_64]```

**Update the chroot before building**

```makechrootpkg -u -r [/var/lib/archbuild/extra-x86_64]```

**Install a local package into the chroot before building**

```makechrootpkg -r [chroot] -I [package.pkg.tar.zst]```

**Run namcap and checkpkg on the built package**

```makechrootpkg -c -n -C -r [chroot]```

**Bind-mount a directory read-write into the chroot**

```makechrootpkg -d [/host/path] -r [chroot]```

**Pass extra arguments to makepkg**

```makechrootpkg -c -r [chroot] -- --skippgpcheck```

# SYNOPSIS

**makechrootpkg** [_options_] **-r** _chroot_ [**--**] [_makepkg-args_]

# PARAMETERS

**-r** _dir_
> Chroot directory to build in (required).

**-c**
> Clean the chroot copy before building.

**-u**
> Update the working copy (chroot) before building.

**-I** _pkg_
> Install the given package file into the working copy before building.

**-d** _dir[:dest]_
> Bind-mount a host directory into the chroot as read-write.

**-D** _dir[:dest]_
> Bind-mount a host directory into the chroot as read-only.

**-t** _dir[:opts]_
> Mount a tmpfs at the specified directory inside the chroot.

**-l** _name_
> Name of the working copy directory (defaults to `$USER`).

**-n**
> Run **namcap** quality checks on the built package.

**-C**
> Run **checkpkg** validation against the previous package version.

**-T**
> Build inside a temporary copy (discarded after the build).

**-U** _user_
> Run **makepkg** as the specified user.

**-x** _when_
> Launch an interactive shell inside the chroot: `never`, `always`, or `failure`.

**-h**
> Display usage information.

# DESCRIPTION

**makechrootpkg** builds a PKGBUILD inside a clean, isolated chroot environment. This ensures reproducible builds by insulating the build from the host system's installed packages and configuration, making it the standard method for building official Arch Linux packages.

The chroot is managed as a root template plus per-user working copies that are cloned from it. Options such as **-c** and **-u** refresh the working copy, while **-I** and **-d** let you customize the build environment.

# SETUP

```bash
# Create the chroot template (once)
mkarchroot /var/lib/archbuild/extra-x86_64/root base-devel

# Build the package in the current directory
cd package-dir
makechrootpkg -c -r /var/lib/archbuild/extra-x86_64
```

# CAVEATS

Requires the **devtools** package. The chroot must be initialized with **mkarchroot** before first use. Root privileges are needed; slower than running **makepkg** directly but produces cleaner, more reproducible builds. Anything after **--** is forwarded to **makepkg**.

# HISTORY

**makechrootpkg** is part of Arch Linux **devtools**, maintained by Arch Linux developers and Trusted Users for building official packages in reproducible chroot environments.

# SEE ALSO

[makepkg](/man/makepkg)(8), [pacman](/man/pacman)(8), [devtools](/man/devtools)(7), [pkgctl](/man/pkgctl)(1), [systemd-nspawn](/man/systemd-nspawn)(1)
