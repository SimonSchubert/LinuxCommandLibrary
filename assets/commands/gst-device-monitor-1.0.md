# TAGLINE

GStreamer multimedia device detection tool

# TLDR

**List all devices**

```gst-device-monitor-1.0```

**Monitor for device changes**

```gst-device-monitor-1.0 --follow```

**List audio sources only**

```gst-device-monitor-1.0 Audio/Source```

**List video sources**

```gst-device-monitor-1.0 Video/Source```

**Include hidden devices**

```gst-device-monitor-1.0 --include-hidden```

**Filter by capabilities**

```gst-device-monitor-1.0 Video/Source:video/x-raw```

# SYNOPSIS

**gst-device-monitor-1.0** [_options_] [_filter_]

# PARAMETERS

**-f**, **--follow**
> Continue monitoring for device changes.

**-i**, **--include-hidden**
> Include devices from hidden providers.

**--help**
> Show help synopsis.

**--version**
> Print version and exit.

# DESCRIPTION

**gst-device-monitor-1.0** is a GStreamer tool for detecting and listing available multimedia devices. It shows audio sources (microphones), audio sinks (speakers), video sources (webcams), and other media devices.

By default, it lists all devices and exits. Use **--follow** to continuously monitor for device additions and removals.

# CAVEATS

Requires GStreamer 1.4+ with appropriate plugins. Device detection depends on installed plugins (ALSA, PulseAudio, V4L2). May require proper permissions to detect some devices.

# SEE ALSO

[gst-launch-1.0](/man/gst-launch-1.0)(1), [gst-inspect-1.0](/man/gst-inspect-1.0)(1)
