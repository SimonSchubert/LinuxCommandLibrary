# TAGLINE

Terminal-based tool for displaying GPU usage stats on Linux

# TLDR

**Launch the GPU monitor TUI**

```qmassa```

**Save stats to a JSON file**

```qmassa --json [output.json]```

**Replay data from a JSON file**

```qmassa --replay [stats.json]```

**Plot SVG charts from a JSON file**

```qmassa --plot [stats.json]```

# SYNOPSIS

**qmassa** [_options_]

# PARAMETERS

**--json** _FILE_
> Save GPU stats to a JSON file.

**--replay** _FILE_
> Replay previously recorded stats in the TUI.

**--plot** _FILE_
> Generate SVG charts from recorded JSON data.

# DESCRIPTION

**qmassa** is a terminal-based tool for displaying GPU usage statistics on Linux. It shows device information and DRM client processes using the GPU. It supports recording stats to JSON, replaying recorded data, and generating SVG charts for visualization.

# CAVEATS

Requires Linux kernel 6.8 or later for full usage stats. Needs libudev development packages to compile.

# HISTORY

**qmassa** was created by **Ulisses Furquim** (ulissesf) and is written in **Rust**.

# SEE ALSO

[nvtop](/man/nvtop)(1), [nvidia-smi](/man/nvidia-smi)(1), [radeontop](/man/radeontop)(1)
