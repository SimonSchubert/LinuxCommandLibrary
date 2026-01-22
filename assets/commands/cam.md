# TLDR

**List** available cameras

```cam -l```

List **controls** of a camera

```cam -c [camera_index] --list-controls```

**Capture frames** to files

```cam -c [camera_index] -C=[frames] -F```

Display camera feed in a **window**

```cam -c [camera_index] -C -S```

# SYNOPSIS

**cam** [_options_]

# DESCRIPTION

**cam** is a command-line tool for interacting with cameras through the libcamera framework. It can list cameras, display their controls, capture frames, and show live video in a window.

libcamera provides a modern camera stack for Linux, replacing older V4L2-only approaches with a more flexible architecture.

# PARAMETERS

**-l, --list**
> List available cameras

**-c, --camera** _index_
> Select camera by index

**--list-controls**
> Show camera controls

**-C, --capture** _frames_
> Capture specified number of frames

**-F, --file**
> Write captured frames to files

**-S, --sdl**
> Display video in SDL window

# CAVEATS

Requires libcamera support, which may not be available for all cameras. Some cameras work better with direct V4L2 access.

# SEE ALSO

[v4l2-ctl](/man/v4l2-ctl)(1), [qcam](/man/qcam)(1)
