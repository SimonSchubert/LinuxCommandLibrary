# TAGLINE

Automated temperature-based fan speed control

# TLDR

Start with **default** configuration

```fancontrol```

Start with **custom** configuration file

```fancontrol [path/to/config_file]```

# SYNOPSIS

**fancontrol** [_config_file_]

# PARAMETERS

_config_file_
> Path to configuration (default: /etc/fancontrol).

# DESCRIPTION

**fancontrol** is a shell script from the lm-sensors package that provides automated fan speed management based on temperature readings. It reads its configuration from a file, calculates fan speeds from temperatures, and sets the corresponding PWM outputs to the computed values.

The daemon continuously monitors hardware temperature sensors and adjusts PWM-controlled fans to maintain desired thermal levels. Configuration is typically generated with the pwmconfig utility, which detects available fans and sensors, then creates appropriate mappings and thresholds.

# CONFIGURATION

**/etc/fancontrol**
> Main configuration file with the following key variables:

**FCTEMPS**
> Maps PWM outputs to temperature sensors.

**FCFANS**
> Associates PWM outputs with fan speed inputs for monitoring.

**MINTEMP / MAXTEMP**
> Temperature range for fan speed calculation.

**MINPWM / MAXPWM**
> PWM value range corresponding to the temperature range.

**AVERAGE**
> Number of temperature readings to average (default: 1, no averaging).

# CAVEATS

Requires configured hardware monitoring. Run pwmconfig first to generate configuration. Requires root privileges. Configuration file format is specific to fancontrol.

# SEE ALSO

[sensors](/man/sensors)(1)
