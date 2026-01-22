# TLDR

Check **status** of parallel port

```tunelp -s [/dev/lp0]```

**Reset** parallel port

```tunelp -r [/dev/lp0]```

Set **IRQ** for device

```tunelp -i 5 [/dev/lp0]```

Set retry **attempts** and timing

```tunelp -c [times] -t [time_in_centiseconds] [/dev/lp0]```

Toggle **abort** on error

```tunelp -a [on|off]```

# SYNOPSIS

**tunelp** [_OPTIONS_] _DEVICE_

# PARAMETERS

**-s, --status**
> Check device status

**-r, --reset**
> Reset the parallel port

**-i, --irq** _N_
> Set interrupt line (IRQ)

**-c, --chars** _N_
> Number of times to try output before sleeping

**-t, --time** _N_
> Sleep time in centiseconds

**-a, --abort** _on|off_
> Enable or disable abort on error

# DESCRIPTION

**tunelp** sets various parameters for parallel port devices. It is used for troubleshooting printer connections or optimizing performance of parallel port printers and other devices.

Part of the util-linux package, tunelp allows adjusting IRQ settings, timeout values, and error handling behavior for legacy parallel port hardware.

# CAVEATS

Parallel ports are largely obsolete. Requires root privileges. Incorrect IRQ settings can cause system conflicts. Only affects legacy lp devices.

# HISTORY

**tunelp** is part of the **util-linux** package, providing configuration for parallel port devices that were common in earlier computing eras.

# SEE ALSO

[lp](/man/lp)(4)
