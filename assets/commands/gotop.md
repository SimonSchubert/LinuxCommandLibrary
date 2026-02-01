# TLDR

**Start gotop**

```gotop```

**Use specific color scheme**

```gotop -c [monokai]```

**Show per-CPU usage**

```gotop -p```

**Use minimal layout**

```gotop -m```

**Show battery widget**

```gotop -b```

**Set update interval**

```gotop -r [500ms]```

**Disable CPU graph**

```gotop --no-cpu```

**Use specific network interface**

```gotop -i [eth0]```

# SYNOPSIS

**gotop** [_options_]

# PARAMETERS

**-c**, **--color** _scheme_
> Color scheme: default, monokai, solarized, vice, etc.

**-p**, **--percpu**
> Show each CPU core separately.

**-a**, **--averagecpu**
> Show average CPU usage.

**-m**, **--minimal**
> Minimal terminal UI.

**-b**, **--battery**
> Show battery widget.

**-r**, **--rate** _duration_
> Update interval. Default: 1s.

**-i**, **--interface** _name_
> Network interface filter.

**-l**, **--layout** _file_
> Custom layout file.

**--no-cpu**
> Disable CPU widget.

**--no-disk**
> Disable disk widget.

**--no-mem**
> Disable memory widget.

**--no-net**
> Disable network widget.

**-V**, **--version**
> Display version information.

**-h**, **--help**
> Display help information.

# KEYBOARD COMMANDS

**q**, **Ctrl+c**
> Quit.

**Tab**
> Move to next widget.

**j**/**k** or **Down**/**Up**
> Scroll process list.

**g**/**G**
> Go to top/bottom of list.

**d**
> Kill selected process.

**/**
> Filter processes.

**h**
> Toggle help.

**c**
> Sort by CPU.

**m**
> Sort by memory.

**p**
> Sort by PID.

# DESCRIPTION

**gotop** is a terminal-based graphical activity monitor inspired by gtop and vtop. It displays CPU, memory, disk, network, and process information with ASCII graphs.

The interface shows widget panels with real-time metrics. CPU displays cores or average usage. Memory shows RAM and swap. Network shows bandwidth per interface.

Color schemes change the appearance. Built-in schemes include monokai, solarized, vice, and more. Custom themes can be defined in configuration.

Custom layouts with **-l** allow rearranging and resizing widgets. Layout files define widget placement in YAML format.

Process sorting supports CPU, memory, and PID columns. Filter with **/** and kill with **d**. The process list scrolls independently.

# CAVEATS

GPU monitoring not available in the maintained fork. Some metrics may be platform-specific. Battery widget requires supported hardware. High update rates increase CPU usage.

# HISTORY

gotop was originally created by **Caleb Bassi** (cjbassi) in **2018** as a Go rewrite of gtop. The original project was archived in **2020**. A community fork maintained by **xxxserxxx** continues development with additional features and fixes. gotop brought the visual monitor style to Go with cross-platform support.

# SEE ALSO

[htop](/man/htop)(1), [btm](/man/btm)(1), [gtop](/man/gtop)(1), [zenith](/man/zenith)(1)
