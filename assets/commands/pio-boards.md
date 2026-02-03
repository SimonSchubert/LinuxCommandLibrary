# TLDR

**List all supported boards**

```pio boards```

**Search for boards**

```pio boards [arduino]```

**List boards in JSON format**

```pio boards --json-output```

**Filter by installed platforms**

```pio boards --installed```

# SYNOPSIS

**pio boards** [_options_] [_filter_]

# PARAMETERS

**--installed**
> Show only installed boards.

**--json-output**
> Output in JSON format.

_filter_
> Search filter string.

# DESCRIPTION

**pio boards** lists supported development boards in PlatformIO. Shows board IDs, names, platforms, and MCU information. Use board IDs with pio init for project setup.

# SEE ALSO

[pio-init](/man/pio-init)(1), [pio-platform](/man/pio-platform)(1)

