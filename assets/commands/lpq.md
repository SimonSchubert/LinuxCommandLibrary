# TAGLINE

displays the print queue status

# TLDR

**Show print queue**

```lpq```

**Show specific printer queue**

```lpq -P [printer]```

**Show all printers**

```lpq -a```

**Show long listing** with detailed info

```lpq -l```

**Show queue for a specific user**

```lpq -P [printer] [username]```

**Continuous updates** every N seconds

```lpq +[5]```

# SYNOPSIS

**lpq** [_options_] [_user_]

# PARAMETERS

_USER_
> Show jobs for specific user.

**-P** _PRINTER_
> Specify printer.

**-a**
> Show all printers.

**-l**
> Long listing format.

**+** _INTERVAL_
> Repeat every interval seconds.

**--help**
> Display help information.

# DESCRIPTION

**lpq** displays the current print queue status, showing pending and active jobs along with their owners, job IDs, file names, and sizes. Without arguments, it shows the default printer's queue.

The tool provides the BSD-style interface for viewing print queues, now typically implemented by CUPS. It is useful for checking job status, diagnosing stuck queues, and monitoring print activity.

# CAVEATS

Requires CUPS. Output format varies. Legacy BSD interface.

# HISTORY

lpq originated in **BSD Unix** for viewing print queues, now implemented by CUPS.

# SEE ALSO

[lp](/man/lp)(1), [lpr](/man/lpr)(1), [lprm](/man/lprm)(1), [lpstat](/man/lpstat)(1)

