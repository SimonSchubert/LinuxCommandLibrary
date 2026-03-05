# TAGLINE

Interactive terminal UI for Go pprof profiling data

# TLDR

**Analyze a CPU profile**

```pproftui [cpu.prof]```

**Focus on your module's code**

```pproftui --module-path=[github.com/your/project] [cpu.prof]```

**Live-fetch CPU profiles from a running server**

```pproftui -live=[http://localhost:6060/debug/pprof/profile?seconds=5] -refresh=[10s]```

# SYNOPSIS

**pproftui** [_options_] [_profile_file_]

# PARAMETERS

**--module-path** _PATH_
> Focus on code from the specified Go module path.

**-live** _URL_
> Fetch profiles from a running HTTP pprof endpoint.

**-refresh** _DURATION_
> Refresh interval for live profiling.

# DESCRIPTION

**pproftui** is a terminal-based UI for Go's pprof that makes profiling interactive and intuitive. It provides integrated source code and call graph views with an option to hide Go runtime functions. Its diffing feature highlights resource usage changes between profiles using color-coded indicators.

# CAVEATS

Only works with Go pprof profile data.

# HISTORY

**pproftui** was created by **Oloruntobi1** and is written in **Go**.

# SEE ALSO

[go](/man/go)(1), [pprof](/man/pprof)(1)
