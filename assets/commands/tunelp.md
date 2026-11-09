# TAGLINE

Configure parallel port device parameters

# TLDR

Show current **IRQ** setting of a device

```tunelp [/dev/lp0]```

Check **status** of parallel port

```tunelp -s [/dev/lp0]```

**Reset** parallel port

```tunelp -r [/dev/lp0]```

Restore non-interrupt driven **polling**

```tunelp -i 0 [/dev/lp0]```

Set retry **attempts** and timing

```tunelp -c [chars] -t [jiffies] [/dev/lp0]```

Toggle **abort** on error

```tunelp -a [on|off] [/dev/lp0]```

# SYNOPSIS

**tunelp** [_OPTIONS_] _DEVICE_

# PARAMETERS

**-i, --irq** _N_
> Set the IRQ to use; no effect on kernels 2.1.131 or later, where the parport driver handles it

**-t, --time** _N_
> Time in jiffies to wait if the printer does not take a character (default: 10)

**-c, --chars** _N_
> Number of times to try output before sleeping (default: 1000)

**-w, --wait** _N_
> Strobe signal wait (default: 1); longer values may help some printers

**-a, --abort** _on|off_
> Abort on printer error (default: off)

**-o, --check-status** _on|off_
> Make any open(2) of the device check that it is on-line and error-free

**-C, --careful** _on|off_
> Extra error checking; obsolete since kernel 2.1.131

**-s, --status**
> Show printer status as a decimal number and a list of active flags

**-r, --reset**
> Reset the parallel port

**-q, --print-irq** _on|off_
> Set whether the current IRQ is displayed

# DESCRIPTION

**tunelp** sets various parameters for parallel port (/dev/lp?) devices. It is used for troubleshooting printer connections or optimizing performance of parallel port printers and other devices. Without options, it reports whether the device uses interrupts, and which one.

Part of the util-linux package, tunelp allows adjusting timeout values and error handling behavior for legacy parallel port hardware.

# CAVEATS

Parallel ports are largely obsolete. Requires root privileges. Only affects legacy lp devices. The source remains in util-linux, but it is not built by default (it requires **--enable-tunelp**), so availability depends on the distribution; Debian does not ship it, for example. On current kernels the IRQ is configured through /proc/parport/*/irq rather than **-i**.

# HISTORY

**tunelp** is part of the **util-linux** package, providing configuration for parallel port devices that were common in earlier computing eras.

# SEE ALSO

[lp](/man/lp)(4)

# RESOURCES

```[Source code](https://github.com/util-linux/util-linux)```

<!-- verified: 2026-11-09 -->
