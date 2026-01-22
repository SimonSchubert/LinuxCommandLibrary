# TLDR

Install **base** package, Linux kernel and firmware

```sudo pacstrap /mnt base linux linux-firmware```

Install base with **LTS kernel** and build tools

```sudo pacstrap /mnt base base-devel linux-lts```

Copy host's **pacman config** to target

```sudo pacstrap -P /mnt [packages]```

Use **alternate config** file

```sudo pacstrap -C [path/to/pacman.conf] /mnt [packages]```

Use host's **package cache**

```sudo pacstrap -c /mnt [packages]```

Initialize **empty keyring** in target

```sudo pacstrap -K /mnt [packages]```

Install in **interactive** mode

```sudo pacstrap -i /mnt [packages]```

# SYNOPSIS

**pacstrap** [**-C** _config_] [**-c**] [**-G**] [**-i**] [**-K**] [**-M**] [**-N**] [**-P**] _root_ [_packages_...]

# PARAMETERS

**-C _config_**
> Use alternate pacman configuration file

**-c**
> Use package cache on host instead of target

**-G**
> Avoid copying host's pacman keyring to target

**-i**
> Prompt for package confirmation (interactive mode)

**-K**
> Initialize empty pacman keyring in target

**-M**
> Avoid copying host's mirrorlist to target

**-N**
> Run in unshare mode as regular user

**-P**
> Copy host's pacman config to target

# DESCRIPTION

**pacstrap** is designed to create a new system installation from scratch. It installs packages to a specified new root directory, typically used during Arch Linux installation to bootstrap the base system.

The tool handles mounting the target filesystem, installing packages using pacman, and optionally copying the host's configuration. It is part of the arch-install-scripts package.

# CAVEATS

Requires root privileges unless using -N flag. The target directory must be mounted before running. Package signatures are verified using the host's keyring by default. Network access is required for downloading packages.

# HISTORY

**pacstrap** is part of the **arch-install-scripts** package developed by the Arch Linux team. It replaces manual chroot-based installation methods with a streamlined tool that handles the complexities of bootstrapping an Arch system.

# SEE ALSO

[pacman](/man/pacman)(8), [arch-chroot](/man/arch-chroot)(1), [genfstab](/man/genfstab)(8)
