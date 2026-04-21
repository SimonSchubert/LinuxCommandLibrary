# TAGLINE

resume printer job processing

# TLDR

**Enable a printer**

```cupsenable [printer_name]```

**Enable and release held jobs**

```cupsenable --release [printer_name]```

**Enable a printer on a remote server**

```cupsenable -h [server:port] [printer_name]```

**Authenticate as a specific user**

```cupsenable -U [username] [printer_name]```

**Force an encrypted connection**

```cupsenable -E [printer_name]```

# SYNOPSIS

**cupsenable** [**-E**] [**-U** _username_] [**-c**] [**-h** _server[:port]_] [**--release**] _destination(s)_

# PARAMETERS

**-E**
> Force encryption of the connection to the server.

**-U** _username_
> Use the specified username when connecting to the server.

**-c**
> Cancel all jobs on the named destination.

**-h** _server[:port]_
> Connect to the specified server and port.

**--release**
> Release previously held jobs for printing. Use after **cupsdisable --hold** to resume printing.

# DESCRIPTION

**cupsenable** starts the named printers or classes, allowing them to process queued jobs. This reverses the effect of **cupsdisable**.

Unlike the System V versions (_enable_ / _disable_), the CUPS commands have been renamed to avoid conflicts with the bash(1) built-ins. Printer and class names are not case-sensitive and may contain any printable character except SPACE, TAB, "/", or "#".

# CAVEATS

Depending on the CUPS configuration, the command may prompt for an administrator password rather than requiring the root user. The **--release** flag is commonly paired with **cupsdisable --hold** for scheduled maintenance.

# SEE ALSO

[cupsdisable](/man/cupsdisable)(1), [cupsaccept](/man/cupsaccept)(1), [cupsreject](/man/cupsreject)(1), [cancel](/man/cancel)(1), [lp](/man/lp)(1), [lpadmin](/man/lpadmin)(1), [lpstat](/man/lpstat)(1)
