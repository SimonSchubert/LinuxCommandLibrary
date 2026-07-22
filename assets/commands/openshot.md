# TAGLINE

video Editor

# TLDR

**Start OpenShot**

```openshot-qt```

**Open a project file**

```openshot-qt [project.osp]```

**Open with a media file** added to the project

```openshot-qt [video.mp4]```

**Run with debug logging** enabled

```openshot-qt --debug```

# SYNOPSIS

**openshot-qt** [_options_] [_file_...]

# PARAMETERS

_FILE_
> One or more project (.osp) or media files to open at startup.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version.

**--debug**
> Enable verbose debug logging to stdout.

**--lang** _CODE_
> Force the user-interface language (e.g., `en_US`, `de_DE`).

**--list-languages**
> List available interface languages.

# DESCRIPTION

**openshot-qt** launches the OpenShot Video Editor, a free, cross-platform non-linear video editor built on Qt and the libopenshot rendering library.

The application supports multi-track timeline editing, transitions, animated titles, key-frame animation, and a wide range of audio/video codecs through FFmpeg. Project files use the **.osp** extension and store JSON-serialized clip and timeline metadata.

# CAVEATS

GUI application. Requires display. Resource intensive for complex projects.

# HISTORY

OpenShot was created as a **free, open-source video editor** for Linux, macOS, and Windows.

# INSTALL

```dnf: sudo dnf install openshot```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[kdenlive](/man/kdenlive)(1), [shotcut](/man/shotcut)(1), [ffmpeg](/man/ffmpeg)(1)

