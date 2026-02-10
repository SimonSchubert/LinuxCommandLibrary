# TAGLINE

JACK audio server daemon

# TLDR

**Start JACK with ALSA driver**

```jackd -d alsa```

**Specify sample rate and buffer**

```jackd -d alsa -r [48000] -p [256]```

**Start in realtime mode**

```jackd -R -d alsa```

**Use specific device**

```jackd -d alsa -d [hw:0]```

**Start with verbose output**

```jackd -v -d alsa```

# SYNOPSIS

**jackd** [_options_] **-d** _driver_ [_driver-options_]

# PARAMETERS

**-d** _driver_
> Audio driver (alsa, coreaudio, dummy).

**-R**, **--realtime**
> Use realtime scheduling.

**-r** _rate_
> Sample rate (44100, 48000, etc.).

**-p** _frames_
> Frames per period (buffer size).

**-n** _periods_
> Number of periods.

**-P**
> Playback only.

**-C**
> Capture only.

**-v**, **--verbose**
> Verbose output.

**-T**, **--temporary**
> Exit when all clients disconnect.

# DRIVER OPTIONS (ALSA)

**-d** _device_
> ALSA device (hw:0, hw:1).

**-S**
> Force 16-bit samples.

**-H**
> Hardware monitoring.

# DESCRIPTION

**jackd** is the JACK audio server daemon. It provides low-latency audio connections between applications with sample-accurate synchronization.

JACK is essential for professional audio on Linux, enabling complex routing between DAWs, synthesizers, effects, and hardware.

# CAVEATS

Requires realtime privileges for low latency. Buffer size affects latency vs. stability. Consider JACK2 (jackdbus) for modern systems.

# HISTORY

JACK was created primarily by **Paul Davis** starting in **2002**. It became the standard for professional audio on Linux, enabling pro audio workflows comparable to commercial systems.

# SEE ALSO

[jack_connect](/man/jack_connect)(1), [qjackctl](/man/qjackctl)(1), [pulseaudio](/man/pulseaudio)(1)
