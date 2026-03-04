# TAGLINE

blink(1) USB RGB LED controller command-line tool

# TLDR

Set the **blink(1) to red**

```blink1-tool --red```

Set to a specific **hex color**

```blink1-tool --rgb [ff00ff]```

**Blink** the LED a number of times

```blink1-tool --blink [3]```

**Fade** to a color over a duration in milliseconds

```blink1-tool --rgb [00ff00] --fade [500]```

**Turn off** the LED

```blink1-tool --off```

Set LED **pattern** to play

```blink1-tool --play [1]```

List **connected blink(1) devices**

```blink1-tool --list```

# SYNOPSIS

**blink1-tool** [_options_]

# PARAMETERS

**--rgb** _RRGGBB_
> Set color by hex RGB value.

**--red**
> Set LED to red.

**--green**
> Set LED to green.

**--blue**
> Set LED to blue.

**--off**
> Turn off the LED.

**--blink** _N_
> Blink the LED _N_ times.

**--fade** _MILLIS_
> Fade to color over _MILLIS_ milliseconds.

**--play** _N_
> Play stored pattern _N_.

**--list**
> List connected blink(1) devices.

**--savergb** _RRGGBB_,_POS_
> Save RGB color to position in pattern.

**--savepattern**
> Save the current pattern to the device.

**-l** _N_, **--led** _N_
> Select which LED to address (0=all, 1=top, 2=bottom) on blink(1) mk2+.

**-q**, **--quiet**
> Suppress output.

# DESCRIPTION

**blink1-tool** is the command-line interface for controlling **blink(1)** USB RGB LED indicator lights made by ThingM. It can set colors, create blink patterns, fade between colors, and manage stored light patterns on the device.

The blink(1) device is a small USB dongle containing a programmable RGB LED. It is commonly used for build status indicators, notification lights, ambient information displays, and visual alerts triggered by scripts or monitoring systems.

The tool communicates directly with the blink(1) hardware over USB HID, requiring no special drivers. Multiple devices can be addressed independently.

# CAVEATS

Requires a physical blink(1) USB device to be connected. On Linux, udev rules may need to be configured for non-root access. The mk1 hardware supports only a single LED, while mk2 and later support two independently addressable LEDs.

# HISTORY

The **blink(1)** was created by **Tod Kurt** of **ThingM** and successfully funded on **Kickstarter in 2012**. The blink1-tool command-line utility is part of the open-source blink1 software suite hosted on GitHub, supporting Linux, macOS, and Windows.

# SEE ALSO

[usbreset](/man/usbreset)(1), [lsusb](/man/lsusb)(8)
