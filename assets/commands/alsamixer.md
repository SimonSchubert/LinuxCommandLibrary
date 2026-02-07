# TAGLINE

Interactive ncurses audio mixer

# TLDR

Select the **soundcard** to use

```alsamixer -c [soundcard_number]```

Select **mixer device** to control

```alsamixer -D [device_name]```

Start in **playback** view mode

```alsamixer -V playback```

Start with **black background**

```alsamixer -B```

# SYNOPSIS

**alsamixer** [_-c card_] [_-D device_] [_-V mode_]

# DESCRIPTION

**alsamixer** is an ncurses mixer program for use with the ALSA soundcard drivers. It supports multiple soundcards with multiple devices and provides a graphical interface for adjusting audio levels.

# PARAMETERS

**-c, --card number**
> Select soundcard (numbered from 0)

**-D, --device id**
> Select mixer device to control

**-V, --view mode**
> Set starting view (playback, capture, or all)

**-B, --black-background**
> Use black background color

**-g, --no-color**
> Disable colors

# KEYBOARD SHORTCUTS

**Navigation:**
> Left/Right arrows or n/p: select channels
> Up/Down arrows or +/-: adjust volume

**Volume Control:**
> PageUp/PageDown: increase/decrease by 5%
> End: set to 0%
> 0-9: set to 0-90% volume
> Q/W/E: raise left/both/right
> Z/X/C: lower left/both/right

**Muting & Capture:**
> M: toggle mute (both channels)
> Space: enable recording for current channel

**View Modes:**
> F3/F4/F5: playback/capture/all modes
> Tab: toggle views circularly
> F6 or S: select sound card

**Other:**
> B or =: balance left/right channels
> L: redraw screen
> Esc or Alt+Q: quit

# CONFIGURATION

**/etc/asound.conf**
> System-wide ALSA configuration file.

**~/.asoundrc**
> Per-user ALSA configuration file for custom device definitions and plugin settings.

# CAVEATS

Requires ALSA drivers to be installed and configured. Some options may not be available depending on the soundcard capabilities.

# HISTORY

Part of the **ALSA** (Advanced Linux Sound Architecture) utilities package, which replaced OSS as the standard Linux sound system.

# SEE ALSO

[amixer](/man/amixer)(1), [aplay](/man/aplay)(1), [arecord](/man/arecord)(1)
