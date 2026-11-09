# TAGLINE

Terminal-based flamegraph viewer

# TLDR

**View** a profile

```flameshow [profile.out]```

**View** Brendan Gregg folded stacks

```flameshow [stacks.folded]```

**View** a Go goroutine dump from pprof

```curl [http://localhost:9100/debug/pprof/goroutine] -o [goroutine.out] && flameshow [goroutine.out]```

**View** a profile from stdin

```cat [profile] | flameshow -```

**Write debug logs** to a file

```flameshow -l [path/to/log] -vvv [profile]```

# SYNOPSIS

**flameshow** [_options_] _profile_

# PARAMETERS

_profile_
> Profile file to open, or **-** for stdin

**-v**, **--verbose**
> Increase log verbosity; repeat for more

**-l**, **--log-to** _file_
> Write logs to a file (default: no logs)

**--version**
> Display version and exit

**--help**
> Display help and exit

# DESCRIPTION

**flameshow** is a terminal flamegraph viewer written in Python with Textual. It renders flamegraphs in the terminal, supports zooming and percentages, and can switch between sample types. All operations are available from the keyboard and the mouse.

Supported formats are Go pprof, Brendan Gregg's folded stacks, Python **austin** output, Speedscope (evented and sampled profiles) and the Google Trace Event format.

# KEYBINDINGS

**h**, **j**, **k**, **l** or arrow keys
> Move around

**Enter**
> Zoom in

**Esc**
> Zoom out

**q**
> Quit

# CAVEATS

Requires Python 3.10 or later. There is no standard profile format, so output from other profilers may not be recognized.

# HISTORY

**flameshow** was created by **laixintao**. Its renderer is available separately as the **flamegraph-textual** package.

# SEE ALSO

[flamelens](/man/flamelens)(1), [flamegraph](/man/flamegraph)(1), [py-spy](/man/py-spy)(1), [perf](/man/perf)(1), [pprof](/man/pprof)(1)

# RESOURCES

```[Source code](https://github.com/laixintao/flameshow)```

<!-- verified: 2026-11-09 -->
