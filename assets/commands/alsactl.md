# TAGLINE

Save and restore ALSA sound card settings.

# TLDR

**Store** current sound card settings

```sudo alsactl store```

**Restore** saved settings

```sudo alsactl restore```

Store settings for **specific card**

```sudo alsactl store [0]```

**Initialize** sound cards to default

```sudo alsactl init```

Restore with **debug output**

```sudo alsactl -d restore```

# SYNOPSIS

**alsactl** [_options_] _command_ [_card_]

# DESCRIPTION

**alsactl** is an ALSA soundcard control utility that manages sound card configuration state. It can save and restore mixer settings, volume levels, and other audio parameters.

The tool is typically called automatically during system startup and shutdown to preserve audio settings across reboots.

# PARAMETERS

**store** [_card_]
> Save current state to file

**restore** [_card_]
> Restore state from file

**init** [_card_]
> Initialize card to default state

**nrestore** [_card_]
> Restore but don't fail on missing state file

**monitor**
> Monitor driver events

**-f** _file_
> Configuration file (default: /var/lib/alsa/asound.state)

**-d**
> Debug mode

**-F**
> Force restore even if card is busy

# CONFIGURATION

**/var/lib/alsa/asound.state**
> Default state file where mixer settings and volume levels are saved and restored from. Can also be located at /etc/asound.state on some distributions.

# CAVEATS

Requires root privileges for system-wide operations. State files are card-specific; moving a card to a different slot may cause issues. Some driver updates may invalidate saved state.

# HISTORY

**alsactl** has been part of the ALSA (Advanced Linux Sound Architecture) project since ALSA replaced OSS (Open Sound System) as the standard Linux audio framework in the early **2000s**.

# SEE ALSO

[alsamixer](/man/alsamixer)(1), [amixer](/man/amixer)(1), [aplay](/man/aplay)(1)
