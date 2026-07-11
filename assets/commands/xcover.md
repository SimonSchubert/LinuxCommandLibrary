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

It supports daemon mode so you can start tracing, execute arbitrary test suites or manual runs, then stop and obtain a report of which functions were exercised. Stripped Go binaries can still be symbolized via `.gopclntab`; other stripped binaries can use `--debug-path` for a separate debug file.

# COMMANDS

**run**
> Start profiling. Key flags: `--detach`/`-d`, `--path`/`-p`, `--pid`, `--include`/`--exclude` regexes, `--scope` (`binary` or `project` for Go modules), `--report`, `--debug-path`, `--no-build-id-check`, `--verbose`.

**wait**
> Block until the profiler is fully initialized and tracing.

**status**
> Show whether the profiler daemon is running.

**stop**
> Stop the daemon and finalize results/report (`xcover-report.json` when reporting is enabled).

# PARAMETERS

**--path** _EXE_PATH_
> ELF executable to profile.

**--pid** _PID_
> Filter by process ID.

**--include** / **--exclude** _regex_
> Include or exclude function symbol names.

**--scope** binary|project
> All functions (default) or only the producing Go module's symbols.

**--report**
> Write JSON coverage report (default true on run).

**--debug-path** _path_
> Separate debug/symbol file for stripped non-Go binaries.

**--detach**
> Run as a background daemon.

# CAVEATS

- Requires a Linux kernel with eBPF support and appropriate permissions (usually root or CAP_BPF).
- Stripped binaries need language-specific fallbacks (`.gopclntab` for Go) or separate debug info.
- Measures function coverage at the binary level, not line/branch coverage inside functions.
- Single-file `go build main.go` binaries lack module metadata; project scope falls back to binary scope.

# SEE ALSO

[bpftrace](/man/bpftrace)(8), [perf](/man/perf)(1)

# RESOURCES

```[Source code](https://github.com/maxgio92/xcover)```

```[Documentation](https://github.com/maxgio92/xcover#readme)```

<!-- verified: 2026-07-11 -->
