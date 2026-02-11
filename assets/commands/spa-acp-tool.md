# TAGLINE

Debug ALSA card profiles for PipeWire

# TLDR

**List** all ALSA objects

```spa-acp-tool list```

**Probe** a specific ALSA card

```spa-acp-tool card [card_id]```

List available **profiles** for a card

```spa-acp-tool list-profiles [card_id]```

**Set** the active profile

```spa-acp-tool set-profile [profile_id]```

List available **devices**

```spa-acp-tool list-devices [card_id]```

**Get volume** from a device

```spa-acp-tool get-volume [device_id]```

**Set volume** on a device

```spa-acp-tool set-volume [device_id] [volume]```

**Toggle mute** on a device

```spa-acp-tool toggle-mute [device_id]```

# SYNOPSIS

**spa-acp-tool** [_OPTIONS_] [_COMMAND_]

# PARAMETERS

**-h, --help**
> Display help information

**-v, --verbose**
> Increase output verbosity

**-c, --card** _number_
> Select specific card for probing

**-p, --properties** _key=value_
> Pass additional properties to ACP

# COMMANDS

**list, l**
> List all ALSA objects

**list-verbose, lv**
> List objects with detailed information

**card, c** _id_
> Probe a specific card

**info, i**
> Display card information

**list-profiles, lpr**
> List available profiles

**set-profile, spr** _id_
> Set active profile

**list-ports, lpo**
> List available ports

**set-port, spo** _id_
> Set active port

**list-devices, ld**
> List available devices

**get-volume, gv** _id_
> Get device volume

**set-volume, v** _id_ _level_
> Set device volume

**toggle-mute, m** _id_
> Toggle device mute state

**quit, q**
> Exit the tool

# DESCRIPTION

**spa-acp-tool** is a debug utility for testing ALSA Card Profile (ACP) probing without running the full PipeWire daemon. It helps diagnose issues where PipeWire incorrectly configures ALSA card profiles.

The tool allows interactive exploration of sound cards, profiles, ports, and devices. It can test volume controls and mute states to verify proper hardware configuration before PipeWire uses the settings.

# CAVEATS

Designed for debugging only; changes may not persist. Requires appropriate permissions to access ALSA devices. Some operations may conflict with a running PipeWire instance. Part of the PipeWire/SPA ecosystem.

# HISTORY

**spa-acp-tool** is part of **PipeWire**, the modern multimedia framework developed by **Wim Taymans** at Red Hat starting around **2017**. PipeWire was designed to unify audio and video handling on Linux, replacing PulseAudio and JACK. The SPA (Simple Plugin API) tools help debug the low-level plugin infrastructure.

# SEE ALSO

[pipewire](/man/pipewire)(1), [pw-cli](/man/pw-cli)(1), [pactl](/man/pactl)(1), [alsamixer](/man/alsamixer)(1)
