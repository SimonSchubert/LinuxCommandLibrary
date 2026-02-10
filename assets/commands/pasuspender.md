# TAGLINE

temporarily suspends PulseAudio to allow another application exclusive access

# TLDR

Suspend PulseAudio while running **JACK**

```pasuspender -- jackd --driver alsa --device hw:0```

Suspend PulseAudio for **any command**

```pasuspender -- [command]```

# SYNOPSIS

**pasuspender** [**-s** _server_] **--** _command_ [_arguments_...]

# PARAMETERS

**-s, --server _server_**
> Connect to specified PulseAudio server

**--**
> Separator between pasuspender options and command

**-h, --help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**pasuspender** temporarily suspends PulseAudio to allow another application exclusive access to audio hardware through ALSA. This is necessary for applications that cannot work with PulseAudio or require direct hardware access.

When the specified command exits, PulseAudio automatically resumes normal operation. This is commonly used with professional audio applications like JACK that need low-latency direct hardware access.

# CAVEATS

Only works with PulseAudio (not PipeWire without compatibility layer). The command runs with exclusive audio access, blocking other audio applications. PulseAudio must be running for the command to work. Some applications may not release audio cleanly.

# HISTORY

**pasuspender** is part of the **PulseAudio** sound system developed by **Lennart Poettering** and the freedesktop.org community. It addresses the common need to temporarily bypass the sound server for applications requiring direct hardware access.

# SEE ALSO

[pulseaudio](/man/pulseaudio)(1), [pactl](/man/pactl)(1), [jackd](/man/jackd)(1)
