# TLDR

**Print file**

```lpr [file]```

**Print to specific printer**

```lpr -P [printer] [file]```

**Print multiple copies**

```lpr -# [3] [file]```

**Print from stdin**

```cat [file] | lpr```

**Remove file after printing**

```lpr -r [file]```

**Title for job**

```lpr -T "[title]" [file]```

# SYNOPSIS

**lpr** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files to print.

**-P** _PRINTER_
> Destination printer.

**-#** _COPIES_
> Number of copies.

**-r**
> Remove file after printing.

**-T** _TITLE_
> Job title.

**-o** _OPTION_
> Printer option.

**--help**
> Display help information.

# DESCRIPTION

**lpr** submits print jobs. It's the BSD-style print command used with CUPS.

The tool queues files for printing. Options control destination, copies, and formatting.

lpr prints files.

# CAVEATS

Requires CUPS. Use lp for System V style. Options are printer-specific.

# HISTORY

lpr originated in **BSD Unix** as the line printer spooler, now implemented by CUPS.

# SEE ALSO

[lp](/man/lp)(1), [lpq](/man/lpq)(1), [lprm](/man/lprm)(1)

