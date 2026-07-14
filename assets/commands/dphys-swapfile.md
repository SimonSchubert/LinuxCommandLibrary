# TAGLINE

swap file management for Debian-based systems

# TLDR

**Disable** the swap file

```sudo dphys-swapfile swapoff```

**Enable** the swap file

```sudo dphys-swapfile swapon```

**Create or resize** the swap file to match the config

```sudo dphys-swapfile setup```

**Remove** the swap file entirely

```sudo dphys-swapfile uninstall```

**Resize the swap** (the standard three-step sequence)

```sudo dphys-swapfile swapoff && sudo dphys-swapfile setup && sudo dphys-swapfile swapon```

**Check the result**

```swapon --show```

# SYNOPSIS

**dphys-swapfile** _command_

# DESCRIPTION

**dphys-swapfile** creates and manages a swap *file*, as opposed to a swap partition. It exists because a file can be resized after the fact while a partition cannot, which matters on systems installed from a fixed disk image, and it is best known as the swap mechanism on **Raspberry Pi OS**.

By default it computes the swap size from the amount of installed RAM, capped by `CONF_MAXSWAP`, so a machine gets sensible swap without anyone choosing a number. Setting `CONF_SWAPSIZE` overrides that and pins the size in megabytes.

It is normally driven by its init script or systemd unit at boot rather than run by hand. The manual invocations matter when changing the size: the file must be swapped off before it can be rebuilt, so **swapoff**, **setup**, **swapon** in that order.

# PARAMETERS

**setup**
> Create the swap file, or resize it if the configured size has changed. Does not activate it.

**swapon**
> Activate the swap file, creating it first if it does not exist.

**swapoff**
> Deactivate the swap file, leaving it on disk.

**uninstall**
> Deactivate the swap file and delete it.

# CONFIGURATION

**/etc/dphys-swapfile**
> Shell-style configuration file, read by every subcommand.

**CONF_SWAPFILE**
> Path to the swap file. Defaults to `/var/swap`.

**CONF_SWAPSIZE**
> Fixed size in megabytes. Leave it empty to compute the size from RAM instead. Raspberry Pi OS ships with a small default (commonly 100 or 200).

**CONF_MAXSWAP**
> Upper bound in megabytes on the computed size. Defaults to 2048, and it caps `CONF_SWAPSIZE` too, so raising the swap beyond 2 GB means raising this as well.

# CAVEATS

`CONF_MAXSWAP` silently limits `CONF_SWAPSIZE`. Setting `CONF_SWAPSIZE=4096` without also raising `CONF_MAXSWAP` gives you a 2 GB swap file and no warning, which is a frequent source of confusion.

Editing the config alone does nothing: the file is only rebuilt by **setup**, and it cannot be rebuilt while in use, hence the swapoff/setup/swapon sequence.

On a Raspberry Pi the swap file lives on the SD card, and swapping writes heavily to flash that has limited erase cycles and no wear levelling worth the name. Heavy swap use is a well-known way to kill an SD card, and it is also painfully slow. If a workload genuinely needs swap, put it on a USB SSD, or use **zram** to compress pages in RAM instead, which most people find is the better answer on a small board.

# SEE ALSO

[swapon](/man/swapon)(8), [swapoff](/man/swapoff)(8), [mkswap](/man/mkswap)(8), [free](/man/free)(1), [zramctl](/man/zramctl)(8)
