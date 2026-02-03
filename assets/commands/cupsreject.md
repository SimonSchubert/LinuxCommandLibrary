# TLDR

**Reject new print jobs** for a printer

```cupsreject [printer_name]```

**Reject with reason message**

```cupsreject -r "[printer offline]" [printer_name]```

# SYNOPSIS

**cupsreject** [_options_] _destination(s)_

# PARAMETERS

**-r** _reason_
> Set reason message for rejecting.

**-h** _server[:port]_
> Connect to specific server.

# DESCRIPTION

**cupsreject** instructs the printing system to reject new print jobs for the specified destinations. Existing jobs in the queue are not affected.

Use **cupsaccept** to accept jobs again. Requires administrator privileges.

# SEE ALSO

[cupsaccept](/man/cupsaccept)(1), [cupsdisable](/man/cupsdisable)(1)
