# TAGLINE

Create virtual loopback audio devices

# TLDR

Create a **loopback device** with default behavior

```pw-loopback```

Create a loopback device that automatically connects to the **speakers**

```pw-loopback -m '[FL FR]' -i 'media.class=Audio/Sink'```

Create a loopback device that automatically connects to the **microphone**

```pw-loopback -m '[FL FR]' -o 'media.class=Audio/Source'```

Create a **dummy loopback** device that doesn't automatically connect

```pw-loopback -m '[FL FR]' -i 'media.class=Audio/Sink' -o 'media.class=Audio/Source'```

Create a loopback that **swaps left and right channels** to speakers

```pw-loopback -i 'media.class=Audio/Sink audio.position=[FL FR]' -o 'audio.position=[FR FL]'```

# SYNOPSIS

**pw-loopback** [_options_]

# PARAMETERS

**-m**, **--channel-map** _map_
> Set the channel map for the loopback

**-i**, **--capture-props** _props_
> Set properties for the capture side (sink)

**-o**, **--playback-props** _props_
> Set properties for the playback side (source)

**-h**, **--help**
> Display help message

# DESCRIPTION

**pw-loopback** creates virtual loopback audio devices in PipeWire. Loopback devices capture audio from one source and play it back to another destination, enabling audio routing between applications or devices.

The tool can create sink devices (for capturing audio output), source devices (for providing audio input), or combined loopback configurations for audio monitoring and routing.

# CAVEATS

Channel mapping and media class properties must be specified correctly for proper automatic connection behavior. Incorrect configuration may result in audio routing issues or silent devices.

# HISTORY

Part of **PipeWire**, the modern multimedia framework for Linux. Provides flexible audio routing capabilities similar to PulseAudio's module-loopback but with PipeWire's graph-based architecture.

# SEE ALSO

[pipewire](/man/pipewire)(1), [pw-cli](/man/pw-cli)(1), [pw-link](/man/pw-link)(1)
