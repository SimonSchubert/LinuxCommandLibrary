# TLDR

**Forward audio** from a connected Android device

```sndcpy```

**Forward audio** from a specific device by serial

```sndcpy [serial]```

**Stop audio forwarding**

> Press **Ctrl+C** in the terminal (or disconnect the device on Windows)

# SYNOPSIS

**sndcpy** [_serial_]

# PARAMETERS

_serial_
> The serial number of the Android device to forward audio from. Optional if only one device is connected.

# DESCRIPTION

**sndcpy** forwards audio from an Android device to a computer over USB or TCP/IP. It works as a companion to **scrcpy** (screen copy), enabling both video and audio forwarding from Android devices. The name is a portmanteau of "sound" and "copy."

The tool installs a small app on the Android device that captures audio output and streams it to VLC on the computer. Audio continues to play on the device as well, and volume can be controlled independently on both device and computer.

sndcpy requires Android 10 or later due to its reliance on the AudioPlaybackCapture API introduced in that version. VLC must be installed on the computer to receive and play the audio stream.

# CAVEATS

This is a proof-of-concept with limitations. Apps targeting Android 9 or earlier cannot have their audio captured by default. Apps can also explicitly disable audio capture by setting **allowAudioPlaybackCapture="false"** in their manifest. Network jitter may cause VLC to increase buffering, resulting in audio delay. For reliable audio forwarding across all apps, Bluetooth pairing between device and computer is recommended as an alternative.

# HISTORY

**sndcpy** was created by Romain Vimont (rom1v), the same developer who created **scrcpy** for Android screen mirroring. It was released as a proof-of-concept to demonstrate Android 10's new audio capture capabilities. While functional, the project has not seen active development as the author considers Bluetooth audio forwarding a more practical solution for most use cases.

# SEE ALSO

[scrcpy](/man/scrcpy)(1), [adb](/man/adb)(1), [vlc](/man/vlc)(1)
