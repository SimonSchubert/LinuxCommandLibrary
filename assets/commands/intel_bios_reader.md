# TAGLINE

extracts and displays Intel graphics BIOS information

# TLDR

**Parse VBT from a BIOS dump file**

```intel_bios_reader --file=[bios.bin]```

**Parse details for all flat panels**

```intel_bios_reader --file=[bios.bin] --all-panels```

**Hex dump BIOS blocks**

```intel_bios_reader --file=[bios.bin] --hexdump```

**Dump a specific BIOS Data Block**

```intel_bios_reader --file=[bios.bin] --block=[N]```

**Pretend to be a specific PCI device ID**

```intel_bios_reader --file=[bios.bin] --devid=[DEVID]```

# SYNOPSIS

**intel_bios_reader** [_options_]

# PARAMETERS

**--file=** _FILE_
> Parse Video BIOS Tables from FILE.

**--devid=** _DEVID_
> Pretend to be PCI ID DEVID for more accurate platform-specific parsing.

**--panel-type=** _N_
> Parse details for flat panel N, overriding the value from the VBT.

**--all-panels**
> Parse details for all flat panels present in the Video BIOS Tables.

**--hexdump**
> Hex dump the blocks.

**--block=** _N_
> Dump only the BIOS Data Block number N.

**--help**
> Display help information.

# DESCRIPTION

**intel_bios_reader** parses the Intel Video BIOS Tables (VBT) and prints the information in a human-readable format. The binary VBT can be read from kernel debug interfaces or from a previously saved dump file.

The tool shows panel timing, backlight settings, and display connector information. It is primarily used for debugging Intel integrated graphics display configuration issues.

# CAVEATS

Intel graphics only. A VBT dump file (produced by intel_bios_dumper) or appropriate kernel debug access is required. Part of intel-gpu-tools.

# HISTORY

intel_bios_reader is part of **intel-gpu-tools** (igt-gpu-tools), developed for debugging Intel integrated graphics hardware.

# SEE ALSO

[intel_error_decode](/man/intel_error_decode)(1), [intel_reg_read](/man/intel_reg_read)(1)
