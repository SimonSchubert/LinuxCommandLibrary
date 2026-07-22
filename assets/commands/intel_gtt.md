# TAGLINE

displays the Graphics Translation Table for Intel GPUs

# TLDR

**Show GTT status**

```sudo intel_gtt```

**Dump GTT entries**

```sudo intel_gtt -d```

**Show specific range**

```sudo intel_gtt -r [0x0-0x1000]```

# SYNOPSIS

**intel_gtt** [_options_]

# PARAMETERS

**-d**
> Dump GTT entries.

**-r** _RANGE_
> Show specific address range.

**--help**
> Display help information.

# DESCRIPTION

**intel_gtt** displays the Graphics Translation Table for Intel GPUs. The GTT maps graphics memory addresses to physical memory.

The tool shows aperture usage and memory mappings. Useful for debugging memory allocation and GPU memory issues.

# CAVEATS

Intel graphics only. Requires root. Part of intel-gpu-tools.

# HISTORY

intel_gtt is part of **intel-gpu-tools**, developed for low-level debugging of Intel integrated graphics.

# INSTALL

```apt: sudo apt install intel-gpu-tools```

```pacman: sudo pacman -S intel-gpu-tools```

```zypper: sudo zypper install intel-gpu-tools```

```nix: nix profile install nixpkgs#intel-gpu-tools```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[intel_reg_read](/man/intel_reg_read)(1), [intel_error_decode](/man/intel_error_decode)(1)
