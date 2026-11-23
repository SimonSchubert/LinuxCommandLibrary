# TAGLINE

Multi-purpose weather client for the terminal

# TLDR

**Show current weather** in the interactive TUI, auto-detecting location

```outside```

**Show weather for a specific location** (city and country code)

```outside -l "[London, GB]"```

**Show a detailed text report** with a 7-day forecast in imperial units

```outside -o detailed -u imperial```

**Print a one-line summary**

```outside -o simple```

**Output as JSON**

```outside -o json```

**Stream updates for a Waybar module** every 5 minutes

```outside -o waybar -s -i [300]```

# SYNOPSIS

**outside** [_options_]

# PARAMETERS

**-l**, **--location** _LOCATION_
> Location as city and country code, e.g. "New York, US" (auto-detected via IP by default).

**-u**, **--units** _UNITS_
> Units of measurement: **metric** (default) or **imperial**.

**-o**, **--output** _FORMAT_
> Display format: **tui** (default), **simple**, **detailed**, **json** or **waybar**.

**-s**, **--stream**
> Enable streaming mode for continuous output.

**-i**, **--interval** _SECONDS_
> Interval between streaming updates (default: 30).

**--24**
> Use a 24-hour time format.

**-h**, **--help**
> Print help.

**-V**, **--version**
> Print version.

# CONFIGURATION

**~/.config/outside/config.yaml**
> Optional defaults for **location**, **units** and **interval**, plus output templates for the **simple** and **waybar** formats (e.g. `{weather_icon} {temperature | round}{temperature_unit}`). Run `outside -o json` to see all available template variables.

# DESCRIPTION

**outside** is a multi-purpose weather client for the terminal. It fetches current conditions and a 7-day forecast from Open-Meteo, detects the location via ip-api.com when none is given, and renders the result as an interactive TUI, plain text, JSON, or a Waybar custom module with conditional CSS classes (hot, cold, rain, snow, fog).

Location data is cached for 4 hours and weather data for 10 minutes to reduce API calls.

# CAVEATS

Requires an internet connection. Location detection accuracy depends on IP geolocation. Weather icons need a Nerd Font to display correctly.

# HISTORY

**outside** was created by **BaconIsAVeg** in **2025** and is written in **Rust**.

# SEE ALSO

[curl](/man/curl)(1), [stormy](/man/stormy)(1), [rustormy](/man/rustormy)(1)

# RESOURCES

```[Source code](https://github.com/BaconIsAVeg/outside)```

<!-- verified: 2026-11-23 -->
