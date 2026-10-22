# TAGLINE

Read-only I2C scan, register read, and PMBus dump on an openTPU FPGA card

# TLDR

**Scan** both buses and identify devices

```otpu-i2c scan```

Scan **one bus** without sending command codes

```otpu-i2c scan --bus [sensor] --no-identify```

**Read** a register from a device

```otpu-i2c read [smbus] [0x48] [0x00] -n [2]```

**SMBus block** read

```otpu-i2c read [smbus] [0x48] [0x9a] --block```

**PMBus** identification and telemetry

```otpu-i2c pmbus-dump [smbus] [0x40]```

Pin **levels** (SCL, SDA, ALERT)

```otpu-i2c levels```

**JSON** output

```otpu-i2c --json scan```

**Demo** buses (no card)

```otpu-i2c --fake scan```

# SYNOPSIS

**otpu-i2c** [**--dev** _path_] [**--fake**] [**--khz** _N_] [**--json**] **scan** [**--bus** _name_] [**--no-identify**]

**otpu-i2c** [_options_] **read** _bus_ _addr_ [_reg_] [**-n** _N_] [**--block**]

**otpu-i2c** [_options_] **pmbus-dump** _bus_ _addr_

**otpu-i2c** [_options_] **levels**

# DESCRIPTION

**otpu-i2c** is the read-only I2C tool for **openTPU** cards. After `pip install -e .` in the FeSens/openTPU tree it is installed as a console script (`opentpu.host.i2c:main`). The FPGA bit-bangs two buses through **I2C_CTRL** / **I2C_IN** (CAPS bit2, register map 2 or later):

**sensor** (bus 0)
> LM73 temperature sensor (SCL N24, SDA N25, ALERT P25).

**smbus** (bus 1)
> PCIe edge-connector SMBus (SCL R26, SDA R27). The host's own SMBus controller may also drive this bus.

A transaction writes at most one byte to a device: the command code (register pointer) of a read, then a repeated START. It never writes data, so it cannot change a regulator's OPERATION, VOUT COMMAND, PAGE, or any other setting. PMBus send-byte commands (CLEAR FAULTS, STORE, RESTORE) are refused as command codes. No command code is written to 0x30-0x37 (DIMM SPD write-protect and page), 0x0C (alert response), or 0x61 (ARP).

**scan** probes addresses **0x08-0x77** with one-byte reads and, unless **--no-identify**, classifies each ACK: LM73, INA current monitor, or PMBus (manufacturer id/model and telemetry). Identification skips I/O expanders (0x20-0x27, 0x38-0x3F), I2C multiplexers (0x70-0x77), and EEPROMs (0x50-0x57); **read** can still address them explicitly. A full two-bus scan is cached as `<run dir>/<device>.i2c.json` for **otpu-smi**.

**read** fetches **-n** bytes (default 1). With _reg_, that command code is written first. **--block** is an SMBus block read (the first byte is the count, at most 32).

**pmbus-dump** requires a PMBus revision response; it prints identification, VOUT MODE, telemetry, and derived power.

**levels** prints SCL and SDA of both buses plus the LM73 ALERT pin. It does not start a transaction.

Processes serialize with an flock on `<run dir>/<device>.i2c.lock`. The SMBus waits for an idle window before START and retries on lost arbitration.

# PARAMETERS

**--dev** _path_
> XDMA device prefix (default `/dev/xdma0`).

**--fake**
> In-memory demo buses. No hardware.

**--khz** _N_
> SCL rate bound in kHz (default **100**). Half-bit delay is `0.5 / (khz * 1e3)`; PCIe register accesses add to the period, so the bus typically runs slower (about 50-80 kHz at the default).

**--json**
> Print JSON instead of text.

**scan --bus** _sensor_|_smbus_|_all_
> Which bus to probe (default **all**).

**scan --no-identify**
> Probe only; do not send command codes.

**read** _bus_ _addr_ [_reg_]
> Bus name, 7-bit address (decimal or `0x`), optional register pointer.

**-n** _N_
> Bytes to read (default **1**). Ignored with **--block**.

**--block**
> SMBus block read.

**pmbus-dump** _bus_ _addr_
> PMBus identification and telemetry.

**levels**
> Pin levels only.

# CAVEATS

Needs a loaded openTPU bitstream with CAPS bit2 (I2C pins). A card that is not **OTPU**, or a map-1 bitstream, exits **1**. The tool does not take the device lock, so it can run next to **otpu-chat**, but a busy I2C lock (`BusBusy`) fails the command. A multi-page PMBus device reports whichever page is already selected. **--fake** does not talk to hardware. The command is installed only via `pip install -e .` in the openTPU tree.

# HISTORY

**otpu-i2c** is part of the **openTPU** host tools (Apache-2.0, FeSens). The same bit-banged master feeds **otpu-smi** (measured power and board temperature) and **otpu-diag**'s i2c section; this command is the interactive scan, read, and PMBus dump of those buses.

# SEE ALSO

[otpu-smi](/man/otpu-smi)(1), [otpu-diag](/man/otpu-diag)(1), [otpu-setup](/man/otpu-setup)(1), [i2cdetect](/man/i2cdetect)(1), [i2cget](/man/i2cget)(1), [i2cdump](/man/i2cdump)(1)

# RESOURCES

```[Source code](https://github.com/FeSens/openTPU)```

```[Documentation](https://github.com/FeSens/openTPU/blob/main/README.md)```

<!-- verified: 2026-10-22 -->
