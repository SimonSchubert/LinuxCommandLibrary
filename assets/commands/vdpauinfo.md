# TAGLINE

Display VDPAU video acceleration capabilities

# TLDR

**Display VDPAU capabilities**

```vdpauinfo```

**Show decoder capabilities only**

```vdpauinfo | grep -A20 "Decoder capabilities"```

# SYNOPSIS

**vdpauinfo**

# DESCRIPTION

**vdpauinfo** queries and displays the capabilities of the VDPAU (Video Decode and Presentation API for Unix) driver. It shows which video codecs can be hardware-accelerated and at what resolutions.

The output includes API version, decoder profiles supported (MPEG1, MPEG2, H.264, VC1, HEVC, VP9, AV1), maximum resolution and macroblock limits for each codec, video surface formats, and output surface capabilities.

This tool verifies that VDPAU is properly configured and helps determine which video content can benefit from GPU acceleration on NVIDIA hardware.

# OUTPUT SECTIONS

**API version**: VDPAU API and driver implementation versions.

**Decoder capabilities**: Supported codecs with resolution limits.

**Video surface formats**: Supported color formats for decoding.

**Output surface formats**: Formats for video output.

**Bitmap surface formats**: Overlay and OSD capabilities.

# CAVEATS

Requires VDPAU-capable NVIDIA GPU with proprietary drivers. Open-source nouveau driver needs firmware. Some newer codecs (VP9, AV1) require recent driver versions. Output varies by GPU generation.

# HISTORY

**vdpauinfo** was created as a diagnostic tool for NVIDIA's VDPAU API, introduced in 2009 with GeForce 8 series GPUs. VDPAU enabled GPU-accelerated video decoding on Linux, significantly reducing CPU usage for video playback. The tool helps users and developers verify hardware capabilities.

# SEE ALSO

[vainfo](/man/vainfo)(1), [nvidia-smi](/man/nvidia-smi)(1), [nvidia-settings](/man/nvidia-settings)(1)
