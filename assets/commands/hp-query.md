# TAGLINE

retrieves status information from HP printers

# TLDR

**Query printer status**

```hp-query -p [printer-name]```

**Query by device URI**

```hp-query -d [device-uri]```

**Query specific parameter**

```hp-query -p [printer] -s [status]```

**List available queries**

```hp-query -l```

# SYNOPSIS

**hp-query** [_options_]

# PARAMETERS

**-p** _PRINTER_
> Printer name.

**-d** _DEVICE_
> Device URI.

**-s** _QUERY_
> Specific query string.

**-l**
> List available queries.

**-b** _BUS_
> Bus type (usb, net).

**--help**
> Display help information.

# DESCRIPTION

**hp-query** retrieves status information from HP printers. It sends queries and returns printer responses for various parameters.

The tool accesses internal printer status and configuration. It's useful for scripting and monitoring.

# CAVEATS

Part of HPLIP package. Query availability varies by model. Printer must be accessible.

# HISTORY

hp-query is part of **HPLIP** (HP Linux Imaging and Printing) for querying device status.

# SEE ALSO

[hp-info](/man/hp-info)(1), [hp-levels](/man/hp-levels)(1), [snmpget](/man/snmpget)(1)
