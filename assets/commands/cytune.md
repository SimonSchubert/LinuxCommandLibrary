# TAGLINE

Tune driver parameters for Cyclades-Z multiport serial card

# TLDR

**Get current threshold and timeout values**

```cytune -g /dev/ttyC0```

**Get default threshold and timeout values**

```cytune -G /dev/ttyC0```

**Set current threshold value** (1-12)

```cytune -s [8] /dev/ttyC0```

**Set current flush timeout value** (0-255, units of 5ms)

```cytune -t [10] /dev/ttyC0```

**Set both threshold and timeout**

```cytune -s [8] -t [10] /dev/ttyC0```

**Set default threshold for next open**

```cytune -S [8] /dev/ttyC0```

**Gather statistics at an interval** (requires ENABLE_MONITORING)

```cytune -q -i [5] /dev/ttyC0```

# SYNOPSIS

**cytune** [**-q** [**-i** _interval_]] [{**-s**|**-S**} _value_] [**-g**|**-G**] [{**-t**|**-T**} _timeout_] _tty_...

# PARAMETERS

_TTY_
> Serial device to configure (e.g., /dev/ttyC0).

**-s** _VALUE_
> Set the current threshold to VALUE characters (1-12). Resets on next open if the tty is not held open.

**-S** _VALUE_
> Set the default threshold to VALUE characters (1-12). Applied when the tty is next opened.

**-t** _VALUE_
> Set the current flush timeout to VALUE units (0-255). Each unit is 5ms. Zero forces the default timeout.

**-T** _VALUE_
> Set the default flush timeout to VALUE units. Applied when the tty is next opened.

**-g**
> Get current threshold and timeout values.

**-G**
> Get default threshold and flush timeout values.

**-q**
> Gather and report driver statistics (interrupts and characters transferred). Only available if the driver was compiled with ENABLE_MONITORING.

**-i** _interval_
> Statistics gathering interval in seconds (used with -q).

# DESCRIPTION

**cytune** is a utility for tuning the interrupt threshold and flush timeout parameters for Cyclades-Z multiport serial card drivers. These parameters affect how the driver buffers data before triggering an interrupt, balancing latency against CPU overhead.

Each serial line on a Cyclades card has a 12-byte FIFO for input and output. The threshold specifies how many characters must be present in the FIFO before an interrupt is raised. Higher values reduce interrupt overhead but increase latency. If set too high, the FIFO can overflow and characters will be lost. The flush timeout ensures data is delivered even when the threshold is not reached.

Default thresholds are set based on baud rate when the tty is opened: 10 for 50-4800 baud, 8 for 9600, 4 for 19200, 2 for 38400, 1 for 57600+.

# CAVEATS

Only works with Cyclades serial hardware and drivers. Incorrect settings can cause data loss or poor performance. Requires root privileges to modify settings. Not applicable to standard serial ports. The -q monitoring option is only available if the driver was compiled with ENABLE_MONITORING defined.

# HISTORY

**cytune** was developed for the Cyclades multiport serial card drivers in Linux and is part of the **util-linux** package. Cyclades produced high-density serial solutions for applications requiring many serial ports.

# SEE ALSO

[setserial](/man/setserial)(8), [stty](/man/stty)(1)
