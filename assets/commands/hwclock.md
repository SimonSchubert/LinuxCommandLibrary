# TLDR

Display the **current time** from the hardware clock

```sudo hwclock```

Write **system time to hardware** clock

```sudo hwclock -w```

Write **hardware time to system** clock

```sudo hwclock -s```

# SYNOPSIS

**hwclock** [_options_]

# PARAMETERS

**-r**, **--show**
> Read and display hardware clock time

**-w**, **--systohc**
> Set hardware clock from system time

**-s**, **--hctosys**
> Set system time from hardware clock

**--set** **--date=**_TIME_
> Set hardware clock to specified time

**--localtime**
> Hardware clock is in local time

**--utc**
> Hardware clock is in UTC

**--adjust**
> Adjust for systematic drift

**--debug**
> Show debug information

**-f**, **--rtc** _FILE_
> Use specified RTC device (default: /dev/rtc0)

# DESCRIPTION

**hwclock** reads and sets the hardware clock (Real-Time Clock/RTC), which is a battery-backed clock that maintains time when the system is powered off.

The hardware clock can be set to either UTC or local time. Linux systems typically use UTC for the hardware clock and convert to local time for display. Dual-boot systems with Windows may need the hardware clock in local time since Windows expects this.

During boot, the system typically runs **hwclock --hctosys** to initialize system time from the hardware clock. NTP then corrects for any drift.

# CAVEATS

Requires root privileges. Windows and Linux have different expectations for RTC timezone - Linux prefers UTC, Windows prefers localtime. On virtualized systems, the hardware clock may be emulated. Modern systems often use systemd-timesyncd or NTP for time management.

# HISTORY

hwclock has been the standard Linux utility for hardware clock management since the early days of Linux. It's part of the util-linux package and replaces older tools like clock.

# SEE ALSO

[timedatectl](/man/timedatectl)(1), [date](/man/date)(1), [ntpd](/man/ntpd)(8), [chrony](/man/chrony)(8)
