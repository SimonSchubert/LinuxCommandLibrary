# TAGLINE

Interactive terminal UI for Go pprof profiling data

# TLDR

**Analyze a CPU profile**

```pproftui [cpu.prof]```

**Compare two profiles** to find a regression

```pproftui [base.prof] [new.prof]```

**Highlight your module's code**, then press p to hide the rest

```pproftui --module-path=[github.com/your/project] [cpu.prof]```

**Live-fetch CPU profiles** from a running server

```pproftui -live="[http://localhost:6060/debug/pprof/profile?seconds=5]" -refresh=[10s]```

# SYNOPSIS

**pproftui** [_options_] _profile_ [_new_profile_]

**pproftui** **-live** _url_ [**-refresh** _duration_]

# PARAMETERS

**--module-path** _PATH_
> Root module path of your project, used to highlight its code.

**-live** _URL_
> Poll profiles from a running HTTP pprof endpoint.

**-refresh** _DURATION_
> Refresh interval for live mode. Default: 5s.

# DESCRIPTION

**pproftui** is a terminal-based UI for Go's pprof that makes profiling interactive and intuitive. It provides integrated source code and call graph views with an option to hide Go runtime functions. Its diffing feature highlights resource usage changes between profiles using color-coded indicators.

Keys: **t** toggles the profile type, **c** switches between source and call graph, **p** toggles project-only code, **s** cycles the sort order, **f** toggles the flame graph, **space** pauses live updates, **F1** shows help and **q** quits.

# CAVEATS

Only works with Go pprof profile data.

# HISTORY

**pproftui** was created by **Oloruntobi1** and is written in **Go**.

# SEE ALSO

[go](/man/go)(1), [pprof](/man/pprof)(1)

# RESOURCES

```[Source code](https://github.com/Oloruntobi1/pproftui)```

<!-- verified: 2026-11-09 -->
