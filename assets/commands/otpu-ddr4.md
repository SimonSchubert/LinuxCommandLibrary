# TAGLINE

DDR4 LiteDRAM DIMM status, BIST, and ECC counters on an openTPU BCU1525 card

# TLDR

**Status** of every DIMM (identifier, scratch, calibration, ECC)

```otpu-ddr4```

**ECC** counters

```otpu-ddr4 ecc```

Read ECC, then **clear** the counters

```otpu-ddr4 ecc --clear```

**BIST** 1 GiB on every DIMM (random then address data)

```otpu-ddr4 bist```

BIST **one DIMM**, 2 GiB, two passes

```otpu-ddr4 bist --dimm [0] --gib [2] --passes [2]```

A **named** XDMA device

```otpu-ddr4 --dev [/dev/xdma1]```

# SYNOPSIS

**otpu-ddr4** [**status** | **bist** | **ecc**] [**--dev** _path_] [**--dimm** _D_]... [**--gib** _G_] [**--passes** _N_] [**--clear**]

# DESCRIPTION

**otpu-ddr4** is the memory bring-up tool for an **openTPU** board with one LiteDRAM DDR4 core per DIMM (the **BCU1525**: Virtex UltraScale+ VU9P, four DDR4 DIMMs). After `pip install -e .` in the FeSens/openTPU tree it is installed as a console script (`opentpu.host.ddr4:main`). It can also be invoked as `python -m opentpu.host.ddr4`.

Each DIMM _d_'s CSRs sit in BAR0 at **R_DDR4 + d × DDR4_STRIDE**. Each core's CPU (LiteX BIOS) calibrates its DIMM at reset and logs on the UART (DIMM C1's core drives the board's). This command reads and tests what the CSRs reach. The CSR map and PHY settings ship in `opentpu/host/litedram4/` (copies of `boards/bcu1525/litedram/`, produced by `tools/litedram/gen_core_ddr4.py`).

The bitstream must be register map 4 with a target whose platform `mem` is **ddr4** and `mem_ctrl` is **litedram**. The Verilator board model has no LiteDRAM cores; the command then exits **2**. Board channel _j_ = 2_s_ + _c_ (slice _s_'s channel _c_) maps to DIMM **CHANNEL_DIMM[j]** = (0, 1, 3, 2).

**status** (default) prints STATUS **CALIB0** / **CALIB1** / **ECC_DED**, then per DIMM: the core identifier string, a scratch register write/read-back, calibrated (**cal_ready** or BIOS DFII hardware-control hand-over), ECC enable, and ECC counters. Exit **1** if any selected DIMM fails the scratch check or is not calibrated.

**ecc** prints 64-bit corrected and uncorrectable word counts since the last clear. Exit **1** if any selected DIMM has uncorrectable errors.

**bist** runs each DIMM's built-in self-test over the first **--gib** GiB (default 1): per pass, random then address data, written then read back. Beats are the 576-bit raw port's, past the ECC, so the check bits are left wrong. The command clears the DRAM_INIT scratch marker; the next **BoardBackend** scrubs the DRAM. **bist** holds the device lock (DMA transport); **status** and **ecc** only read registers, like **otpu-smi**.

# PARAMETERS

**status**
> Per-DIMM identifier, scratch, calibration, and ECC. Default when no subcommand is given.

**bist**
> Write, then read and check, **--gib** GiB from each selected DIMM's start.

**ecc**
> Print ECC counters. **--clear** zeros them after the read (every DIMM's, not only **--dimm**).

**--dev** _path_
> XDMA device prefix (default `/dev/xdma0`).

**--dimm** _D_
> DIMM index (repeatable). Default: every DIMM in the bitstream. Unknown indexes exit **2**.

**--gib** _G_
> With **bist**: GiB per DIMM from its start (default **1.0**).

**--passes** _N_
> With **bist**: passes of random-then-address (default **1**).

**--clear**
> With **ecc**: clear counters after printing.

# CAVEATS

Only a real DDR4 LiteDRAM card: anything else prints `not a DDR4 LiteDRAM card` and exits **2**. **bist** overwrites DRAM and the ECC check bits; chat or serve on that card after a BIST needs a scrub. **status** and **ecc** do not take the device lock; **bist** does, so it will not run beside **otpu-chat**. The command is installed only via `pip install -e .` in the openTPU tree.

# HISTORY

**otpu-ddr4** is part of the **openTPU** host tools (Apache-2.0, FeSens). YPCB-00338 production cards are DDR3 (see **otpu-memcal**); the BCU1525 target uses one LiteDRAM DDR4 core per DIMM, documented in `docs/bcu1525.md`.

# SEE ALSO

[otpu-memcal](/man/otpu-memcal)(1), [otpu-diag](/man/otpu-diag)(1), [otpu-smi](/man/otpu-smi)(1), [otpu-setup](/man/otpu-setup)(1), [otpu-selftest](/man/otpu-selftest)(1)

# RESOURCES

```[Source code](https://github.com/FeSens/openTPU)```

```[Documentation](https://github.com/FeSens/openTPU/blob/main/docs/bcu1525.md)```

<!-- verified: 2026-10-22 -->
