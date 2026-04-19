# TAGLINE

Wrap OSS applications for PulseAudio

# TLDR

**Run an OSS application** with PulseAudio

```padsp [oss_application]```

**Connect to a specific** PulseAudio server

```padsp -s [server] [application]```

**Set the client** application name

```padsp -n [name] [application]```

**Disable /dev/dsp emulation**

```padsp -D [application]```

**Enable debug** output

```padsp -d [application]```

# SYNOPSIS

**padsp** [_options_] _program_ [_arguments_...]

# PARAMETERS

_PROGRAM_
> OSS application to run.

**-s** _SERVER_
> PulseAudio server to connect to.

**-n** _NAME_
> Client application name sent to the server.

**-m** _NAME_
> Stream name passed when creating a stream.

**-M**
> Disable /dev/mixer device emulation.

**-S**
> Disable /dev/sndstat device emulation.

**-D**
> Disable /dev/dsp device emulation.

**-d**
> Enable debug output.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**padsp** (PulseAudio OSS Wrapper) starts a program using an LD_PRELOAD library that redirects OSS audio device access (/dev/dsp, /dev/mixer, /dev/sndstat) to PulseAudio. This provides a compatibility layer for legacy OSS applications so they play through the PulseAudio sound server.

# CAVEATS

Relies on **LD_PRELOAD**, so it only works with dynamically linked ELF binaries. Not every OSS feature is emulated; applications using mmap or exotic ioctls may not work. Part of the PulseAudio distribution.

# HISTORY

**padsp** was developed as part of the **PulseAudio** project to support legacy OSS applications after PulseAudio replaced OSS as the default sound system on most Linux distributions.

# SEE ALSO

[pulseaudio](/man/pulseaudio)(1), [aoss](/man/aoss)(1), [pactl](/man/pactl)(1)

