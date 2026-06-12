# Printing

## Getting Started
Printing on Linux goes through **CUPS**, which provides two command families: System V style (**lp**, **lpstat**, **cancel**) and BSD style (**lpr**, **lpq**, **lprm**). Both talk to the same print system; use whichever you prefer. CUPS also has a web interface at http://localhost:631.

## List Printers
Show available printers, the default printer, and full status.
```[lpstat](/man/lpstat) -p -d```
```[lpstat](/man/lpstat) -t```

Set the default printer.
```[lpoptions](/man/lpoptions) -d [printerName]```

## Print a file
Print to the default printer, or pick one explicitly: **lp** uses **-d** (destination), **lpr** uses **-P**.
```[lp](/man/lp) [file]```
```[lp](/man/lp) -d [printerName] [file]```
```[lpr](/man/lpr) [file]```
```[lpr](/man/lpr) -P [printerName] [file]```

Anything can be piped to the printer, and **pr** paginates plain text nicely first.
```[echo](/man/echo) "Hello" | [lp](/man/lp)```
```[pr](/man/pr) -l60 [file] | [lpr](/man/lpr)```

## Print Options
**-n** sets the number of copies; **-o** passes printer options.
```[lp](/man/lp) -n 3 [file]```
```[lp](/man/lp) -o sides=two-sided-long-edge [file]```
```[lp](/man/lp) -o page-ranges=1-4,7 [file]```
```[lp](/man/lp) -o landscape -o fit-to-page [image.png]```

| Option | Description |
|-----|-------------|
| **sides=two-sided-long-edge** | Duplex printing (long edge binding) |
| **page-ranges=1-4,7** | Print only these pages |
| **number-up=2** | Multiple pages per sheet |
| **landscape** | Rotate output 90 degrees |
| **fit-to-page** | Scale to fit the paper |

## View the Print Queue
```[lpq](/man/lpq)```
```[lpstat](/man/lpstat) -o```

## Cancel Print Jobs
Cancel a specific job by ID (shown by **lpq** or **lpstat -o**), your most recent job, or everything.
```[cancel](/man/cancel) [jobID]```
```[cancel](/man/cancel) -a [printerName]```
```[lprm](/man/lprm) [jobID]```
```[lprm](/man/lprm) -```

> **lprm -** removes all of your own jobs. Cancelling other users' jobs requires root.

## Manage Printers
Stop and start a printer's output, for example to clear a paper jam without losing queued jobs.
```[cupsdisable](/man/cupsdisable) [printerName]```
```[cupsenable](/man/cupsenable) [printerName]```

Add a printer or list available drivers and connections with CUPS admin tools (root required).
```[lpinfo](/man/lpinfo) -v```
```[lpadmin](/man/lpadmin) -p [printerName] -E -v ipp://[host]/ipp/print -m everywhere```

> Most modern network printers support driverless printing (IPP Everywhere), which is what **-m everywhere** sets up.
