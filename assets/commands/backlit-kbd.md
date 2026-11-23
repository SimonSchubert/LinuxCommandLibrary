# TAGLINE

Control keyboard backlight brightness on Linux

# TLDR

**Show current backlight** state and device info

```backlit-kbd info```

**Set brightness** by percentage (0-100)

```backlit-kbd percent [75]```

**Set brightness** by raw level value

```backlit-kbd set [value]```

**Increase or decrease** brightness by a step

```backlit-kbd inc [step]```

```backlit-kbd dec [step]```

**Turn backlight on** at a specific percentage (default 100)

```backlit-kbd on --percent [40]```

**Turn backlight off**

```backlit-kbd off```

**Blink the keyboard** as a visual notification

```backlit-kbd blink --count [4] --on-ms [100] --off-ms [100]```

**Blink as a named notification** and wait for it to finish

```backlit-kbd notify --name [chat] --count [5] --on-ms [80] --off-ms [120]```

**Target a specific device** instead of auto-discovery

```backlit-kbd --device-path [/sys/class/leds/asus::kbd_backlight] percent [50]```

**Test without hardware** using the mock backend

```backlit-kbd --mock percent [50]```

# SYNOPSIS

**backlit-kbd** [**--mock**] [**--device-path** _PATH_] _command_ [_args_]

# PARAMETERS

**info**
> Display current backlight state and detected device information.

**set** _value_
> Set the brightness to a raw level value supported by the device.

**percent** _value_
> Set the brightness as a percentage between 0 and 100.

**inc** [_step_]
> Increase brightness by _step_ (default: 1).

**dec** [_step_]
> Decrease brightness by _step_ (default: 1).

**on** [**--percent** _N_]
> Turn the backlight on at the given percentage (default **100**).

**off**
> Turn the backlight off.

**blink** [_options_]
> Run a synchronous blink pattern on the keyboard.

**notify** [_options_]
> Run the blink pattern through the library's asynchronous notification blinker under a name, then wait for it to complete.

**--mock**
> Use an in-memory backend for safe testing without writing to hardware.

**--device-path** _PATH_
> Target a specific sysfs device path instead of auto-discovery.

**--count** _N_
> Number of blink cycles (default **3**; used with _blink_ / _notify_).

**--on-ms** _N_
> Duration in milliseconds for the on state (default **150**).

**--off-ms** _N_
> Duration in milliseconds for the off state (default **150**).

**--level-percent** _N_
> Brightness percentage during blink cycles (default **100**).

**--name** _NAME_
> Notification identifier (default **default**; used with _notify_).

# DESCRIPTION

**backlit-kbd** is a Python command-line utility for controlling the keyboard backlight on Linux. It auto-discovers compatible LED devices exposed by the kernel under **/sys/class/leds/** whose names match **kbd_backlight** or **keyboard_backlight** (for example **tpacpi::kbd_backlight** on ThinkPads or **asus::kbd_backlight** on ASUS laptops), using the first device that provides both **brightness** and **max_brightness** files. Each command prints the resulting state as raw level, maximum, and percentage.

The tool exposes high-level commands (_set_, _percent_, _inc_, _dec_, _on_, _off_) for everyday brightness control and a pair of _blink_ / _notify_ commands for producing visual notifications via the keyboard LEDs. The same functionality is available as a Python library (**backlit_kbd**). A **--mock** flag swaps the backend for an in-memory simulator, making it safe to experiment or integrate into scripts on machines without a real backlight device.

# CONFIGURATION

Installed via **pip install backlit-kbd**. The tool reads brightness paths from **/sys/class/leds/*kbd_backlight*** and usually requires root permissions (or a udev rule granting write access) to change brightness levels. Use **--device-path** to override device auto-discovery.

# CAVEATS

Writing to sysfs brightness files typically requires **root** privileges or a udev rule. Discovery may also match a **capslock** LED on some systems if no keyboard backlight is found, so use **--device-path** when results look wrong. Not all laptops expose a keyboard backlight LED; on unsupported hardware the tool will fail to discover a device unless **--mock** is used. Raw level ranges differ per device, so percentage mode is more portable across machines.

# HISTORY

**backlit-kbd** was created by **Adarsh Gourab Mahalik** and first released (version 0.1.0) on PyPI in **2026** under the MIT license.

# SEE ALSO

[brightnessctl](/man/brightnessctl)(1), [light](/man/light)(1), [xbacklight](/man/xbacklight)(1)

# RESOURCES

```[Source code](https://github.com/itsmeadarsh2008/backlit-kbd)```

<!-- verified: 2026-11-23 -->
