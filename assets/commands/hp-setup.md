# TAGLINE

Installs HPLIP-supported HP printers and faxes into the CUPS spooler

# TLDR

**Launch the graphical setup wizard** (default when no mode is given)

```hp-setup```

**Run the text-based interactive wizard**

```hp-setup -i```

**Set up a USB printer automatically**, no prompts, using its bus:device ID from lsusb

```hp-setup -i -a [001:002]```

**Set up a network printer** by IP address, automatically and without a test page

```hp-setup -i -a -x [192.168.1.100]```

**Remove an installed printer**

```hp-setup -r -p [printer-name]```

# SYNOPSIS

**hp-setup** [_MODE_] [_OPTIONS_] [_SERIAL-NO_|_USB-BUS:DEVICE_|_IP_|_DEVNODE_]

# PARAMETERS

**-u**, **--gui**
> Run the graphical (Qt) setup wizard. This is the default when no mode is given.

**-i**, **--interactive**
> Run the text-based interactive setup wizard.

**-a**, **--auto**
> Non-interactive automatic setup, skipping prompts (interactive mode only).

**-x**
> Skip printing a test page in automatic mode (interactive mode only).

**-p** _printer_, **--printer**=_printer_
> Set the CUPS printer queue name (interactive mode only).

**-f** _fax_, **--fax**=_fax_
> Set the CUPS fax queue name (interactive mode only).

**-t** _typelist_, **--type**=_typelist_
> Queue types to create: print, fax (interactive mode only).

**-d** _device-uri_, **--device**=_device-uri_
> Specify the device URI directly (GUI mode only).

**-r**, **--rm**, **--remove**
> Remove the printer/fax queue instead of installing it.

**--port**=_port_
> Multi-port JetDirect port number: 1 (default), 2, or 3.

**-l** _level_, **--logging**=_level_
> Set logging verbosity: none, info, error, warn, or debug.

**-g**
> Run with debug-level logging (equivalent to **-l debug**).

**-h**, **--help**
> Display help and exit.

# DESCRIPTION

**hp-setup** discovers an HP printer (USB, network/JetDirect, or parallel port) and installs it into the CUPS spooler, automatically choosing an appropriate PPD/driver and, for fax-capable models, setting up a fax queue and basic fax parameters. It can also print a test page as part of installation.

Run with no arguments it opens the Qt graphical wizard. For scripted or headless installs, use **-i** for the text-based wizard, adding **-a** to skip all interactive prompts, and optionally **-x** to skip the test page. A device can be targeted directly by USB bus:device ID (from **lsusb**), IP address, hostname, serial number, or parallel port devnode; without one, hp-setup probes USB and parallel buses for a compatible printer.

# CAVEATS

Part of the HPLIP package. Installing print queues typically requires root or a user in the CUPS **lpadmin** group. Some models require HP's proprietary binary plugin, which hp-setup will offer to download and install (needs internet access) via **hp-plugin**.

# HISTORY

**hp-setup** is the main installation utility in **HPLIP** (HP Linux Imaging and Printing), HP's open-source printer/scanner driver suite for Linux.

# SEE ALSO

[hp-check](/man/hp-check)(1), [hp-plugin](/man/hp-plugin)(1), [hp-info](/man/hp-info)(1), [lpadmin](/man/lpadmin)(1)

# RESOURCES

```[Source code](https://sourceforge.net/projects/hplip/)```

```[Homepage](https://developers.hp.com/hp-linux-imaging-and-printing)```

```[Documentation](https://developers.hp.com/hp-linux-imaging-and-printing/tech_docs/man_pages/index)```

<!-- verified: 2026-07-19 -->
