# TAGLINE

displays status information about the current print service

# TLDR

**Show all printers**

```lpstat -p```

**Show default printer**

```lpstat -d```

**Show print jobs**

```lpstat```

**Show jobs for specific printer**

```lpstat -P [printer]```

**Show detailed printer info**

```lpstat -l -p [printer]```

**Show all status info**

```lpstat -t```

**Show accepting printers**

```lpstat -a```

# SYNOPSIS

**lpstat** [_options_]

# DESCRIPTION

**lpstat** displays status information about the current print service. It shows printers, print jobs, and system configuration for CUPS.

The tool helps troubleshoot printing issues and monitor job queues.

# PARAMETERS

**-a** [_printers_]
> Show accepting status.

**-d**
> Show default destination.

**-o** [_dest_]
> Show jobs.

**-p** [_printers_]
> Show printer status.

**-r**
> Show scheduler running.

**-s**
> Show summary.

**-t**
> Show all status.

**-u** [_users_]
> Show user jobs.

**-l**
> Long (detailed) output.

**-W** _which_
> Show completed/not-completed jobs.

# CAVEATS

Information depends on CUPS configuration. Some details need appropriate access. Network printers may have delayed status.

# HISTORY

**lpstat** follows the POSIX printing interface, with implementations in various Unix systems. The CUPS implementation by **Apple** and **Michael Sweet** became standard on macOS and Linux.

# SEE ALSO

[lp](/man/lp)(1), [lpr](/man/lpr)(1), [lpq](/man/lpq)(1), [cancel](/man/cancel)(1), [cupsd](/man/cupsd)(8)
