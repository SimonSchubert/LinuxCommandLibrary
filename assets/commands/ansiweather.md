# TAGLINE

Display weather in the terminal with ANSI colors

# TLDR

**Get** weather for a city

```ansiweather -l [London,UK]```

Show **forecast**

```ansiweather -l [Paris,FR] -f [5]```

Use **Celsius**

```ansiweather -l [Tokyo,JP] -u metric```

Use **Fahrenheit**

```ansiweather -l [New York,US] -u imperial```

Show **wind and humidity** data

```ansiweather -l [Berlin,DE] -w true -h true```

Show **five-day** forecast

```ansiweather -l [Berlin,DE] -F```

Display **UV index** information

```ansiweather -l [Berlin,DE] -i true```

# SYNOPSIS

**ansiweather** [_-l location_] [_-u units_] [_-f days_] [_options_]

# DESCRIPTION

**ansiweather** is a shell script that displays current weather conditions in your terminal using ANSI colors and Unicode symbols. It fetches data from OpenWeatherMap API and formats it for terminal display.

The tool provides a quick, colorful weather overview without leaving the command line.

# PARAMETERS

**-l** _location_
> Location (City,CountryCode format)

**-u** _units_
> Units: metric (Celsius) or imperial (Fahrenheit)

**-f** _days_
> Forecast days (1-5)

**-F**
> Toggle forecast mode for the next five days.

**-a** _bool_
> Toggle ANSI colors display (true/false).

**-s** _bool_
> Toggle Unicode symbols display (true/false).

**-k** _key_
> Specify OpenWeatherMap API key.

**-d** _bool_
> Toggle daylight data display: sunrise/sunset (true/false).

**-w** _bool_
> Toggle wind data display (true/false).

**-p** _bool_
> Toggle pressure data display (true/false).

**-h** _bool_
> Toggle humidity data display (true/false).

**-i** _bool_
> Toggle UV index display (true/false).

**-v**
> Display version information.

# CONFIGURATION

**~/.ansiweatherrc**
> User configuration file for default location, units, API key, and display options.

# CAVEATS

Requires OpenWeatherMap API key for some features. Free API has rate limits. Location matching can be imprecise; use country codes for accuracy.

# HISTORY

**ansiweather** was created as a simple, colorful terminal weather tool, leveraging OpenWeatherMap's free API tier for weather data.

# SEE ALSO

[curl](/man/curl)(1), [wttr.in](/man/wttr.in)(1)
