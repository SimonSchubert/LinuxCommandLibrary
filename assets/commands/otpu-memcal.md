# TAGLINE

DDR3 LiteDRAM calibration status and host-driven calibration on an openTPU card

# TLDR

**Status**: CAPS, STATUS bits, core CPU, last run

```otpu-memcal```

**Calibrate** channels that are not ready yet

```otpu-memcal cal```

Redo **both channels** from the host

```otpu-memcal cal --force```

Let the core's **CPU** calibrate both channels again

```otpu-memcal selfcal```

Load **new firmware**, then self-calibrate

```otpu-memcal selfcal --firmware [selfcal.bin]```

A **named** XDMA device

```otpu-memcal --dev [/dev/xdma1]```

# SYNOPSIS

**otpu-memcal** [**status** | **cal** | **selfcal**] [**--force**] [**--stride** _N_] [**--firmware** _file_] [**--dev** _path_]

# DESCRIPTION

**otpu-memcal** is the DDR3 calibration tool for **openTPU** bitstreams whose memory controllers are **LiteDRAM** (CAPS bit27, register map 2 or later). After `pip install -e .` in the FeSens/openTPU tree it is installed as a console script (`opentpu.host.memcal:main`). Older **MIG** bitstreams calibrate themselves in hardware; this command then reports them as self-calibrating and has nothing to do.

LiteDRAM's PHY is calibrated through each controller's CSRs in the BAR0 window at **R_MEMCAL** (0x10000). Per channel the CK phase is scanned over one tCK with the channel's BIST as the traffic check, the phase is set to the centre of the window common to all nine byte lanes, write latency and read leveling are programmed, and the channel's ready bit (STATUS **CALIB0** / **CALIB1**) rises. The CSR map and init sequence ship in `opentpu/host/litedram` as `csr.csv` and `sdram_init.py`.

Two ways to run it:

**Core CPU** (`gen_core.py --selfcal`)
> A small CPU in the LiteDRAM core runs the algorithm at reset. **status** waits for it when it is still running. A channel the CPU failed is calibrated from the host (the CPU is held first).

**Host** (`cal`, or `cal --force`)
> The host holds the core's CPU if there is one, calibrates the channels, and leaves the CPU held so it does not run again behind the host's back. **selfcal** releases it so both channels calibrate again.

**Board()** in the host library calls **ensure()** so every tool that opens the card calibrates it once per configuration. The scan writes over each channel's first **64 MiB**, which holds nothing before calibration. The last result per device is `<run dir>/<device>.memcal.json`.

With no subcommand the tool prints **status**: controller kind, STATUS calibration bits, the core CPU's state and per-channel result, and the last **ensure()** run.

# PARAMETERS

**status**
> Print calibration state. Default when no subcommand is given.

**cal**
> Calibrate channels whose STATUS bit is still low. Exits **0** if both are already calibrated (use **--force** to redo). Exits **1** on **CalError**.

**selfcal**
> Hold, optionally load firmware, release, and wait for the core's CPU (up to 60 s). Exits **1** when the bitstream has no calibration CPU, or when any channel's state is not **ok**.

**--force**
> With **cal**: both channels, from the host, even if STATUS already says they are ready.

**--stride** _N_
> DQS scan stride in fine steps (default **1**).

**--firmware** _file_
> With **selfcal**: load this image (`tools/litedram/selfcal_fw/fw.py` target, typically `selfcal.bin`) into the CPU's memory first. It lasts until the FPGA is configured again.

**--dev** _path_
> XDMA device prefix (default `/dev/xdma0`).

# CAVEATS

A real card needs XDMA character devices and a LiteDRAM bitstream for **cal** / **selfcal** to do work. Opening **Board** with `calibrate=False` so this command can drive calibration still talks to hardware; there is no **--sim**. Host calibration overwrites the first 64 MiB of each channel. After **cal --force** the core CPU stays held until **selfcal**. The command is installed only via `pip install -e .` in the openTPU tree.

# HISTORY

**otpu-memcal** is part of the **openTPU** host tools (Apache-2.0, FeSens). Production YPCB-00338 images moved from MIG (hardware self-cal) to LiteDRAM; the host then either waits for the core's CPU or drives the same algorithm through CSRs, as described in `docs/litedram.md`.

# SEE ALSO

[otpu-ddr4](/man/otpu-ddr4)(1), [otpu-diag](/man/otpu-diag)(1), [otpu-selftest](/man/otpu-selftest)(1), [otpu-smi](/man/otpu-smi)(1), [otpu-setup](/man/otpu-setup)(1)

# RESOURCES

```[Source code](https://github.com/FeSens/openTPU)```

```[Documentation](https://github.com/FeSens/openTPU/blob/main/docs/litedram.md)```

<!-- verified: 2026-10-22 -->
