# TLDR

**Start web interface**

```pprof -http=[localhost:8080] [profile.pb.gz]```

**Show top functions**

```pprof -top [profile.pb.gz]```

**Show call graph as text**

```pprof -text [profile.pb.gz]```

**Show call graph as PDF**

```pprof -pdf [profile.pb.gz] > [profile.pdf]```

**Profile from running server**

```pprof -http=[localhost:8080] [http://localhost:6060/debug/pprof/profile]```

**Compare two profiles**

```pprof -base [baseline.pb.gz] [current.pb.gz]```

**Focus on specific function**

```pprof -focus=[FunctionName] [profile.pb.gz]```

# SYNOPSIS

**pprof** [_-http addr_] [_-top_] [_-text_] [_-pdf_] [_-focus pattern_] [_options_] _source_

# PARAMETERS

**-http** _ADDR_
> Start web server.

**-top**
> Show top functions.

**-text**
> Text report.

**-pdf**
> PDF output.

**-svg**
> SVG output.

**-png**
> PNG output.

**-web**
> Open in browser.

**-focus** _REGEX_
> Focus on matching functions.

**-ignore** _REGEX_
> Ignore matching functions.

**-base** _PROFILE_
> Compare against baseline.

**-seconds** _N_
> Profile duration.

**-sample_index** _IDX_
> Sample type (cpu, alloc, etc.).

**-lines**
> Show line-level info.

# DESCRIPTION

**pprof** analyzes and visualizes performance profiles from Go programs and other sources. It shows where programs spend time and memory.

The web interface provides interactive exploration. Flame graphs show call hierarchies. Graph views display caller/callee relationships.

Profiles capture CPU usage, memory allocations, goroutine counts, and custom metrics. Go's runtime/pprof package generates these profiles.

Live profiling connects to running servers through HTTP endpoints. The standard /debug/pprof/ path provides various profile types.

Comparison mode highlights changes between profiles. This identifies performance regressions or improvements after code changes.

Focus and ignore filters narrow analysis to specific areas. Regular expressions match function names for targeted investigation.

# CAVEATS

Requires graphviz for graph generation. CPU profiles need sufficient sample time. Memory profiles may need multiple collections. Profile size grows with sampling.

# HISTORY

**pprof** was developed at **Google** for profiling production systems. The Go version is maintained as part of the Go project. It originated from Google's internal profiling tools and gperftools.

# SEE ALSO

[go tool pprof](/man/go-tool-pprof)(1), [perf](/man/perf)(1), [flamegraph](/man/flamegraph)(1)
