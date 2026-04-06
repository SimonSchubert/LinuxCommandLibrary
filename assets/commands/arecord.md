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

**-d**, **--duration** _seconds_
> Stop recording after the specified number of seconds.

**-f**, **--format** _format_
> Sample format (cd, S16_LE, S16_BE, U8, S32_LE, etc.).

**-r**, **--rate** _rate_
> Sampling rate in Hz (2000-192000).

**-c**, **--channels** _count_
> Number of channels (1 for mono, 2 for stereo).

**-t**, **--file-type** _type_
> File type (wav, raw, au, voc).

**-l**, **--list-devices**
> List all soundcards and digital audio devices.

**-L**, **--list-pcms**
> List all PCMs defined.

**-D**, **--device** _name_
> Select PCM device by name.

**-M**, **--mmap**
> Use memory-mapped I/O mode for the audio stream.

**-N**, **--nonblock**
> Open the audio device in non-blocking mode.

**-F**, **--period-time** _microseconds_
> Distance between interrupts in microseconds.

**-B**, **--buffer-time** _microseconds_
> Buffer duration in microseconds.

**-V**, **--vumeter** _type_
> VU meter type (stereo or mono).

**-i**, **--interactive**
> Allow interactive control via stdin.

**-v**, **--verbose**
> Verbose mode; use -vv for more detail including VU meter.

**-q**, **--quiet**
> Quiet mode; suppress messages.

**--disable-resample**
> Disable automatic rate resample.

**--disable-channels**
> Disable automatic channel conversions.

**--disable-format**
> Disable automatic format conversions.

# CAVEATS

Requires ALSA drivers to be installed and configured. The **cd** format is shorthand for 16-bit signed little-endian, 44100 Hz, stereo.

# HISTORY

Part of **ALSA** (Advanced Linux Sound Architecture) utilities package, which replaced OSS as the standard Linux sound system.

# SEE ALSO

[aplay](/man/aplay)(1), [alsamixer](/man/alsamixer)(1), [amixer](/man/amixer)(1)
