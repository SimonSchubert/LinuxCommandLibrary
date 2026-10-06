# TAGLINE

Monitor openTPU FPGA cards: bitstream, temperature, power, DRAM, and utilization

# TLDR

**Show** every attached card

```otpu-smi```

Refresh **every second**

```otpu-smi -l [1]```

**JSON** for one sample

```otpu-smi --json```

**Full** dump including raw counters

```otpu-smi -q```

One **device**

```otpu-smi --dev [/dev/xdma1]```

**Skip I2C** sensors (measured power and board temperature)

```otpu-smi --no-i2c```

**Verilator** board model (no card)

```otpu-smi --sim```

**Synthetic** counters for a demo

```otpu-smi --fake```

# SYNOPSIS

**otpu-smi** [_options_]

# DESCRIPTION

**otpu-smi** is the nvidia-smi-style status tool for **openTPU** cards. It prints one table per `/dev/xdma*_user` device: bitstream identity (D, MCOLS, LANES, build id, core clock), PCIe link, DDR3 calibration, temperature, power, DRAM use (including KV cache when a runner has published it), DRAM bandwidth, per-unit utilization, and the process that holds the card.

The tool only reads registers (and writes **SNAP**, which latches free-running counters into shadows). It never takes the device lock, so it can run next to **otpu-chat**. Utilization is the counter delta between two SNAPs over the uptime delta (default sample gap **0.2** s; with **-l** the gap is the loop period). Process, model, DRAM, and tok/s come from the runner's status file.

Power is measured over the card's I2C buses when the bitstream exposes I2C pins and a PMBus device answers. Otherwise it is an estimate from the matching Vivado power report, labelled as an estimate. Register map 1 bitstreams have no counters, temperature, or power estimate.

**--sim** runs the Verilator board model (bring-up demo program between two samples). **--fake** uses an in-memory card with synthetic counters.

# PARAMETERS

**--dev** _path_
> XDMA device prefix, for example `/dev/xdma0`. Repeatable. Default: every `/dev/xdma*_user`.

**-l**, **--loop** _SEC_
> Repeat every _SEC_ seconds; utilization is measured over each period.

**--json**
> Print a JSON list, one object per device.

**-q**, **--query**
> Verbose dump of every field, including raw counters.

**-i**, **--interval** _SEC_
> Seconds between the two counter samples when not looping (default **0.2**).

**--power-json** _file_
> Vivado power summary used for the estimate (default `build/vivado/reports/power.json` in the repository, or the report whose directory matches the loaded **BUILD_ID**).

**--sim**
> Query the Verilator board model instead of hardware.

**--sim-idle** _CYCLES_
> With **--sim**, sample an idle window of _CYCLES_ instead of running the demo program.

**--no-i2c**
> Do not read I2C sensors (measured power, board temperature).

**--fake**
> In-memory card with synthetic counters (demo and tests).

# CAVEATS

Real-card output needs the XDMA character devices and a bitstream that identifies as openTPU; a down link reports registers as `0xffffffff`. DRAM bars and tok/s are **n/a** unless a host runner (typically **otpu-chat**) has published status. Power estimates need a Vivado `power.json` for that bitstream. I2C scans can fail if another process holds the I2C lock. **--sim** and **--fake** do not talk to hardware. The tool is installed only via `pip install -e .` in the openTPU tree.

# HISTORY

**otpu-smi** is part of the **openTPU** host tools (Apache-2.0, FeSens). It was added so a second terminal can watch utilization and DRAM bandwidth while **otpu-chat** holds the card, mirroring the **nvidia-smi** workflow.

# SEE ALSO

[otpu-chat](/man/otpu-chat)(1), [otpu-lens](/man/otpu-lens)(1), [nvidia-smi](/man/nvidia-smi)(1), [nvtop](/man/nvtop)(1)

# RESOURCES

```[Source code](https://github.com/FeSens/openTPU)```

```[Documentation](https://github.com/FeSens/openTPU/blob/main/README.md)```

<!-- verified: 2026-10-06 -->
