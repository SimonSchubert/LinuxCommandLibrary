# TLDR

Start with **default** configuration

```fancontrol```

Start with **custom** configuration file

```fancontrol [path/to/config_file]```

# SYNOPSIS

**fancontrol** [_config_file_]

# DESCRIPTION

**fancontrol** provides automated fan speed management based on temperature readings. It uses a configuration file to control fan speeds dynamically according to defined temperature thresholds.

Part of lm-sensors package. Configuration typically generated with pwmconfig.

# PARAMETERS

_config_file_
> Path to configuration (default: /etc/fancontrol)

# CAVEATS

Requires configured hardware monitoring. Run pwmconfig first to generate configuration. May require root privileges. Configuration file format is specific to fancontrol.

# SEE ALSO

[pwmconfig](/man/pwmconfig)(8), [sensors](/man/sensors)(1), [lm_sensors](/man/lm_sensors)(1)
