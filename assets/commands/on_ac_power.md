# TAGLINE

tests whether the system is running on AC power

# TLDR

**Check if on AC power**

```on_ac_power && echo "AC" || echo "Battery"```

**Use in script conditionally**

```on_ac_power && backup.sh```

**Check exit code**

```on_ac_power; echo $?```

# SYNOPSIS

**on_ac_power**

# EXIT CODES

**0**
> System is on AC power.

**1**
> System is on battery.

**255**
> Cannot determine power status.

# DESCRIPTION

**on_ac_power** tests whether the system is running on AC (mains) power. It returns an exit code indicating power status.

The tool is designed for scripting. Exit code 0 means AC power is connected. Exit code 1 means running on battery. Any other exit code indicates the power status cannot be determined.

Common uses include scheduling heavy tasks only when plugged in, adjusting backup frequency based on power source, and power-aware cron jobs.

The command checks various power subsystems including ACPI, APM, and sysfs to determine status. It works on laptops and systems with battery backup.

On systems without batteries or power status information, the result may be unreliable.

# CAVEATS

May not work on all systems. Desktop systems without UPS typically return "AC". Result depends on kernel power reporting. Some virtual machines report unknown.

# HISTORY

**on_ac_power** is part of the **powermgmt-base** package on Debian-based systems. It provides a simple interface for power-aware scripting without parsing ACPI or sysfs directly.

# SEE ALSO

[acpi](/man/acpi)(1), [upower](/man/upower)(1), [tlp](/man/tlp)(8), [pm-utils](/man/pm-utils)(8)
