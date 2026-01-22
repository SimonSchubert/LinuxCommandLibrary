# TLDR

**Play** a specific file

```aplay [path/to/file]```

Play the first **10 seconds** at 2500 Hz

```aplay -d 10 -r 2500 [path/to/file]```

Play a **raw file** with specific format

```aplay -c 1 -t raw -r 22050 -f mu_law [path/to/file]```

List available **audio devices**

```aplay -l```

# SYNOPSIS

**aplay** [_-d duration_] [_-r rate_] [_-c channels_] [_-t type_] [_-f format_] [_file_]

# DESCRIPTION

**aplay** is a command-line sound player for ALSA soundcard drivers. It supports various audio formats and can automatically determine sampling rate, bit depth, and other parameters from the file format.

# PARAMETERS

**-d, --duration seconds**
> Stop playback after the specified number of seconds

**-r, --rate rate**
> Sampling rate in Hz

**-c, --channels count**
> Number of channels (1 for mono, 2 for stereo)

**-t, --file-type type**
> File type (voc, wav, raw, au)

**-f, --format format**
> Sample format (S16_LE, U8, mu_law, etc.)

**-l, --list-devices**
> List all available audio devices

**-L, --list-pcms**
> List all PCM devices

**-D, --device name**
> Select PCM device by name

**-q, --quiet**
> Quiet mode; suppress messages

**-v, --verbose**
> Verbose mode; show PCM structure and setup

# CAVEATS

Requires ALSA drivers to be installed and configured. Raw files require explicit format specification.

# HISTORY

Part of **ALSA** (Advanced Linux Sound Architecture) utilities package, which replaced OSS as the standard Linux sound system.

# SEE ALSO

[arecord](/man/arecord)(1), [alsamixer](/man/alsamixer)(1), [amixer](/man/amixer)(1)
