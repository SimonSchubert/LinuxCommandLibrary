# TAGLINE

Configure and query serial port settings

# TLDR

Print **all information** about a serial device

```setserial -a [/dev/ttyS0]```

Print **configuration summary** suitable for bootup

```setserial -b [/dev/ttyS0]```

**Set** a configuration parameter

```sudo setserial [/dev/ttyS0] [parameter] [value]```

Print configuration of **multiple devices**

```setserial -g [/dev/ttyS0] [/dev/ttyS1]```

**Auto-configure** UART type and IRQ

```sudo setserial [/dev/ttyS0] autoconfig```

Set **custom baud rate** divisor

```sudo setserial [/dev/ttyS0] baud_base [115200] divisor [1]```

# SYNOPSIS

**setserial** [**-abqvVWz**] _device_ [_parameter_ [_arg_]]...

**setserial** **-g** [**-abGv**] _device_...

# PARAMETERS

**-a**
> Display all available configuration information

**-b**
> Print summary configuration suitable for bootup scripts

**-g**
> Report characteristics of multiple devices

**-G**
> Print configuration as setserial command-line arguments

**-q**
> Quiet mode; suppress status output

**-v**
> Verbose mode; display additional status info

**-V**
> Print version and exit

**-z**
> Zero out flags before setting new values

**port** _port_number_
> Set the I/O port address

**irq** _irq_number_
> Set the interrupt request line

**uart** _uart_type_
> Set UART type (none, 8250, 16450, 16550, 16550A, 16650, 16750, etc.)

**autoconfig**
> Automatically detect UART type and IRQ

**baud_base** _baud_
> Set base baud rate (clock frequency / 16)

**divisor** _divisor_
> Set custom clock divisor for non-standard baud rates

**low_latency**
> Minimize receive latency at the cost of CPU overhead

# DESCRIPTION

**setserial** configures and queries serial port settings including I/O port addresses, IRQ lines, UART types, and operational flags. It is primarily used during system startup to initialize serial ports beyond the standard COM1-COM4 ports or to configure non-standard hardware.

The command can auto-detect UART types and set custom baud rates for specialized hardware. Modern systems with **udev** often handle serial configuration automatically, but setserial remains useful for legacy hardware and custom configurations.

# CAVEATS

Incorrect settings can cause serial ports to malfunction or conflict with other devices. The **-W** wild interrupt initialization is obsolete on modern kernels. Many settings require root privileges. On systems using **systemd**, serial port configuration may be handled differently through udev rules.

# HISTORY

**setserial** was written by **Theodore Ts'o** and has been part of Linux since the early **1990s**, originally to help configure the diverse serial hardware of that era. The tool became essential for setting up modems, terminals, and serial mice. While less critical on modern hardware with automatic detection, it remains in the **setserial** package for legacy support.

# SEE ALSO

[stty](/man/stty)(1), [getty](/man/getty)(8), [minicom](/man/minicom)(1), [cu](/man/cu)(1)
