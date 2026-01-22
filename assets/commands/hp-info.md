# TLDR

**Show printer info**

```hp-info```

**Specify printer**

```hp-info -p [printer-name]```

**Show device ID**

```hp-info -d [device-uri]```

**All connected printers**

```hp-info -a```

# SYNOPSIS

**hp-info** [_options_]

# PARAMETERS

**-p** _PRINTER_
> Printer name.

**-d** _DEVICE_
> Device URI.

**-a**, **--all**
> Show all printers.

**-b** _BUS_
> Bus type (usb, net).

**--help**
> Display help information.

# DESCRIPTION

**hp-info** displays information about HP printers. It shows model, serial number, firmware version, and supported features.

The tool queries the printer directly for detailed status. It helps identify printer capabilities and configuration.

hp-info shows HP printer details.

# CAVEATS

Part of HPLIP package. Printer must be connected. Some info requires printer communication.

# HISTORY

hp-info is part of **HPLIP** (HP Linux Imaging and Printing), providing device information queries.

# SEE ALSO

[hp-check](/man/hp-check)(1), [hp-levels](/man/hp-levels)(1), [lpstat](/man/lpstat)(1)
