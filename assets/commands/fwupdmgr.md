# TLDR

Display all **devices detected** by fwupd

```fwupdmgr get-devices```

Download the latest **firmware metadata** from LVFS

```fwupdmgr refresh```

List the **updates available** for devices on your system

```fwupdmgr get-updates```

**Install** firmware updates

```fwupdmgr update```

Show firmware **update history**

```fwupdmgr get-history```

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

# SEE ALSO

[fwupdtool](/man/fwupdtool)(1), [efibootmgr](/man/efibootmgr)(8)
