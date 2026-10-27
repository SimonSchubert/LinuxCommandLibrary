# TAGLINE

Linux hardware report and live sensor dashboard

# TLDR

**Open** the live dashboard

```sio```

Poll **twice a second**

```sio --interval [500]```

**One-shot** CPU report

```sio cpu```

Sensors as **JSON**

```sio sensors -f [json]```

A self-contained **HTML** report

```sio -f [html] > [report.html]```

**Log** samples to CSV while the dashboard runs

```sio --log [sensors.csv]```

Storage, including SMART, **as root**

```sudo sio storage```

# SYNOPSIS

**sio** [_options_] [_command_]

# COMMANDS

With no command, **sio** opens the TUI. Each command below prints one report and takes no extra arguments. Global options still apply.

**cpu**
> Processors, frequencies, and utilization.

**gpu**
> GPU identity, clocks, temperature, power, and memory when the driver exposes them.

**memory**
> Memory inventory. Per-DIMM details need **dmidecode**.

**storage**
> Disks. SMART and NVMe health need root.

**network**
> Interfaces and throughput.

**pci**
> PCI devices, with names from the built-in PCI ID database.

**pcie**
> Negotiated link generation and width against each device's maximum.

**usb**
> USB tree, with vendor and product ids.

**audio**
> Audio devices.

**battery**
> Charge, wear, cycle count, and chemistry on laptops.

**board**
> Board and firmware identity.

**sensors**
> Snapshot of kernel hwmon sensors.

# PARAMETERS

**-f**, **--format** _text_|_json_|_xml_|_html_
> Output format. The default is **text**. **html** is a self-contained report.

**-m**, **--monitor**
> Open the live dashboard. That is already the default when no command is given.

**--interval** _MS_
> Poll period in milliseconds. The default is **1000**.

**--no-nvidia**
> Skip NVIDIA Management Library probes.

**--direct-io**
> Read Super I/O through **/dev/sinfo_io**, or **/dev/port** when that device is absent. This needs root, or membership in the **siomon** group with the matching udev rule.

**--show-empty**
> Include sensors that currently have no value.

**--log** _PATH_
> Append CSV samples while monitoring.

**--alert** _RULE_
> Repeatable threshold. Example:

```
sio --alert "hwmon/nct6798/temp1 > 80 @30s"
```

**--color** _auto_|_always_|_never_
> When to colorize text output. The default is **auto**.

# DESCRIPTION

**sio** is the command installed by the **siomon** project: one static binary for Linux hardware inventory and live sensor monitoring. The dashboard polls kernel-exported sensors and tracks min, max, and average for the session. One-shot commands read CPU, GPU, memory, storage, network, PCI, PCIe, USB, audio, battery, board, and sensors.

GPU data comes from sysfs and, on NVIDIA, from **libnvidia-ml.so.1**. AMD data comes from sysfs. Tegra boards expose integrated GPU frequency and hardware-engine clocks. Disk temperatures need the **drivetemp** module. CPU TDP, turbo ratios, and RAPL power need the **msr** module. SPD timings need **i2c-dev**.

**sio** runs without root and omits fields it cannot read. Root adds full DMI serials, SMART, NVMe health, MSR, RAPL, and SPD. Those fields are marked when elevation is required.

# KEYS

**q** / **Esc**
> Quit, or clear an active filter.

**/**
> Start a filter. **Enter** applies it. **Esc** clears it.

**Up** / **Down** / **j** / **k**
> Move between sensor groups.

**Enter** / **Space**
> Collapse or expand the current group.

**c** / **e**
> Collapse all groups, or expand them.

**PageUp** / **PageDown**
> Scroll 20 rows. **Home** and **End** jump to the ends.

# CONFIGURATION

**~/.config/siomon/config.toml**

> Used for any setting the command line did not set: format, color, poll interval in milliseconds, whether NVIDIA probes are skipped, and sensor label overrides.

# CAVEATS

Linux only. There is no required library at runtime; optional data disappears when the matching module or tool is absent. **--direct-io** cannot see Super I/O chips until **/dev/sinfo_io** or **/dev/port** is readable. On an ASRock Z890 Nova WiFi, board fan telemetry from the NCT6686D-class controller needs the in-tree **nct6683** driver loaded with **force=1**, and only when that matches the board:

```
sudo modprobe nct6683 force=1
```

# HISTORY

**sio** is the **siomon** binary from Level1Techs. It is written in Rust and licensed under MIT.

# INSTALL

```aur: yay -S siomon```

```nix: nix profile install nixpkgs#siomon```

<!-- packages: 2026-10-27 -->

# SEE ALSO

[sensors](/man/sensors)(1), [inxi](/man/inxi)(1), [lshw](/man/lshw)(1), [dmidecode](/man/dmidecode)(1), [smartctl](/man/smartctl)(1), [hwinfo](/man/hwinfo)(1)

# RESOURCES

```[Source code](https://github.com/level1techs/siomon)```

<!-- verified: 2026-10-27 -->
