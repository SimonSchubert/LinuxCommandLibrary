# TAGLINE

aligns print cartridges on HP printers

# TLDR

**Align print heads**

```hp-align```

**Specify printer**

```hp-align -p [printer-name]```

**Interactive mode**

```hp-align -i```

**Specify device URI**

```hp-align -d [hp:/usb/Deskjet_Printer?serial=XYZ]```

**Enable debug logging**

```hp-align -g```

# SYNOPSIS

**hp-align** [_options_]

# PARAMETERS

**-p** _PRINTER_, **--printer=**_PRINTER_
> CUPS printer name.

**-d** _URI_, **--device=**_URI_
> Device URI (e.g. `hp:/usb/...`).

**-i**, **--interactive**
> Run in interactive mode.

**-l** _LEVEL_, **--logging=**_LEVEL_
> Logging level: none, info, error, warn, debug.

**-g**
> Debug mode (equivalent to `-l debug`).

**-h**, **--help**
> Display help information.

# DESCRIPTION

**hp-align** aligns print cartridges on HP printers. It runs the alignment procedure to ensure optimal print quality.

The tool supports automatic and interactive alignment modes. Interactive mode displays alignment patterns and asks for best match selection.

# CAVEATS

Part of HPLIP package. Uses paper and ink. May require manual selection.

# HISTORY

hp-align is part of **HPLIP** (HP Linux Imaging and Printing), HP's official printer driver project for Linux.

# SEE ALSO

[hp-check](/man/hp-check)(1), [hp-clean](/man/hp-clean)(1), [hp-setup](/man/hp-setup)(1)
