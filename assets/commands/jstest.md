# TAGLINE

joystick testing tool that displays real-time axis and button states

# TLDR

**Test joystick**

```jstest [/dev/input/js0]```

**Test in one-line mode** showing immediate status

```jstest --normal [/dev/input/js0]```

**Test using event** output mode

```jstest --event [/dev/input/js0]```

**Test in non-blocking** event mode

```jstest --nonblock [/dev/input/js0]```

# SYNOPSIS

**jstest** [_options_] _device_

# PARAMETERS

_device_
> Joystick device path (e.g., /dev/input/js0).

**--normal**
> One-line mode showing immediate axis and button status.

**--old**
> Same as --normal but using the 0.x compatibility interface.

**--event**
> Print events as they come in.

**--nonblock**
> Same as --event but in non-blocking mode.

**--select**
> Same as --event but using select(2) system call.

# DESCRIPTION

**jstest** can be used to test all the features of the Linux joystick API, including non-blocking and select(2) access, as well as version 0.x compatibility mode. It reads input from Linux joystick devices (/dev/input/js*) and shows axis and button values as they change.

The tool is useful for verifying joystick functionality, calibration, and troubleshooting input issues. It works with gamepads, flight sticks, and other game controllers.

# OUTPUT

```
Driver version is 2.1.0.
Joystick (Microsoft X-Box One pad) has 8 axes (X, Y, Z, Rx, Ry, Rz, Hat0X, Hat0Y)
and 11 buttons (BtnA, BtnB, BtnX, BtnY, BtnTL, BtnTR, BtnSelect, BtnStart, BtnMode, BtnThumbL, BtnThumbR).
Testing ... (interrupt to exit)
Axes:  0:     0  1:     0  2:-32767  3:     0  4:     0  5:-32767  6:     0  7:     0
Buttons:  0:off  1:off  2:off  3:off  4:off  5:off  6:off  7:off  8:off  9:off 10:off
```

# CAVEATS

Requires joystick driver support. Device paths may change on hotplug. Calibration may be needed. Some controllers need xpad or other drivers.

# HISTORY

jstest is part of the **joystick** package for Linux, providing basic input device testing. It works with the kernel's joystick API (/dev/input/js*).

# SEE ALSO

[evtest](/man/evtest)(1), [inputattach](/man/inputattach)(1)
