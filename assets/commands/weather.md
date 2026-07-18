# TAGLINE

Command-line weather forecasts

# TLDR

**Current weather** for a location

```weather [city]```

**Use geolocation** / default location

```weather```

**JSON output** (if supported)

```weather -j [city]```

# SYNOPSIS

**weather** [*options*] [*location*]

# DESCRIPTION

**weather** (also published historically as **darksky-weather** from genuinetools) prints concise weather conditions and forecasts in the terminal. Location can be a city name or coordinates depending on version and backend API configuration.

Many builds require an API key from a weather data provider (originally Dark Sky; forks may use OpenWeatherMap or others). Check **weather --help** and environment variables documented by your package.

# PARAMETERS

*location*

> City or query string for the forecast.

**-j** / **--json**

> Machine-readable output when available.

**-h**, **--help**

> Options for units, days ahead, and icons.

# CAVEATS

Upstream weather APIs change frequently; keys, quotas, and endpoints may break older binaries. Prefer a maintained package for your distribution. Not related to GNOME Weather GUI.

# SEE ALSO

[curl](/man/curl)(1), [ansiweather](/man/ansiweather)(1), [wttr](/man/wttr)(1)

# RESOURCES

```[Source code](https://github.com/genuinetools/weather)```

<!-- verified: 2026-07-19 -->
