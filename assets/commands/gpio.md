# TAGLINE

Raspberry Pi GPIO pin control utility

# TLDR

**Read GPIO pin state**

```gpio read [pin]```

**Set GPIO pin output**

```gpio write [pin] [0|1]```

**Set pin mode**

```gpio mode [pin] [in|out|pwm]```

**Read all pins**

```gpio readall```

**Export pin for user access**

```gpio export [pin] [in|out]```

**Unexport pin**

```gpio unexport [pin]```

# SYNOPSIS

**gpio** [_options_] _command_ [_args_]

# PARAMETERS

**read** _pin_
> Read pin value.

**write** _pin_ _value_
> Write value (0 or 1) to pin.

**mode** _pin_ _mode_
> Set pin mode: in, out, pwm, clock.

**readall**
> Display all GPIO pins status.

**export** _pin_ _mode_
> Export pin for user-space access.

**unexport** _pin_
> Unexport pin.

**pwm** _pin_ _value_
> Set PWM value (0-1023).

**-g**
> Use BCM GPIO numbering.

**-1**
> Use physical pin numbering.

# DESCRIPTION

**gpio** is the WiringPi command-line utility for controlling GPIO pins on Raspberry Pi and similar boards. It allows reading, writing, and configuring GPIO pins from shell scripts and the command line.

The tool supports multiple pin numbering schemes: WiringPi numbering (default), BCM GPIO numbering (**-g**), and physical pin numbers (**-1**). The **readall** command displays a complete pin status table.

# CAVEATS

WiringPi is deprecated but still functional. Different numbering schemes can cause confusion. Requires appropriate permissions. Pin capabilities vary by board. Some pins have special functions.

# HISTORY

gpio is part of **WiringPi**, created by **Gordon Henderson** for Raspberry Pi GPIO access. While WiringPi was deprecated in 2019, it remains widely used. Alternatives include libgpiod and Python's RPi.GPIO.

# SEE ALSO

[gpiodetect](/man/gpiodetect)(1), [gpioset](/man/gpioset)(1), [gpioget](/man/gpioget)(1), [raspi-gpio](/man/raspi-gpio)(1)
