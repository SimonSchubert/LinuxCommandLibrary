# TAGLINE

display or set printer options and defaults

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

**List options for the default printer**

```lpoptions -l```

**Remove all options for a printer instance**

```lpoptions -x [printer/instance]```

# SYNOPSIS

**lpoptions** [_options_]

# PARAMETERS

**-d** _destination[/instance]_
> Set the user default printer to the named destination.

**-p** _destination[/instance]_
> Set the destination and instance for any options that follow.

**-l**
> List printer-specific options and their current settings.

**-o** _option[=value]_
> Set a new option for the named destination.

**-r** _option_
> Remove the specified option from the named destination.

**-x** _destination[/instance]_
> Remove all options for the named destination and instance.

**-E**
> Enable encryption when communicating with the CUPS server.

**-h** _server[:port]_
> Connect to the specified server.

# DESCRIPTION

**lpoptions** displays or sets printer options and defaults. When run with no arguments, it shows the default printer options.

User-specific settings are stored in **~/.cups/lpoptions**. When run by root, system-wide defaults in **/etc/cups/lpoptions** are used instead. Options like paper size, media type, and print quality can be configured per printer or per instance.

# CAVEATS

Options are printer-specific and may vary between devices. System-wide options in /etc/cups/lpoptions require root access. Instances allow defining named sets of options for a single printer.

# HISTORY

lpoptions is part of **CUPS** for configuring default printer options and destinations.

# SEE ALSO

[lp](/man/lp)(1), [lpadmin](/man/lpadmin)(8), [lpstat](/man/lpstat)(1), [lpr](/man/lpr)(1), [lpq](/man/lpq)(1), [cups](/man/cups)(1)

