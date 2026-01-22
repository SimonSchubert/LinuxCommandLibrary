# TLDR

**Launch Cheese webcam application**

```cheese```

**Start in fullscreen mode**

```cheese --fullscreen```

**Start in wide mode (thumbnails on right)**

```cheese --wide```

**Use a specific video device**

```cheese --device=[/dev/video0]```

# SYNOPSIS

**cheese** [**-w**|**--wide**] [**-d**|**--device** _DEVICE_] [**-f**|**--fullscreen**] [**-h**|**--help**] [**-v**|**--version**]

# DESCRIPTION

**Cheese** is a GNOME webcam application that takes photos and videos from your webcam. It functions as a virtual photo booth with real-time preview, visual effects, and easy sharing capabilities.

The application supports over 20 visual effects including distortions, color filters, and artistic overlays powered by GStreamer. Captured photos are saved to **~/Pictures** and videos to **~/Videos**.

# PARAMETERS

**-w, --wide**
> Start in wide mode with thumbnails displayed to the right of the video preview

**-d, --device** _DEVICE_
> Use the specified device as the video capture device (e.g., /dev/video0)

**-f, --fullscreen**
> Start in fullscreen mode

**-h, --help**
> Print help information and exit

**-v, --version**
> Print version information and exit

# CAVEATS

Requires a working webcam with Video4Linux (V4L2) support. Effects availability depends on GStreamer plugins installed on the system.

# HISTORY

**Cheese** was created as part of **Google Summer of Code 2007** by Daniel G. Siegel, mentored by Raphaël Slinckx. It has since become part of the GNOME desktop suite, using GStreamer for video processing and effects.

# SEE ALSO

[guvcview](/man/guvcview)(1), [v4l2-ctl](/man/v4l2-ctl)(1)
