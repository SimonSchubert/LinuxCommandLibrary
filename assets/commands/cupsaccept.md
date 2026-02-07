# TAGLINE

allow printer queues to accept jobs

# TLDR

**Accept print jobs** for a printer

```cupsaccept [printer_name]```

**Accept with reason message**

```cupsaccept -r "[reason]" [printer_name]```

# SYNOPSIS

**cupsaccept** [_options_] _destination(s)_

# PARAMETERS

**-E**
> Encrypt connection to server.

**-r** _reason_
> Set reason message for accepting.

**-h** _server[:port]_
> Connect to specific server.

# DESCRIPTION

**cupsaccept** instructs the printing system to accept print jobs for the specified destinations. This reverses the effect of **cupsreject**.

This command is an alias for **accept** and requires administrator privileges.

# SEE ALSO

[cupsreject](/man/cupsreject)(1), [cupsenable](/man/cupsenable)(1), [cupsdisable](/man/cupsdisable)(1)
