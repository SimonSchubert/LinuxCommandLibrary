# TAGLINE

Fast log viewer and processor for JSON and logfmt

# TLDR

**View JSON logs** from a file

```hl [path/to/logfile.json]```

**Filter logs by level**

```hl -l [error] [path/to/logfile]```

**Filter by field value**

```hl -f [key]=[value] [path/to/logfile]```

**Stream logs** without pager

```hl -P [path/to/logfile]```

**Filter by time range**

```hl --since "[2024-01-01]" --until "[2024-01-02]" [path/to/logfile]```

**Show logs in local timezone**

```hl -L [path/to/logfile]```

**Read from stdin**

```cat [path/to/logfile] | hl```

# SYNOPSIS

**hl** [**-l** _level_] [**-f** _filter_] [**--since** _time_] [**--until** _time_] [**-P**] [**-L**] [_file_...]

# PARAMETERS

**-l** _LEVEL_
> Filter by log level (debug, info, warn, error)

**-f** _KEY=VALUE_
> Filter by field value

**--since** _TIME_
> Show logs after this timestamp

**--until** _TIME_
> Show logs before this timestamp

**-P**
> Disable pager (streaming mode)

**-L**
> Show timestamps in local timezone

**-Z** _ZONE_
> Show timestamps in specified timezone

**--allow-prefix**
> Process logs with non-JSON prefixes

# DESCRIPTION

**hl** is a high-performance log viewer and processor that converts **JSON** logs and **logfmt** logs into clear human-readable format. It automatically detects log formats and renders them with color-coded output for quick analysis.

The tool supports field-based filtering, log level filtering, and timestamp range filtering. It automatically integrates with a pager (defaulting to **less**) and supports theme customization through configuration files.

# CAVEATS

Designed for structured log formats (JSON, logfmt); plain text logs are passed through as-is. Very large log files benefit from the tool's streaming mode to avoid buffering the entire file in memory.

# HISTORY

**hl** was created by **pamburus** and is written in **Rust**. It was designed as a blazing-fast alternative to tools like **jq** for log analysis, with built-in understanding of common log formats and levels.

# SEE ALSO

[jq](/man/jq)(1), [less](/man/less)(1), [tailspin](/man/tailspin)(1)
