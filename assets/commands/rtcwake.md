# TLDR

**Show** alarm status

```sudo rtcwake -m show -v```

Suspend to **RAM** and wake after 10 seconds

```sudo rtcwake -m mem -s 10```

Suspend to **disk** and wake in 15 minutes

```sudo rtcwake -m disk --date +15min```

**Freeze** and wake at specific time

```sudo rtcwake -m freeze --date [YYYYMMDDhhmm]```

**Disable** alarm

```sudo rtcwake -m disable```

**Dry run** at specific time

```sudo rtcwake -m on --date [hh:mm]```

# SYNOPSIS

**rtcwake** [**-m** _mode_] [**-s** _seconds_|**--date** _time_] [_options_]

# MODES

**mem**
> Suspend to RAM (S3)

**disk**
> Suspend to disk/hibernate (S4)

**freeze**
> Suspend-to-idle (S0ix, kernel 3.9+)

**off**
> Power off system

**on**
> No sleep, just set wakeup time

**show**
> Display current alarm

**disable**
> Cancel pending alarm

# PARAMETERS

**-m, --mode _mode_**
> Sleep/action mode

**-s, --seconds _sec_**
> Wake after N seconds

**--date _time_**
> Wake at specific time

**-v, --verbose**
> Verbose output

**-d, --device _rtc_**
> Use specific RTC device

# DESCRIPTION

**rtcwake** enters a system sleep state and configures the RTC (Real-Time Clock) to wake the system at a specified time. It's useful for scheduled tasks, power saving, and automatic system wake.

The tool supports various sleep modes with different power/wake trade-offs. The RTC alarm persists even if the system loses power (battery backup).

# CAVEATS

Requires root privileges. Not all hardware supports all modes. Time is relative to hardware clock (usually UTC). BIOS/UEFI must support RTC wake.

# HISTORY

**rtcwake** is part of **util-linux**, providing a standard interface to the Linux RTC wake functionality used for scheduled wake-ups and automated power management.

# SEE ALSO

[systemctl](/man/systemctl)(1), [hwclock](/man/hwclock)(8), [pm-suspend](/man/pm-suspend)(8)
