# TLDR

**Synchronize** date and time

```sudo htpdate [host]```

Perform **simulation** without any action

```htpdate -q [host]```

**Compensate** for systematic clock drift

```sudo htpdate -x [host]```

Set time **immediately** after synchronization

```sudo htpdate -s [host]```

# SYNOPSIS

**htpdate** [_options_] _host_...

# PARAMETERS

**-q**
> Query only; don't set time

**-s**
> Set time immediately (step)

**-x**
> Adjust for systematic drift

**-a**
> Adjust time gradually (slew)

**-d**
> Run as daemon

**-l**
> Use syslog for logging

**-t**
> Turn off sanity time check

**-u** _USER_
> Run as specified user

**-p** _FILE_
> Create PID file

# DESCRIPTION

**htpdate** synchronizes the local system time using HTTP headers from web servers. It extracts the Date header from HTTP responses, providing time synchronization without dedicated NTP ports.

This is useful in restricted network environments where:
- NTP (port 123) is blocked by firewalls
- Only HTTP/HTTPS traffic is allowed
- Time synchronization is needed but NTP servers are inaccessible

htpdate can query multiple servers and average the results for better accuracy. It supports both one-time synchronization and daemon mode for continuous adjustment.

# CAVEATS

Less accurate than NTP (HTTP timestamps have one-second resolution). Depends on web servers having accurate time. Network latency affects accuracy. HTTPS requires additional processing that may affect precision.

# HISTORY

htpdate was created by Eddy Vervest as an alternative to NTP for environments where NTP traffic is restricted. It leverages the ubiquity of HTTP access to provide basic time synchronization.

# SEE ALSO

[ntpd](/man/ntpd)(8), [chrony](/man/chrony)(8), [systemd-timesyncd](/man/systemd-timesyncd)(8), [date](/man/date)(1)
