# TAGLINE

Terminal-based video trimming tool

# TLDR

**Trim a video** file interactively in the terminal

```lazycut [video.mp4]```

**Open a specific video** for trimming

```lazycut [path/to/file.mkv]```

# SYNOPSIS

**lazycut** _video-file_

# DESCRIPTION

**lazycut** is a terminal-based video trimming tool that provides an interactive TUI for marking in/out points and exporting trimmed video clips. It renders video frames directly in the terminal using **chafa** and processes cuts with **FFmpeg**, allowing quick and precise trimming without leaving the command line.

The interface uses vim-style keybindings for navigation and supports repeat counts for seeking (e.g., **5l** seeks forward 5 seconds). After setting in and out points, pressing Enter exports the trimmed clip.

# KEYBOARD CONTROLS

**Space**
> Play or pause playback.

**h** / **l**
> Seek backward or forward 1 second.

**H** / **L**
> Seek backward or forward 5 seconds.

**i** / **o**
> Set the in point or out point for trimming.

**Enter**
> Export the trimmed clip.

**?**
> Display help menu.

**q**
> Quit the application.

# CAVEATS

Requires both **FFmpeg** and **chafa** to be installed and available in PATH. Terminal rendering quality depends on the terminal emulator's capabilities and font size. Not available in standard Linux distribution package managers — must be installed via Homebrew or built from source.

# HISTORY

**lazycut** was created by **Emin Ozata** and first released on **GitHub** as an open-source project under the **MIT license**. Written entirely in **Go**, it gained visibility after appearing on Hacker News. The tool provides a lightweight alternative to GUI video editors for simple trimming tasks.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [chafa](/man/chafa)(1)
