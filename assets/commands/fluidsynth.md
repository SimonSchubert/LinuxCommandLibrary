# TAGLINE

A real-time software MIDI synthesizer using SoundFont 2

# TLDR

**Play a MIDI file with a SoundFont**

```fluidsynth [/usr/share/soundfonts/soundfont.sf2] [path/to/file.mid]```

**Specify the audio driver**

```fluidsynth -a [pipewire|pulseaudio|alsa|jack] [soundfont.sf2] [file.mid]```

**Render a MIDI file to a WAV audio file (no real-time playback)**

```fluidsynth -T wav -F [output.wav] [soundfont.sf2] [file.mid]```

**Run as a MIDI server accepting external MIDI input**

```fluidsynth -s [soundfont.sf2]```

**Batch process multiple MIDI files without interactive shell**

```fluidsynth -ni [soundfont.sf2] [file1.mid] [file2.mid]```

**Set sample rate and master gain**

```fluidsynth -r [44100] -g [1.0] [soundfont.sf2] [file.mid]```

**Disable reverb and chorus effects**

```fluidsynth -R 0 -C 0 [soundfont.sf2] [file.mid]```

# SYNOPSIS

**fluidsynth** [_options_] [_soundfont_] [_midifile..._]

# PARAMETERS

**-a**, **--audio-driver** _driver_
> Audio output driver (pulseaudio, pipewire, alsa, jack, oss, etc.).

**-m**, **--midi-driver** _driver_
> MIDI input driver (alsa_seq, alsa_raw, jack, oss, etc.).

**-F**, **--fast-render** _file_
> Render to audio file as fast as possible (no real-time playback).

**-T**, **--audio-file-type** _type_
> File type for fast-render output (wav, raw, aiff, au, flac, oga).

**-n**, **--no-midi-in**
> Disable MIDI input.

**-i**, **--no-shell**
> Disable interactive shell.

**-s**, **--server**
> Run as background server process.

**-r**, **--sample-rate** _rate_
> Set audio sample rate (default: 44100).

**-g**, **--gain** _value_
> Set master gain (0.0-10.0, default: 0.2).

**-L**, **--audio-channels** _num_
> Number of audio channel pairs.

**-R**, **--reverb** _0|1_
> Enable or disable reverb effect.

**-C**, **--chorus** _0|1_
> Enable or disable chorus effect.

**-o** _setting=value_
> Set arbitrary synth setting (e.g., `synth.polyphony`).

**-c**, **--audio-bufcount** _count_
> Number of audio buffers.

**-z**, **--audio-bufsize** _size_
> Size of each audio buffer in frames.

**-V**, **--version**
> Display version information.

**-h**, **--help**
> Display help message.

# DESCRIPTION

**FluidSynth** is a real-time software MIDI synthesizer implementing the SoundFont 2 specifications. It synthesizes MIDI input or files into audio output using SoundFont instrument definitions.

The synthesizer can operate in multiple modes: playing MIDI files directly, running as a server for external MIDI input (keyboards, sequencers), or fast-rendering to audio files. An interactive shell allows real-time control of synthesis parameters.

FluidSynth supports various audio backends (PulseAudio, PipeWire, ALSA, JACK) and MIDI backends (ALSA sequencer, JACK MIDI), making it suitable for both standalone use and integration into larger audio setups.

# CAVEATS

Requires at least one SoundFont file (**.sf2** or **.sf3**) to produce sound. Many distributions provide default SoundFonts in **/usr/share/soundfonts/**. Real-time synthesis requires adequate CPU resources; complex SoundFonts may cause audio dropouts on slower systems. The **-F** fast-render option disables real-time audio output.

# HISTORY

FluidSynth was created by **Peter Hanappe** in **2000** as an open-source software synthesizer. Originally named "IIWU Synth," it was renamed to FluidSynth and has grown into a widely-used MIDI synthesizer for Linux, macOS, and Windows. The project continues active development, with version 2.x introducing significant improvements to the API and audio quality.

# SEE ALSO

[timidity](/man/timidity)(1), [aplaymidi](/man/aplaymidi)(1), [aconnect](/man/aconnect)(1), [amidi](/man/amidi)(1)
