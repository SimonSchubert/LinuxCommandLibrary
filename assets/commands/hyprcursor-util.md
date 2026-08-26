# TAGLINE

compile and extract Hyprcursor cursor themes

# TLDR

**Compile** a working-directory theme into Hyprcursor format

```hyprcursor-util -c [path/to/theme_directory]```

**Extract** an XCursor theme into a working directory of PNG/SVG shapes

```hyprcursor-util -x [path/to/xcursor_theme]```

Write output under a **parent directory** (theme lands in a subdirectory)

```hyprcursor-util -c [path/to/theme_directory] -o [path/to/output]```

Extract with a specific **resize** algorithm

```hyprcursor-util --extract [path/to/xcursor_theme] --resize nearest```

# SYNOPSIS

**hyprcursor-util** {**-c**|**--create** | **-x**|**--extract**} _path_ [_options_]

# PARAMETERS

**-c**, **--create** _path_
> Compile a working-state theme (PNG/SVG + metadata files) into a Hyprcursor theme apps and compositors can load.

**-x**, **--extract** _path_
> Unpack an XCursor theme into working-state files.

**-o**, **--output** _dir_
> Parent directory for output. Since 0.1.2 the theme is written to a subdirectory named `$ACTION_$NAME` under this path.

**--resize** _mode_
> For **--extract** only: default resize algorithm for shapes. One of **none** (default), **nearest**, or **bilinear**.

# DESCRIPTION

**hyprcursor-util** converts cursor themes between Hyprland's Hyprcursor format and a working tree of images plus metadata. A **working state** is easy to edit: every cursor is a PNG or SVG and metadata lives in files. **Compiled Hyprcursor** is what compositors load. **Compiled XCursor** is the older X11 format.

Typical flow: extract an existing XCursor theme, edit shapes, then create a Hyprcursor theme. Runtime conversion from XCursor also needs **xcur2png**.

# CAVEATS

**--output** on versions older than 0.1.1 deleted the target directory without asking. Use 0.1.1 or later. Creating a theme requires a valid working-state layout, not a random folder of images.

# HISTORY

Part of **hyprcursor**, the cursor toolkit for Hyprland by Vaxry.

# INSTALL

```apk: sudo apk add hyprcursor-util```

<!-- packages: 2026-08-26 -->

# SEE ALSO

[hyprland](/man/hyprland)(1), [hyprctl](/man/hyprctl)(1)

# RESOURCES

```[Source code](https://github.com/hyprwm/hyprcursor)```

```[Documentation](https://github.com/hyprwm/hyprcursor/blob/main/hyprcursor-util/README.md)```

<!-- verified: 2026-08-26 -->
