# TAGLINE

Build Arch Linux ISO images from a profile

# TLDR

Build an ISO from the official **releng profile**

```sudo mkarchiso -v /usr/share/archiso/configs/releng```

Use custom **working and output** directories

```sudo mkarchiso -v -w [path/to/work] -o [path/to/out] [path/to/profile]```

**Delete the working directory** when the build finishes

```sudo mkarchiso -r -o [path/to/out] [path/to/profile]```

Build a **bootstrap tarball and netboot artifacts** instead of an ISO

```sudo mkarchiso -m "bootstrap netboot" [path/to/profile]```

Set the **volume label, publisher and application** name

```sudo mkarchiso -L [LABEL] -P "[publisher]" -A "[application]" [path/to/profile]```

Add **extra packages** to the image

```sudo mkarchiso -p "[package1 package2]" [path/to/profile]```

Build with a **different pacman configuration**

```sudo mkarchiso -C [path/to/pacman.conf] [path/to/profile]```

# SYNOPSIS

**mkarchiso** [_options_] _profile_directory_

# PARAMETERS

**-A** _application_
> Application name for the ISO. Default: **mkarchiso iso**.

**-C** _file_
> pacman configuration file. Default: **/etc/pacman.conf**.

**-D** _install_dir_
> Directory on the image where all files are placed. Default: **arch**. For iso and netboot use only a-z0-9, and for iso at most 30 characters.

**-L** _label_
> ISO volume label. Default: **MKARCHISO**.

**-P** _publisher_
> ISO publisher. Default: **mkarchiso**.

**-c** _cert_and_key_
> Certificates for codesigning netboot artifacts and the rootfs, as a quoted, space-delimited list of certificate, key and optional certificate authority.

**-g** _gpg_key_
> PGP key ID for signing the rootfs image. Passed to gpg as **--default-key**.

**-G** _mbox_
> PGP signer, which must include an email address. Passed to gpg as **--sender**.

**-m** _mode_
> Build modes as a quoted, space-delimited list: **bootstrap**, **iso**, **netboot**. Default: **iso**.

**-o** _out_dir_
> Output directory. Default: **./out**.

**-p** _packages_
> Packages to install, as a quoted, space-delimited list.

**-r**
> Delete the working directory at the end.

**-v**
> Verbose output.

**-w** _work_dir_
> Working directory. Default: **./work**.

**-h**
> Show the help message.

# DESCRIPTION

**mkarchiso** is the build tool of the **archiso** project. It reads a profile directory and produces a bootable ISO, netboot artifacts or a bootstrap tarball, and can optionally sign them. It is the tool behind the official Arch Linux installation media.

A profile describes the image. The usual files are **profiledef.sh** (image name, boot modes and file permissions), **packages.x86_64** (packages to install), **pacman.conf** (repositories used during the build) and the **airootfs/** directory, whose contents are copied into the live system.

The archiso package ships two profiles in **/usr/share/archiso/configs/**: **releng**, which is used for the monthly installation ISO, and **baseline**, a minimal live system. To customize one, copy it to a directory of your own and edit the copy.

# CAVEATS

Packages are downloaded through pacman, so the build needs an Arch Linux host or a container with pacman. Running as a non-root user requires **unshare**(1) and user namespace support in the kernel.

The working directory is reused between runs, which can leave changes to a profile unapplied. Use **-r** or delete the directory before rebuilding.

# INSTALL

```pacman: sudo pacman -S archiso```

<!-- packages: 2026-11-09 -->

# SEE ALSO

[pacstrap](/man/pacstrap)(8), [arch-chroot](/man/arch-chroot)(8), [mksquashfs](/man/mksquashfs)(1), [mkinitcpio](/man/mkinitcpio)(8)

# RESOURCES

```[Source code](https://gitlab.archlinux.org/archlinux/archiso)```

```[Documentation](https://wiki.archlinux.org/title/Archiso)```

<!-- verified: 2026-11-09 -->
