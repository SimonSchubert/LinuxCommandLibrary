# TAGLINE

Forward Android device audio to computer

# TLDR

**Forward audio** from a connected Android device

```sndcpy```

**Forward audio** from a specific device by serial

```sndcpy [serial]```

Use a **different local port**

```SNDCPY_PORT=[28300] sndcpy```

**Uninstall** the companion app from the device

```adb uninstall com.rom1v.sndcpy```

# SYNOPSIS

**sndcpy** [_serial_]

# PARAMETERS

_serial_
> The serial number of the Android device to forward audio from, as listed by **adb devices**. Needed when several devices are connected.

**ADB**
> Environment variable with the full path to the adb executable.

**VLC**
> Environment variable with the full path to the vlc executable.

**SNDCPY_APK**
> Environment variable with the full path to sndcpy.apk.

**SNDCPY_PORT**
> Environment variable to override the local forwarding port (default: 28200).

# DESCRIPTION

**sndcpy** forwards audio from an Android device to a computer through adb, with no root access needed. It was built as a companion to **scrcpy** (screen copy) but can be used independently. Works on Linux, Windows and macOS.

The script installs a small app on the device, sets up an adb forward, and plays the raw audio stream in VLC. Audio keeps playing on the device, and volume can be adjusted independently on the device and the computer. Press **Ctrl+C** in the terminal to stop (on Windows, disconnect the device or stop the capture from the device notifications).

sndcpy requires Android 10 or later due to its reliance on the AudioPlaybackCapture API introduced in that version. VLC must be installed on the computer to receive and play the audio stream.

# CAVEATS

This is a proof-of-concept with limitations. Apps targeting Android 9 or earlier cannot have their audio captured by default, and apps can opt out by setting **allowAudioPlaybackCapture="false"** in their manifest. Jitter may cause VLC to increase buffering and add delay; restart sndcpy if that happens. VLC may print a one-time "Connection refused" error at startup, which can be ignored. The script looks for sndcpy.apk in the current directory unless **SNDCPY_APK** is set.

# HISTORY

**sndcpy** was created by Romain Vimont (rom1v), the author of **scrcpy**, to demonstrate Android 10's audio capture. The latest release is v1.1. **scrcpy 2.0** added native audio forwarding, which replaces sndcpy for most uses.

# SEE ALSO

[scrcpy](/man/scrcpy)(1), [adb](/man/adb)(1), [vlc](/man/vlc)(1)

# RESOURCES

```[Source code](https://github.com/rom1v/sndcpy)```

<!-- verified: 2026-11-09 -->
