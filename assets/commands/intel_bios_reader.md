# TAGLINE

extracts and displays Intel graphics BIOS information

# TLDR

**Dump BIOS data**

```sudo intel_bios_reader```

**Read from file**

```intel_bios_reader [bios.bin]```

**Verbose output**

```sudo intel_bios_reader -v```

# SYNOPSIS

**intel_bios_reader** [_options_] [_file_]

# PARAMETERS

_FILE_
> BIOS dump file to read.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**intel_bios_reader** extracts and displays Intel graphics BIOS information. It reads the Video BIOS Tables (VBT) for display configuration.

The tool shows panel timing, backlight settings, and display connector information. Useful for debugging display issues.

# CAVEATS

Intel graphics only. Requires root or BIOS dump. Part of intel-gpu-tools.

# HISTORY

intel_bios_reader is part of **intel-gpu-tools**, developed for debugging Intel integrated graphics hardware.

# SEE ALSO

[intel_error_decode](/man/intel_error_decode)(1), [intel_reg_read](/man/intel_reg_read)(1), [intel_gpu_top](/man/intel_gpu_top)(1)
