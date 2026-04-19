# TAGLINE

real-time media server and proxy that supports multiple streaming protocols

# TLDR

**Run** MediaMTX

```mediamtx```

Run MediaMTX with a **custom configuration** location

```mediamtx [path/to/config.yml]```

Start MediaMTX as a **daemon**

```systemctl start mediamtx```

# SYNOPSIS

**mediamtx** [_config_file_]

# DESCRIPTION

**MediaMTX** (formerly rtsp-simple-server) is a real-time media server and proxy that supports multiple streaming protocols. It can receive, transcode, and redistribute video/audio streams from various sources.

Supported protocols include **RTSP**, **RTMP**, **HLS**, **WebRTC**, and **SRT**. The server can act as a proxy for IP cameras, a restreaming hub, or a recording server. It handles on-demand stream publishing and automatic reconnection.

Configuration is done via a YAML file specifying paths, authentication, encryption, and protocol-specific settings. Without a config file, default settings are used.

# PARAMETERS

**_config_file_**
> Path to a YAML configuration file (optional; uses defaults if not specified)

# CAVEATS

Requires appropriate network ports to be available. Defaults: 8554 (RTSP/TCP), 8000/8001 (RTSP UDP RTP/RTCP), 1935 (RTMP), 8888 (HLS), 8889 (WebRTC HTTP), 8189 (WebRTC ICE/UDP), 8890 (SRT/UDP), 9997 (HTTP API). Firewall rules may need adjustment for external access. Performance depends on available CPU for transcoding operations.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [vlc](/man/vlc)(1)
