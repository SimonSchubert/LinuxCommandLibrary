# TAGLINE

Cyclades serial driver tuning utility

# TLDR

**Display current settings** for a serial device

```cytune /dev/ttyC0```

**Set threshold value**

```cytune -s [12] /dev/ttyC0```

**Set timeout value**

```cytune -t [10] /dev/ttyC0```

**Set both threshold and timeout**

```cytune -s [12] -t [10] /dev/ttyC0```

**Get settings in numeric format**

```cytune -g /dev/ttyC0```

**Set default threshold**

```cytune -S [8] /dev/ttyC0```

# SYNOPSIS

**cytune** [_options_] _tty_...

# PARAMETERS

_TTY_
> Serial device to configure (e.g., /dev/ttyC0).

**-s** _VALUE_
> Set the current threshold value.

**-S** _VALUE_
> Set the default threshold value.

**-t** _VALUE_
> Set the timeout value.

**-T** _VALUE_
> Set the default timeout value.

**-g**
> Get settings in numeric format.

**-q**
> Quiet mode (no output on success).

# DESCRIPTION

**cytune** is a utility for tuning the interrupt threshold and timeout parameters for Cyclades serial drivers. These parameters affect how the driver buffers data before triggering an interrupt, balancing latency against CPU overhead.

The threshold value determines how many characters accumulate in the hardware buffer before an interrupt is generated. Higher values reduce interrupt overhead but increase latency. The timeout ensures data is delivered even when the threshold isn't reached.

These tuning parameters are important for high-speed serial communication where the balance between throughput and responsiveness affects application behavior.

# CAVEATS

Only works with Cyclades serial hardware and drivers. Incorrect settings can cause data loss or poor performance. Requires root privileges to modify settings. Not applicable to standard serial ports.

# HISTORY

cytune was developed for the Cyclades multiport serial card drivers in Linux. Cyclades produced high-density serial solutions for applications requiring many serial ports. The utility allows fine-tuning driver behavior for specific workloads.

# SEE ALSO

[setserial](/man/setserial)(8), [stty](/man/stty)(1)
