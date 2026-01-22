# TLDR

**Show** current readings of all sensor chips

```sensors```

**Show** temperatures in Fahrenheit

```sensors --fahrenheit```

**Show** output in raw format

```sensors -u```

**Show** only a specific chip

```sensors [chip_name]```

# SYNOPSIS

**sensors** [_options_] [_chip_...]

# PARAMETERS

**-f, --fahrenheit**
> Show temperatures in Fahrenheit

**-u**
> Raw output format

**-A**
> Do not show chip adapters

**-j**
> Output in JSON format

**--no-adapter**
> Do not show adapter information

# DESCRIPTION

**sensors** displays the current readings of all sensor chips supported by libsensors. This includes CPU temperatures, fan speeds, voltages, and other hardware monitoring data.

The output is organized by chip, showing adapter type and individual sensor readings with current values, limits, and alarm status.

# CAVEATS

Requires the lm-sensors package. Run **sensors-detect** first to detect and configure available sensors. Some sensors may require kernel modules to be loaded. Part of the lm-sensors package.

# SEE ALSO

[sensors-detect](/man/sensors-detect)(8)
