# TLDR

**Read** from a register of an I2C device

```i2cget [i2cbus] [device_address] [register_address]```

Read without **confirmation** prompt

```i2cget -y [i2cbus] [device_address] [register_address]```

Read using a **specific mode**

```i2cget [i2cbus] [device_address] [register_address] [b|w|c|s|i]```

# SYNOPSIS

**i2cget** [_options_] _i2cbus_ _device_address_ [_register_address_] [_mode_]

# PARAMETERS

**-y**
> Disable interactive confirmation (dangerous on some hardware)

**b**
> Byte mode - read single byte (default)

**w**
> Word mode - read 16-bit value

**c**
> Consecutive byte mode

**s**
> SMBus block mode

**i**
> I2C block mode

# DESCRIPTION

**i2cget** reads a single register value from an I2C device. This is useful for checking specific device configuration or status registers without dumping the entire register map.

All addresses should be specified in hexadecimal notation. The i2cbus number identifies which I2C bus to use, and the device address specifies which device on that bus to communicate with.

# CAVEATS

Reading I2C registers can cause unexpected behavior on some hardware. Some registers are read-sensitive and may change state or clear flags when read. Requires root privileges or i2c group membership.

# HISTORY

i2cget is part of the i2c-tools package for Linux, providing userspace access to I2C devices. It allows inspection and debugging of I2C peripherals like sensors, EEPROMs, and other embedded devices.

# SEE ALSO

[i2cdetect](/man/i2cdetect)(8), [i2cdump](/man/i2cdump)(8), [i2cset](/man/i2cset)(8)
