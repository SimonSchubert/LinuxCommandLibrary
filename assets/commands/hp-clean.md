# TAGLINE

performs print head cleaning on HP printers

# TLDR

**Clean print heads**

```hp-clean```

**Specify printer**

```hp-clean -p [printer-name]```

**Level 2 cleaning**

```hp-clean -l 2```

**Level 3 deep clean**

```hp-clean -l 3```

# SYNOPSIS

**hp-clean** [_options_]

# PARAMETERS

**-p** _PRINTER_
> Printer name.

**-d** _DEVICE_
> Device URI.

**-l** _LEVEL_
> Cleaning level (1-3).

**-b** _BUS_
> Bus type (usb, net).

**--help**
> Display help information.

# DESCRIPTION

**hp-clean** performs print head cleaning on HP printers. It removes dried ink and debris to restore print quality.

The tool supports multiple cleaning levels. Higher levels are more thorough but consume more ink. Level 1 is usually sufficient.

# CAVEATS

Part of HPLIP package. Consumes ink. Use only when needed.

# HISTORY

hp-clean is part of **HPLIP** (HP Linux Imaging and Printing), HP's open-source printer driver project.

# SEE ALSO

[hp-align](/man/hp-align)(1), [hp-check](/man/hp-check)(1), [hp-levels](/man/hp-levels)(1)
