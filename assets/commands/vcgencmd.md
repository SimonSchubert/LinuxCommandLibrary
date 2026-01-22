# TLDR

List all **commands**

```vcgencmd commands```

Print CPU **temperature**

```vcgencmd measure_temp```

Print **voltage**

```vcgencmd measure_volts```

Print **throttled** state

```vcgencmd get_throttled```

Print **bootloader** config

```vcgencmd bootloader_config```

Display **help**

```vcgencmd --help```

# SYNOPSIS

**vcgencmd** _COMMAND_

# COMMANDS

**commands**
> List all available commands

**measure_temp**
> Print current CPU temperature

**measure_volts**
> Print current voltage

**get_throttled**
> Print throttled state as bit pattern

**bootloader_config**
> Print bootloader configuration (Pi 4 only)

**get_config** _OPTION_
> Get configuration value

**version**
> Print firmware version

# DESCRIPTION

**vcgencmd** prints system information for a Raspberry Pi. It interfaces with the VideoCore GPU to query hardware status, temperature, voltage, and configuration.

The command provides diagnostic information useful for monitoring Raspberry Pi health and troubleshooting.

# CAVEATS

Raspberry Pi specific. Some commands only available on certain models. Bootloader commands require Pi 4 or newer.

# SEE ALSO

[raspi-config](/man/raspi-config)(1), [raspinfo](/man/raspinfo)(1)
