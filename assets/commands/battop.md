# TLDR

Display **battery** information

```battop```

Change **measurement** unit

```battop -u human```

Use **SI** units

```battop -u si```

# SYNOPSIS

**battop** [_OPTIONS_]

# DESCRIPTION

**battop** is an interactive viewer for laptop batteries. It displays real-time information about battery status, charge level, capacity, and power consumption in a terminal interface.

# PARAMETERS

**-u, --unit** _unit_
> Set measurement unit (human or si)

The human unit shows values in human-readable format, while si uses standard SI units.

# CAVEATS

Requires access to battery information in /sys/class/power_supply. Only works on systems with batteries (laptops, tablets). Information accuracy depends on battery hardware reporting.

# HISTORY

**battop** is written in Rust and provides a modern battery monitoring interface.

# SEE ALSO

[acpi](/man/acpi)(1), [upower](/man/upower)(1)
