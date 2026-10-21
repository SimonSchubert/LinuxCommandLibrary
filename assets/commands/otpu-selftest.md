# TAGLINE

Staged bring-up test of an openTPU FPGA card or its Verilator model

# TLDR

Run every stage on **the card**

```otpu-selftest```

Run on the **Verilator** board model (no hardware)

```otpu-selftest --sim```

Add a **model-level** greedy-decode check

```otpu-selftest --model qwen3```

Check **LFM2** on a named device

```otpu-selftest --dev [/dev/xdma1] --model lfm2```

# SYNOPSIS

**otpu-selftest** [**--sim**] [**--dev** _path_] [**--model** _name_] [_options_]

# DESCRIPTION

**otpu-selftest** is the staged bring-up of an **openTPU** card (or of its Verilator board model with **--sim**). After `pip install -e .` in the FeSens/openTPU tree it is installed as a console script. Stages stop at the first failure and print a hint. Each stage builds on the previous one. The exit status is **0** on full success and **1** if a stage failed.

The stages are: **link** (ID register answers), **config** (bitstream VERSION gives D / MCOLS / LANES; **OTPU_MCOLS** / **OTPU_LANES** must agree if set), **calib** (both DDR3 controllers report calibration done; LiteDRAM bitstreams may calibrate on the host first), **scrub** (zeros the whole DRAM once so ECC reads of never-written beats do not hang), **regs** (SCRATCH write/read), **addr** (walking address bits and random patterns on each channel), **pattern** (random data through the 64-byte channel interleave, unaligned edges, top of DRAM), **bandwidth** (host ↔ card DMA rate), **kernel** (a program using every unit, compared bit for bit with the ISA simulator), **vops** (RDOT / OUTER / LOG2 against the simulator; a bitstream without them passes with a note unless **--model** names Qwen3.5), **stream** (STREAM and DSTEP on a bitstream with the stream engine), **model** (only with **--model**: greedy tokens equal the ISA simulator), **ecc** (no uncorrectable ECC word in what the stages read).

Unlike **otpu-diag**, this command does not continue past the first failure and does not emit a per-section matrix.

# PARAMETERS

**--sim**
> Use the Verilator board model instead of hardware.

**--dev** _path_
> XDMA device prefix (default `/dev/xdma0`).

**--model** _name_
> Short name (**qwen3**, **lfm2**, **qwen35**) or a checkpoint directory: run the model stage.

**--tokens** _N_
> Tokens to generate in the model stage (default **8**).

**--wformat** _int8_|_fp4_|_int4_|_nvfp4_|_mix_
> Weight format of the model stage's layers (default **int8**).

**--head-format** _int8_|_fp4_|_int4_|_nvfp4_
> Weight format of the model stage's LM head (default: **--wformat**).

**--bw-mib** _N_
> Bandwidth test size in MiB (default **512**).

# CAVEATS

A real card needs XDMA character devices and a loaded openTPU bitstream; **otpu-setup --check** reports what is missing. Stages hold the device lock and will not run beside **otpu-chat** or **otpu-serve**. **--model** needs **transformers** and a checkpoint under `models/`. The ISA simulator comparison for **kernel** / **vops** / **stream** / **model** is the spec; a mismatch means the bitstream or DMA path, not a flaky hint. The command is installed only via `pip install -e .` in the openTPU tree.

# HISTORY

**otpu-selftest** is part of the **openTPU** host tools (Apache-2.0, FeSens). It is the short bring-up path in the README table (`otpu-selftest`, **otpu-diag**) so a programmed card can be checked from the link up through a few greedy tokens before **otpu-chat**.

# SEE ALSO

[otpu-diag](/man/otpu-diag)(1), [otpu-setup](/man/otpu-setup)(1), [otpu-chat](/man/otpu-chat)(1), [otpu-smi](/man/otpu-smi)(1)

# RESOURCES

```[Source code](https://github.com/FeSens/openTPU)```

```[Documentation](https://github.com/FeSens/openTPU/blob/main/README.md)```

<!-- verified: 2026-10-21 -->
