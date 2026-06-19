# TAGLINE

Interactive battery monitor

# TLDR

Display **battery** information

```battop```

Use **SI** units instead of human-readable values

```battop -u si```

Set the **refresh delay** to 5 seconds

```battop -d 5```

# SYNOPSIS

**battop** [**-u** _units_] [**-d** _delay_] [**-v**]

# DESCRIPTION

**battop** is an interactive viewer for system batteries. It displays real-time information about battery status, charge level, capacity, and power consumption in a terminal interface, drawing charts over time. Left and right arrow keys switch between batteries when more than one is present.

It runs on Linux, macOS, FreeBSD, and DragonFlyBSD.

# PARAMETERS

**-u, --units** _units_
> Measurement units to display: **human** (default) or **si**.

**-d, --delay** _seconds_
> Delay between updates, in seconds (default **1**).

**-v, --verbose**
> Increase verbosity, may be repeated up to five times (**-vvvvv**). Log output goes to stderr.

# KEYBINDINGS

- **Left / Right arrows** - Switch between batteries
- **q** - Quit

# CAVEATS

On Linux it reads battery information from /sys/class/power_supply, so it only works on systems with a battery (laptops, tablets). Information accuracy depends on what the battery hardware reports.

# HISTORY

**battop** is written in Rust by svartalf and provides a modern, cross-platform battery monitoring interface.

# SEE ALSO

[acpi](/man/acpi)(1), [upower](/man/upower)(1)

# RESOURCES

```[Source code](https://github.com/svartalf/rust-battop)```

<!-- verified: 2026-06-19 -->
