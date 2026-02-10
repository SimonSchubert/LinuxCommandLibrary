# TAGLINE

decodes Intel GPU error states from kernel logs

# TLDR

**Decode GPU error from dmesg**

```dmesg | intel_error_decode```

**Decode error file**

```intel_error_decode < [error_state.txt]```

**Decode with shader info**

```intel_error_decode -s [shader.bin]```

# SYNOPSIS

**intel_error_decode** [_options_]

# PARAMETERS

**-s** _FILE_
> Shader binary for context.

**-c**
> Color output.

**--help**
> Display help information.

# DESCRIPTION

**intel_error_decode** decodes Intel GPU error states from kernel logs. It translates hardware register dumps into human-readable information.

The tool parses GPU hang information to identify failing batches and instructions. Essential for debugging graphics driver issues.

# CAVEATS

Intel graphics only. Requires error state from dmesg. Part of intel-gpu-tools.

# HISTORY

intel_error_decode is part of **intel-gpu-tools**, created for debugging GPU hangs on Intel graphics hardware.

# SEE ALSO

[intel_bios_reader](/man/intel_bios_reader)(1), [intel_gpu_top](/man/intel_gpu_top)(1), [dmesg](/man/dmesg)(1)
