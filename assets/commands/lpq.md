# TAGLINE

displays the print queue status

# TLDR

**Show print queue**

```lpq```

**Show specific printer queue**

```lpq -P [printer]```

**Show all printers**

```lpq -a```

**Show long listing**

```lpq -l```

**Continuous updates**

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

**lpq** displays the print queue status. It shows pending jobs, their owners, and sizes.

The tool is the BSD-style print queue viewer. Use it to check job status before printing.

# CAVEATS

Requires CUPS. Output format varies. Legacy BSD interface.

# HISTORY

lpq originated in **BSD Unix** for viewing print queues, now implemented by CUPS.

# SEE ALSO

[lp](/man/lp)(1), [lpr](/man/lpr)(1), [lprm](/man/lprm)(1), [lpstat](/man/lpstat)(1)

