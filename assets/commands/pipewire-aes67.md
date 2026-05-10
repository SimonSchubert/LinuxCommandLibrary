# TAGLINE

PipeWire daemon variant for AES67 audio-over-IP networking

# TLDR

**Start the AES67 PipeWire daemon** with the default configuration

```pipewire-aes67```

**Use a custom configuration file**

```pipewire-aes67 -c [path/to/pipewire-aes67.conf]```

**Increase log verbosity**

```pipewire-aes67 -v```

**Show version information**

```pipewire-aes67 --version```

# SYNOPSIS

**pipewire-aes67** [_options_]

# PARAMETERS

**-h**, **--help**
> Show help text and exit.

**-v**, **--verbose**
> Increase logging verbosity (may be repeated, e.g. **-vvv**).

**--version**
> Show version information and exit.

**-c** _FILE_, **--config**=_FILE_
> Load the given configuration file (default **pipewire-aes67.conf**).

**-P** _PROPS_, **--properties**=_PROPS_
> Add JSON properties to the daemon context.

# DESCRIPTION

**pipewire-aes67** is a PipeWire daemon launched with an **AES67**-tailored configuration. AES67 is an open audio-over-IP interoperability standard (used by systems such as Dante and RAVENNA) that defines low-latency, uncompressed PCM audio transport over standard Ethernet using **RTP**, **PTP** for clock sync, and **SAP/SDP** for stream announcements.

In its default configuration the daemon configures a Precision Time Protocol (PTP) hardware clock node, multicast RTP transmitters and receivers, and SAP announcement modules, exposing AES67 streams as native PipeWire devices. Existing audio applications using ALSA, PulseAudio, or JACK clients can then send to or receive from AES67 endpoints transparently.

The binary is typically a symlink to **pipewire**(1); the program selects its default configuration based on **argv[0]**.

# CONFIGURATION

The default configuration is **/usr/share/pipewire/pipewire-aes67.conf**. Copy it to **/etc/pipewire/** for system-wide changes or to **~/.config/pipewire/** for per-user changes. Drop-in fragments may also be placed under a matching **pipewire-aes67.conf.d/** directory.

Key items to configure include the PTP clock interface or device, multicast network interface, sample rate, channel count, and per-stream RTP/SAP parameters.

# CAVEATS

Requires a working **PTP** time source on the local network and a network interface that supports multicast and (ideally) hardware timestamping. Verified interoperable with Dante and RAVENNA from PipeWire **1.1.0** onwards. Firewall rules must allow the relevant multicast and PTP traffic.

# HISTORY

AES67 support was added to **PipeWire** as part of its expanding professional audio capabilities, with full Dante and RAVENNA interoperability landing in PipeWire **1.1.0** (2024). PipeWire itself was created by **Wim Taymans** at Red Hat and first released in **2017**.

# SEE ALSO

[pipewire](/man/pipewire)(1), [pipewire-avb](/man/pipewire-avb)(1), [pipewire-pulse](/man/pipewire-pulse)(1), [pw-cli](/man/pw-cli)(1), [pw-dump](/man/pw-dump)(1)
