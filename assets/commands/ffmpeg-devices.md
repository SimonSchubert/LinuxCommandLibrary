# TLDR

**List available devices**

```ffmpeg -devices```

**Capture from webcam**

```ffmpeg -f v4l2 -i [/dev/video0] [output.mp4]```

**Record screen** (X11)

```ffmpeg -f x11grab -i [:0.0] [screen.mp4]```

**Capture audio device**

```ffmpeg -f alsa -i [hw:0] [audio.wav]```

**List webcam formats**

```ffmpeg -f v4l2 -list_formats all -i [/dev/video0]```

# SYNOPSIS

**ffmpeg** **-f** _device_ [_options_] **-i** _source_ _output_

# PARAMETERS

**-f** _DEVICE_
> Device type: v4l2, x11grab, alsa, pulse, dshow.

**-i** _SOURCE_
> Device path or identifier.

**v4l2**
> Video4Linux2 webcam capture.

**x11grab**
> X11 screen capture.

**alsa**
> ALSA audio capture.

**pulse**
> PulseAudio capture.

**dshow**
> DirectShow (Windows) capture.

**-list_devices**
> List available devices.

# DESCRIPTION

**ffmpeg devices** enable capturing from hardware sources like webcams, microphones, and screens. Device-specific input formats provide access to system multimedia hardware.

Different platforms have different device types: v4l2 and x11grab on Linux, avfoundation on macOS, and dshow on Windows. Each device type has specific options for resolution, framerate, and format.

Device capture enables recording, streaming, and real-time processing of live input sources.

# CAVEATS

Device names are platform-specific. Permissions may be required. Screen capture performance depends on system. Audio sync can be challenging.

# HISTORY

ffmpeg device support evolved with multimedia hardware APIs. V4L2 support came with Linux video devices, while screen grabbing capabilities were added for recording and streaming use cases.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [ffprobe](/man/ffprobe)(1), [v4l2-ctl](/man/v4l2-ctl)(1)
