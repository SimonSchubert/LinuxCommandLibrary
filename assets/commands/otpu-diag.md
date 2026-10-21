# TAGLINE

Full hardware diagnostic of an openTPU FPGA card or its Verilator model

# TLDR

Run **every check** on the card (about a minute)

```otpu-diag```

Also march **all 4 GiB** of both DRAM channels

```otpu-diag --mem full```

Rerun the kernel set **20 times** and count intermittents

```otpu-diag --soak [20]```

Add a **model** greedy-decode check

```otpu-diag --model qwen3```

Run **platform plus selected sections**

```otpu-diag --only [mem,isa]```

Write the report as **JSON**

```otpu-diag --json [diag.json]```

Run on the **Verilator** board model

```otpu-diag --sim```

# SYNOPSIS

**otpu-diag** [**--sim**] [**--dev** _path_] [**--mem** _quick_|_full_] [**--only** _sections_] [_options_]

# DESCRIPTION

**otpu-diag** is the full hardware diagnostic of an **openTPU** card (or its Verilator board model with **--sim**). After `pip install -e .` in the FeSens/openTPU tree it is installed as a console script. Unlike **otpu-selftest** it does not stop at the first failure: it runs every check whose prerequisites passed, marks the others **SKIP** (naming the failed prerequisite), and ends with a works / does-not-work matrix per section plus diagnosis hints from the pattern of failures. The exit status is **1** when any check failed.

Sections are **platform** (PCIe, driver, ID, configuration, calibration, STATUS errors, temperature, power estimate), **regs** (read/write patterns, read-only sanity), **i2c** (when the bitstream exposes I2C: scan the LM73 bus and the PCIe SMBus; read only), **mem** (per channel: walking data and address bits, random blocks, partial writes, DMA bandwidth, the interleave; **--mem full** adds a march C- over every byte of both channels), **isa** (one program per instruction variant, bit for bit against the ISA simulator), **system** (demo, masked-write and vops programs, cycle counters, **--soak**), **model** (only with **--model**). **--only** still always runs **platform**.

On a missing device it prints the XDMA / ID failures and hints to run **otpu-setup**.

# PARAMETERS

**--sim**
> Use the Verilator board model instead of hardware (memory tests scaled to the model).

**--dev** _path_
> XDMA device prefix (default `/dev/xdma0`).

**--mem** _quick_|_full_
> Memory tests. **full** also runs a march C- over every byte of both channels (default **quick**).

**--soak** _N_
> Rerun the kernel set _N_ times and count intermittent failures (default **0**).

**--model** _name_
> Short name (**qwen3**, **lfm2**, **qwen35**) or a checkpoint directory: run the model section.

**--tokens** _N_
> Tokens to generate with **--model** (default **8**).

**--only** _sections_
> Comma-separated sections besides platform: **regs**, **i2c**, **mem**, **isa**, **system**, **model**.

**--bw-mib** _N_
> Bandwidth test size per channel in MiB (default **256**).

**--power-json** _file_
> Vivado power summary used for the estimate.

**--json** _path_
> Also write the report as JSON.

# CAVEATS

A real card needs XDMA character devices and a loaded openTPU bitstream. Checks hold the device lock and will not run beside **otpu-chat** or **otpu-serve**. **--mem full** walks all 4 GiB and takes much longer than the default. **--model** needs **transformers** and a checkpoint. I2C is read-only and skipped when the bitstream has no I2C pins. Power estimates need a Vivado `power.json` for that bitstream. The command is installed only via `pip install -e .` in the openTPU tree.

# HISTORY

**otpu-diag** is part of the **openTPU** host tools (Apache-2.0, FeSens). It sits next to **otpu-selftest** in the README table: selftest stops at the first failure for bring-up; diag keeps going so a bad pinout, a weak DRAM channel, or a wrong bitstream can be told apart from the pattern of PASSes and FAILs.

# SEE ALSO

[otpu-selftest](/man/otpu-selftest)(1), [otpu-setup](/man/otpu-setup)(1), [otpu-smi](/man/otpu-smi)(1), [otpu-chat](/man/otpu-chat)(1)

# RESOURCES

```[Source code](https://github.com/FeSens/openTPU)```

```[Documentation](https://github.com/FeSens/openTPU/blob/main/README.md)```

<!-- verified: 2026-10-21 -->
