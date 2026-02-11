# TAGLINE

Generate test tones for ALSA speakers

# TLDR

Test speakers with **pink noise**

```speaker-test```

Test with **sine wave** at specific frequency

```speaker-test -t sine -f [frequency]```

Test with **predefined WAV** files

```speaker-test -t wav```

Test with **custom WAV** file

```speaker-test -t wav -w [path/to/file.wav]```

Test specific **number of channels**

```speaker-test -c [channels]```

Test a **specific device**

```speaker-test -D [device_name]```

Test a **single speaker** channel

```speaker-test -s [channel_number]```

# SYNOPSIS

**speaker-test** [_OPTIONS_]

# PARAMETERS

**-c, --channels** _num_
> Number of channels to test (default: 8)

**-D, --device** _name_
> PCM device name to use

**-f, --frequency** _freq_
> Sine wave frequency in Hz (default: 440)

**-t, --test** _type_
> Test signal: pink, sine, wav, or st2095

**-l, --nloops** _count_
> Number of test loops (0 = infinite)

**-s, --speaker** _channel_
> Test single channel only

**-w, --wavfile** _file_
> Custom WAV file for wav test

**-W, --wavdir** _directory_
> Directory containing WAV files

**-r, --rate** _rate_
> Sample rate in Hz

**-b, --buffer** _time_
> Buffer size in microseconds

**-p, --period** _time_
> Period size in microseconds

**-P, --nperiods** _periods_
> Number of periods (default: 4)

**-m, --chmap** _map_
> Channel position mapping override

**-X, --force-frequency**
> Allow frequencies outside 30-8000Hz range

**--help**
> Display usage information

# DESCRIPTION

**speaker-test** generates test tones through ALSA sound devices to verify speaker configuration and channel mapping. It supports various test signals including pink noise, sine waves, and WAV file playback.

The tool cycles through each speaker channel, playing the test signal to help identify which physical speaker corresponds to which audio channel. Use **aplay -L** to list available PCM devices for the **-D** option.

# CAVEATS

Requires ALSA and appropriate sound card drivers. Very high or low frequencies may not be audible or could damage speakers. Default device may not be the intended output; specify with **-D**. Some test signals require speaker test WAV files to be installed.

# HISTORY

**speaker-test** is part of **alsa-utils**, the ALSA (Advanced Linux Sound Architecture) utility collection. ALSA became the standard Linux sound system in kernel **2.6** (2003), replacing OSS. The speaker-test tool helps users configure multi-channel audio setups and verify surround sound configurations.

# SEE ALSO

[aplay](/man/aplay)(1), [arecord](/man/arecord)(1), [amixer](/man/amixer)(1), [alsamixer](/man/alsamixer)(1)
