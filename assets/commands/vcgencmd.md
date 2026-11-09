# TAGLINE

Query Raspberry Pi hardware status

# TLDR

List all **commands**

```vcgencmd commands```

Print CPU **temperature**

```vcgencmd measure_temp```

Print **core voltage**

```vcgencmd measure_volts [core]```

Print a **clock** frequency

```vcgencmd measure_clock [arm]```

Print **GPU memory** allocation

```vcgencmd get_mem [gpu]```

Print **throttled** state

```vcgencmd get_throttled```

Print **bootloader** config

```vcgencmd bootloader_config```

Display **usage**

```vcgencmd```

# SYNOPSIS

**vcgencmd** _COMMAND_ [_PARAMS_]

# COMMANDS

**commands**
> List all available commands

**measure_temp** [_pmic_]
> Print SoC temperature, or PMIC temperature on Raspberry Pi 5

**measure_clock** _CLOCK_
> Print a clock frequency: arm, core, h264, isp, v3d, uart, pwm, emmc, pixel, vec, hdmi, dpi

**measure_volts** _BLOCK_
> Print a voltage: core, sdram_c, sdram_i, sdram_p

**pmic_read_adc** [_CHANNEL_]
> Print PMIC current and voltage readings (Raspberry Pi 5)

**get_throttled**
> Print throttled state as a bit pattern. Bits 0-3: under-voltage, ARM frequency capped, currently throttled, soft temperature limit active. Bits 16-19: the same conditions have occurred since boot. Zero means none

**get_mem** _TYPE_
> Print memory allocated to arm or gpu

**codec_enabled** _TYPE_
> Report whether a codec is enabled

**otp_dump**
> Display One Time Programmable memory

**bootloader_config**
> Print bootloader configuration (Pi 4 and later)

**get_config** _TYPE|NAME_
> Get config.txt values by type (int, str) or by item name

**version**
> Print firmware version

# DESCRIPTION

**vcgencmd** prints system information for a Raspberry Pi. It interfaces with the VideoCore GPU to query hardware status, temperature, voltage, and configuration.

The command provides diagnostic information useful for monitoring Raspberry Pi health and troubleshooting.

# CAVEATS

Raspberry Pi specific. Some commands only available on certain models. Bootloader commands require Pi 4 or newer. **get_mem arm** is inaccurate on a Pi 4 with more than 1GB of RAM; use free or /proc/meminfo instead.

# SEE ALSO

[raspi-config](/man/raspi-config)(1), [raspinfo](/man/raspinfo)(1), [pinout](/man/pinout)(1)

# RESOURCES

```[Source code](https://github.com/raspberrypi/utils)```

```[Documentation](https://www.raspberrypi.com/documentation/computers/os.html#vcgencmd)```

<!-- verified: 2026-11-09 -->
