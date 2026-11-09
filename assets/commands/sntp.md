# TAGLINE

Simple Network Time Protocol client

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

**Slew small offsets and step larger ones**

```sudo sntp -S -s -M [128] [pool.ntp.org]```

# SYNOPSIS

**sntp** [_-46cdrSs_] [_-a keynum_] [_-b bcaddress_] [_-B bctimeout_] [_-D debug-level_] [_-g delay_] [_-K kodfile_] [_-k keyfile_] [_-l logfile_] [_-M steplimit_] [_-o ntpver_] [_-u uctimeout_] [_--wait_] [_server..._]

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

**-M** _steplimit_, **--steplimit**=_steplimit_
> When both **-S** and **-s** are given, slew offsets below _steplimit_ milliseconds and step larger ones

**-u** _seconds_, **--uctimeout**=_seconds_
> Maximum time to wait for a unicast response (default: 5)

**-d**, **--debug-level**
> Increase debug verbosity (can be specified multiple times)

**-D** _level_, **--set-debug-level**=_level_
> Set the debug verbosity level

**-K** _file_, **--kod**=_file_
> KoD (Kiss-of-Death) history file (default: /var/db/ntp-kod). The file is not created if missing

**-a** _keyid_, **--authentication**=_keyid_
> Enable authentication with the specified key number

**-k** _file_, **--keyfile**=_file_
> Key file used with **-a**

**-b** _address_, **--broadcast**=_address_
> Listen for NTP packets sent to the specified broadcast or multicast address

**-B** _seconds_, **--bctimeout**=_seconds_
> Maximum time to wait for a broadcast or multicast message (default: 68)

**-l** _file_, **--filelog**=_file_
> Append a copy of status messages to the specified file

**-c**, **--concurrent**
> Send concurrent queries to resolved IPs (for hostnames resolving to multiple addresses on different machines)

**-g** _milliseconds_, **--gap**=_milliseconds_
> Delay between outgoing queries (default: 50)

**-o** _version_, **--ntpversion**=_version_
> NTP protocol version to put in requests (default: 4)

**--wait**
> Without **-S** or **-s**, wait for all pending responses instead of exiting after the first valid one

# DESCRIPTION

**sntp** is a Simple Network Time Protocol client that queries NTP servers and displays the time offset between the local system clock and the server. With appropriate privileges, it can correct the system clock.

Unlike the full ntpd daemon, sntp performs one-time synchronization, making it suitable for cron jobs or scripts where continuous synchronization is unnecessary. It can either step (immediately set) or slew (gradually adjust) the clock.

By default the offset is only displayed; **-S** or **-s** is needed to correct the clock. Output shows the time offset and error bounds in seconds, indicating how far the local clock deviates from the server. The exit status is zero if a valid response is received.

# CAVEATS

Stepping the clock can disrupt applications depending on monotonic time. Slewing is safer but limited to small adjustments. Modern distributions often use **chronyd** or **systemd-timesyncd** instead.

# HISTORY

sntp implements RFC 4330 (Simple Network Time Protocol Version 4), since obsoleted by RFC 5905. It is part of the NTP reference implementation but has been largely superseded by more robust alternatives like chrony and systemd-timesyncd.

# SEE ALSO

[ntpd](/man/ntpd)(8), [ntpdate](/man/ntpdate)(1), [chronyc](/man/chronyc)(1), [timedatectl](/man/timedatectl)(1), [date](/man/date)(1)

# RESOURCES

```[Homepage](https://www.ntp.org/)```

```[Documentation](https://www.ntp.org/documentation/4.2.8-series/sntp/)```

<!-- verified: 2026-11-09 -->
