# TAGLINE

Terminal UI for controlling Lenovo Legion laptops on Linux

# TLDR

**Run** the TUI (needs root for sysfs/driver I/O)

```sudo legionlinuxtui```

**Build** from source and run

```go build -o build/```

```sudo ./build/legionlinuxtui```

**Run** without installing (from a checkout)

```sudo go run .```

# SYNOPSIS

**legionlinuxtui**

# DESCRIPTION

**legionlinuxtui** is a terminal user interface for Lenovo **Legion** laptops on Linux. It reads sensor data and exposes capability toggles (for example conservative mode and power mode) through a full-screen TUI, refreshing sensor information about every 100 ms.

It depends on the community **Lenovo Legion Linux** kernel drivers (sysfs interfaces) and on **lm_sensors** being set up correctly on the machine. The process needs elevated privileges to talk to drivers and write sysfs values — invoke with **sudo** (or equivalent).

Written in Go. Packaging is available via Nix (NUR / flake packages from the author); otherwise build with Go ≥ 1.24.4 from the repository.

# PARAMETERS

No command-line options are required. Launch the binary; interaction is entirely through the TUI.

# CAVEATS

Requires Lenovo Legion hardware supported by [LenovoLegionLinux](https://github.com/johnfanv2/LenovoLegionLinux) drivers, plus a working **sensors** setup. Must run with privileges sufficient for driver/sysfs I/O. Not a generic laptop control tool for non-Legion machines.

# HISTORY

**legionlinuxtui** is an open-source Go TUI maintained at **github.com/nooneknowspeter/legionlinuxtui** under the MIT license.

# SEE ALSO

[sensors](/man/sensors)(1), [sensors-detect](/man/sensors-detect)(8), [amdgpu_top](/man/amdgpu_top)(1), [nvtop](/man/nvtop)(1)

# RESOURCES

```[Source code](https://github.com/nooneknowspeter/legionlinuxtui)```

<!-- verified: 2026-08-02 -->
