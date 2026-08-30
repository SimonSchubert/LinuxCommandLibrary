# TAGLINE

Simple PulseAudio volume control commands

# TLDR

Raise the volume by the **default 5% step**

```pulseaudio-ctl up```

Raise it by a **chosen amount**

```pulseaudio-ctl up [10]```

Lower it by the default step

```pulseaudio-ctl down```

Lower it by a chosen amount

```pulseaudio-ctl down [10]```

Jump to an **exact level**

```pulseaudio-ctl set [50]```

**Cap** the volume, lowering it only when it is above the limit

```pulseaudio-ctl atmost [80]```

Toggle **output mute**

```pulseaudio-ctl mute```

Toggle the **microphone** instead of the speakers

```pulseaudio-ctl mute-input```

Print the **volume and mute state** together

```pulseaudio-ctl full-status```

# SYNOPSIS

**pulseaudio-ctl** _command_ [_amount_]

# PARAMETERS

**up** [_amount_]
> Increase volume (default 5%)

**down** [_amount_]
> Decrease volume (default 5%)

**set** _percentage_
> Set volume to specific percentage

**atmost** _percentage_
> Set volume if current is higher

**mute**
> Toggle speaker mute

**mute-input**
> Toggle microphone mute

# DESCRIPTION

**pulseaudio-ctl** provides simple commands for controlling PulseAudio volume levels. It offers intuitive commands for increasing, decreasing, and setting volume, as well as muting speakers and microphone.

This tool is designed for easy integration with keyboard shortcuts and desktop environments.

# CAVEATS

Requires PulseAudio to be running. May not work with PipeWire unless PulseAudio compatibility layer is enabled.

# HISTORY

Developed as a lightweight shell script for easy PulseAudio volume control, commonly used with window managers and keyboard shortcut daemons.

# INSTALL

```apk: sudo apk add pulseaudio-ctl```

```nix: nix profile install nixpkgs#pulseaudio-ctl```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pactl](/man/pactl)(1), [pamixer](/man/pamixer)(1), [amixer](/man/amixer)(1)
