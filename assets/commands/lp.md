# TLDR

**Print file**

```lp [file.pdf]```

**Print to specific printer**

```lp -d [printer_name] [file]```

**Print multiple copies**

```lp -n [3] [file]```

**Print double-sided**

```lp -o sides=two-sided-long-edge [file]```

**Print specific pages**

```lp -o page-ranges=[1-5] [file]```

**Print from stdin**

```cat [file] | lp```

# SYNOPSIS

**lp** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files to print.

**-d** _PRINTER_
> Destination printer.

**-n** _COPIES_
> Number of copies.

**-o** _OPTION_
> Printer option.

**-P** _PAGES_
> Page list to print.

**-q** _PRIORITY_
> Job priority (1-100).

**--help**
> Display help information.

# DESCRIPTION

**lp** prints files to a printer. It's the System V print command used with CUPS.

The tool submits print jobs to the print queue. Options control copies, pages, and print quality.

lp prints files.

# CAVEATS

Requires CUPS. Printer must be configured. Options vary by printer.

# HISTORY

lp is the **System V** print command, now implemented by CUPS as the standard Linux/macOS print interface.

# SEE ALSO

[lpr](/man/lpr)(1), [lpq](/man/lpq)(1), [lprm](/man/lprm)(1), [lpoptions](/man/lpoptions)(1)

