# TLDR

**Start zenith**

```zenith```

**Refresh at custom interval**

```zenith --refresh-rate [500]```

**Start with specific database**

```zenith --db [/path/to/zenith.db]```

**Disable GPU monitoring**

```zenith --disable-gpu```

**Use specific graphics mode**

```zenith --graphics-mode [plain]```

# SYNOPSIS

**zenith** [_options_]

# PARAMETERS

**-d**, **--db** _path_
> History database path.

**-r**, **--refresh-rate** _ms_
> Refresh rate in milliseconds. Default: 2000.

**--disable-gpu**
> Disable GPU monitoring.

**--graphics-mode** _mode_
> Graphics mode: unicode (default), plain.

**-p**, **--process** _mode_
> Process display: cpu, mem, top.

**--cpu-height** _rows_
> CPU chart height.

**--net-height** _rows_
> Network chart height.

**--disk-height** _rows_
> Disk chart height.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# KEYBOARD COMMANDS

**q**
> Quit.

**Tab**
> Switch focus between sections.

**Up**/**Down** or **j**/**k**
> Navigate process list.

**/**
> Filter processes.

**+**/**-**
> Zoom charts.

**g**/**G**
> Go to top/bottom of process list.

**e**
> Expand/collapse disk section.

**p**
> Pause updates.

**c**
> Toggle CPU view modes.

**m**
> Toggle memory view modes.

# DESCRIPTION

**zenith** is a terminal system monitor focusing on historical data visualization. It stores metrics in SQLite for reviewing past system state.

The interface displays CPU, memory, network, disk, and GPU metrics with sparkline charts. Process list shows current system activity with sorting and filtering.

Historical data stored in the SQLite database allows viewing past system behavior. Navigate time with zoom controls. Default location is **~/.zenith.db**.

GPU monitoring supports NVIDIA (nvidia-smi) and AMD (amdgpu). Enable at compile time or check build features. Use **--disable-gpu** if unavailable.

The refresh rate controls how often metrics update. Lower values provide smoother animation but higher CPU usage.

# CAVEATS

GPU support depends on drivers and hardware. Database can grow over time. Some metrics may be platform-specific. Unicode graphics require compatible terminal.

# HISTORY

zenith was created by **Benjamin Sago** (bensadeh) and first released around **2019**. Written in Rust, it was designed to combine real-time monitoring with historical analysis. The project distinguishes itself from other monitors by storing and visualizing historical metrics.

# SEE ALSO

[htop](/man/htop)(1), [btm](/man/btm)(1), [gtop](/man/gtop)(1), [glances](/man/glances)(1)
