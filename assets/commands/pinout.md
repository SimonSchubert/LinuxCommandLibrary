# TAGLINE

displays an ASCII diagram of the GPIO header on Raspberry Pi boards

# TLDR

Display **GPIO pinout** diagram

```pinout```

Open **pinout.xyz** website

```pinout -x```

# SYNOPSIS

**pinout** [**-x**|**--xyz**] [**-r** _revision_] [**-c**|**--color**]

# PARAMETERS

**-x, --xyz**
> Open pinout.xyz website in default browser

**-r _revision_**
> Show pinout for specific board revision

**-c, --color**
> Force colored output

**-m, --monochrome**
> Force monochrome output

# DESCRIPTION

**pinout** displays an ASCII diagram of the GPIO header on Raspberry Pi boards. It shows pin numbers, GPIO numbers, and function labels for all 40 pins, helping identify connections for hardware projects.

The tool automatically detects the Pi model and displays the appropriate pinout. It's part of the gpiozero Python package's command-line tools.

# CAVEATS

Only works on Raspberry Pi hardware. Requires gpiozero package. May not recognize very new Pi models until package is updated. ASCII output best viewed in terminal with sufficient width.

# HISTORY

**pinout** is part of **gpiozero**, a Python library for GPIO programming created by **Ben Nuttall** and the Raspberry Pi Foundation. It provides a friendly interface for understanding Pi GPIO layouts without external documentation.

# SEE ALSO

[gpio](/man/gpio)(1), [raspi-config](/man/raspi-config)(1), [raspi-gpio](/man/raspi-gpio)(1)
