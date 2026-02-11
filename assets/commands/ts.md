# TAGLINE

Prepend timestamps to command output lines

# TLDR

**Add timestamps** to command output

```[command] | ts```

**Use ISO 8601 format** timestamps

```[command] | ts -i```

**Include milliseconds** in timestamps

```[command] | ts -m```

**Use UTC time** instead of local time

```[command] | ts -u```

**Show incremental time** since program start

```[command] | ts -s```

**Show time elapsed** since last line

```[command] | ts -i```

**Custom timestamp format**

```[command] | ts '[%Y-%m-%d %H:%M:%S]'```

**Convert existing timestamps** to relative times

```[command] | ts -r```

# SYNOPSIS

**ts** [**-imsu**] [**-r**] [_format_]

# PARAMETERS

**-i**
> Show incremental time elapsed since last timestamp

**-s**
> Show time elapsed since program start

**-m**
> Include milliseconds in timestamps

**-u**
> Use UTC time instead of local time

**-r**
> Convert existing timestamps to relative times (e.g., "15m5s ago")

_format_
> Custom strftime format (default: "%b %d %H:%M:%S")

# DESCRIPTION

**ts** reads lines from standard input, prepends a timestamp to each line, and writes to standard output. It is part of the **moreutils** package and is useful for logging, debugging, and monitoring command output over time.

The default timestamp format is "**%b %d %H:%M:%S**" (e.g., "Jan 22 14:30:45"). Custom formats use strftime conversion specifications. Extended specifiers **%.S**, **%.s**, and **%.T** provide subsecond resolution.

The **-s** option shows cumulative time since ts started, useful for measuring total elapsed time. The **-i** option shows time between lines, helpful for identifying slow operations in pipelines.

The **-r** option converts existing timestamps in the input to human-readable relative times, supporting many common timestamp formats.

# EXAMPLES

**Monitor log file with timestamps**
```
tail -f /var/log/syslog | ts
```

**Time each line of a build process**
```
make 2>&1 | ts -i '[%H:%M:%S]'
```

**Track total script runtime**
```
./long_script.sh | ts -s '%.T'
```

# CAVEATS

ts requires the **moreutils** package, which may not be installed by default. The command buffers output, which can cause slight delays when used with slowly producing commands. Timestamps reflect when ts receives each line, not when the original command produced it.

# HISTORY

**ts** was written by **Joey Hess** as part of **moreutils**, a collection of Unix utilities. Moreutils was first released around **2006** to provide additional tools that complement the standard coreutils, filling gaps in common command-line workflows.

# SEE ALSO

[date](/man/date)(1), [strftime](/man/strftime)(3), [sponge](/man/sponge)(1), [chronic](/man/chronic)(1)
