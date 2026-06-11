# TAGLINE

Keyboard-driven terminal UI wrapping ffmpeg

# TLDR

**Launch the** interactive TUI in the current directory

```nano-ffmpeg```

**Open the file picker** at a specific directory

```nano-ffmpeg -d [path/to/videos]```

**Skip the picker** and jump straight to operations with a preloaded file

```nano-ffmpeg -d [path/to/video.mp4]```

**Force** a specific UI theme for the session

```nano-ffmpeg -t [dark|light]```

**Show** the version

```nano-ffmpeg --version```

# SYNOPSIS

**nano-ffmpeg** [_-t theme_] [_-d path_] [_--version_] [_--help_]

# PARAMETERS

**-d** _path_, **--dir** _path_
> If _path_ is a directory, open the file picker rooted there. If _path_ is a file, bypass the picker and load it directly into the operations menu.

**-t** _theme_, **--theme** _theme_
> Override the UI theme for the current session. Accepts **dark** or **light**.

**--version**
> Print the version and exit.

**-h**, **--help**
> Print usage information.

# DESCRIPTION

**nano-ffmpeg** is a terminal user interface that wraps **ffmpeg** behind a keyboard-driven dashboard. Instead of memorizing flags, the user browses files, picks an operation from a menu, tweaks parameters via presets, and watches a live progress bar while ffmpeg encodes in the background.

The TUI exposes twelve common operations: format conversion, audio extraction, resizing, trimming, compression, concatenation, subtitle handling, GIF creation, thumbnail extraction, watermarking, audio adjustments, and video filters such as stabilization, deinterlacing, and rotation. Every settings screen previews the exact **ffmpeg** invocation that will be executed, so users can learn the underlying flags as they work.

Hardware-accelerated encoders are detected automatically: **VideoToolbox** on macOS, **NVENC** on systems with NVIDIA GPUs, and **VAAPI** on Linux. Real-time stats during encoding include elapsed time, ETA, speed, FPS, bitrate, frames written, and output size.

# CAVEATS

Requires **ffmpeg** and **ffprobe** to be installed and discoverable in **PATH**; nano-ffmpeg only orchestrates them. A terminal of at least 80x24 cells is required. Hardware encoder availability depends on platform, drivers, and ffmpeg build options.

# HISTORY

**nano-ffmpeg** is an open-source project written in **Go** by **dgr8akki**, distributed via Homebrew, Scoop, **go install**, and prebuilt binaries on GitHub. It was created to lower the barrier to entry for ffmpeg by exposing a guided, discoverable workflow without sacrificing access to the underlying command.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [ffprobe](/man/ffprobe)(1)
