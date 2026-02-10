# TAGLINE

sets the system date and time by querying NTP servers

# TLDR

**Synchronize and set** date and time

```sudo ntpdate [host]```

**Query** the host without setting the time

```ntpdate -q [host]```

Use an **unprivileged port** in case a firewall is blocking privileged ports

```sudo ntpdate -u [host]```

**Force time to be stepped** using settimeofday instead of slewed

```sudo ntpdate -b [host]```

# SYNOPSIS

**ntpdate** [_options_] _server_...

# PARAMETERS

**-q**
> Query only; don't set the clock

**-u**
> Use unprivileged port for outgoing packets (useful for firewalls)

**-b**
> Force time to be stepped (abrupt change) rather than slewed (gradual)

**-s**
> Log to syslog instead of stdout

**-v**
> Verbose output

**-d**
> Debug mode; don't change time, show what would happen

**-t _timeout_**
> Timeout for server response in seconds

# DESCRIPTION

**ntpdate** sets the system date and time by querying NTP (Network Time Protocol) servers. It performs a one-time synchronization, unlike **ntpd** which runs continuously.

By default, if the time offset is small, ntpdate gradually adjusts (slews) the clock to avoid disrupting running programs. For large offsets, it steps the clock immediately. The **-b** flag forces stepping regardless of offset size.

Multiple servers can be specified; ntpdate queries all and uses the best response.

# CAVEATS

**Deprecated** in favor of **ntpd -q** or **sntp**. Abrupt time changes (**-b**) can confuse applications expecting monotonic time. Requires root privileges to set the system clock. Not suitable for continuous synchronization; use ntpd or chronyd instead.

# HISTORY

ntpdate was part of the original NTP distribution but has been deprecated since NTP 4.2.8. Modern systems typically use **systemd-timesyncd**, **chrony**, or **ntpd** for time synchronization.

# SEE ALSO

[ntpd](/man/ntpd)(8), [chronyc](/man/chronyc)(1), [timedatectl](/man/timedatectl)(1), [sntp](/man/sntp)(8)
