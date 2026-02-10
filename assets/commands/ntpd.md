# TAGLINE

network Time Protocol daemon that synchronizes the system clock with remote

# TLDR

**Start** the daemon

```sudo ntpd```

Synchronize system time **a single time** (quit after synchronizing)

```sudo ntpd --quit```

Synchronize a single time allowing **big adjustments**

```sudo ntpd --panicgate --quit```

# SYNOPSIS

**ntpd** [_options_]

# PARAMETERS

**-q, --quit**
> Set the time once and exit

**-g, --panicgate**
> Allow large time corrections (normally refused if >1000 seconds off)

**-n, --nofork**
> Run in foreground, don't daemonize

**-c _file_, --configfile _file_**
> Use alternate configuration file

**-p _file_, --pidfile _file_**
> Specify PID file location

**-d, --debug-level**
> Increase debug verbosity (can be repeated)

# DESCRIPTION

**ntpd** is the Network Time Protocol daemon that synchronizes the system clock with remote NTP servers or local reference clocks. It maintains accurate time by continuously adjusting the clock rate to compensate for drift.

The daemon reads its configuration from **/etc/ntp.conf**, which specifies time servers, access restrictions, and behavior options. Once running, it gradually slews the clock to avoid abrupt time jumps that could confuse applications.

For one-time synchronization without running a continuous daemon, use the **--quit** option. The **--panicgate** option allows initial sync even when the clock is far off.

# CAVEATS

Large time jumps (>1000 seconds) are refused by default; use **--panicgate** for initial sync of badly drifted clocks. Conflicts with other time sync daemons (systemd-timesyncd, chrony). Port 123 (UDP) must be accessible. Modern systems often prefer **chrony** or **systemd-timesyncd**.

# HISTORY

NTP was developed by David L. Mills at the University of Delaware, first appearing in 1985. The reference implementation ntpd has been the standard NTP daemon for decades.

# SEE ALSO

[ntpq](/man/ntpq)(8), [ntpdate](/man/ntpdate)(8), [chrony](/man/chrony)(8), [timedatectl](/man/timedatectl)(1)
