# TAGLINE

OpenGL rotating gears demo and sanity check

# TLDR

**Run the gears demo** (shows FPS in terminal)

```glxgears```

**Run in fullscreen mode**

```glxgears -fullscreen```

**Run without printing FPS**

```glxgears -info```

**Run at specific window size**

```glxgears -geometry [800x600]```

**Run with stereo rendering** (if supported)

```glxgears -stereo```

**Run without animation** (static image)

```glxgears -iacknowledgethatthistoolisnotabenchmark```

# SYNOPSIS

**glxgears** [_-display display_] [_-info_] [_-stereo_] [_-fullscreen_] [_-geometry WxH_]

# PARAMETERS

**-display** _display_
> Specify X display to use.

**-info**
> Print GL renderer info and suppress FPS output.

**-stereo**
> Enable stereo rendering (requires hardware support).

**-fullscreen**
> Run in fullscreen mode.

**-geometry** _WxH_
> Set window size (width x height).

**-iacknowledgethatthistoolisnotabenchmark**
> Disable animation (for static screenshots).

# DESCRIPTION

**glxgears** is an OpenGL demo that renders three rotating gears. It displays frames per second (FPS) in the terminal every 5 seconds, making it commonly used to verify that OpenGL and GPU acceleration are working correctly.

The application creates a simple GLX window and renders the classic gears animation using OpenGL. When working properly, modern systems typically show several thousand FPS (capped by vsync to monitor refresh rate when composited, or much higher when unthrottled).

The FPS display makes **glxgears** useful for quick GPU sanity checks: if you see reasonable FPS (hundreds to thousands) and smooth animation, OpenGL acceleration is working. Very low FPS (under 60) may indicate software rendering or driver issues.

Despite common use as a "benchmark," glxgears tests very little of modern GPU capabilities. It uses ancient OpenGL features that aren't representative of real application performance.

# CAVEATS

**NOT a valid benchmark** for GPU performance comparison. FPS varies wildly based on vsync, window size, compositing, and driver settings. Only tests minimal OpenGL functionality. Cannot detect many GPU driver issues. Stereo mode requires specific hardware.

# HISTORY

**glxgears** was written by Brian Paul around **1999** as part of Mesa, the open-source OpenGL implementation. It was created as a simple demo to test GLX (OpenGL Extension to X11) functionality. Despite disclaimers, it became widely misused as a benchmark due to its readily visible FPS counter. The "iacknowledgethatthistoolisnotabenchmark" flag was added as a humorous commentary on this misuse.

# SEE ALSO

[glxinfo](/man/glxinfo)(1), [vulkaninfo](/man/vulkaninfo)(1), [xdpyinfo](/man/xdpyinfo)(1), [vkcube](/man/vkcube)(1)
