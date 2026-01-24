# TLDR

**Mirror Android device**

```scrcpy```

**Mirror specific device** (by serial)

```scrcpy -s [SERIAL]```

**Record screen while mirroring**

```scrcpy --record [file.mp4]```

**Limit resolution**

```scrcpy --max-size [1024]```

**Limit framerate**

```scrcpy --max-fps [30]```

**Connect wirelessly**

```adb tcpip 5555 && adb connect [device_ip]:5555 && scrcpy```

**Mirror without control** (view only)

```scrcpy --no-control```

**Turn screen off while mirroring**

```scrcpy --turn-screen-off```

# SYNOPSIS

**scrcpy** [_-s serial_] [_--record file_] [_--max-size px_] [_--max-fps fps_] [_options_]

# PARAMETERS

**-s** _SERIAL_, **--serial** _SERIAL_
> Device serial number.

**--max-size**, **-m** _SIZE_
> Limit resolution (shorter edge).

**--max-fps** _FPS_
> Limit frame rate.

**-r**, **--record** _FILE_
> Record to file (mp4/mkv).

**-b**, **--bit-rate** _RATE_
> Video bitrate (default: 8M).

**-n**, **--no-control**
> Disable control (mirror only).

**-N**, **--no-display**
> Disable display (record only).

**-t**, **--show-touches**
> Show touches on device.

**--turn-screen-off**, **-S**
> Turn device screen off.

**--stay-awake**, **-w**
> Keep device awake.

**--window-title** _TITLE_
> Custom window title.

**--window-x** _X_
> Window X position.

**--window-y** _Y_
> Window Y position.

**--window-width** _W_
> Window width.

**--window-height** _H_
> Window height.

**--fullscreen**, **-f**
> Start fullscreen.

**--always-on-top**
> Keep window on top.

**--crop** _W:H:X:Y_
> Crop screen region.

**--no-audio**
> Disable audio forwarding.

# DESCRIPTION

**scrcpy** (screen copy) displays and controls Android devices from desktop. It mirrors the device screen with low latency, enabling interaction via mouse and keyboard.

Connection works over USB or WiFi. USB provides best performance; WiFi enables untethered use. The tool uses ADB for communication and custom server pushed to the device.

Control includes touch emulation, keyboard input, clipboard sync, and device buttons (power, volume, back). Multi-touch is supported with mouse + keyboard modifiers.

Recording captures the mirrored screen to MP4 or MKV without audio overhead. Combined with --no-display, it enables headless recording.

Screen-off mode keeps the device screen off while displaying on desktop - useful for battery saving. Stay-awake prevents device sleep during mirroring.

Window management options control placement and behavior. Fullscreen and always-on-top modes optimize different workflows.

# CAVEATS

Requires ADB and USB debugging enabled. Audio forwarding needs Android 11+. Some apps block screen capture. Wireless mode needs initial USB setup. High resolution/framerate increases latency. Not all keyboard shortcuts work in all apps.

# HISTORY

**scrcpy** was created by **Romain Vimont** (rom1v) at **Genymobile** around **2018**. It provides a lightweight alternative to Android emulators and vendor-specific mirroring tools. Written in C with SDL, it prioritizes performance and simplicity. The project is open source and actively maintained.

# SEE ALSO

[adb](/man/adb)(1), [sndcpy](/man/sndcpy)(1), [vysor](/man/vysor)(1)
