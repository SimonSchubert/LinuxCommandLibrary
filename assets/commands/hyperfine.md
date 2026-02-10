# TAGLINE

command-line benchmarking tool that measures command execution time

# TLDR

**Benchmark a command**

```hyperfine '[sleep 0.3]'```

**Compare multiple commands**

```hyperfine '[command1]' '[command2]' '[command3]'```

**Run warmup iterations** before timing

```hyperfine --warmup [3] '[command]'```

**Set minimum number of runs**

```hyperfine --min-runs [20] '[command]'```

**Run setup command** before each benchmark

```hyperfine --prepare '[make clean]' '[make]'```

**Export results to JSON**

```hyperfine '[command]' --export-json [results.json]```

**Benchmark with parameter range**

```hyperfine -P threads 1 8 '[./program --threads {threads}]'```

**Ignore command failures**

```hyperfine --ignore-failure '[command]'```

# SYNOPSIS

**hyperfine** [_options_] _command_ [_command ..._]

# PARAMETERS

**-w**, **--warmup** _n_
> Run n warmup iterations before timing.

**-m**, **--min-runs** _n_
> Minimum number of runs (default: 10).

**-M**, **--max-runs** _n_
> Maximum number of runs.

**-r**, **--runs** _n_
> Exact number of runs.

**-p**, **--prepare** _cmd_
> Command to run before each timing run.

**-c**, **--cleanup** _cmd_
> Command to run after each timing run.

**-s**, **--setup** _cmd_
> Command to run once before all benchmarks.

**-P**, **--parameter-scan** _var start end_
> Run benchmark for parameter range.

**-L**, **--parameter-list** _var_ _vals_
> Run benchmark for comma-separated values.

**-S**, **--shell** _shell_
> Shell to use (default: system default).

**-N**
> No shell, run command directly.

**--ignore-failure**
> Continue on non-zero exit codes.

**--export-json** _file_
> Export to JSON.

**--export-csv** _file_
> Export to CSV.

**--export-markdown** _file_
> Export to Markdown.

**--show-output**
> Show command output.

**--style** _type_
> Output style: auto, full, basic, nocolor, color, none.

# DESCRIPTION

**hyperfine** is a command-line benchmarking tool that measures command execution time with statistical analysis. It provides accurate measurements by running commands multiple times and calculating mean, standard deviation, min, max, and relative comparisons.

The tool automatically determines the optimal number of runs based on variance, ensuring statistically meaningful results. Warmup runs help account for cache effects and JIT compilation in interpreted languages.

When comparing multiple commands, hyperfine shows relative speedup/slowdown ratios. Color-coded output highlights the fastest command. This makes A/B testing of optimizations straightforward.

Parameter scanning enables benchmarking across value ranges without writing wrapper scripts. For example, testing thread counts from 1-16 with a single command. Results can be exported to JSON, CSV, or Markdown for further analysis or documentation.

The prepare option enables clean-state benchmarks (e.g., clearing caches or rebuilding). The shell option allows testing shell-specific features or running with minimal shell overhead using -N.

# CAVEATS

System load affects results - close other applications for accurate measurements. Warmup is important for JIT-compiled or cached operations. Very fast commands (< 5ms) may have significant measurement overhead. Statistical outliers can affect mean; check min/max values.

# HISTORY

**hyperfine** was created by David Peter (sharkdp) and released around **2018**. Written in Rust, it was designed as a more user-friendly and statistically rigorous alternative to shell-based benchmarking with **time**. It's part of a collection of modern CLI tools (including fd, bat, etc.) that improve on traditional Unix utilities.

# SEE ALSO

[time](/man/time)(1), [perf](/man/perf)(1), [bench](/man/bench)(1), [pv](/man/pv)(1)
