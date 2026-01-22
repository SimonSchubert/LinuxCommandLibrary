# TLDR

**Show default options**

```lpoptions```

**Show printer options**

```lpoptions -p [printer] -l```

**Set default printer**

```lpoptions -d [printer]```

**Set printer option**

```lpoptions -p [printer] -o [option=value]```

**Remove option**

```lpoptions -p [printer] -r [option]```

**Show all printers**

```lpoptions -l```

# SYNOPSIS

**lpoptions** [_options_]

# PARAMETERS

**-d** _PRINTER_
> Set default destination.

**-p** _PRINTER_
> Specify printer.

**-l**
> List options.

**-o** _OPTION_
> Set option value.

**-r** _OPTION_
> Remove option.

**--help**
> Display help information.

# DESCRIPTION

**lpoptions** manages printer options. It sets defaults for print jobs and displays available options.

The tool configures user-specific or system-wide printer preferences like paper size and quality.

lpoptions manages print options.

# CAVEATS

User options in ~/.cups/lpoptions. System options need root. Options are printer-specific.

# HISTORY

lpoptions is part of **CUPS** for configuring default printer options and destinations.

# SEE ALSO

[lp](/man/lp)(1), [lpadmin](/man/lpadmin)(8), [lpstat](/man/lpstat)(1)

