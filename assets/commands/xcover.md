# TAGLINE

eBPF-based functional test coverage profiler that works without instrumenting binaries

# TLDR

**Start** the profiler in daemon mode for a binary

```xcover run --detach --path /path/to/bin```

**Wait** until it is ready, then run tests

```xcover wait
/path/to/bin test1
/path/to/bin test2
xcover stop```

**Generate** a JSON coverage report

```xcover run --path myapp --report```

**Check** status or stop

```xcover status
xcover stop```

# SYNOPSIS

**xcover** <command> [options]

# DESCRIPTION

xcover uses kernel eBPF uprobes to trace function calls in any compiled ELF binary (Go, C, Rust, etc.) during test execution. No source changes or recompilation with coverage flags are required.

It supports daemon mode so you can start tracing, execute arbitrary test suites or manual runs, then stop and obtain a report of which functions were exercised.

# COMMANDS

**run**
> Start profiling (supports --detach for daemon, --path, --pid, filters, --report).

**wait**
> Block until the profiler is fully initialized and tracing.

**status**
> Show whether the profiler daemon is running.

**stop**
> Stop the daemon and finalize results/report.

# PARAMETERS

Important flags on `run` include `--path`, `--pid`, `--include`/`--exclude` regexes, `--scope` (binary or project for Go), `--report`, and debug/symbol options for stripped binaries.

# CAVEATS

- Requires a Linux kernel with eBPF support and appropriate permissions (usually root or CAP_BPF).
- Stripped binaries need language-specific fallbacks (`.gopclntab` for Go) or separate debug info.
- Measures function coverage at the binary level, not line/branch coverage inside functions.

# RESOURCES

```[Source code](https://github.com/maxgio92/xcover)```
```[Documentation](https://github.com/maxgio92/xcover#readme)```

<!-- verified: 2026-07-10 -->

# SEE ALSO

bpftrace(8), perf(1)