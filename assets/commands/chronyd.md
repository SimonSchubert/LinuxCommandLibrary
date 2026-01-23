# TLDR

**Start chronyd** daemon

```chronyd```

**Start in foreground** with debug output

```chronyd -d```

**Start with specific config file**

```chronyd -f [/etc/chrony.conf]```

**Check configuration syntax**

```chronyd -p```

**Run once** for initial time sync

```chronyd -q```

# SYNOPSIS

**chronyd** [_options_]

# DESCRIPTION

**chronyd** is the daemon component of chrony, a versatile implementation of the Network Time Protocol (NTP). It synchronizes the system clock with NTP servers, reference clocks, or manual input, and can serve time to other computers.

chronyd is designed to work well in a wide range of conditions, including intermittent network connections, virtualized environments, and systems with unstable clocks. It can achieve faster and more accurate synchronization than traditional ntpd in many scenarios.

The daemon maintains a drift file to track the system clock's frequency error, allowing it to correct time accurately even when network connectivity is lost.

# PARAMETERS

**-d**
> Don't detach from terminal (foreground).

**-f** _file_
> Use specified configuration file.

**-n**
> Don't fork into background.

**-p**
> Print configuration and exit.

**-q**
> Set time once and exit.

**-Q**
> Like -q but don't step clock.

**-r**
> Reload sample histories on restart.

**-R**
> Do not restore saved state.

**-s**
> Set system time from RTC on startup.

**-u** _user_
> Run as specified user.

**-x**
> Don't control system clock.

**-4**
> Use only IPv4.

**-6**
> Use only IPv6.

# CAVEATS

Requires root privileges to adjust system time. Cannot run simultaneously with other NTP daemons (ntpd). Hardware timestamps require kernel and driver support. Some features may require configuration in /etc/chrony.conf. Real-time clock (RTC) sync requires hardware support.

# HISTORY

**chrony** was originally written by **Richard Curnow** starting in **1997** as an alternative to the reference NTP implementation. It was designed specifically for systems that don't maintain continuous network connections. The project is now maintained by **Miroslav Lichvar** at Red Hat. Chrony has become the default NTP implementation in many Linux distributions including Fedora, RHEL, and CentOS.

# SEE ALSO

[chronyc](/man/chronyc)(1), [chrony.conf](/man/chrony.conf)(5), [ntpd](/man/ntpd)(8), [timedatectl](/man/timedatectl)(1)
