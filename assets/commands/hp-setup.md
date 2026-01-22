# TLDR

**Setup HP printer**

```hp-setup```

**Interactive mode**

```hp-setup -i```

**Automatic setup**

```hp-setup -a```

**Setup network printer**

```hp-setup [192.168.1.100]```

**Setup USB printer**

```hp-setup -b usb```

# SYNOPSIS

**hp-setup** [_options_] [_address_]

# PARAMETERS

_ADDRESS_
> IP address or hostname.

**-i**, **--interactive**
> Interactive mode.

**-a**, **--auto**
> Automatic mode.

**-b** _BUS_
> Bus type (usb, net).

**-p** _PRINTER_
> Printer name.

**--help**
> Display help information.

# DESCRIPTION

**hp-setup** configures HP printers for Linux. It discovers, installs, and adds printers to the print system.

The tool handles driver installation, queue creation, and basic configuration. It works with USB and network printers.

hp-setup installs HP printers on Linux.

# CAVEATS

Part of HPLIP package. May need root for some operations. Downloads drivers if needed.

# HISTORY

hp-setup is the main configuration utility in **HPLIP** (HP Linux Imaging and Printing) for printer installation.

# SEE ALSO

[hp-check](/man/hp-check)(1), [hp-plugin](/man/hp-plugin)(1), [lpadmin](/man/lpadmin)(1)
