# TAGLINE

resume printer job processing

# TLDR

**Enable a printer**

```cupsenable [printer_name]```

**Enable and release held jobs**

```cupsenable --release [printer_name]```

# SYNOPSIS

**cupsenable** [_options_] _destination(s)_

# PARAMETERS

**--release**
> Release held jobs.

**-h** _server[:port]_
> Connect to specific server.

# DESCRIPTION

**cupsenable** starts the printing system processing jobs for the specified destinations. This reverses the effect of **cupsdisable**.

Requires administrator privileges.

# SEE ALSO

[cupsdisable](/man/cupsdisable)(1), [cupsaccept](/man/cupsaccept)(1)
