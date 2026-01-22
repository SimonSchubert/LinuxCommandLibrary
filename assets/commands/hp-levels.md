# TLDR

**Show ink levels**

```hp-levels```

**Specify printer**

```hp-levels -p [printer-name]```

**Continuous monitoring**

```hp-levels -w```

**By device URI**

```hp-levels -d [device-uri]```

# SYNOPSIS

**hp-levels** [_options_]

# PARAMETERS

**-p** _PRINTER_
> Printer name.

**-d** _DEVICE_
> Device URI.

**-w**, **--watch**
> Continuous monitoring.

**-b** _BUS_
> Bus type (usb, net).

**--help**
> Display help information.

# DESCRIPTION

**hp-levels** displays ink or toner levels for HP printers. It shows remaining supply levels as percentages or visual bars.

The tool queries the printer's supply status. Watch mode provides real-time updates during printing operations.

hp-levels shows ink/toner levels.

# CAVEATS

Part of HPLIP package. Accuracy varies by printer model. Some printers don't report levels.

# HISTORY

hp-levels is part of **HPLIP** (HP Linux Imaging and Printing) for monitoring consumable supplies.

# SEE ALSO

[hp-info](/man/hp-info)(1), [hp-check](/man/hp-check)(1), [lpstat](/man/lpstat)(1)
