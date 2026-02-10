# TAGLINE

development and testing tool that implements an IPP Everywhere compliant

# TLDR

**Start an IPP Everywhere printer** for testing

```ippeveprinter [TestPrinter]```

**Start printer on a specific port**

```ippeveprinter -p [8631] [TestPrinter]```

**Create printer with specific command** for processing jobs

```ippeveprinter -c '[/usr/bin/cat > /tmp/printjob.pdf]' [TestPrinter]```

**Start printer with verbose logging**

```ippeveprinter -v [TestPrinter]```

**Create printer that advertises via DNS-SD**

```ippeveprinter -d [TestPrinter]```

# SYNOPSIS

**ippeveprinter** [_-c command_] [_-d_] [_-p port_] [_-v_] _service-name_

# PARAMETERS

**-c** _command_
> Command to run for each print job (receives job data on stdin)

**-d**
> Advertise the printer using DNS-SD/Bonjour

**-p** _port_
> Port number to listen on (default: auto-assigned)

**-v**
> Verbose mode; show detailed logging

**-2**
> Support 2-sided printing

**-M** _manufacturer_
> Manufacturer name for the printer

**-m** _model_
> Model name for the printer

**-i** _iconfile_
> Icon file for the printer

**-l** _location_
> Printer location string

# DESCRIPTION

**ippeveprinter** is a development and testing tool that implements an IPP Everywhere compliant virtual printer. IPP Everywhere is a PWG (Printer Working Group) standard that enables driverless printing.

The tool creates a network printer that accepts print jobs via the Internet Printing Protocol. Jobs can be processed by a custom command or simply logged for testing purposes. This is useful for testing IPP clients, developing print workflows, or debugging printer discovery.

# CAVEATS

Not intended for production use as a print server. The printer only exists while the command is running. Requires appropriate firewall rules if accepting remote connections. Part of CUPS but functionality varies by version.

# HISTORY

**ippeveprinter** is part of the **CUPS** (Common Unix Printing System) project, originally developed by Michael Sweet at Easy Software Products and later maintained by Apple. IPP Everywhere support was added to facilitate driverless printing standards compliance testing.

# SEE ALSO

[ippfind](/man/ippfind)(1), [ipptool](/man/ipptool)(1), [cupsd](/man/cupsd)(8), [lp](/man/lp)(1)
