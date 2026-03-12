# TAGLINE

CLI timezone info tool for cross-timezone teams

# TLDR

**Show** current time in multiple zones

```gotz```

**Show** time for specific city

```gotz [city-name]```

**Convert** time between zones

```gotz "[time]" [from-zone] [to-zone]```

**List** all supported timezones

```gotz --list```

# SYNOPSIS

**gotz** [_options_] [_timezone-or-query_]

# PARAMETERS

**-l, --list**
> List all supported timezones

**-c, --config** _FILE_
> Configuration file path

**-f, --format** _FORMAT_
> Time format string

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**gotz** is a command-line tool for working with timezones. It shows current times in different locations and converts times between timezones, making it useful for teams working across multiple regions.

The tool can display multiple timezones simultaneously and supports fuzzy matching for city names.

# EXAMPLES

Show configured timezones:
```gotz```

Show time in Tokyo:
```gotz tokyo```

Convert 3pm NYC to Tokyo:
```gotz "3pm" America/New_York Asia/Tokyo```

# CONFIGURATION

Config file (~/.config/gotz/config.toml):

```toml
[zones]
default = ["America/New_York", "Europe/London", "Asia/Tokyo"]
```

# CAVEATS

Timezone names must follow IANA database. Fuzzy matching may return unexpected results. DST transitions may cause confusion.

# HISTORY

**gotz** was created to simplify timezone conversions for distributed teams, providing a quick CLI alternative to online tools.

# SEE ALSO

[date](/man/date)(1), [tzselect](/man/tzselect)(1), [timedatectl](/man/timedatectl)(1)