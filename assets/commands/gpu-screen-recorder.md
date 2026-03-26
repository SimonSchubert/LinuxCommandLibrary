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
> Video source: window ID, monitor name, focused, portal, region, or V4L2 device path. Combine with |.

**-o** _FILE_
> Output file path, or directory in replay mode.

**-r** _SECONDS_
> Replay buffer duration in seconds (2-86400). Saves only on signal.

**-ro** _DIR_
> Regular recording output directory during replay/streaming mode.

**-c** _CONTAINER_
> Container format: mp4, mkv, flv, webm. Defaults to file extension.

**-f** _FPS_
> Frame rate (default: 60).

**-fm** _cfr|vfr|content_
> Frame rate mode (default: vfr).

**-k** _CODEC_
> Video codec: auto, h264, hevc, av1, vp8, vp9, hevc_hdr, av1_hdr (default: auto).

**-q** _QUALITY_
> Quality preset: medium, high, very_high, ultra (default: very_high). In CBR mode, specifies bitrate.

**-bm** _auto|qp|vbr|cbr_
> Bitrate mode (default: auto). CBR recommended for replay/streaming.

**-a** _SOURCE_
> Audio source: default_output, default_input, device:name, or app:name. Repeatable.

**-ac** _aac|opus|flac_
> Audio codec (default: opus for mp4/mkv, aac otherwise).

**-s** _WxH_
> Output resolution limit. Use 0x0 for original resolution.

**-cr** _limited|full_
> Color range (default: limited).

**-cursor** _yes|no_
> Include mouse cursor (default: yes).

**-encoder** _gpu|cpu_
> Encoding device (default: gpu). CPU limited to H264.

**-keyint** _SECONDS_
> Keyframe interval in seconds (default: 2.0).

**--list-capture-options**
> List available video capture sources.

**--list-audio-devices**
> List available audio devices.

**--list-application-audio**
> List available audio application names.

# DESCRIPTION

**gpu-screen-recorder** is a hardware-accelerated screen recorder that uses GPU encoding (NVIDIA NVENC, AMD VAAPI/AMF, or Intel VAAPI) for minimal CPU impact. It supports H264, HEVC, AV1, VP8, and VP9 codecs.

Key features include a replay buffer (recording the last N seconds like instant replay), support for both X11 and Wayland via portals, and efficient hardware encoding. The replay buffer is saved by sending SIGUSR1 to the process and stopped cleanly with SIGINT. The tool supports multiple monitors, specific window capture, region capture, and simultaneous system audio and microphone recording. A CPU fallback encoder is available for H264.

# CAVEATS

Requires compatible GPU with hardware encoding support (NVIDIA with NVENC, AMD with VAAPI/AMF, or Intel with VAAPI). Wayland support depends on desktop portal implementation. Some desktop environments may require additional configuration.

# HISTORY

gpu-screen-recorder was created to provide an efficient, GPU-accelerated alternative to software-based screen recorders. It's particularly popular among Linux gamers for its low overhead and instant replay capabilities.

# SEE ALSO

[obs](/man/obs)(1), [ffmpeg](/man/ffmpeg)(1), [wf-recorder](/man/wf-recorder)(1)
