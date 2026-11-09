# TAGLINE

Neofetch-inspired weather CLI with ASCII art

# TLDR

**Display weather for the location set in the config file**

```rustormy```

**Show weather for a specific city**

```rustormy -c [London]```

**Show weather for coordinates**

```rustormy -y [51.5074] -x [-0.1278]```

**Display weather in imperial units with colors**

```rustormy -c [Austin] --colors -u imperial```

**Output weather data as JSON**

```rustormy -c [Tokyo] -o json```

**Show a single line** of output

```rustormy -c [Tokyo] --one-line```

**Use a specific provider and language**

```rustormy -c [Valparaiso] -p [yr] -g [es] --name```

**Refresh continuously** every 60 seconds

```rustormy -c [London] -l -i [60]```

# SYNOPSIS

**rustormy** [_options_]

# PARAMETERS

**-c**, **--city** _CITY_
> Specify the city name (required if coordinates are not provided).

**-y**, **--lat** _LAT_
> Latitude (required if city is not provided).

**-x**, **--lon** _LON_
> Longitude (required if city is not provided).

**-p**, **--provider** _PROVIDER_
> Weather data provider: om, owm, wwo, wa, wb, ti, or yr.

**-u**, **--units** _UNITS_
> Unit system: metric or imperial.

**-o**, **--format** _FORMAT_
> Output format: text or json.

**-g**, **--lang** _LANGUAGE_
> Language for weather output: en, ru, es, or ko.

**-m**, **--text-mode** _MODE_
> Display mode: full, compact, or one_line.

**--compact**
> Shorthand for **--text-mode compact**.

**--one-line**
> Shorthand for **--text-mode one_line**.

**--name**
> Show the city name in the output.

**--colors**
> Enable ANSI color output.

**--degrees**
> Show wind direction in degrees instead of arrows.

**--align-right**
> Align labels to the right in text output.

**-l**, **--live**
> Enable live mode with periodic updates. Press **q**, **Esc** or **Ctrl+C** to quit, **r** to refresh.

**-i**, **--interval** _SECONDS_
> Live mode update interval (default: 300).

**--no-footer**
> Hide the live mode footer.

**--no-cache**
> Disable caching of geocoding results.

**--clear-cache**
> Clear cached geocoding results and exit.

**-v**, **--verbose**
> Increase log verbosity on stderr. Repeat up to **-vvv**.

**-h**, **--help**
> Print help.

**-V**, **--version**
> Print version.

# DESCRIPTION

**rustormy** is a lightweight weather CLI tool that displays current conditions including temperature, wind, humidity, precipitation, pressure, and UV index with ASCII art weather icons. It supports multiple weather data providers (Open-Meteo by default, no API key required), multiple output formats, and automatic provider fallback on API limits.

# CONFIGURATION

Settings live in **~/.config/rustormy/config.toml**, which is created automatically on first run. It holds the provider list, default **city** or **lat**/**lon**, API keys, live mode settings, output format and color theme.

```
providers = ["open_meteo"]
city = "London"
live_mode_interval = 300

[api_keys]
open_weather_map = ""

[format]
units = "metric"
use_colors = true
```

Several providers can be listed to try them in order.

# CAVEATS

There is no automatic location detection: a city or coordinates must come from the command line or the config file. All providers except Open-Meteo and Yr.no require an API key.

# HISTORY

**rustormy** was created by **Tairesh** and is written in **Rust**. It started as a Rust clone of **stormy**.

# INSTALL

```nix: nix profile install nixpkgs#rustormy```

<!-- packages: 2026-11-09 -->

# SEE ALSO

[stormy](/man/stormy)(1), [curl](/man/curl)(1), [zeitfetch](/man/zeitfetch)(1)

# RESOURCES

```[Source code](https://github.com/Tairesh/rustormy)```

<!-- verified: 2026-11-09 -->
