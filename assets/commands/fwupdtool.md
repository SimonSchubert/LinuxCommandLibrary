# TLDR

Display all **devices detected** by fwupd

```fwupdtool get-devices```

**Install** firmware from a file

```fwupdtool install [path/to/firmware]```

Display **help**

```fwupdtool -h```

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

# SEE ALSO

[fwupdmgr](/man/fwupdmgr)(1), [efibootmgr](/man/efibootmgr)(8)
