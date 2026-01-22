# TLDR

**Play** a MIDI file with a SoundFont

```fluidsynth [/usr/share/soundfonts/soundfont.sf2] [path/to/file.mid]```

Specify the **audio driver**

```fluidsynth -a [pipewire|pulseaudio|alsa|jack] [soundfont.sf2] [file.mid]```

**Fast-render** MIDI to audio file (no real-time playback)

```fluidsynth -F [output.wav] [soundfont.sf2] [file.mid]```

Run as a **MIDI server** (accepts external MIDI input)

```fluidsynth -s [soundfont.sf2]```

**Batch process** multiple MIDI files without interaction

```fluidsynth -ni [soundfont.sf2] [file1.mid] [file2.mid]```

Set **sample rate** and **gain**

```fluidsynth -r [44100] -g [1.0] [soundfont.sf2] [file.mid]```

# SYNOPSIS

**fluidsynth** [_options_] [_soundfont_] [_midifile..._]

# PARAMETERS

**-a, --audio-driver** _driver_
> Audio output driver (pulseaudio, pipewire, alsa, jack, etc.)

**-m, --midi-driver** _driver_
> MIDI input driver (alsa_seq, jack, etc.)

**-F, --fast-render** _file_
> Render to audio file as fast as possible (no real-time)

**-n, --no-midi-in**
> Disable MIDI input

**-i, --no-shell**
> Disable interactive shell

**-s, --server**
> Run as background server process

**-r, --sample-rate** _rate_
> Set audio sample rate (default: 44100)

**-g, --gain** _value_
> Set master gain (0.0-10.0, default: 0.2)

**-L, --audio-channels** _num_
> Number of audio channel pairs

**-R, --reverb** _0|1_
> Enable or disable reverb

**-C, --chorus** _0|1_
> Enable or disable chorus

**-o** _setting=value_
> Set arbitrary synth setting

**-h, --help**
> Display help message

# DESCRIPTION

**FluidSynth** is a real-time software MIDI synthesizer implementing the SoundFont 2 specifications. It synthesizes MIDI input or files into audio output using SoundFont instrument definitions.

The synthesizer can operate in multiple modes: playing MIDI files directly, running as a server for external MIDI input (keyboards, sequencers), or fast-rendering to audio files. An interactive shell allows real-time control of synthesis parameters.

FluidSynth supports various audio backends (PulseAudio, PipeWire, ALSA, JACK) and MIDI backends (ALSA sequencer, JACK MIDI), making it suitable for both standalone use and integration into larger audio setups.

# CAVEATS

Requires at least one SoundFont file (**.sf2** or **.sf3**) to produce sound. Many distributions provide default SoundFonts in **/usr/share/soundfonts/**. Real-time synthesis requires adequate CPU resources; complex SoundFonts may cause audio dropouts on slower systems. The **-F** fast-render option disables real-time audio output.

# HISTORY

FluidSynth was created by **Peter Hanappe** in **2000** as an open-source software synthesizer. Originally named "IIWU Synth," it was renamed to FluidSynth and has grown into a widely-used MIDI synthesizer for Linux, macOS, and Windows. The project continues active development, with version 2.x introducing significant improvements to the API and audio quality.

# SEE ALSO

[timidity](/man/timidity)(1), [aplaymidi](/man/aplaymidi)(1), [jack](/man/jack)(1)
