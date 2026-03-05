# TAGLINE

Screenshot, screencast, and image operations on the command line

# TLDR

**Capture a screenshot** of a window

```menyoki capture```

**Record a screencast** as GIF

```menyoki record```

**Edit an image**

```menyoki edit [path/to/image]```

**Analyze an image**

```menyoki analyze [path/to/image]```

**View an image** in the terminal

```menyoki view [path/to/image]```

# SYNOPSIS

**menyoki** _command_ [_options_]

# DESCRIPTION

**menyoki** is a screenshot and screencast utility that can also perform various image operations such as making/splitting GIFs and modifying/analyzing/viewing image files. Originally designed for recording terminal windows, it can be adapted for other purposes.

Subcommands include **capture** for screenshots, **record** for screencasts, **split** and **make** for GIF operations, **edit** for image manipulation, **analyze** for image analysis, and **view** for terminal image display. Output formats include PNG, JPG, PNM, and GIF.

# CAVEATS

Screen capture requires X11 on Linux. Key bindings are only active during capture or record operations.

# HISTORY

**menyoki** was created by **Orhun Parmaksız** (orhun) and is written in **Rust**.

# SEE ALSO

[scrot](/man/scrot)(1), [import](/man/import)(1), [ffmpeg](/man/ffmpeg)(1)
