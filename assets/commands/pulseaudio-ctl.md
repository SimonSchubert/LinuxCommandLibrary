# TLDR

**Increase** volume by 5%

```pulseaudio-ctl up```

Increase volume by a **specific amount**

```pulseaudio-ctl up 10```

**Decrease** volume by 5%

```pulseaudio-ctl down```

**Set** volume to a specific percentage

```pulseaudio-ctl set 50```

Set volume if current is **higher** than provided value

```pulseaudio-ctl atmost 80```

Toggle **mute**

```pulseaudio-ctl mute```

Toggle **microphone mute**

```pulseaudio-ctl mute-input```

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

# SEE ALSO

[pactl](/man/pactl)(1), [pamixer](/man/pamixer)(1), [amixer](/man/amixer)(1)
