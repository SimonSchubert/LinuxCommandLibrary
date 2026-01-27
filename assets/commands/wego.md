# TLDR

**Show 3-day forecast for current location**

```wego```

**Show forecast for specific city**

```wego [London]```

**Show 5-day forecast**

```wego -d [5]```

**Show forecast for city with days**

```wego [Paris] [4]```

**Use emoji frontend**

```wego -f emoji```

**Output as JSON**

```wego -f json```

# SYNOPSIS

**wego** [_options_] [_location_] [_days_]

# PARAMETERS

**-d**, **--days** _num_
> Number of forecast days (1-7, default 3).

**-f**, **--frontend** _type_
> Output frontend: ascii-art-table, emoji, or json.

**-u**, **--units** _system_
> Units: metric or imperial.

**-b**, **--backend** _name_
> Weather data source.

**-l**, **--location** _place_
> Set location for forecast.

**-h**, **--help**
> Display help.

# DESCRIPTION

**wego** is a terminal weather client that displays forecasts using ASCII art. Written in Go, it shows temperature, wind speed and direction, visibility, and precipitation probability.

The tool supports multiple weather data backends including OpenWeatherMap. You need to register for an API key and configure it in ~/.wegorc before use.

Three output frontends are available: ascii-art-table (classic terminal look), emoji (modern icons), and json (for scripting). The display requires a UTF-8 terminal with 256 colors.

# CONFIGURATION

Config file: ~/.wegorc

Required: API key from weather backend. Optional: default location, units, and frontend preferences.

# CAVEATS

Requires API key from weather service. Some backends no longer offer free keys. Needs UTF-8 terminal with 256 colors and appropriate fonts for ASCII art display.

# HISTORY

**wego** was created as a fun terminal weather application. It inspired wttr.in, a web service that wraps wego and serves weather via curl, making terminal weather checks as simple as `curl wttr.in`.

# SEE ALSO

[curl](/man/curl)(1), [finger](/man/finger)(1)
