# TLDR

**Show today's ephemerides**

```kosmorro```

**Show ephemerides for specific date**

```kosmorro --date [2024-01-15]```

**Set observer location**

```kosmorro --latitude [48.8566] --longitude [2.3522]```

**Output as PDF**

```kosmorro --format pdf --output [sky.pdf]```

**Show in specific timezone**

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

**kosmorro** computes astronomical ephemerides including moon phases, planet visibility, and celestial events. Displays sunrise, sunset, and astronomical twilight times for a given location. Useful for astronomy enthusiasts and photographers.

# SEE ALSO

[stellarium](/man/stellarium)(1)

