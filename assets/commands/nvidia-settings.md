# TAGLINE

configures NVIDIA graphics driver settings

# TLDR

**Open settings GUI**

```nvidia-settings```

**Query GPU temperature**

```nvidia-settings -q GPUCoreTemp```

**Set fan speed**

```nvidia-settings -a "[gpu:0]/GPUFanControlState=1" -a "[fan:0]/GPUTargetFanSpeed=[70]"```

**Query all attributes**

```nvidia-settings -q all```

**Load settings from file**

```nvidia-settings --load-config-only```

**Set PowerMizer mode**

```nvidia-settings -a "[gpu:0]/GPUPowerMizerMode=[1]"```

# SYNOPSIS

**nvidia-settings** [_options_]

# PARAMETERS

**-q** _attr_
> Query attribute.

**-a** _attr=value_
> Assign attribute.

**-c** _display_
> X display to use.

**--load-config-only**
> Load config, exit.

**-t**
> Terse output.

**-V** _attr_
> Show valid values.

# DESCRIPTION

**nvidia-settings** configures NVIDIA graphics driver settings. It provides a GUI and command-line interface for adjusting display, performance, and GPU settings.

# COMMON ATTRIBUTES

```
GPUCoreTemp          - GPU temperature
GPUCurrentClockFreqs - Clock speeds
GPUFanControlState   - Manual fan control
GPUTargetFanSpeed    - Fan speed %
GPUPowerMizerMode    - Performance mode
```

# CONFIG FILE

```
# ~/.nvidia-settings-rc
[gpu:0]/GPUPowerMizerMode=1
[gpu:0]/GPUFanControlState=1
```

# CAVEATS

Requires NVIDIA proprietary driver. Some settings need X running. Fan control may void warranty. Settings reset on driver update.

# HISTORY

nvidia-settings is developed by **NVIDIA Corporation** as the official configuration tool for their Linux graphics drivers.

# SEE ALSO

[nvidia-smi](/man/nvidia-smi)(1), [xrandr](/man/xrandr)(1), [xorg.conf](/man/xorg.conf)(5)
