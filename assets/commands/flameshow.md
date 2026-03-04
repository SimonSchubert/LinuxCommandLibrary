# TAGLINE

Terminal-based flamegraph viewer

# TLDR

**View** a flamegraph file

```flameshow [profile.json]```

**View** folded stacks

```flameshow [stacks.folded]```

**View** from stdin

```cat [profile] | flameshow```

# SYNOPSIS

**flameshow** [_options_] [_file_]

# PARAMETERS

**-h, --help**
> Display help and exit

**--version**
> Display version and exit

**--theme** _THEME_
> Color theme: dark, light

# DESCRIPTION

**flameshow** is a Python-based terminal flamegraph viewer. It allows users to visualize profiling data directly in the terminal, making it easy to analyze performance data without leaving the command line.

The tool supports various profile formats and provides an interactive TUI for exploring flamegraphs, identifying hotspots, and understanding application performance.

# KEYBINDINGS

**↑/↓**
> Navigate through frames

**Enter**
> Expand/collapse frame

**q**
> Quit

**?**
> Show help

# CAVEATS

Requires Python environment. May not support all profiler output formats. Performance depends on terminal capabilities. Large profiles may impact rendering speed.

# HISTORY

**flameshow** was developed as an alternative to browser-based flamegraph viewers, focusing on terminal-native display and quick profile inspection.

# SEE ALSO

[flamelens](https://github.com/YS-L/flamelens), [flamegraph](https://github.com/brendangregg/FlameGraph), [py-spy](https://github.com/benfred/py-spy)
