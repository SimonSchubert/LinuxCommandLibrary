# TLDR

**Dump** all registers of an I2C device

```i2cdump [i2cbus] [device_address]```

Dump without **confirmation** prompt

```i2cdump -y [i2cbus] [device_address]```

Dump using a **specific mode**

```i2cdump [i2cbus] [device_address] [b|w|c|s|i]```

Dump a **range** of registers

```i2cdump -r [start]-[end] [i2cbus] [device_address]```

# SYNOPSIS

**i2cdump** [_options_] _i2cbus_ _device_address_ [_mode_]

# PARAMETERS

**-y**
> Disable interactive confirmation (dangerous on some hardware)

**-r** _START-END_
> Limit dump to registers in specified range

**b**
> Byte mode (default for most devices)

**w**
> Word mode (16-bit values)

**c**
> Consecutive byte mode

**s**
> SMBus block mode

**i**
> I2C block mode

# DESCRIPTION

**i2cdump** reads and displays all registers of an I2C device connected to a specified bus. It outputs a hexadecimal table showing register addresses and their contents, useful for debugging I2C hardware.

All addresses should be specified in hexadecimal notation. The i2cbus number can be determined using i2cdetect -l, and device addresses can be found with i2cdetect.

# CAVEATS

Accessing I2C devices can cause hardware issues on some systems. Always use the -y flag with caution. Reading from some registers may have side effects. Requires appropriate permissions (usually root or i2c group membership).

# HISTORY

i2cdump is part of the i2c-tools package, providing userspace access to I2C buses. The I2C bus protocol was developed by Philips Semiconductor (now NXP) in **1982** for inter-chip communication.

# SEE ALSO

[i2cdetect](/man/i2cdetect)(8), [i2cget](/man/i2cget)(8), [i2cset](/man/i2cset)(8)
