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

**alsaloop** [**-C** _capture_] [**-P** _playback_] [**-r** _rate_] [**-f** _format_] [_options_]

# DESCRIPTION

**alsaloop** creates a loopback between an ALSA capture device and playback device. It reads audio from one device and writes it to another in real-time, useful for routing audio between different hardware interfaces.

The tool handles buffer management, sample rate conversion if needed, and attempts to maintain synchronization between devices.

# PARAMETERS

**-C**, **--cdevice** _device_
> Capture (input) PCM device. Default is **default**.

**-P**, **--pdevice** _device_
> Playback (output) PCM device. Default is **default**.

**-r**, **--rate** _rate_
> Sample rate in Hz. Default is **48000**.

**-f**, **--format** _format_
> Sample format such as S16_LE or S32_LE. Default is **S16_LE**.

**-c**, **--channels** _channels_
> Number of channels. Default is **2**.

**-d**, **--daemonize**
> Daemonize the main process and log messages to syslog.

**-s**, **--seconds** _seconds_
> Duration of the loop in seconds.

**-t**, **--tlatency** _usec_
> Requested latency in microseconds (1/1000000 sec).

**-S**, **--sync** _mode_
> Synchronization mode: none, simple, captshift, playshift, samplerate, or auto.

**-n**, **--resample**
> Enable rate resampling using alsa-lib.

**-T**, **--thread** _number_
> Thread number; -1 creates a unique thread. Jobs with the same number share a thread.

# CAVEATS

Latency depends on buffer sizes and hardware capabilities. Different sample rates between devices require resampling. CPU usage increases with lower latency settings.

# HISTORY

**alsaloop** is part of the alsa-utils package, providing a simple tool for audio routing that complements the more complex ALSA loopback kernel module.

# SEE ALSO

[arecord](/man/arecord)(1), [aplay](/man/aplay)(1), [alsactl](/man/alsactl)(1)

# RESOURCES

```[Source code](https://github.com/alsa-project/alsa-utils)```

```[Homepage](https://www.alsa-project.org/)```

<!-- verified: 2026-06-11 -->
