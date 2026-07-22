# TAGLINE

encrypted swap configuration

# TLDR

**Setup encrypted swap**

```ecryptfs-setup-swap```

**Setup with specific** swap partition

```ecryptfs-setup-swap [/dev/sda2]```

# SYNOPSIS

**ecryptfs-setup-swap** [**-f**|**--force**] [_device_]

# PARAMETERS

_DEVICE_
> Swap partition to encrypt. If omitted, every active swap device is used.

**-f**, **--force**
> Set up encrypted swap even if the device already looks encrypted.

# DESCRIPTION

**ecryptfs-setup-swap** configures encrypted swap space using dm-crypt with a random key. This prevents sensitive data from being recoverable from swap after shutdown.

The script modifies /etc/fstab and /etc/crypttab to enable encrypted swap on boot. A random key is generated each boot, so swap contents are unrecoverable after restart.

Encrypted swap is important when using encrypted home directories, as unencrypted swap could leak decrypted data.

# CAVEATS

Disables hibernation (swap content unrecoverable). Requires root privileges. Existing swap will be reformatted. Must run with system not using swap.

# HISTORY

ecryptfs-setup-swap is part of the **eCryptfs** utilities, addressing the security gap where encrypted filesystem data could leak to unencrypted swap space.

# INSTALL

```apt: sudo apt install ecryptfs-utils```

```dnf: sudo dnf install ecryptfs-utils```

```pacman: sudo pacman -S ecryptfs-utils```

```apk: sudo apk add ecryptfs-utils```

```zypper: sudo zypper install ecryptfs-utils```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ecryptfs-setup-private](/man/ecryptfs-setup-private)(1), [ecryptfs](/man/ecryptfs)(7), [cryptsetup](/man/cryptsetup)(8), [swapon](/man/swapon)(8)

# RESOURCES

```[Source code](https://launchpad.net/ecryptfs)```

```[Homepage](https://www.ecryptfs.org/)```

<!-- verified: 2026-07-14 -->
