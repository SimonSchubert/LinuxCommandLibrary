# TAGLINE

Set or dump IEC958 (S/PDIF) status bits on ALSA devices

# TLDR

**Show current IEC958 status**

```iecset```

**Dump status as AES bytes**

```iecset -x```

**Set professional mode**

```iecset pro on```

**Set audio mode**

```iecset audio on```

**Set sample rate**

```iecset rate [48000]```

**Use a specific sound card**

```iecset -c [1]```

**Read commands from stdin**

```iecset -i```

# SYNOPSIS

**iecset** [_options_] [_commands_]

# PARAMETERS

**pro** _on|off_
> Professional mode (true) or consumer mode (false).

**audio** _on|off_
> Audio mode (true) or non-audio mode (false).

**rate** _RATE_
> Sample rate in Hz.

**emphasis** _0|1|2_
> Emphasis: 0 = none, 1 = 50/15us, 2 = CCITT.

**copyright** _on|off_
> Copyright flag (consumer mode only).

**category** _VALUE_
> Category code 0-0x7f (consumer mode only).

**lock** _on|off_
> Rate lock (professional mode only).

**sbits** _VALUE_
> Sample bits: 2 = 20bit, 4 = 24bit, 6 = undefined (professional mode only).

**-c** _CARD_
> Sound card index number.

**-D** _DEVICE_
> Device name.

**-n** _INDEX_
> IEC958 control element index for multiple IEC958 devices.

**-x**
> Dump status in AESx byte format.

**-i**
> Read command sequences from stdin.

# DESCRIPTION

**iecset** sets or dumps IEC958 (S/PDIF) status bits on ALSA devices. When started without commands, it shows the current IEC958 status in a human-readable form.

The tool controls professional/consumer mode, sample rates, emphasis, and other S/PDIF parameters for digital audio output.

# CAVEATS

Part of alsa-utils. Device must support IEC958. Settings may reset.

# HISTORY

iecset is part of **ALSA** utilities for Linux digital audio configuration.

# SEE ALSO

[aplay](/man/aplay)(1), [amixer](/man/amixer)(1), [alsactl](/man/alsactl)(1)
