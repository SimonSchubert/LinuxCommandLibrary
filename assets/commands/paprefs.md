# TAGLINE

PulseAudio preferences GUI

# TLDR

**Open PulseAudio preferences**

```paprefs```

# SYNOPSIS

**paprefs**

# PARAMETERS

No command-line parameters. GUI application.

# DESCRIPTION

**paprefs** is a GTK-based configuration dialog for the PulseAudio sound server. It provides tabs for configuring network access (allowing other machines to play sound on local devices), network server settings (making local PulseAudio discoverable), simultaneous output (playing audio to multiple sinks at once), and multicast/RTP streaming.

# CAVEATS

Requires PulseAudio with module-gconf loaded in the sound server. Can only configure local servers. Not applicable to PipeWire-only setups unless PulseAudio compatibility is enabled.

# HISTORY

paprefs was created for **PulseAudio** network and module configuration.

# SEE ALSO

[pavucontrol](/man/pavucontrol)(1), [pulseaudio](/man/pulseaudio)(1), [pactl](/man/pactl)(1)

