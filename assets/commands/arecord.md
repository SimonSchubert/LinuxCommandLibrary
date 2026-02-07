# TAGLINE

Record audio from ALSA sound devices

# TLDR

Record in **CD quality** (finish with Ctrl+C)

```arecord -vv -f cd [path/to/file.wav]```

Record with a **fixed duration** of 10 seconds

```arecord -vv -f cd -d 10 [path/to/file.wav]```

Record and save as **MP3** (via lame)

```arecord -vv -f cd -t raw | lame -r - [path/to/file.mp3]```

**List** all sound cards and digital audio devices

```arecord -l```

Allow **interactive** interface

```arecord -i```

**Test microphone** with a 5 second sample

```arecord -d 5 test-mic.wav && aplay test-mic.wav && rm test-mic.wav```

# SYNOPSIS

**arecord** [_-d duration_] [_-f format_] [_-r rate_] [_-c channels_] [_file_]

# DESCRIPTION

**arecord** is a command-line sound recorder for ALSA soundcard drivers. It captures audio from sound cards and saves it in various formats including WAV, AU, VOC, and raw audio. The tool supports configurable sample rates, bit depths, and channel counts. The shorthand format **cd** sets 16-bit signed little-endian stereo at 44100 Hz. Raw output can be piped to encoders like **lame** for MP3 conversion. It is the recording counterpart to **aplay**.

# PARAMETERS

**-d, --duration seconds**
> Stop recording after the specified number of seconds

**-f, --format format**
> Sample format (cd, S16_LE, U8, etc.)

**-r, --rate rate**
> Sampling rate in Hz

**-c, --channels count**
> Number of channels (1 for mono, 2 for stereo)

**-t, --file-type type**
> File type (wav, raw, au, voc)

**-l, --list-devices**
> List all available recording devices

**-L, --list-pcms**
> List all PCM devices

**-D, --device name**
> Select PCM device by name

**-i, --interactive**
> Allow interactive control (space/enter to pause/resume)

**-v, --verbose**
> Verbose mode; use -vv for more verbosity

**-q, --quiet**
> Quiet mode; suppress messages

# CAVEATS

Requires ALSA drivers to be installed and configured. The **cd** format is shorthand for 16-bit signed little-endian, 44100 Hz, stereo.

# HISTORY

Part of **ALSA** (Advanced Linux Sound Architecture) utilities package, which replaced OSS as the standard Linux sound system.

# SEE ALSO

[aplay](/man/aplay)(1), [alsamixer](/man/alsamixer)(1), [amixer](/man/amixer)(1)
