# TAGLINE

Weather forecasts delivered to your terminal

# TLDR

**Show current weather**

```yr```

**Show 5-day forecast**

```yr -f```

**Show tomorrow's weather at noon**

```yr -d 1 -h 12```

# SYNOPSIS

**yr** [_options_]

# PARAMETERS

**-f**, **--forecast**
> Show a multi-day forecast instead of the current weather.

**-d** _DAYS_
> Forecast offset in days from today (0 = today, 1 = tomorrow).

**-h** _HOUR_
> Forecast hour of the day (0-23).

**-l** _LOCATION_
> Override the configured location for this query.

**--help**
> Display help information.

# DESCRIPTION

**yr** is a command-line tool that fetches weather data from the yr.no API (Meteorologisk institutt) and OpenStreetMap's Nominatim API. It outputs forecasts in JSON format and supports querying specific hours and multi-day forecasts via a configuration file.

A configuration file (typically under `~/.config/yr/`) stores the default location, units, and language so simple queries can be made without arguments.

# CONFIGURATION

**~/.config/yr/config.toml**
> Default location, units, and language settings.

# CAVEATS

Requires network access to reach yr.no and Nominatim. Data coverage is global but precision varies by location. Hourly forecasts are limited to the range provided by the upstream API.

# HISTORY

**yr** was created by **clux** and is written in **Rust**.

# INSTALL

```aur: yay -S yr```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[curl](/man/curl)(1)
