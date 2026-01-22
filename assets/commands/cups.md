# TLDR

**List available printers**

```lpstat -p```

**Print file to default printer**

```lp [file.pdf]```

**Print to specific printer**

```lp -d [printer-name] [file.pdf]```

**Print multiple copies**

```lp -n [3] [file.pdf]```

**Check print queue**

```lpq```

**Cancel print job**

```cancel [job-id]```

**Add printer**

```lpadmin -p [printer-name] -E -v [ipp://printer/ipp/print] -m everywhere```

# SYNOPSIS

**lp** [_options_] [_file_...]

**lpr** [_options_] [_file_...]

**lpstat** [_options_]

# DESCRIPTION

**CUPS** (Common UNIX Printing System) manages printing on Linux. Uses IPP protocol for network printing. Provides lp, lpr, lpstat, and other commands. Web interface at http://localhost:631.

# PRINT COMMANDS

**lp**, **lpr**
> Print files

**lpstat**
> Show printer status

**lpq**
> Show print queue

**lprm**, **cancel**
> Remove print jobs

**lpadmin**
> Administer printers

**lpoptions**
> Set printer options

**lpinfo**
> List drivers and devices

# PRINT OPTIONS

**-d** _printer_
> Destination printer

**-n** _copies_
> Number of copies

**-o media=** _size_
> Paper size (Letter, A4, etc.)

**-o sides=** _mode_
> two-sided-long-edge, two-sided-short-edge

**-o number-up=** _N_
> N pages per sheet (1,2,4,6,9,16)

**-o job-hold-until=** _time_
> Hold until time (indefinite, night, weekend)

**-o job-priority=** _N_
> Priority 1-100

# WEB INTERFACE

Administration: http://localhost:631/admin

Requires user in lpadmin group.

# CAVEATS

Use lpstat -p -d to see printers and default. Configure via web interface for easiest setup. cups-browsed auto-discovers network printers.

# SEE ALSO

[lp](/man/lp)(1), [lpr](/man/lpr)(1), [lpstat](/man/lpstat)(1), [lpadmin](/man/lpadmin)(8)
