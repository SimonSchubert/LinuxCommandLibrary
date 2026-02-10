# TAGLINE

writes a value to a specified register of an I2C device

# TLDR

**Write** to a register of an I2C device

```i2cset [i2cbus] [device_address] [register_address] [value]```

Write without **confirmation** prompt

```i2cset -y [i2cbus] [device_address] [register_address] [value]```

Write using a **specific mode**

```i2cset [i2cbus] [device_address] [register_address] [value] [b|w|c|s|i]```

# SYNOPSIS

**i2cset** [_options_] _i2cbus_ _device_address_ _register_address_ _value_ [_mode_]

# PARAMETERS

**-y**
> Disable interactive confirmation (dangerous on some hardware)

**b**
> Byte mode - write single byte (default)

**w**
> Word mode - write 16-bit value

**c**
> Consecutive byte mode

**s**
> SMBus block mode

**i**
> I2C block mode

# DESCRIPTION

**i2cset** writes a value to a specified register of an I2C device. This allows configuration of I2C peripherals, setting parameters, or controlling device behavior.

All addresses and values should be specified in hexadecimal notation. The command will prompt for confirmation before writing unless the -y flag is used.

# CAVEATS

Writing to I2C registers can cause hardware damage or unexpected behavior. Always verify device addresses and register meanings before writing. Some devices may become unresponsive or require power cycling after incorrect writes. Requires root privileges or i2c group membership.

# HISTORY

i2cset is part of the i2c-tools package, providing userspace write access to I2C devices. The I2C protocol was developed by Philips (now NXP) in **1982** for low-speed peripheral communication.

# SEE ALSO

[i2cdetect](/man/i2cdetect)(8), [i2cdump](/man/i2cdump)(8), [i2cget](/man/i2cget)(8)
