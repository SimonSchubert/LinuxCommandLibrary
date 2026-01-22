# TLDR

**Print** the last system startup time

```systemd-analyze```

**List** all running units ordered by initialization time

```systemd-analyze blame```

**Print** a tree of the time-critical chain of bootup units

```systemd-analyze critical-chain```

**Create** an SVG showing service startup timeline

```systemd-analyze plot > [path/to/file.svg]```

**Plot** a dependency graph to SVG

```systemd-analyze dot | dot -T svg > [path/to/file.svg]```

**Show** security scores of running units

```systemd-analyze security```

**View** all udev rules without comments

```systemd-analyze cat-config udev/rules.d --tldr```

# SYNOPSIS

**systemd-analyze** [_command_] [_options_]

# PARAMETERS

**blame**
> List units by startup time

**critical-chain**
> Show critical path of unit startup

**plot**
> Generate SVG plot of boot sequence

**dot**
> Generate dependency graph in DOT format

**security**
> Analyze security and sandboxing settings

**verify**
> Verify unit file syntax

**cat-config**
> Show merged configuration files

**time**
> Show boot timing summary (default)

# DESCRIPTION

**systemd-analyze** provides detailed information about system boot-up performance and systemd unit configurations. It helps identify slow-starting services and debug boot issues.

The **blame** and **critical-chain** commands are particularly useful for optimizing boot time by identifying bottlenecks. The **security** command audits unit sandboxing configurations.

# CAVEATS

Some commands require graphviz (dot) for visualization. Boot timing data is only available after system boots completely. Security scores are recommendations, not requirements.

# SEE ALSO

[systemctl](/man/systemctl)(1), [journalctl](/man/journalctl)(1), [systemd](/man/systemd)(1), [bootctl](/man/bootctl)(1)
