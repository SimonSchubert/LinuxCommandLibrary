# TAGLINE

Query and set Raspberry Pi GPIO pin states

# TLDR

**Show all GPIO pin states**

```raspi-gpio get```

**Get the state of a specific pin**

```raspi-gpio get [17]```

**Get the state of several pins or a range**

```raspi-gpio get [7,9-11]```

**Configure a pin as output**

```sudo raspi-gpio set [17] op```

**Drive a pin high**

```sudo raspi-gpio set [17] dh```

**Drive a pin low**

```sudo raspi-gpio set [17] dl```

**Set as input with pull-up**

```sudo raspi-gpio set [18] ip pu```

**Set output, no pull, driving high** in one call

```sudo raspi-gpio set [20] op pn dh```

**Select an alternate function** (e.g. ALT5)

```sudo raspi-gpio set [20] a5```

**List alternate functions** for a pin

```raspi-gpio funcs [17]```

**Dump raw register values**

```sudo raspi-gpio raw```

# SYNOPSIS

**raspi-gpio** _command_ [_pin_] [_options_]

# COMMANDS

**get** [_gpio_]
> Show pin states. _gpio_ is a comma-separated list of pins or ranges without spaces (e.g. **4**, **18-21**, **7,9-11**). Without it, shows all GPIOs.

**set** _pin_ _options..._
> Configure pin direction, drive level, pull, or alternate function.

**funcs** [_gpio_]
> Print the alternate functions for the given pins, or all pins in CSV format.

**raw**
> Print the raw GPIO register values.

# OPTIONS FOR SET

**ip** / **op**
> Set as input / output.

**a0** ... **a5**
> Select alternate function 0-5.

**dl** / **dh**
> Drive low / drive high (only meaningful when **op** is set).

**pu** / **pd** / **pn**
> Pull up / pull down / no pull.

# DESCRIPTION

**raspi-gpio** is a low-level tool for inspecting and manipulating GPIO pins on Raspberry Pi boards. It writes directly to the BCM GPIO controller registers via /dev/gpiomem (falling back to /dev/mem, which needs root), bypassing higher-level libraries like libgpiod.

The tool is mainly intended for debugging hardware setups, verifying that DT overlays applied the expected pin functions, and one-off scripting. For production use, the kernel **gpiod** interface (via **libgpiod**'s **gpioget**/**gpioset**) is recommended because it integrates with the kernel's GPIO subsystem and respects kernel-claimed lines.

# CAVEATS

Raspberry Pi specific and only supports the BCM283x/BCM2711 GPIO controller; it does **not** work on the **Raspberry Pi 5** (RP1). Upstream marks it as **no longer maintained**, replaced by **pinctrl**. Without /dev/gpiomem access (members of the **gpio** group have it on Raspberry Pi OS), the tool must run as root. Writing the wrong direction or drive level on a pin connected to external hardware can damage the SoC. The tool ignores anything else using the pins, such as kernel drivers. The numbering used is BCM (Broadcom), not the physical board pin numbers.

# HISTORY

**raspi-gpio** was written by Raspberry Pi engineers as a debugging tool for the BCM283x GPIO block and shipped pre-installed in **Raspbian** / **Raspberry Pi OS**. With the launch of the Raspberry Pi 5 in **2023** it was deprecated in favor of **pinctrl** from the raspberrypi/utils repository, which supports all Pi models.

# SEE ALSO

[gpio](/man/gpio)(1), [vcgencmd](/man/vcgencmd)(1)

# RESOURCES

```[Source code](https://github.com/RPi-Distro/raspi-gpio)```

<!-- verified: 2026-11-23 -->
