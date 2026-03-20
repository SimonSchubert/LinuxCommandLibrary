# TAGLINE

computes astronomical ephemerides including moon phases and planet visibility

# TLDR

**Show today's ephemerides**

```kosmorro```

**Show ephemerides for a specific date**

```kosmorro --date [2024-01-15]```

**Set observer location for rise/set times**

```kosmorro --latitude [48.8566] --longitude [2.3522]```

**Export ephemerides as PDF**

```kosmorro --format pdf --output [sky.pdf]```

**Show in a specific timezone**

```kosmorro --timezone [Europe/Paris]```

# SYNOPSIS

**kosmorro** [_options_]

# PARAMETERS

**--date** _date_
> Date to compute (YYYY-MM-DD).

**--latitude** _degrees_
> Observer latitude.

**--longitude** _degrees_
> Observer longitude.

**--timezone** _tz_
> Timezone for display.

**--format** _format_
> Output format (text, json, pdf).

**--output** _file_
> Output file path.

# DESCRIPTION

**kosmorro** computes astronomical ephemerides including moon phases, planet visibility, and celestial events. Displays sunrise, sunset, and astronomical twilight times for a given location. On first run, it downloads necessary computation files to `~/.kosmorro-cache`. Useful for astronomy enthusiasts and photographers.

# CAVEATS

Requires an internet connection on first run to download ephemeris data files. Location coordinates must be provided for rise/set time calculations. PDF output requires a LaTeX installation.

