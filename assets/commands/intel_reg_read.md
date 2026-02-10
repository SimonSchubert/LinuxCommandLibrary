# TAGLINE

reads hardware registers from Intel GPUs

# TLDR

**Read specific register**

```sudo intel_reg_read [0x70000]```

**Read multiple registers**

```sudo intel_reg_read [0x70000] [0x70004]```

**Read with decode**

```sudo intel_reg_read -d [0x70000]```

**Dump register range**

```sudo intel_reg_read --all```

# SYNOPSIS

**intel_reg_read** [_options_] _register_...

# PARAMETERS

_REGISTER_
> Register address in hex.

**-d**
> Decode register bits.

**--all**
> Dump all known registers.

**--help**
> Display help information.

# DESCRIPTION

**intel_reg_read** reads hardware registers from Intel GPUs. It provides direct access to GPU configuration registers.

The tool can decode register bits into meaningful fields. Essential for low-level hardware debugging and driver development.

# CAVEATS

Intel graphics only. Requires root. Can affect system stability. Part of intel-gpu-tools.

# HISTORY

intel_reg_read is part of **intel-gpu-tools**, created for Intel graphics driver development and debugging.

# SEE ALSO

[intel_reg_write](/man/intel_reg_write)(1), [intel_gtt](/man/intel_gtt)(1), [intel_gpu_top](/man/intel_gpu_top)(1)
