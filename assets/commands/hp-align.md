# TAGLINE

aligns print cartridges on HP printers

# TLDR

**Align print heads**

```hp-align```

**Specify printer**

```hp-align -p [printer-name]```

**Interactive mode**

```hp-align -i```

**Automatic alignment**

```hp-align -a```

# SYNOPSIS

**hp-align** [_options_]

# PARAMETERS

**-p** _PRINTER_
> Printer name or device.

**-d** _DEVICE_
> Device URI.

**-i**
> Interactive mode.

**-a**
> Automatic mode.

**-b** _BUS_
> Bus type (usb, net).

**--help**
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
