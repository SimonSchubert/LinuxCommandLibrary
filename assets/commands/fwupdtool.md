# TAGLINE

low-level firmware manipulation tool

# TLDR

List every device the plugins can see, **including the hidden ones**

```sudo fwupdtool get-devices --show-all```

Show which **plugins loaded** and which failed

```sudo fwupdtool get-plugins```

**Inspect a firmware file** before flashing anything

```fwupdtool get-details [path/to/firmware.cab]```

**Install** firmware from a cabinet file

```sudo fwupdtool install [path/to/firmware.cab]```

Write a **raw blob** to one device

```sudo fwupdtool install-blob [path/to/firmware.bin] [device_id]```

Load **only one plugin**, which makes debugging tractable

```sudo fwupdtool get-devices --plugins [uefi_capsule]```

**Parse a firmware image** and print its structure

```fwupdtool firmware-parse [path/to/firmware.bin]```

List the **firmware formats** it understands

```fwupdtool get-firmware-types```

Dump the **SMBIOS tables**

```sudo fwupdtool smbios-dump```

Show the **hardware IDs** used to match firmware to this machine

```sudo fwupdtool hwids```

Report the host's **firmware security attributes**

```sudo fwupdtool security```

Run with **full debug output**

```sudo fwupdtool get-devices --verbose```

# SYNOPSIS

**fwupdtool** [_command_] [_options_]

# PARAMETERS

**get-devices**
> List all devices detected by fwupd

**install** _FILE_
> Install firmware from a local cabinet (.cab) file

**get-details** _FILE_
> Show details about a firmware file

**verify** _DEVICE_
> Verify firmware on a device

**firmware-parse** _FILE_
> Parse and display firmware file structure

**firmware-convert** _FILE_
> Convert firmware to different format

**-h**, **--help**
> Display help message

**-v**, **--verbose**
> Enable verbose output

# DESCRIPTION

**fwupdtool** is a low-level firmware manipulation tool that works alongside fwupd. Unlike **fwupdmgr** which handles automated updates from LVFS, fwupdtool allows manual firmware operations including installing local firmware files, parsing firmware archives, and device verification.

This tool is primarily used for debugging, development, and situations where firmware must be installed manually from a vendor-provided file rather than through the LVFS repository.

# CAVEATS

Manual firmware installation bypasses LVFS signature verification. Only install firmware from trusted sources. Incorrect firmware can brick devices. Most users should prefer **fwupdmgr** for routine updates.

# HISTORY

fwupdtool is part of the fwupd project, created by Richard Hughes in **2015**. It serves as the development and debugging companion to the main fwupdmgr tool.

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

[fwupdmgr](/man/fwupdmgr)(1), [efibootmgr](/man/efibootmgr)(8)

# RESOURCES

```[Source code](https://github.com/fwupd/fwupd)```

```[Homepage](https://fwupd.org/)```

<!-- verified: 2026-07-15 -->
