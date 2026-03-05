# TAGLINE

Neofetch-inspired weather CLI with ASCII art

# TLDR

**Display weather for your current location**

```rustormy```

**Show weather for a specific city**

```rustormy -c [London]```

**Display weather in imperial units with colors**

```rustormy -c [Austin] --colors -u imperial```

**Output weather data as JSON**

```rustormy -c [Tokyo] -o json```

# SYNOPSIS

**rustormy** [_options_]

# PARAMETERS

**-c**, **--city** _CITY_
> Specify the city name.

**-u**, **--units** _UNITS_
> Unit system: metric or imperial.

**-o**, **--format** _FORMAT_
> Output format: text or json.

**-m**, **--text-mode** _MODE_
> Display mode: full, compact, or one_line.

**-l**, **--live**
> Enable live mode with periodic updates.

**--colors**
> Enable ANSI color output.

# DESCRIPTION

**rustormy** is a lightweight weather CLI tool that displays current conditions including temperature, wind, humidity, precipitation, pressure, and UV index with ASCII art weather icons. It supports multiple weather data providers (Open-Meteo by default, no API key required), multiple output formats, and automatic provider fallback on API limits.

# HISTORY

**rustormy** was created by **Tairesh** and is written in **Rust**.

# SEE ALSO

[stormy](/man/stormy)(1), [curl](/man/curl)(1), [zeitfetch](/man/zeitfetch)(1)
