# TLDR

**Publish PulseAudio to X11**

```pax11publish -e```

**Remove X11 properties**

```pax11publish -r```

**Show current settings**

```pax11publish -d```

**Set display**

```pax11publish -e -d [display]```

# SYNOPSIS

**pax11publish** [_options_]

# PARAMETERS

**-e**
> Export/publish settings.

**-r**
> Remove settings.

**-d**
> Display settings.

**-S** _SERVER_
> Server string.

# DESCRIPTION

**pax11publish** manages PulseAudio X11 settings. Publishes server info to X properties.

The tool enables X11 session audio. Part of PulseAudio.

pax11publish manages X11 audio.

# CAVEATS

Part of PulseAudio. X11 specific. Session startup utility.

# HISTORY

pax11publish enables **PulseAudio X11 session** integration.

# SEE ALSO

[pulseaudio](/man/pulseaudio)(1), [pactl](/man/pactl)(1)

