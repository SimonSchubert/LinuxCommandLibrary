# TAGLINE

CLI tool for log stream splitting and visualization

# TLDR

**Split logs by multiple regex patterns**

```tail -f [logfile] | logss -c "[pattern1]" -c "[pattern2]"```

**Write matched patterns to files**

```tail -f [logfile] | logss -c "[pattern]" -o [output_dir/]```

**Get input from a command instead of stdin**

```logss -C "[command]" -c "[pattern]"```

**Use a configuration file**

```logss -f [config.yaml]```

**Start in vertical view mode**

```tail -f [logfile] | logss -c "[pattern]" -V```

# SYNOPSIS

**logss** [_options_]

# PARAMETERS

**-c** _PATTERN_
> Specify a regex pattern to match and split logs by. May be `pattern`, or `pattern,command,timeout` to trigger a shell command on each match.

**-C** _COMMAND_
> Get input from a shell command instead of stdin.

**-f** _FILE_
> Load configuration from a YAML file (overrides CLI arguments).

**-o** _OUTPUT_PATH_
> Write matched lines to files in the specified output path.

**-r** _MS_
> Define render speed in milliseconds. Default: 100.

**-s**
> Start in single view mode.

**-t** _N_
> Number of threads per container for triggers. Default: 1.

**-V**
> Start in vertical view mode.

**-e**
> Exit on empty input.

**-h**
> Print help.

# DESCRIPTION

**logss** is a CLI/TUI tool for visualizing and splitting log streams in real time. It allows you to define multiple regex patterns and view matching log entries in separate panes, with automatic color coding and adjustable render speed.

The tool reads from stdin (or a command via `-C`) and distributes log lines to different views based on pattern matches. Each pattern container can optionally trigger a shell command when a match occurs, using `__line__` as a placeholder for the matched line. A dedicated container displays the raw unfiltered stream.

Interactive controls include pause/resume, scroll, zoom, show/hide containers, and toggling line wrap.

# CAVEATS

By default reads from stdin; a log source must be piped in or specified with `-C`. Configuration files specified with `-f` override all CLI arguments.

# HISTORY

**logss** was created by **todoesverso** and is written in **Rust**.

# SEE ALSO

[grep](/man/grep)(1), [tail](/man/tail)(1), [multitail](/man/multitail)(1)
