# TLDR

**Disable a printer**

```cupsdisable [printer_name]```

**Disable with reason**

```cupsdisable -r "[maintenance]" [printer_name]```

**Disable and cancel all jobs**

```cupsdisable -c [printer_name]```

# SYNOPSIS

**cupsdisable** [_options_] _destination(s)_

# PARAMETERS

**-c**
> Cancel all jobs on the destination.

**-r** _reason_
> Set reason message.

**-h** _server[:port]_
> Connect to specific server.

**--hold**
> Hold remaining jobs.

# DESCRIPTION

**cupsdisable** stops the printing system from processing jobs for the specified destinations. Jobs are held in the queue until the printer is enabled again.

Requires administrator privileges.

# SEE ALSO

[cupsenable](/man/cupsenable)(1), [cupsaccept](/man/cupsaccept)(1), [cupsreject](/man/cupsreject)(1)
