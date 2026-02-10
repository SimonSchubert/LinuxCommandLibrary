# TAGLINE

generates device URIs for HP printers

# TLDR

**Generate device URI**

```hp-makeuri [192.168.1.100]```

**USB device**

```hp-makeuri -b usb```

**Network scan**

```hp-makeuri -g```

**Specific port**

```hp-makeuri -p [9100] [ip-address]```

# SYNOPSIS

**hp-makeuri** [_options_] [_ip-address_]

# PARAMETERS

_IP-ADDRESS_
> Printer IP address.

**-b** _BUS_
> Bus type (usb, net).

**-g**
> Guess/probe for device.

**-p** _PORT_
> Network port.

**-s** _SERIAL_
> Serial number filter.

**--help**
> Display help information.

# DESCRIPTION

**hp-makeuri** generates device URIs for HP printers. It creates the proper URI format needed for CUPS printer configuration.

The tool probes network or USB printers and constructs valid device identifiers. URIs are used with lpadmin and CUPS.

# CAVEATS

Part of HPLIP package. Network printers need connectivity. USB requires permissions.

# HISTORY

hp-makeuri is part of **HPLIP** (HP Linux Imaging and Printing) for device URI generation.

# SEE ALSO

[hp-setup](/man/hp-setup)(1), [lpadmin](/man/lpadmin)(1), [hp-probe](/man/hp-probe)(1)
