# TAGLINE

PipeWire daemon variant for AVB audio-video bridging

# TLDR

**Start the AVB PipeWire daemon** with the default configuration

```pipewire-avb```

**Use a custom configuration file**

```pipewire-avb -c [path/to/pipewire-avb.conf]```

**Increase log verbosity**

```pipewire-avb -v```

**Show version information**

```pipewire-avb --version```

# SYNOPSIS

**pipewire-avb** [_options_]

# PARAMETERS

**-h**, **--help**
> Show help text and exit.

**-v**, **--verbose**
> Increase logging verbosity (may be repeated).

**--version**
> Show version information and exit.

**-c** _FILE_, **--config**=_FILE_
> Load the given configuration file (default **pipewire-avb.conf**).

**-P** _PROPS_, **--properties**=_PROPS_
> Add JSON properties to the daemon context.

# DESCRIPTION

**pipewire-avb** is a PipeWire daemon launched with an **AVB**-tailored configuration. AVB (Audio Video Bridging) is a set of IEEE 802.1 standards (gPTP, FQTSS, MSRP, AVTP) that provide deterministic, low-latency, time-synchronised media streaming over standard Ethernet. It is widely used in pro-audio, automotive, and broadcast environments.

The daemon loads the **avb** module to discover and announce AVB streams (talkers and listeners) on a chosen network interface, sets up a gPTP-driven media clock, and exposes streams as native PipeWire nodes. Standard PulseAudio, ALSA, and JACK clients can then send audio to or receive from AVB endpoints.

The binary is typically a symlink to **pipewire**(1); the program selects its default configuration based on **argv[0]**.

# CONFIGURATION

The default configuration is **/usr/share/pipewire/pipewire-avb.conf**. Copy it to **/etc/pipewire/** for system-wide changes or to **~/.config/pipewire/** for per-user changes. Drop-in fragments may be placed in a matching **pipewire-avb.conf.d/** directory.

The configuration selects the AVB network interface, gPTP clock parameters, and stream topology.

# CAVEATS

Requires a network interface and switch infrastructure that support **AVB/TSN** (gPTP and SRP) for guaranteed bandwidth and timing. Stream discovery uses the layer-2 protocols MSRP and MVRP, which often require **CAP_NET_ADMIN** capabilities or root privileges. Marked **EXPERIMENTAL** in upstream PipeWire releases.

# HISTORY

AVB support was added to **PipeWire** as part of its push into professional networked audio. PipeWire was created by **Wim Taymans** at Red Hat and first released in **2017**, and now ships as the default audio server in major Linux distributions.

# SEE ALSO

[pipewire](/man/pipewire)(1), [pipewire-aes67](/man/pipewire-aes67)(1), [pipewire-pulse](/man/pipewire-pulse)(1), [pw-cli](/man/pw-cli)(1), [pw-dump](/man/pw-dump)(1)
