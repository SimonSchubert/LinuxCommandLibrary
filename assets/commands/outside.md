# TAGLINE

Multi-purpose weather client for the terminal

# TLDR

**Show current weather**

```outside```

**Show weather for a specific location**

```outside -l "[city]"```

**Show weather in metric units**

```outside -u metric```

**Output as JSON**

```outside -f json```

# SYNOPSIS

**outside** [_options_]

# PARAMETERS

**-l**, **--location** _LOCATION_
> Specify a location (auto-detected via IP by default).

**-u**, **--units** _UNITS_
> Units of measurement (metric or imperial).

**-f**, **--format** _FORMAT_
> Output format (tui, simple, detailed, json, waybar).

# DESCRIPTION

**outside** is a multi-purpose weather client for the terminal. It supports automatic location detection via IP, multiple output formats, 7-day forecasts, and customizable templates for data presentation.

# CAVEATS

Requires an internet connection. Location detection accuracy depends on IP geolocation.

# HISTORY

**outside** was created by **BaconIsAVeg** and is written in **Rust**.

# SEE ALSO

[curl](/man/curl)(1)
