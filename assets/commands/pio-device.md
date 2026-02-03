# TLDR

**List connected devices**

```pio device list```

**Open serial monitor**

```pio device monitor```

**Monitor with specific baud rate**

```pio device monitor -b [115200]```

**Monitor specific port**

```pio device monitor -p [/dev/ttyUSB0]```

# SYNOPSIS

**pio device** _command_ [_options_]

# PARAMETERS

**list**
> List connected devices.

**monitor**
> Open serial monitor.

**-p**, **--port** _port_
> Serial port.

**-b**, **--baud** _rate_
> Baud rate (default 9600).

**-f**, **--filter** _filter_
> Apply output filter.

**--raw**
> Disable input/output filters.

# DESCRIPTION

**pio device** manages connected development boards. Lists serial devices and provides serial monitor for debugging embedded applications. Supports filtering and custom baud rates.

# SEE ALSO

[pio-run](/man/pio-run)(1), [pio-debug](/man/pio-debug)(1)

