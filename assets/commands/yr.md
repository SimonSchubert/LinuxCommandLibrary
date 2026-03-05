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

# DESCRIPTION

**yr** is a command-line tool that fetches weather data from the yr.no API (Meteorologisk institutt) and OpenStreetMap's Nominatim API. It outputs forecasts in JSON format and supports querying specific hours and multi-day forecasts via a configuration file.

# HISTORY

**yr** was created by **clux** and is written in **Rust**.

# SEE ALSO

[curl](/man/curl)(1)
