# TAGLINE

wraps OSS applications for PulseAudio

# TLDR

**Run OSS app with PulseAudio**

```padsp [oss_application]```

**Run with specific server**

```padsp -s [server] [application]```

**Run without mmap support**

```padsp -m [application]```

# SYNOPSIS

**padsp** [_options_] _program_ [_arguments_]

# PARAMETERS

_PROGRAM_
> OSS application to run.

**-s** _SERVER_
> PulseAudio server.

**-m**
> Disable mmap emulation.

**-n** _NAME_
> Application name.

**-d**
> Debug mode.

**--help**
> Display help information.

# DESCRIPTION

**padsp** wraps OSS applications for PulseAudio. Provides compatibility layer.

The tool redirects /dev/dsp access. Enables legacy audio apps.

# CAVEATS

Part of PulseAudio. LD_PRELOAD based. Not all apps compatible.

# HISTORY

padsp was created for **OSS application compatibility** with PulseAudio.

# SEE ALSO

[pulseaudio](/man/pulseaudio)(1), [aoss](/man/aoss)(1), [pactl](/man/pactl)(1)

