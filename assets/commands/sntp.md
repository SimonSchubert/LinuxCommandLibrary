# TLDR

**Query time from an NTP server**

```sntp [pool.ntp.org]```

**Step (set) the system clock** from a server

```sudo sntp -S [pool.ntp.org]```

**Slew (gradually adjust)** the system clock

```sudo sntp -s [pool.ntp.org]```

**Query using IPv4 only**

```sntp -4 [pool.ntp.org]```

**Query using IPv6 only**

```sntp -6 [pool.ntp.org]```

**Use reserved NTP port 123**

```sudo sntp -r [pool.ntp.org]```

# SYNOPSIS

**sntp** [_-46dhKoSs_] [_-a keyid_] [_-b bcaddress_] [_-c filename_] [_-M threshold_] [_-r_] [_server..._]

# PARAMETERS

**-S**, **--step**
> Step (set) the system clock using settimeofday()

**-s**, **--slew**
> Slew (gradually adjust) the clock using adjtime()

**-4**, **--ipv4**
> Force IPv4 DNS resolution

**-6**, **--ipv6**
> Force IPv6 DNS resolution

**-r**, **--usereservedport**
> Use reserved NTP port 123 for communication

**-M** _threshold_
> Slew if offset is less than threshold milliseconds, otherwise step

**-d**, **--debug-level**
> Increase debug verbosity

**-K** _file_, **--kod**=_file_
> KoD (Kiss-of-Death) history file

# DESCRIPTION

**sntp** is a Simple Network Time Protocol client that queries NTP servers and displays the time offset between the local system clock and the server. With appropriate privileges, it can correct the system clock.

Unlike the full ntpd daemon, sntp performs one-time synchronization, making it suitable for cron jobs or scripts where continuous synchronization is unnecessary. It can either step (immediately set) or slew (gradually adjust) the clock.

Output shows the time offset and error bounds in seconds, indicating how far the local clock deviates from the server.

# CAVEATS

Stepping the clock can disrupt applications depending on monotonic time. Slewing is safer but limited to small adjustments. Modern distributions often use **chronyd** or **systemd-timesyncd** instead.

# HISTORY

sntp implements RFC 2030 (Simple Network Time Protocol), which superseded RFC 1769. It is part of the NTP reference implementation but has been largely superseded by more robust alternatives like chrony.

# SEE ALSO

[ntpd](/man/ntpd)(8), [chronyc](/man/chronyc)(1), [timedatectl](/man/timedatectl)(1), [date](/man/date)(1)
