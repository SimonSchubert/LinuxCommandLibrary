# TAGLINE

configures IEC958 status bits on ALSA devices

# TLDR

**Show IEC958 status**

```iecset```

**Set professional mode**

```iecset pro on```

**Set audio mode**

```iecset audio on```

**Set sample rate**

```iecset rate 48000```

**Use specific card**

```iecset -c [1]```

# SYNOPSIS

**iecset** [_options_] [_commands_]

# PARAMETERS

_COMMANDS_
> Status bit commands.

**pro** _on|off_
> Professional mode.

**audio** _on|off_
> Audio mode.

**rate** _RATE_
> Sample rate.

**-c** _CARD_
> Sound card number.

**-D** _DEVICE_
> Device name.

**--help**
> Display help information.

# DESCRIPTION

**iecset** configures IEC958 (S/PDIF) status bits on ALSA devices. It controls digital audio output characteristics.

The tool sets professional/consumer mode, sample rates, and other S/PDIF parameters. It's used for digital audio configuration.

# CAVEATS

Part of alsa-utils. Device must support IEC958. Settings may reset.

# HISTORY

iecset is part of **ALSA** utilities for Linux digital audio configuration.

# SEE ALSO

[aplay](/man/aplay)(1), [amixer](/man/amixer)(1), [alsactl](/man/alsactl)(1)
