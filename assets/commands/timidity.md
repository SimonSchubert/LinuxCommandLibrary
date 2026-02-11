# TAGLINE

Software MIDI synthesizer and converter

# TLDR

**Play a MIDI file**

```timidity [path/to/file.mid]```

**Play with ncurses interface**

```timidity -in [path/to/file.mid]```

**Convert MIDI to WAV**

```timidity -Ow -o [output.wav] [input.mid]```

**Convert MIDI to WAV on stdout** (for piping)

```timidity -Ow -o - [input.mid]```

**Play with increased volume**

```timidity -A [150] [path/to/file.mid]```

**Run as ALSA sequencer client**

```timidity -iA```

**Play multiple files** unloading instruments between each

```timidity -U [file1.mid] [file2.mid]```

# SYNOPSIS

**timidity** [_options_] _file_ [_file_...]

# PARAMETERS

**-A** _n_
> Set master volume amplification to n%. Default is 70%, range is 0-800.

**-a**
> Enable anti-aliasing. Runs samples through a lowpass filter to reduce aliasing noise.

**-B** _n_,_m_
> Set buffer fragments to n and fragment size to 2^m bytes for audio driver.

**-i** _mode_
> Interface mode: d (dumb), n (ncurses), g (GTK+), r (MIDI server), A (ALSA sequencer).

**-o** _file_
> Output to file. Use - for stdout.

**-O** _mode_
> Output mode: w (RIFF WAVE), a (AIFF), r (raw), l (list).

**-s** _freq_
> Set sampling frequency in Hz. Default is 44100.

**-U**
> Unload instruments from memory between files to reduce memory usage.

**-c** _file_
> Read additional configuration file.

**-L** _path_
> Add path to search for patch files.

**-E** _mode_
> Set TiMidity++ extension modes for effects and reverb.

**-h**
> Display help message.

# DESCRIPTION

**TiMidity++** is a software MIDI synthesizer that converts MIDI files to audio using SoundFont or GUS patch instruments. It can play MIDI files in real time through an audio device or convert them to audio formats like WAV, AIFF, or raw PCM.

The program supports Standard MIDI files (.mid), Recomposer files (.rcp, .r36, .g18, .g36), and module files (.mod). It uses Gravis Ultrasound-compatible patch files or SoundFonts (.sf2) to synthesize audio from MIDI data.

TiMidity++ offers multiple interfaces including a dumb terminal interface, ncurses-based interface, GTK+ GUI, and can run as an ALSA sequencer client or MIDI server. This flexibility makes it useful for both playback and as a system-wide MIDI synthesizer.

# CONFIGURATION

**/etc/timidity/timidity.cfg**
> System-wide configuration specifying SoundFont and patch file paths, default output mode, and audio settings.

**~/.timidity.cfg**
> Per-user configuration overrides.

**-c** _file_
> Load an additional configuration file at runtime.

# CAVEATS

TiMidity++ requires SoundFont or patch files to produce sound. Without properly configured instrument files in /etc/timidity/timidity.cfg (or similar), no audio will be generated. Quality and CPU usage depend significantly on the SoundFont files used.

# HISTORY

TiMidity was originally written by **Tuukka Toivonen** in **1995**. The enhanced version **TiMidity++** was developed by **Masanao Izumo** starting in **1999**, adding significant features including multiple output modes, real-time MIDI synthesis, and various user interfaces. It became a popular solution for MIDI playback on Linux systems without hardware synthesizers.

# SEE ALSO

[fluidsynth](/man/fluidsynth)(1), [aplaymidi](/man/aplaymidi)(1), [pmidi](/man/pmidi)(1)
