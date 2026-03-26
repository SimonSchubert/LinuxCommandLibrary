# TAGLINE

Interactive command-line benchmarking tool

# TLDR

**Benchmark** a single command with default 10 runs

```cmdperf "sleep 0.1"```

**Compare** two commands side-by-side

```cmdperf "grep 'ERROR' log.txt" "rg 'ERROR' log.txt"```

**Run** 100 iterations of a command

```cmdperf -n 100 "ls -la"```

**Simulate** 10 concurrent requests

```cmdperf -c 10 "curl -s https://example.com > /dev/null"```

**Run** for a fixed duration of 30 seconds

```cmdperf -d 30s "redis-cli PING"```

**Export** results to a markdown file

```cmdperf --markdown [results.md] "sleep 0.1" "sleep 0.2"```

# SYNOPSIS

**cmdperf** [_options_] _command_ [_command_...]

# PARAMETERS

**-n**, **--runs=**_N_
> Number of iterations to run (default: 10).

**-c**, **--concurrency=**_N_
> Number of parallel executions (default: 1).

**-d**, **--duration=**_DURATION_
> Run for a fixed duration instead of a fixed number of runs.

**-r**, **--rate=**_RATE_
> Target request rate in requests per second.

**-t**, **--timeout=**_DURATION_
> Per-command timeout (default: 1m).

**-s**, **--shell=**_SHELL_
> Shell to use for command execution (default: /bin/sh).

**--shell-opt=**_OPT_
> Shell option, repeatable (default: -c).

**-N**, **--no-shell**
> Execute command directly without wrapping in a shell.

**--csv=**_FILE_
> Export results to CSV file.

**--markdown=**_FILE_
> Export results to Markdown file.

**--fail-on-error**
> Exit with non-zero status if any command returns non-zero exit code.

**--color-scheme=**_SCHEME_
> Set color scheme (auto, catppuccin, tokyonight, nord, monokai, solarized, solarized-light, gruvbox, monochrome).

**--list-color-schemes**
> Display available color schemes.

**--version**
> Display version information.

# DESCRIPTION

**cmdperf** runs one or more shell commands repeatedly and gathers timing statistics, displaying them in a live terminal UI with a progress bar, ETA, and key metrics including mean execution time, standard deviation, and min/max ranges. It supports single command benchmarking, multi-command comparison, concurrent execution to simulate load, duration-based runs, and rate limiting for HTTP endpoint testing.

# CAVEATS

Designed for quick interactive benchmarking, not a replacement for rigorous statistical profiling tools. Default shell wrapping adds overhead; use **-N/--no-shell** for tighter measurements when shell features are not needed.

# HISTORY

**cmdperf** was created by **miklosn** and is written in Go under the MIT license. The latest release is v0.1.4 (January 2026). It fills a niche as a lightweight, interactive alternative to tools like **hyperfine**, with a focus on live TUI experience and concurrent execution simulation.

# SEE ALSO

[hyperfine](/man/hyperfine)(1), [time](/man/time)(1), [perf](/man/perf)(1)
