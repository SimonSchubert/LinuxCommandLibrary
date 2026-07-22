# TAGLINE

Query static model info, dynamic status, and CUPS settings for HP printers

# TLDR

**Show info** for the default/only installed printer

```hp-info```

**Show info for a specific CUPS printer**

```hp-info -p [printer-name]```

**Show info by device URI**

```hp-info -d [device-uri]```

**Print only the device ID string** (interactive mode)

```hp-info -i --id```

**Run interactively**, choosing the printer from a list

```hp-info -i```

# SYNOPSIS

**hp-info** [_DEVICE-URI_|_PRINTER-NAME_] [_MODE_] [_OPTIONS_]

# PARAMETERS

**-d** _device-uri_, **--device**=_device-uri_
> Specify the target printer by CUPS device URI.

**-p** _printer_, **--printer**=_printer_
> Specify the target printer by CUPS queue name.

**-i**, **--interactive**
> Run in interactive mode, prompting to choose a device.

**--id**
> Print only the device ID string and exit (interactive mode only).

**-x**
> Allow device URIs of printers not yet installed in CUPS (interactive mode only).

**-l** _level_, **--logging**=_level_
> Set logging verbosity: none, info (default), error, warn, or debug.

**-g**
> Run with debug-level logging (equivalent to **-l debug**).

**-h**, **--help**
> Display help and exit.

# DESCRIPTION

**hp-info** queries an HPLIP-supported HP printer and reports static model information (model name, supported data types, plugin requirements), dynamic status (online/offline, tray and supply state), and the corresponding CUPS printer queue settings.

It is mainly a diagnostic tool: point it at a printer with **-p** or **-d** to dump everything HPLIP knows about that device, which is useful when filing bug reports or scripting device discovery.

# CAVEATS

Part of the HPLIP package. The printer must be reachable (powered on and connected via USB or network) for dynamic status fields to populate; static model data is read from HPLIP's local models database even when the device is offline.

# HISTORY

**hp-info** is one of the device-query utilities in **HPLIP** (HP Linux Imaging and Printing), HP's open-source printer/scanner driver suite for Linux.

# INSTALL

```apt: sudo apt install hplip```

```dnf: sudo dnf install hplip```

```pacman: sudo pacman -S hplip```

```zypper: sudo zypper install hplip```

```nix: nix profile install nixpkgs#hplip```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[hp-check](/man/hp-check)(1), [hp-levels](/man/hp-levels)(1), [hp-query](/man/hp-query)(1), [lpstat](/man/lpstat)(1)

# RESOURCES

```[Source code](https://sourceforge.net/projects/hplip/)```

```[Homepage](https://developers.hp.com/hp-linux-imaging-and-printing)```

```[Documentation](https://developers.hp.com/hp-linux-imaging-and-printing/tech_docs/man_pages/index)```

<!-- verified: 2026-07-19 -->
