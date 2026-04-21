# TAGLINE

PipeWire SPA device debugging utility

# TLDR

**Load a SPA plugin** and instantiate a device from it

```spa-monitor [path/to/plugin.so]```

**Debug the JACK compatibility plugin**

```spa-monitor /usr/lib/x86_64-linux-gnu/spa-0.2/jack/libspa-jack.so```

**Debug the ALSA plugin**

```spa-monitor /usr/lib/x86_64-linux-gnu/spa-0.2/alsa/libspa-alsa.so```

**Debug the Bluetooth plugin**

```spa-monitor /usr/lib/x86_64-linux-gnu/spa-0.2/bluez5/libspa-bluez5.so```

**Debug the V4L2 video plugin**

```spa-monitor /usr/lib/x86_64-linux-gnu/spa-0.2/v4l2/libspa-v4l2.so```

# SYNOPSIS

**spa-monitor** _FILE_

# DESCRIPTION

**spa-monitor** is a small debugging utility shipped with **PipeWire**. It loads a **SPA** (Simple Plugin API) shared-object plugin and instantiates a device object from it so that developers can observe how the plugin enumerates hardware, advertises nodes, and emits events.

The tool is not intended for end users; it exists to help plugin authors and PipeWire developers verify that a SPA plugin initializes correctly, exposes the expected interfaces, and reports devices on the system bus. Running **spa-monitor** against a plugin prints diagnostic output describing the devices discovered and any errors encountered during instantiation.

Typical usage is pointing it at one of the plugin libraries under _/usr/lib/<triplet>/spa-0.2/_ to inspect how that plugin behaves on the current machine.

# PARAMETERS

_FILE_
> Path to a SPA plugin shared object (.so) file. The plugin is dlopen'd and a device is instantiated from it.

# CAVEATS

**spa-monitor** is a debugging aid: it is only useful to developers working on PipeWire device plugins. The program takes no flags and produces output that is only meaningful in the context of the SPA plugin API. It is shipped in the _pipewire-bin_ package on Debian/Ubuntu and _pipewire_ on Arch.

# HISTORY

Developed by the **PipeWire** project as part of the SPA plugin framework. PipeWire was created by **Wim Taymans** at **Red Hat** starting in **2015** as a unified server for audio and video on Linux, intended to eventually replace both **PulseAudio** and **JACK** for media handling.

# SEE ALSO

[pipewire](/man/pipewire)(1), [pw-cli](/man/pw-cli)(1), [pw-dump](/man/pw-dump)(1), [wpctl](/man/wpctl)(1)
