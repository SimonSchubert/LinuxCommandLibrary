# TAGLINE

Terminal-based tool for displaying GPU usage stats on Linux

# TLDR

**Launch the GPU monitor TUI**, with full stats as root

```sudo qmassa```

Show only a **specific GPU**

```sudo qmassa -d [0000:03:00.0]```

Show only the **process tree of a PID**

```sudo qmassa -p [pid]```

**Update every second** and stop after 5 updates

```sudo qmassa -m 1000 -n 5```

**Save stats** to a JSON file

```sudo qmassa -t [output.json]```

Save stats **without the TUI**

```sudo qmassa -x -t [output.json]```

**Replay** data from a JSON file

```qmassa replay -j [stats.json]```

**Plot SVG charts** from a JSON file

```qmassa plot -j [stats.json] -o [prefix]```

# SYNOPSIS

**qmassa** [_options_]

**qmassa** **replay** **-j** _file_

**qmassa** **plot** **-j** _file_ **-o** _prefix_ [**-d** _devices_] [**-c** _charts_]

# PARAMETERS

**-d**, **--dev-slots** _DEVICES_
> Show only specific devices, as a comma-separated list.

**-p**, **--pid** _PID_
> Base process for the process tree. qmassa exits when it ends.

**-m**, **--ms-interval** _MS_
> Interval between updates. Default: 1500.

**-n**, **--nr-iterations** _N_
> Number of stats updates. Default: -1 (unlimited).

**-a**, **--all-clients**
> Show all DRM clients, including inactive ones.

**-g**, **--group-by-pid**
> Group DRM client stats by PID.

**-s**, **--show-pciid**
> Show PCI ID numbers instead of names.

**-w**, **--all-sensors**
> Show all temperature and fan sensors.

**-t**, **--to-json** _FILE_
> Save stats to a JSON file.

**-x**, **--no-tui**
> Run with no TUI rendering.

**-l**, **--log-file** _FILE_
> File to log to when RUST_LOG is used.

**-o**, **--drv-options** _OPTIONS_
> Options for the DRM driver, can be passed multiple times.

# COMMANDS

**replay** **-j**, **--json-file** _FILE_
> Replay recorded stats in the TUI.

**plot** **-j**, **--json-file** _FILE_ **-o**, **--out-prefix** _PREFIX_
> Plot SVG charts. **-d** limits devices and **-c** selects charts: meminfo, engines, freqs, power, temps or fans.

# DESCRIPTION

**qmassa** is a terminal-based tool for displaying GPU usage statistics on Linux. It shows device information and DRM client processes using the GPU. It supports recording stats to JSON, replaying recorded data, and generating SVG charts for visualization.

The same project also provides **qmmd**, a Prometheus HTTP endpoint exporting GPU usage metrics.

# CAVEATS

Requires Linux kernel 6.8 or later for full usage stats. Needs libudev development packages to compile. Non-root users must be in at least the video, render and power groups, and see limited information; whole-system engine usage requires root.

# HISTORY

**qmassa** was created by **Ulisses Furquim** (ulissesf) and is written in **Rust**.

# SEE ALSO

[nvtop](/man/nvtop)(1), [nvidia-smi](/man/nvidia-smi)(1), [radeontop](/man/radeontop)(1)

# RESOURCES

```[Source code](https://github.com/ulissesf/qmassa)```

<!-- verified: 2026-11-09 -->
