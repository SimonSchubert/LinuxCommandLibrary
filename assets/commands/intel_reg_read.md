# TAGLINE

reads hardware registers from Intel GPUs

# TLDR

**Read a specific register by address**

```sudo intel_reg read [0x70000]```

**Read multiple registers**

```sudo intel_reg read [0x70000] [0x70004]```

**Decode register bits into named fields**

```sudo intel_reg read --decode [0x70000]```

**Dump all known registers**

```sudo intel_reg read --all```

**Dump registers with decoding**

```sudo intel_reg read --all --decode```

# SYNOPSIS

**intel_reg** **read** [_options_] [_register_...]

# PARAMETERS

_REGISTER_
> Register address in hex (e.g., 0x70000).

**--decode**
> Decode register bits into named fields.

**--all**
> Dump all known registers.

**--help**
> Display help information.

# DESCRIPTION

**intel_reg read** is a subcommand of `intel_reg` that reads hardware registers from Intel GPUs. It provides direct access to GPU configuration registers for debugging and development.

The tool can decode register bits into meaningful named fields when used with the `--decode` flag.

# CAVEATS

Intel graphics only. Requires root. Can affect system stability. Part of intel-gpu-tools.

# HISTORY

intel_reg_read is part of **intel-gpu-tools**, created for Intel graphics driver development and debugging.

# SEE ALSO

[intel_gtt](/man/intel_gtt)(1)
