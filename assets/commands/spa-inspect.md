# TAGLINE

Inspect PipeWire SPA plugin details

# TLDR

Display information about a **SPA plugin**

```spa-inspect [path/to/plugin.so]```

Inspect a **Bluetooth codec** plugin

```spa-inspect /usr/lib64/spa-0.2/bluez5/libspa-codec-bluez5-sbc.so```

Inspect an **audio convert** plugin

```spa-inspect /usr/lib64/spa-0.2/audioconvert/libspa-audioconvert.so```

# SYNOPSIS

**spa-inspect** _FILE_

# PARAMETERS

_FILE_
> Path to a SPA plugin shared object file (.so)

# DESCRIPTION

**spa-inspect** displays information about SPA (Simple Plugin API) plugins used by PipeWire. It lists the factories contained within a plugin and attempts to instantiate them, showing available interfaces and capabilities.

SPA plugins are the low-level building blocks of PipeWire, handling audio/video processing, device access, and format conversion. This tool helps developers and administrators understand what functionality each plugin provides.

# CAVEATS

Plugin paths vary by distribution and architecture (lib vs lib64). Some plugins may fail to instantiate without proper hardware or dependencies. Primarily useful for debugging and development purposes.

# HISTORY

**spa-inspect** is part of **PipeWire**, developed by **Wim Taymans** at Red Hat. PipeWire was created starting around **2017** as a unified multimedia framework for Linux, combining the capabilities of PulseAudio and JACK. The SPA layer provides the plugin architecture that makes PipeWire modular and extensible.

# SEE ALSO

[pipewire](/man/pipewire)(1), [spa-acp-tool](/man/spa-acp-tool)(1), [pw-cli](/man/pw-cli)(1)
