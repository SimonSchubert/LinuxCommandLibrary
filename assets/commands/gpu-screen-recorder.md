# TAGLINE

Hardware-accelerated screen recorder

# TLDR

Record a monitor to a file

```gpu-screen-recorder -w screen -o [path/to/video.mp4]```

Let the **desktop portal** choose the source, which is how Wayland grants access

```gpu-screen-recorder -w portal -o [path/to/video.mp4]```

Record **one named output**

```gpu-screen-recorder -w [DP-1] -o [path/to/video.mp4]```

Show the **capture sources** this machine offers

```gpu-screen-recorder --list-capture-options```

Show the **audio devices** available

```gpu-screen-recorder --list-audio-devices```

Record **desktop audio** alongside the video

```gpu-screen-recorder -w screen -a default_output -o [path/to/video.mp4]```

Match the **frame rate** of a high refresh monitor

```gpu-screen-recorder -w screen -f [144] -o [path/to/video.mp4]```

Choose the **codec and container**

```gpu-screen-recorder -w screen -k h264 -c mkv -o [path/to/video.mkv]```

Use **constant bitrate**, which keeps memory use steady in high motion scenes

```gpu-screen-recorder -w screen -bm cbr -q [40000] -o [path/to/video.mp4]```

Keep the **last 30 seconds in a replay buffer**, writing into a directory

```gpu-screen-recorder -w screen -c mkv -r [30] -o [path/to/directory]```

**Save** whatever is in the replay buffer

```pkill -SIGUSR1 -f gpu-screen-recorder```

**Stop** recording and close the file cleanly

```pkill -SIGINT -f gpu-screen-recorder```

Run a **script each time a video is saved**

```gpu-screen-recorder -w screen -sc [path/to/script.sh] -o [path/to/video.mp4]```

Start the replay buffer **at login**, as a user service

```systemctl enable --now --user gpu-screen-recorder```

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

# INSTALL

```pacman: sudo pacman -S gpu-screen-recorder```

```zypper: sudo zypper install gpu-screen-recorder```

```nix: nix profile install nixpkgs#gpu-screen-recorder```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[obs](/man/obs)(1), [ffmpeg](/man/ffmpeg)(1), [wf-recorder](/man/wf-recorder)(1)
