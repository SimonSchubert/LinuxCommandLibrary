# TAGLINE

Command-line monitor for Sony DualShock 4 controllers on Linux

# TLDR

**Monitor** the first connected DualShock 4 controller

```ds4```

**Watch a specific** hidraw device

```ds4 [/dev/hidraw0]```

**Show** the embedded help

```ds4 --help```

# SYNOPSIS

**ds4** [_device_]

# DESCRIPTION

**ds4** is a small command-line monitor for **Sony DualShock 4** (PS4) controllers connected to a Linux machine over USB or Bluetooth. It opens the controller's **hidraw** node, parses incoming HID input reports, and continuously prints the decoded state of every analog stick, trigger, button, touchpad point, gyroscope axis, accelerometer axis and battery indicator.

Unlike **ds4drv**, which creates virtual gamepad and mouse devices via **uinput**, **ds4** does not emulate any input devices — it only reads and prints. This makes it useful for verifying that a controller is detected, debugging button mappings before configuring a wrapper such as **antimicrox** or **AntiMicroX**, reverse-engineering vendor-specific HID reports, or characterising sensor drift on the IMU.

The tool is written in Go and distributed in source form via the Go module path **github.com/kenshaw/ds4**. The first positional argument can override the auto-detected hidraw device path.

# CAVEATS

Reading from **/dev/hidraw\*** typically requires **root** privileges or a udev rule granting access to the **input** group; otherwise the program will fail with a permission error on open. The decoder targets the first-generation DS4 (CUH-ZCT1U) and the revised CUH-ZCT2U; DualShock 3 and DualSense (PS5) controllers use different report layouts and are not supported. Bluetooth-connected controllers send larger reports than USB ones — both are handled, but the byte offsets differ between transports.

# HISTORY

**ds4** was written by **Kenneth Shaw** (kenshaw) and published on GitHub as a small Go utility for inspecting the DualShock 4 protocol on Linux. It complements the broader Linux PS4-controller ecosystem (**ds4drv**, **hid-playstation** kernel driver, **DualSense Tools**) by providing a minimal, dependency-free monitor.

# SEE ALSO

[evtest](/man/evtest)(1), [jstest](/man/jstest)(1)
