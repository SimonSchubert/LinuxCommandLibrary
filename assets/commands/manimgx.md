# TAGLINE

Fast Manim-compatible 3D animation renderer on a Rust GPU engine

# TLDR

**Render** a scene file to MP4 (default 1920x1080 at 60 fps)

```manimgx render [scene.py]```

Render a **named scene** when the file defines several

```manimgx render [scene.py] [Hello3D]```

Write the video to a **chosen path**

```manimgx render [scene.py] -o [out.mp4]```

Render at **720p** and **30 fps**

```manimgx render [scene.py] -r 1280x720 --fps [30]```

**Inspect** without encoding video: storyboard, timeline, layout problems

```manimgx inspect [scene.py]```

Inspect specific **times** (seconds from the start, or `end`)

```manimgx inspect [scene.py] -t [0,2.5,end]```

**Preview** in a window that rebuilds on save

```manimgx preview [scene.py]```

Start the playhead at **1.5 seconds**

```manimgx preview [scene.py] -t [1.5]```

**Present** sections as slides in the browser

```manimgx present [scene.py]```

Also write a **PDF** of each slide's last frame

```manimgx present [scene.py] --pdf```

Print the **version**

```manimgx --version```

# SYNOPSIS

**manimgx** [**--version**] [_command_] [_options_]

**manimgx** **render** _file_ [_scene_] [**-o** _video.mp4_] [**-r** _WxH_] [**--fps** _n_] [**--preset** _preset_] [**--crf** _n_]

**manimgx** **inspect** _file_ [_scene_] [**-t** _time_] [**-o** _storyboard.png_]

**manimgx** **preview** _file_ [_scene_] [**-t** _seconds_] [**-r** _WxH_] [**--fps** _n_]

**manimgx** **present** _file_ [_scene_] [**-o** _video.mp4_] [**-r** _WxH_] [**--fps** _n_] [**--pdf**] [**--open**|**--no-open**]

# DESCRIPTION

**manimgx** is the command-line interface for **ManimGX**, a 2D and 3D animation engine that targets the **Manim Community Edition** Python API and renders with a **Rust** + **wgpu** core. Install with `pip install manimgx` (Python **3.13** or newer). The console script is **manimgx** (`manimgx.cli:main`, Typer). The published package version is **0.1.1**.

A scene file is ordinary Manim CE-style Python: `import manimgx as m`, a class deriving `m.Scene` (or `m.ThreeDScene`), and a `construct` method. **render** writes an MP4 beside the file named after the scene class, plus a storyboard PNG (the frame at each play's end, with layout problems outlined) and, if the scene speaks or has subcaptions, an **.srt** file. **inspect** does the same checks without encoding video. **preview** opens a window that reruns the scene when the file (or a module it imports from beside it) is saved. **present** renders the video and an HTML page that stops at each `self.next_section(...)`.

Default picture size is **1920x1080** at **60** frames per second, unless the scene sets `m.config` or **-r** / **--fps** override it. Width and height must be even and positive (`WIDTHxHEIGHT`). Video encoding is **H.264** (x264); output must be named **.mp4**. Text and math use **Typst** (LaTeX input is translated); no system LaTeX install is required. Fonts and encoding libraries ship in the wheel. Linux wheels bundle Mesa **lavapipe** so rendering still works without a GPU driver.

What a command writes goes to stdout, one line per file, then its report; errors go to stderr. Exit **0** on success, **1** when the scene fails or **inspect** finds layout problems, **2** when the command is wrong. Help is plain text when piped, rich on a terminal. **render**, **inspect**, and **present** start the GPU before loading the rest of the CLI (not for **--help**, **--version**, or **preview**).

# COMMANDS

**render** _file_ [_scene_]
> Render a scene to an MP4, with its sound. Also writes a storyboard beside the video and lists layout problems the same way **inspect** does. Default output is `<Scene>.mp4` beside _file_

**inspect** _file_ [_scene_]
> Inspect without video: annotated PNG storyboard, timeline, and 2D layout checks (clipped content, overlapping text, lines or fills over text, small labels). Samples play and wait endings by default. **-t** inspects the frames a player would show at those times; `end` is the last frame. 3D scenes get pictures and a timeline; layout checks are skipped. Exits **1** when layout problems are found; notes such as a graph leaving the frame do not count

**preview** _file_ [_scene_]
> Play the scene in a window, rebuilt each time its code is saved. The window keeps its place across rebuilds; an error shows over the last good picture. In a file of several scenes, **N** and **P** switch scenes. Keys: Space play/pause, ← → 5 s, `,` `.` a frame, Option (or Ctrl) with ← → a play, `?` the rest. Closing the window or **Ctrl+C** stops

**present** _file_ [_scene_]
> Render the video, write a page that plays it as slides (one section each), and open it. Keys: → or Space next, ← back, **F** full screen, **B** black, **Shift+P** presenter view, **C** captions, `?` help. Begin a section with `self.next_section(...)` in the scene

# PARAMETERS

_file_
> Python file defining ManimGX scenes

_scene_
> Scene class name. Required only if the file defines more than one scene

**-o**, **--output** _path_
> With **render** and **present**, the MP4 (must end in `.mp4`). With **inspect**, the storyboard PNG (must end in `.png`). Defaults are `<Scene>.mp4` or `<Scene>.storyboard.png` beside the scene file. **present** writes `<Scene>.html` beside the video

**-r**, **--resolution** _WxH_
> Pixels, for example `1280x720`. Width and height must be even and positive. Default: the scene's `config`, **1920x1080** unless set

**--fps** _n_
> Frames per second (integer ≥ 1). Default: the scene's `config`, **60** unless set. A video needs a whole-number frame rate

**--preset** _preset_
> x264 encoding speed for **render**. Faster presets encode sooner but produce larger files. Values: **ultrafast**, **superfast**, **veryfast**, **faster**, **fast**, **medium**, **slow**, **slower**, **veryslow**, **placebo**

**--crf** _n_
> x264 constant rate factor for **render**, **0**–**51**. Lower is higher quality and a larger file. Default **18**

**-t**, **--time** _time_
> With **inspect**: seconds from the start, or `end`. Repeat **-t** or separate with commas. With **preview**: where the playhead starts, in seconds (default **0**)

**--pdf**
> With **present**, also write a PDF: the picture each slide ends on, one page each

**--open** / **--no-open**
> With **present**, open the HTML page in the browser (default **--open**)

**-h**, **--help**
> Print usage. Every subcommand also accepts **-h** / **--help**

**--version**
> Print `manimgx` and the package version and exit

# CONFIGURATION

Scenes set render size and frame rate on **manimgx.config.config** (`m.config`) before constructing the scene:

**pixel_width** / **pixel_height**
> Video size in pixels. Default **1920** × **1080**. For 9:16, swap them (`1080, 1920`)

**frame_rate**
> Frames per second. Default **60**. Video export needs a whole number

**background_color**
> Scene background. Dictionary-style access works as in Manim CE (`config["pixel_height"] = 720`)

The CLI resets `config` to defaults, then runs the scene file, then applies **-r** / **--fps** for the take. Fonts ship as the **manimgx-fonts** (and **manimgx-fonts-cjk**) packages pinned by the wheel.

# CAVEATS

Python **3.13** or newer is required. **render** and **present** write **MP4 only**; a different suffix is a usage error. **inspect** storyboards must be **.png**.

**inspect** exits **1** when 2D layout problems are found. 3D scenes skip those checks. Only sampled moments are checked.

Video encoding uses **x264** (GPL). Native wheels therefore ship as **GPL-3.0-or-later** even though the ManimGX Python/Rust sources are **MIT**. Linux wheels include lavapipe for CPU Vulkan when no suitable GPU is available. The browser package (`npm install manimgx`) runs scenes in **Pyodide** with WebGPU; it is not this CLI.

A file with several scenes must name one on the command line (**preview** can switch with **N**/**P** after starting). `import manim` is the wrong module: use `import manimgx as m`.

# HISTORY

**Manim** was created by **Grant Sanderson** (3Blue1Brown). ManimGX targets the API of **Manim Community Edition** and is developed by the **Academa** team. First release **0.1.0** was tagged on **7 October 2026**; **0.1.1** followed the same day. The renderer uses **wgpu**; 3D lighting is adapted from Google's **Filament**. **Typst** typesets text and math; **mitex** translates LaTeX input.

# SEE ALSO

[manim](/man/manim)(1), [python](/man/python)(1), [pip](/man/pip)(1), [ffmpeg](/man/ffmpeg)(1), [rustc](/man/rustc)(1), [uv](/man/uv)(1)

# RESOURCES

```[Source code](https://github.com/academa-labs/manimgx)```

```[Homepage](https://manimgx.academa.ai/)```

```[Documentation](https://manimgx.academa.ai/user-guide/quickstart/)```

<!-- verified: 2026-10-11 -->
