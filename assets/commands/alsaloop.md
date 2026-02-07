# TAGLINE

Create audio loopback between ALSA devices.

# TLDR

**Loop** audio from capture to playback device

```alsaloop -C [hw:0,0] -P [hw:1,0]```

Loop with **specific sample rate**

```alsaloop -C [hw:0,0] -P [hw:1,0] -r [48000]```

Loop with **specific format**

```alsaloop -C [hw:0,0] -P [hw:1,0] -f [S16_LE]```

Run in **daemon** mode

```alsaloop -C [hw:0,0] -P [hw:1,0] -d```

# SYNOPSIS

**alsaloop** [_-C capture_] [_-P playback_] [_-r rate_] [_-f format_] [_options_]

# DESCRIPTION

**alsaloop** creates a loopback between an ALSA capture device and playback device. It reads audio from one device and writes it to another in real-time, useful for routing audio between different hardware interfaces.

The tool handles buffer management, sample rate conversion if needed, and attempts to maintain synchronization between devices.

# PARAMETERS

**-C** _device_
> Capture (input) device

**-P** _device_
> Playback (output) device

**-r** _rate_
> Sample rate in Hz

**-f** _format_
> Sample format (S16_LE, S24_LE, S32_LE, etc.)

**-c** _channels_
> Number of channels

**-d**, **--daemonize**
> Run as daemon

**-s** _seconds_
> Process time limit

**-t** _ms_
> Loop latency in milliseconds

**--sync** _mode_
> Sync mode: none, simple, captshift, playshift

# CAVEATS

Latency depends on buffer sizes and hardware capabilities. Different sample rates between devices require resampling. CPU usage increases with lower latency settings.

# HISTORY

**alsaloop** is part of the alsa-utils package, providing a simple tool for audio routing that complements the more complex ALSA loopback kernel module.

# SEE ALSO

[arecord](/man/arecord)(1), [aplay](/man/aplay)(1), [alsactl](/man/alsactl)(1)
