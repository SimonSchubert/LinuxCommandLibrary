# TLDR

List **active I2C buses**

```i2cdetect -l```

**Scan devices** on an I2C bus

```i2cdetect [i2c_bus]```

Scan devices **without confirmation**

```i2cdetect -y [i2c_bus]```

# SYNOPSIS

**i2cdetect** [_options_] _i2cbus_

# PARAMETERS

**-l**
> List available I2C buses

**-y**
> Disable interactive mode (no confirmation prompt)

**-a**
> Scan all addresses (0x00-0x7f instead of 0x03-0x77)

**-q**
> Use SMBus quick write commands for probing

**-r**
> Use SMBus read byte commands for probing

**-F**
> Display functionality of the adapter

# DESCRIPTION

**i2cdetect** scans I2C buses to detect connected devices. It's commonly used for debugging I2C hardware, identifying device addresses, and verifying hardware connections on embedded systems and single-board computers.

The output is a grid showing addresses 0x00-0x7f. Detected devices show their address, while empty positions show "--". Addresses marked "UU" are in use by a kernel driver.

On Raspberry Pi and similar boards, I2C is often used for sensors, displays, and other peripherals. Common devices include:
- 0x27/0x3f - LCD displays
- 0x48-0x4f - Temperature sensors
- 0x50-0x57 - EEPROMs
- 0x68 - Real-time clocks

# CAVEATS

Requires root privileges or membership in the i2c group. Scanning can interfere with sensitive devices; use **-y** carefully in production. Some devices may not respond to detection probes.

# HISTORY

i2cdetect is part of i2c-tools, a set of utilities for I2C bus access on Linux. I2C (Inter-Integrated Circuit) was developed by Philips in **1982** and became widely used in embedded systems.

# SEE ALSO

[i2cget](/man/i2cget)(8), [i2cset](/man/i2cset)(8), [i2cdump](/man/i2cdump)(8), [i2ctransfer](/man/i2ctransfer)(8)
