# TAGLINE

Schedule system wake from sleep using RTC alarm

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

**Dry run** without actually suspending

```sudo rtcwake -m mem -s 600 -n```

**List supported wake modes** for this kernel

```rtcwake --list-modes```

# SYNOPSIS

**rtcwake** [_options_] [**-d** _device_] [**-m** _mode_] {**-s** _seconds_ | **-t** _time_t_ | **--date** _timestamp_}

# MODES

**standby**
> ACPI S1 — minimal but real power savings. Default mode if **-m** is omitted.

**mem**
> Suspend to RAM (ACPI S3).

**disk**
> Suspend to disk / hibernate (ACPI S4).

**freeze**
> Suspend-to-idle (S0ix), kernel 3.9+.

**off**
> Power off the system (ACPI S5).

**no**
> Set the RTC alarm but do not suspend or shut down.

**on**
> Do not sleep; instead poll the RTC until the alarm fires (debugging).

**show**
> Display the currently set alarm.

**disable**
> Cancel a pending alarm.

# PARAMETERS

**-m**, **--mode** _mode_
> Sleep / action mode (see **MODES**).

**-s**, **--seconds** _sec_
> Wake _sec_ seconds from now.

**-t**, **--time** _time_t_
> Wake at the absolute Unix epoch time _time_t_.

**--date** _timestamp_
> Wake at the given timestamp (e.g. `+5min`, `2026-04-30 18:00`, `tomorrow 03:00`).

**-d**, **--device** _rtc_
> Use the specified RTC device (default **/dev/rtc0**).

**-l**, **--local**
> Treat the hardware clock as local time.

**-u**, **--utc**
> Treat the hardware clock as UTC.

**-a**, **--auto**
> Read the clock interpretation from **/etc/adjtime** (default).

**-A**, **--adjfile** _file_
> Use _file_ instead of **/etc/adjtime**.

**-n**, **--dry-run**
> Test mode — set up the alarm but do not actually suspend or shut down.

**--list-modes**
> Print modes the running kernel supports.

**-v**, **--verbose**
> Verbose output.

**-V**, **--version**
> Print version and exit.

# DESCRIPTION

**rtcwake** enters a system sleep state and configures the RTC (Real-Time Clock) to wake the system at a specified time. It's useful for scheduled tasks, power saving, and automatic system wake.

The tool supports various sleep modes with different power/wake trade-offs. The RTC alarm persists even if the system loses power (battery backup).

# CAVEATS

Requires root privileges. Not all hardware supports all modes. Time is relative to hardware clock (usually UTC). BIOS/UEFI must support RTC wake.

# HISTORY

**rtcwake** is part of **util-linux**, providing a standard interface to the Linux RTC wake functionality used for scheduled wake-ups and automated power management.

# INSTALL

```apt: sudo apt install util-linux```

```dnf: sudo dnf install util-linux```

```pacman: sudo pacman -S util-linux```

```apk: sudo apk add util-linux-misc```

```zypper: sudo zypper install util-linux```

```brew: brew install util-linux```

```nix: nix profile install nixpkgs#util-linux```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[systemctl](/man/systemctl)(1), [hwclock](/man/hwclock)(8), [pm-suspend](/man/pm-suspend)(8)
