# TAGLINE

Control system time and timezone

# TLDR

Show current **time and date** settings

```timedatectl```

Set **local time** directly

```timedatectl set-time "2024-01-15 14:30:00"```

List available **timezones**

```timedatectl list-timezones```

Set system **timezone**

```timedatectl set-timezone America/New_York```

Enable **NTP synchronization**

```timedatectl set-ntp on```

Set hardware clock to **local time**

```timedatectl set-local-rtc 1```

# SYNOPSIS

**timedatectl** [_OPTIONS_] [_COMMAND_]

# DESCRIPTION

**timedatectl** queries and changes the system clock and its settings. It controls the system time, timezone, and network time synchronization through systemd-timedated.

# COMMANDS

**status**
> Show current time/date settings (default command)

**show**
> Show properties in machine-readable format

**set-time TIME**
> Set system time (YYYY-MM-DD HH:MM:SS format)

**set-timezone ZONE**
> Set system timezone

**list-timezones**
> List available timezones

**set-local-rtc BOOL**
> Control RTC in local time (0=UTC, 1=local)

**set-ntp BOOL**
> Enable or disable NTP synchronization

**timesync-status**
> Show status of systemd-timesyncd

# PARAMETERS

**--no-pager**
> Do not pipe output into a pager

**--no-ask-password**
> Do not prompt for password

**-H, --host**
> Execute operation on remote host

**-M, --machine**
> Execute operation on container

**-p, --property**
> Show specific property

**--value**
> Show only property values

# CAVEATS

Setting time manually (set-time) disables NTP synchronization. RTC in local time (set-local-rtc 1) can cause issues with dual-boot systems during DST changes.

# HISTORY

**timedatectl** is part of **systemd**, introduced to provide a unified interface for time/date management replacing older tools like hwclock and tzselect.

# SEE ALSO

[systemd-timedated](/man/systemd-timedated)(8), [hwclock](/man/hwclock)(8), [date](/man/date)(1)
