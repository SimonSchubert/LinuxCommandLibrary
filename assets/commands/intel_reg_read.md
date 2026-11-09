# TAGLINE

reads hardware registers from Intel GPUs

# TLDR

**Read a specific register by address**

```sudo intel_reg read [0x70000]```

**Read multiple registers**

```sudo intel_reg read [0x70000] [0x70004]```

**Read N consecutive registers** starting at an address

```sudo intel_reg read --count=[16] [0x70000]```

**Decode register bits into named fields**

```sudo intel_reg read --decode [0x70000]```

**Decode a register for all known platforms**

```sudo intel_reg read --all [0x70000]```

**Read from a specific GPU** on a multi-GPU system

```sudo intel_reg read --pci-slot [0000:00:02.0] [0x70000]```

**Dump all registers** in the register spec

```sudo intel_reg dump```

# SYNOPSIS

**intel_reg** **read** [_options_] _register_...

# PARAMETERS

_REGISTER_
> Register reference: [(PORTNAME|PORTNUM|ENGINE|MMIO-OFFSET):](REGNAME|REGADDR), e.g. 0x70000.

**--count**=_N_
> Read N registers starting from each REGISTER.

**--decode**
> Decode register bits into named fields.

**--all**
> Decode registers for all known platforms. Implies **--decode**.

**--binary**
> Output binary values.

**--mmio**=_FILE_
> Use MMIO bar from FILE.

**--devid**=_DEVID_
> Pretend to be PCI ID DEVID. Useful with MMIO snapshots from other machines.

**--pci-slot** _DOMAIN:BUS:DEVICE[.FUNC]_
> Find Intel GPU by PCI slot.

**--spec**=_PATH_
> Read register spec from PATH. Implies **--decode**.

**--verbose**, **--quiet**
> Increase or decrease verbosity.

**--help**
> Display help information.

# DESCRIPTION

**intel_reg read** is a subcommand of `intel_reg` that reads hardware registers from Intel GPUs. It provides direct access to GPU configuration registers for debugging and development.

The tool can decode register bits into meaningful named fields when used with the `--decode` flag.

# CAVEATS

Intel graphics only. Requires root. Reading some registers may hang the GPU or the machine. No standalone **intel_reg_read** binary exists in current releases; use **intel_reg read**.

# HISTORY

intel_reg_read was part of **intel-gpu-tools** (now **igt-gpu-tools**), created for Intel graphics driver development and debugging. Its function now lives in the **intel_reg** multitool.

# SEE ALSO

[intel_gtt](/man/intel_gtt)(1)

# RESOURCES

```[Source code](https://gitlab.freedesktop.org/drm/igt-gpu-tools)```

```[Documentation](https://drm.pages.freedesktop.org/igt-gpu-tools/)```

<!-- verified: 2026-11-09 -->
