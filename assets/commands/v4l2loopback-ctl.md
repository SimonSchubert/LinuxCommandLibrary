# TAGLINE

Control v4l2 loopback devices

# TLDR

**Create a new loopback device** with a custom name

```sudo v4l2loopback-ctl add -n "[My Virtual Camera]"```

**List all** v4l2 loopback devices

```v4l2loopback-ctl list```

**Delete** a loopback device

```sudo v4l2loopback-ctl delete /dev/video[0]```

**Query** a device for its properties

```v4l2loopback-ctl query /dev/video[0]```

**Set the frame rate** of a device

```v4l2loopback-ctl set-fps /dev/video[0] [30]```

**Set the format capabilities** of a device

```v4l2loopback-ctl set-caps /dev/video[0] "[UYVY:1024x768@30/1]"```

**Set a timeout image** displayed when no producer is active

```v4l2loopback-ctl set-timeout-image -t [3000] /dev/video[0] [path/to/image.png]```

# SYNOPSIS

**v4l2loopback-ctl** [_options_]

**v4l2loopback-ctl** **add** [_options_] [_outputdevice_ [_capturedevice_]]

**v4l2loopback-ctl** **delete** _device_

**v4l2loopback-ctl** **list** [_options_]

**v4l2loopback-ctl** **query** [_options_] _device_

**v4l2loopback-ctl** **set-fps** _device_ _fps_

**v4l2loopback-ctl** **set-caps** _device_ _caps_

**v4l2loopback-ctl** **set-timeout-image** [_options_] _device_ _image_

# PARAMETERS

**-h**, **-?**, **--help**
> Display help information and exit.

**-v**, **--version**
> Show version and exit.

# ADD OPTIONS

**-b** _num_, **--buffers** _num_
> Number of buffers in the queue.

**-w** _w_, **--max-width** _w_
> Maximum frame width.

**-h** _h_, **--max-height** _h_
> Maximum frame height.

**--min-width** _w_
> Minimum frame width.

**--min-height** _h_
> Minimum frame height.

**-n** _name_, **--name** _name_
> Device name shown in applications.

**-o** _num_, **--max-openers** _num_
> Maximum number of concurrent openers.

**-x** _x_, **--exclusive-caps** _x_
> Announce exclusive capabilities (0 or 1).

# SET-CAPS FORMAT

The caps argument uses the format **'_fourcc_:_width_x_height_@_fps_'**, for example **'UYVY:1024x768@60/1'**. Use **'any'** to unset current caps.

# SET-TIMEOUT-IMAGE OPTIONS

**-t** _timeout_, **--timeout** _timeout_
> Timeout duration in milliseconds before the fallback image is displayed.

# DESCRIPTION

**v4l2loopback-ctl** is a utility for managing virtual video loopback devices created by the **v4l2loopback** kernel module. These virtual devices act as pipes: one application feeds video frames into the device (producer), and another application reads them (consumer), enabling use cases like virtual webcams, screen sharing to video conferencing tools, and video processing pipelines.

The tool uses a verb-based interface with commands for creating, deleting, listing, and querying loopback devices, as well as configuring their frame rate, format capabilities, and fallback timeout images.

# CAVEATS

Requires the **v4l2loopback** kernel module to be loaded. Creating and deleting devices typically requires root privileges. The set-caps format string must exactly match the expected fourcc:WxH@fps pattern. Not all applications correctly detect or use loopback devices, especially when exclusive capabilities are not set.

# HISTORY

The **v4l2loopback** project was created by **IOhannes m zmölnig** to provide virtual video devices on Linux using the Video4Linux2 (V4L2) framework. It gained widespread adoption as a way to create virtual webcams, particularly popular during the rise of video conferencing. The **v4l2loopback-ctl** utility was added to provide a user-friendly interface for managing these devices without directly manipulating kernel module parameters.

# SEE ALSO

[v4l2-ctl](/man/v4l2-ctl)(1), [ffmpeg](/man/ffmpeg)(1), [modprobe](/man/modprobe)(8)
