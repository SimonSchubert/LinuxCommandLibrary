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

**Turn backlight on** at a specific percentage

```backlit-kbd on --percent [40]```

**Turn backlight off**

```backlit-kbd off```

**Blink the keyboard** as a visual notification

```backlit-kbd blink --count [4] --on-ms [100] --off-ms [100]```

**Test without hardware** using the mock backend

```backlit-kbd --mock percent [50]```

# SYNOPSIS

**backlit-kbd** [_options_] _command_ [_args_]

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
> Turn the backlight on, optionally at a given percentage.

**off**
> Turn the backlight off.

**blink** [_options_]
> Run a synchronous blink pattern on the keyboard.

**notify** [_options_]
> Run an asynchronous notification blink without blocking the shell.

**--mock**
> Use an in-memory backend for safe testing without writing to hardware.

**--device-path** _PATH_
> Target a specific sysfs device path instead of auto-discovery.

**--count** _N_
> Number of blink cycles (used with _blink_ / _notify_).

**--on-ms** _N_
> Duration in milliseconds for the on state during blink.

**--off-ms** _N_
> Duration in milliseconds for the off state during blink.

**--level-percent** _N_
> Brightness level during blink cycles.

**--name** _NAME_
> Notification identifier (used with _notify_).

# DESCRIPTION

**backlit-kbd** is a Python command-line utility for controlling the keyboard backlight on Linux. It auto-discovers compatible LED devices exposed by the kernel under **/sys/class/leds/**, typically vendor-specific paths such as **tpacpi::kbd_backlight** (Lenovo ThinkPad), **asus::kbd_backlight** (ASUS), or **dell::kbd_backlight** (Dell).

The tool exposes high-level commands (_set_, _percent_, _inc_, _dec_, _on_, _off_) for everyday brightness control and a pair of _blink_ / _notify_ commands for producing visual notifications via the keyboard LEDs. A **--mock** flag swaps the backend for an in-memory simulator, making it safe to experiment or integrate into scripts on machines without a real backlight device.

# CONFIGURATION

Installed via **pip install backlit-kbd**. The tool reads brightness paths from **/sys/class/leds/*kbd_backlight*** and usually requires root permissions (or a udev rule granting write access) to change brightness levels. Use **--device-path** to override device auto-discovery.

# CAVEATS

Writing to sysfs brightness files typically requires **root** privileges. Not all laptops expose a keyboard backlight LED; on unsupported hardware the tool will fail to discover a device unless **--mock** is used. Raw level ranges differ per device, so percentage mode is more portable across machines.

# HISTORY

**backlit-kbd** is an open-source Python package hosted on GitHub and published to PyPI, aimed at providing a beginner-friendly CLI for keyboard backlight control on Linux laptops.

# SEE ALSO

[brightnessctl](/man/brightnessctl)(1), [light](/man/light)(1), [xbacklight](/man/xbacklight)(1)
