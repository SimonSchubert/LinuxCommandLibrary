# TLDR

**Add printer**

```lpadmin -p [printer] -v [device://uri] -m [driver.ppd]```

**Set default printer**

```lpadmin -d [printer]```

**Delete printer**

```lpadmin -x [printer]```

**Enable printer**

```lpadmin -p [printer] -E```

**Set printer option**

```lpadmin -p [printer] -o [option=value]```

**Add network printer**

```lpadmin -p [printer] -v ipp://[host]/printers/[name] -m everywhere```

# SYNOPSIS

**lpadmin** [_options_]

# PARAMETERS

**-p** _PRINTER_
> Printer name.

**-v** _URI_
> Device URI.

**-m** _MODEL_
> Model/PPD file.

**-d** _PRINTER_
> Set default printer.

**-x** _PRINTER_
> Delete printer.

**-E**
> Enable printer.

**-o** _OPTION_
> Set option.

**--help**
> Display help information.

# DESCRIPTION

**lpadmin** configures CUPS printers. It adds, modifies, and removes printer definitions.

The tool manages printer queues, options, and drivers. Administrator access is required.

lpadmin administers CUPS printers.

# CAVEATS

Requires root privileges. CUPS must be running. Driver availability varies.

# HISTORY

lpadmin is part of **CUPS** (Common Unix Printing System), providing printer administration on Linux and macOS.

# SEE ALSO

[lp](/man/lp)(1), [lpinfo](/man/lpinfo)(8), [cupsd](/man/cupsd)(8)

