# TAGLINE

collects files from the root filesystem and creates a compressed

# TLDR

Generate an **initramfs** with features from /etc/mkinitfs/mkinitfs.conf

```mkinitfs```

Use a **different configuration file**

```mkinitfs -c [path/to/config]```

**Compress** the initramfs using specified algorithm

```mkinitfs -C [gzip|xz|zstd|lz4|none]```

**List files** that will be included in the initramfs image

```mkinitfs -l```

List all **available features**

```mkinitfs -L```

Generate initramfs for a **specific kernel version**

```mkinitfs [kernel_version]```

Specify **output file** path

```mkinitfs -o [path/to/initramfs.img]```

# SYNOPSIS

**mkinitfs** [**-c** _configfile_] [**-C** _algorithm_] [**-f** _fstab_] [**-F** _features_] [**-o** _outfile_] [**-l**] [**-L**] [_kernelversion_]

# PARAMETERS

**-b _basedir_**
> Use specified directory instead of root filesystem

**-c _configfile_**
> Use alternative configuration file; default is /etc/mkinitfs/mkinitfs.conf

**-C _algorithm_**
> Compression method: gzip (default), xz, zstd, lz4, or none

**-f _fstab_**
> Specify alternate fstab file

**-F _features_**
> Enable specified features

**-i _initfile_**
> Use custom init script

**-k**
> Keep temporary files after completion

**-K**
> Include host APK keys in initramfs

**-l**
> Dry run; list files that would be included

**-L**
> Show all available features

**-n**
> Exclude kernel modules and firmware

**-o _outfile_**
> Specify output file path

**-P _featuresdir_**
> Add custom features directory to search path

**-q**
> Quiet mode; suppress output messages

**-t _tmpdir_**
> Set temporary directory location

# DESCRIPTION

**mkinitfs** collects files from the root filesystem and creates a compressed initramfs for Alpine Linux. The initramfs provides early userspace tools needed to mount the real root filesystem during boot.

Features control which modules, binaries, and configuration files are included. Common features include base system tools, filesystem support, encryption (cryptsetup), LVM, and network booting (dhcp, nfs).

# CAVEATS

Alpine Linux specific tool; not compatible with other distributions. Missing features can prevent boot. The configuration file must list all required features for successful system boot.

# HISTORY

**mkinitfs** was developed as part of **Alpine Linux** to create minimal, efficient initramfs images suitable for the distribution's focus on security and simplicity. It integrates with Alpine's apk package manager and uses a feature-based modular system.

# SEE ALSO

[mkinitcpio](/man/mkinitcpio)(8), [dracut](/man/dracut)(8), [update-initramfs](/man/update-initramfs)(8)
