# TAGLINE

Hardware-accelerated screen recorder

# TLDR

Select a source using a **desktop portal** and record it

```gpu-screen-recorder -w portal -o [path/to/video.mp4]```

Specify a **specific video source**

```gpu-screen-recorder -w [screen|DP-1|HDMI-A1|...] -o [path/to/video.mp4]```

List **video capture** sources

```gpu-screen-recorder --list-capture-options```

List **audio capture** sources

```gpu-screen-recorder --list-audio-devices```

Record using the **replay buffer**

```gpu-screen-recorder -w screen -r 30 -c mp4 -ro [path/to/directory] -o whatever```

**Capture** a video from the replay buffer

```pkill -SIGUSR1 -f gpu-screen-recorder```

Run gpu-screen-recorder in the **background**

```systemctl start --user gpu-screen-recorder```

# SYNOPSIS

**gpu-screen-recorder** [_options_] **-w** _source_ **-o** _output_

# PARAMETERS

**-w** _SOURCE_
> Video source: screen, portal, or specific output name

**-o** _FILE_
> Output file path

**-r** _SECONDS_
> Replay buffer duration in seconds

**-ro** _DIR_
> Replay output directory

**-c** _CONTAINER_
> Container format: mp4, mkv, flv, etc.

**-f** _FPS_
> Frame rate (default: 60)

**-q** _QUALITY_
> Quality preset: ultra, high, medium, low

**-a** _DEVICE_
> Audio device to record

**--list-capture-options**
> List available video capture sources

**--list-audio-devices**
> List available audio devices

# DESCRIPTION

**gpu-screen-recorder** is a hardware-accelerated screen recorder that uses GPU encoding (NVENC, VAAPI, or AMF) for minimal CPU impact. It is designed for recording gameplay and screen content with low performance overhead.

Key features include a replay buffer (recording the last N seconds like instant replay), support for both X11 and Wayland via portals, and efficient hardware encoding. The replay buffer can be triggered to save via SIGUSR1 signal. The tool supports multiple monitors, specific window capture, and simultaneous system audio and microphone recording.

# CAVEATS

Requires compatible GPU with hardware encoding support (NVIDIA with NVENC, AMD with VAAPI/AMF, or Intel with VAAPI). Wayland support depends on desktop portal implementation. Some desktop environments may require additional configuration.

# HISTORY

gpu-screen-recorder was created to provide an efficient, GPU-accelerated alternative to software-based screen recorders. It's particularly popular among Linux gamers for its low overhead and instant replay capabilities.

# SEE ALSO

[obs](/man/obs)(1), [ffmpeg](/man/ffmpeg)(1), [wf-recorder](/man/wf-recorder)(1)
