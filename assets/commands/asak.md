# TAGLINE

Cross-platform audio recording/playback CLI tool with TUI

# TLDR

**Record audio** to a WAV file

```asak rec [output]```

**Play back** a WAV file

```asak play [input.wav]```

**Play a file interactively** by selecting from WAV files in the current directory

```asak play```

**Record using a specific audio device** by index

```asak rec -d [device_index] [output]```

**Monitor audio input** through the output device in real time

```asak monitor```

**Monitor with a custom buffer size**

```asak monitor -b [2048]```

**List available audio devices**

```asak list```

# SYNOPSIS

**asak** [**-j**] _command_ [_options_]

**asak rec** [**-d** _index_] [_output_]

**asak play** [**-d** _index_] [_input_]

**asak monitor** [**-b** _size_]

**asak list**

# PARAMETERS

**-j**, **--jack**
> Use the JACK audio backend instead of the default. Only available on Linux, DragonFly BSD, FreeBSD, and NetBSD when built with the jack feature.

**-d** _index_, **--device** _index_
> The audio device index to use for recording or playback. Run **asak list** to see available devices and their indices.

**-b** _size_, **--buffer_size** _size_
> Buffer size for audio input monitoring. Defaults to 1024. Higher values increase latency.

**-h**, **--help**
> Display help information and exit.

**-V**, **--version**
> Display version information and exit.

# DESCRIPTION

**asak** (audio Swiss Army knife) is a cross-platform audio recording and playback CLI tool with a terminal user interface, written in Rust. It aims to provide functionality similar to SoX but with an interactive and visual experience.

The tool provides four main subcommands. **rec** records audio from an input device to a WAV file; if no filename is given, it prompts interactively and suggests a UTC-timestamped default name. **play** plays back a WAV file; if no file is specified, it searches the current directory for WAV files and presents an interactive selection menu. **monitor** routes audio from the input device to the output device in real time with a visual scope display, useful for quickly testing a microphone or speaker setup. **list** displays all available audio input and output devices with their indices.

asak uses **cpal** as its audio backend and **ratatui** for its terminal UI, providing visual feedback such as level meters and playback animations. Audio resampling is handled via the **dasp** library when the source and target sample rates differ.

# CAVEATS

Only WAV format is supported for recording and playback at this time. The **monitor** subcommand requires the output device to match the system default settings. On Linux, the JACK audio backend requires **libjack-dev** (or equivalent) to be installed and the tool to be built with the **jack** feature flag. The project is under active development and some features like effects processing and live position control are not yet implemented.

# HISTORY

**asak** was created by **Qichao Lan** (chaosprint), a developer at the University of Oslo who specializes in Rust audio programming and is also the author of **Glicol**, a graph-oriented live coding language. The first commits appeared in **early 2024** and the project was publicly announced on Hacker News in **December 2024**. The tool reached version 0.3.6 by mid-2025. It is licensed under the MIT license.

# SEE ALSO

[sox](/man/sox)(1), [arecord](/man/arecord)(1), [aplay](/man/aplay)(1), [play](/man/play)(1), [rec](/man/rec)(1), [ffmpeg](/man/ffmpeg)(1)
