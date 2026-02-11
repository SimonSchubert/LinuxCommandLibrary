# TAGLINE

Query and set Raspberry Pi GPIO pin states

# TLDR

**Show all GPIO states**

```raspi-gpio get```

**Get specific pin**

```raspi-gpio get [17]```

**Set pin as output**

```raspi-gpio set [17] op```

**Set pin high**

```raspi-gpio set [17] dh```

**Set pin low**

```raspi-gpio set [17] dl```

# SYNOPSIS

**raspi-gpio** _command_ [_options_]

# PARAMETERS

**get** [_pin_]
> Get pin state.

**set** _pin_ _options_
> Set pin configuration.

**funcs** [_pin_]
> Show available functions.

**raw**
> Show raw register values.

# OPTIONS FOR SET

**ip** / **op**
> Input / Output mode.

**dl** / **dh**
> Drive low / high.

**pu** / **pd** / **pn**
> Pull up / down / none.

# DESCRIPTION

**raspi-gpio** is a tool for directly manipulating GPIO pins on Raspberry Pi. It provides low-level access to GPIO configuration without libraries.

# EXAMPLES

```bash
# Show all pins
raspi-gpio get

# Get pin 17 state
raspi-gpio get 17

# Set pin 17 as output, drive high
raspi-gpio set 17 op dh

# Set pin 18 as input with pull-up
raspi-gpio set 18 ip pu

# Show available functions
raspi-gpio funcs

# Blink LED
raspi-gpio set 17 op dh
sleep 1
raspi-gpio set 17 dl
```

# CAVEATS

Raspberry Pi specific. Requires appropriate permissions. Be careful with pin configurations to avoid damage.

# HISTORY

raspi-gpio is a utility included with **Raspberry Pi OS** for direct GPIO access, complementing the GPIO libraries.

# SEE ALSO

[gpio](/man/gpio)(1), [pinctrl](/man/pinctrl)(1), [gpioset](/man/gpioset)(1)
