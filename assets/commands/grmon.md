# TAGLINE

Terminal monitor for Go process goroutines via pprof

# TLDR

**Connect** to default local pprof endpoint

```grmon```

**Connect** to a specific host and port

```grmon -host [localhost:6060]```

**Set refresh interval** in seconds (0 disables auto-refresh)

```grmon -i [2]```

**Use a custom pprof path**

```grmon -endpoint [/debug/pprof]```

# SYNOPSIS

**grmon** [**-i** *seconds*] [**-host** *host:port*] [**-endpoint** *path*]

# DESCRIPTION

**grmon** is an interactive terminal UI for watching goroutines in a running Go program. The target process must expose Go's **net/http/pprof** endpoints (or start the small **grmon** agent). **grmon** polls the profile endpoint and displays goroutine counts and stacks; you can pause refresh, filter, sort, and expand individual traces.

Default target is **localhost:1234** with path **/debug/pprof**. In the target app, either call **grmon.Start()** from the agent package or serve pprof yourself (for example **http.ListenAndServe(":6060", nil)** with **_ "net/http/pprof"** imported).

# PARAMETERS

**-i** *seconds*

> Refresh interval (default: 5). **0** disables automatic refresh.

**-host** *host:port*

> Target host (default: **localhost:1234**).

**-endpoint** *path*

> pprof base path (default: **/debug/pprof**).

Interactive keys include **r** refresh, **p** pause, **s** sort, **f** filter, arrows/**j**/**k** move, Enter expand, **t** full-screen trace, **q** quit.

# CAVEATS

The target must expose pprof; binding pprof to a public interface is a security risk. Stack collection has runtime cost. **go get** install paths may differ by Go module mode—prefer current module install instructions from the repository.

# INSTALL

```nix: nix profile install nixpkgs#grmon```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[go](/man/go)(1), [pprof](/man/pprof)(1), [top](/man/top)(1)

# RESOURCES

```[Source code](https://github.com/bcicen/grmon)```

<!-- verified: 2026-07-19 -->
