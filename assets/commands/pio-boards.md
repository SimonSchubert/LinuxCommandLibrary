# TAGLINE

lists supported development boards in PlatformIO

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

**pio boards** lists supported development boards in PlatformIO. It displays a formatted table with board ID, MCU type, frequency, flash memory, RAM, and board name. Use board IDs with **pio init** for project setup.

An optional filter argument narrows results by platform, MCU, or board name (e.g., `pio boards arduino`, `pio boards atmega168`).

# SEE ALSO

[pio](/man/pio)(1), [pio-init](/man/pio-init)(1), [pio-run](/man/pio-run)(1), [pio-platform](/man/pio-platform)(1)

