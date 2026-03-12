# TAGLINE

submits print jobs

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

**lpr** submits files for printing. It sends one or more files to the default printer or a printer specified with **-P**. Files are queued and printed in the order submitted.

On modern Linux systems, lpr is provided by **CUPS** (Common Unix Printing System). Without arguments, it reads from stdin, making it useful in pipelines (e.g., `ls | lpr`). Printer options like paper size and duplex can be set with **-o**.

# CAVEATS

Requires CUPS. Use lp for System V style. Options are printer-specific.

# HISTORY

lpr originated in **BSD Unix** as the line printer spooler, now implemented by CUPS.

# SEE ALSO

[lp](/man/lp)(1), [lpq](/man/lpq)(1), [lprm](/man/lprm)(1)

