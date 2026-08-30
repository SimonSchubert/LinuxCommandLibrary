# TAGLINE

command-line firmware update client

# TLDR

List the devices **fwupd can see**

```fwupdmgr get-devices```

**Refresh** the firmware metadata from LVFS

```fwupdmgr refresh```

Refresh **even if the cache is still considered fresh**

```fwupdmgr refresh --force```

Show the **updates waiting**

```fwupdmgr get-updates```

Apply **every available update**

```fwupdmgr update```

Update **one device** by its ID

```fwupdmgr update [device_id]```

Show **all releases** published for a device

```fwupdmgr get-releases [device_id]```

**Go back** to an older firmware version

```fwupdmgr downgrade [device_id]```

**Reinstall** the version already running

```fwupdmgr reinstall [device_id]```

Show what has been **flashed before**

```fwupdmgr get-history```

List the configured **remotes**

```fwupdmgr get-remotes```

**Enable** the testing remote to get pre-release firmware

```fwupdmgr enable-remote lvfs-testing```

**Check firmware checksums** against the vendor's records

```fwupdmgr verify [device_id]```

Report the host's **firmware security attributes**

```fwupdmgr security```

# SYNOPSIS

**fwupdmgr** [_command_]

# PARAMETERS

**get-devices**
> Show all devices detected by fwupd

**refresh**
> Download latest firmware metadata from Linux Vendor Firmware Service (LVFS)

**get-updates**
> List available firmware updates for detected devices

**update**
> Download and install firmware updates

**get-history**
> Show firmware update history

**downgrade**
> Downgrade firmware to older version

**get-releases**
> Show available firmware releases for a device

**reinstall**
> Reinstall current firmware

**--version**
> Display fwupdmgr version

# DESCRIPTION

**fwupdmgr** is the command-line client for fwupd, the Linux firmware update daemon. It enables updating device firmware including UEFI/BIOS, SSDs, Thunderbolt controllers, and other supported hardware.

The tool connects to the Linux Vendor Firmware Service (LVFS) to download signed firmware updates. Manufacturers submit firmware to LVFS, which is then distributed to Linux users. Updates are applied either immediately or scheduled for the next reboot, depending on the device type.

UEFI updates require the EFI System Partition to be properly mounted and writable.

# CAVEATS

Firmware updates carry risk of bricking hardware if interrupted. Ensure stable power during updates. Some updates require a reboot to apply. The /boot or EFI partition may need to be remounted with write permissions before updating UEFI firmware.

# HISTORY

fwupdmgr is part of fwupd, created by Richard Hughes in **2015**. The project was developed to bring reliable firmware updates to Linux, partnering with hardware vendors through the Linux Vendor Firmware Service. Major vendors including Dell, Lenovo, HP, and Logitech now distribute firmware via LVFS.

# INSTALL

```apt: sudo apt install fwupd```

```dnf: sudo dnf install fwupd```

```pacman: sudo pacman -S fwupd```

```apk: sudo apk add fwupd```

```zypper: sudo zypper install fwupd```

```brew: brew install fwupd```

```nix: nix profile install nixpkgs#fwupd```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[fwupdtool](/man/fwupdtool)(1), [efibootmgr](/man/efibootmgr)(8)

# RESOURCES

```[Source code](https://github.com/fwupd/fwupd)```

```[Homepage](https://fwupd.org/)```

<!-- verified: 2026-07-15 -->
