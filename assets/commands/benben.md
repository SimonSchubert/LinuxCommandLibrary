# TAGLINE

Fast command-line audio player and converter with VGM chip emulation

# TLDR

**Play a single audio file**

```benben [path/to/song.mp3]```

**Play all files in a directory**

```benben [path/to/album/]```

**Play a VGM file** with looping

```benben --loop [2] [path/to/song.vgz]```

**Render files to WAV** in parallel

```benben --render [*.ogg] [*.flac]```

**Render to a specific output directory** with normalization

```benben --render --normalize --outdir [path/to/output] [*.vgm]```

**Play with a specific audio driver** and sample rate

```benben --driver [alsa] --sample-rate [48000] [path/to/file]```

**Play a SID file** selecting specific songs

```benben [path/to/file.sid@2,4,7]```

**Shuffle and repeat** a directory

```benben --shuffle --repeat [path/to/music/]```

# SYNOPSIS

**benben** [_options_] [_files_|_directories_|_playlists_]

# PARAMETERS

**-h**, **--help**
> Display help information and exit

**-v**, **--version**
> Show brief version details and exit

**--long-version**
> Display verbose version information and exit

**--scan-only**
> Scan files only, then terminate

**--recurse**
> Search subdirectories recursively

**--no-recurse**
> Disable recursive subdirectory searching

**--dump-config**
> Generate a fresh configuration and output to stdout

**--basedir** _path_
> Load configuration and themes from an alternate directory

**--remote**
> Enable UNIX domain socket for remote control

**--remote-socket** _path_
> Specify alternate socket location for remote control

**--list-themes**
> Display all available themes

**-T** _name_, **--theme** _name_
> Use the specified theme

**--ui** _type_
> Select user interface: original or minimal

**-L**, **--no-listenbrainz**
> Disable ListenBrainz submission

**-d** _driver_, **--driver** _driver_
> Select audio driver (alsa, out123, ao, any)

**--alsa-device** _name_
> Use a specific ALSA device (default: default)

**--volume** _x_
> Set output volume from 0.0 to 3.0 (default: 1.0)

**-S** _hz_, **--sample-rate** _hz_
> Set output sample rate in Hz from 8000 to 48000 (default: 44100)

**--replay-gain** _mode_
> Set ReplayGain mode: disabled, mix, or album

**--resampler** _mode_
> Set resampler mode

**-e**, **--no-eq**
> Start with equalizer disabled

**-c**, **--soft-clipping**
> Start with soft clipping enabled

**-C**, **--no-soft-clipping**
> Start with soft clipping disabled

**--soft-clipping-oversampling** _n_
> Oversampling amount when soft clipping is enabled (default: 1)

**-t**, **--stereo-enhancer**
> Enable stereo enhancer effect

**-E** _amount_, **--stereo-enhancement** _amount_
> Set stereo enhancement amount from 0.0 to 1.5 (default: 0.5)

**--dc-filter**
> Enable DC offset filter

**--no-dc-filter**
> Disable DC offset filter

**-r**, **--reverb**
> Enable reverb effect

**-R**, **--no-reverb**
> Disable reverb effect

**--reverb-type** _type_
> Set reverb unit type: mverb or zita

**--reverb-preset** _name_
> Use an alternate reverb preset (default: gm-default)

**--reverb-amount** _x_
> Set reverb amount from 0.0 to 1.0 (default: 0.5)

**-l** _n_, **--loop** _n_
> Loop count; 0 for infinite looping (default: 1)

**-p**, **--repeat**
> Loop entire queue when finished

**-P**, **--no-repeat**
> Disable queue looping

**--shuffle**
> Randomize playback queue

**--start-paused**
> Begin playback in a paused state

**--fadeout-seconds** _n_
> Fade-out duration in seconds (default: 5)

**--vgm-chip-info**
> Display supported VGM chip emulators and exit

**--vgm-strict-gd3-loading**
> Be strict with GD3 tags during VGM loading

**--vgm-ym2612-pseudo-stereo**
> Enable pseudo-stereo for YM2612 emulator

**--sid-mono**
> Force 2SID/3SID playback as monaural

**--sid-def-length** _seconds_
> Default SID song length in seconds (default: 180)

**--midi-soundfont** _path_
> Specify SoundFont file for MIDI playback

**-n**, **--render**
> Render files to WAV or Au format instead of playing

**-Q**, **--quiet**
> Suppress non-error messages during rendering

**-N**, **--normalize**
> Normalize rendered files to 0 dBFS peak

**-A**, **--au**
> Render to Au format instead of WAV

**-F**, **--float**
> Output IEEE floating-point data when rendering

**-b** _depth_, **--bit-depth** _depth_
> Set bit depth: 8, 16, 24, 32, or 64 (default: 16 for PCM, 32 for float)

**-o** _dir_, **--outdir** _dir_
> Output directory for rendered files

**--overwrite**
> Overwrite existing rendered files

**--jobs** _n_
> Number of parallel rendering jobs (default: CPU core count)

**--tcp-driver-host** _host_
> TCP host to connect to (default: localhost)

**--tcp-driver-port** _port_
> TCP port to connect to (default: 6969)

**--tcp-driver-format** _format_
> Audio format for TCP transmission (default: float32)

# DESCRIPTION

**benben** is a fast and efficient command-line audio player and audio converter for Linux and other Unix-like systems with an oldschool-inspired terminal interface. It is written almost entirely in Common Lisp and is designed for users who organize their music in folders and prefer terminal-based tools over graphical interfaces.

benben supports a wide range of audio formats including MP3, Ogg Vorbis, Opus, FLAC, WavPack, WAV, QOA, Sun Au, General MIDI, MUS, Commodore 64 SID, Doom WAD files, and all module/tracker formats supported by libxmp. It has extensive VGM (Video Game Music) format support with chip emulation for over 30 sound chips including YM2612, YM2151, YM2610, NES APU, HuC6280, QSound, and Sega MultiPCM, powered by the SatouSynth library.

The player provides multiple audio output backends (ALSA, libout123, libao) and supports TCP audio streaming. Built-in audio effects include soft clipping with configurable oversampling, a parametric equalizer with arbitrary band count, stereo enhancement, reverb (mverb and zita types with presets), and a DC offset filter. It supports ReplayGain/RVA for volume normalization.

The rendering mode can convert audio files to WAV or Au format in parallel using multiple CPU cores, with options for normalization, configurable bit depth, and floating-point output. XSPF and JSPF playlists are supported, along with ListenBrainz scrobbling and Matrix protocol integration for now-playing updates.

The multi-threaded UI is built on S-Lang and features customizable themes, banner animations, a VU meter, and full keyboard controls. A minimal headless UI is also available for resource-constrained systems or remote control via the companion **remote-benben** tool over UNIX domain sockets. SID files support song selection syntax using the @ notation (e.g., file.sid@1-3).

benben is command-line only with no file browser by design; users specify files, directories, or playlists as arguments.

# CONFIGURATION

Configuration is stored in **$XDG_CONFIG_HOME/benben/benben.yaml** (typically ~/.config/benben/benben.yaml) in YAML format. Command-line options override configuration file settings.

Key configuration sections include audio driver and buffer settings, playback defaults (volume, sample rate, loop count, fade-out), audio effects (equalizer bands, soft clipping, stereo enhancer, reverb type and presets, DC filter), VGM emulator preferences (chip cores, GD3 language, pseudo-stereo), MIDI settings (soundfont path, reverb, chorus, voice filter type), C64/SID settings (ROM paths, chip model, songlength database), UI customization (theme, banner style and animation, display preferences), and integration tokens for ListenBrainz and Matrix.

Song-specific configuration files can be placed in **$XDG_CONFIG_HOME/benben/song-configs/** as **song-config-*.yaml** files, each containing a **match** key with glob patterns to apply settings to particular files.

Themes are stored in **$XDG_CONFIG_HOME/benben/themes/** as **theme-\<name\>.yaml** files and support 8-bit ANSI, 24-bit RGB, and hex color notation.

# CAVEATS

The configuration file format is considered unstable and may change until version 1.0. MIDI playback requires a SoundFont file to be specified. SID song length accuracy depends on having the HVSC songlength database configured; without it, songs default to 180 seconds. The sample rate is limited to a range of 8000 to 48000 Hz. benben has no built-in file browser and requires explicit file or directory arguments. For 24-bit terminal color support, the COLORTERM environment variable may need to be set to truecolor.

# HISTORY

**benben** was created by **Remilia Scarlet** as a personal project, originally written in the **Crystal** programming language. Development began around **2023**, with the v0.4.0 release announced on **March 7, 2024** at VGMRips. The VGM chip emulation was built on the author's **YunoSynth** library, an OOP rewrite of VGMPlay's sound emulator code. In **January 2025**, work began on porting benben from Crystal to **Common Lisp**, with the Lisp-based **v0.7.0** becoming the author's daily music player by **April 2025**. The VGM library was rewritten as **SatouSynth** for the Lisp version. Version **0.7.1** was released on **November 6, 2025**. The project is licensed under the **GNU Affero General Public License v3** and hosted in a Fossil repository.

# SEE ALSO

[mpv](/man/mpv)(1), [ffmpeg](/man/ffmpeg)(1), [sox](/man/sox)(1), [aplay](/man/aplay)(1), [cmus](/man/cmus)(1), [moc](/man/moc)(1)
