# TLDR

**List** connected devices

```adb devices```

**Install** an APK

```adb install [app.apk]```

**Copy file** from device to computer

```adb pull [/sdcard/file.txt] [./local/]```

**Copy file** from computer to device

```adb push [local_file] [/sdcard/]```

Open a **shell** on the device

```adb shell```

# SYNOPSIS

**adb** [_-d|-e|-s serial_] _command_ [_options_]

# DESCRIPTION

**adb** (Android Debug Bridge) is a versatile command-line tool for communicating with Android devices. It provides access to a Unix shell for running commands, installing/uninstalling apps, transferring files, and debugging applications.

The tool operates through a client-server architecture where the adb server runs on your computer and communicates with the adb daemon (adbd) on connected devices. Connections can be made via USB or wirelessly over TCP/IP.

# PARAMETERS

**-d**
> Direct command to the only connected USB device

**-e**
> Direct command to the only running emulator

**-s** _serial_
> Direct command to device with specified serial number

**devices**
> List all connected devices and their states

**install** _apk_
> Install an APK file

**uninstall** _package_
> Remove an application by package name

**push** _local_ _remote_
> Copy file from computer to device

**pull** _remote_ _local_
> Copy file from device to computer

**shell**
> Open interactive shell or run command on device

**logcat**
> View device log output

**forward** _local_ _remote_
> Set up port forwarding

**reverse** _remote_ _local_
> Set up reverse port forwarding

**reboot**
> Reboot the device (bootloader, recovery options available)

**start-server**
> Start the adb server

**kill-server**
> Stop the adb server

# CAVEATS

USB debugging must be enabled on the device. First connection requires authorizing the computer on the device. Some commands require root access. Wireless debugging requires initial USB setup or pairing (Android 11+).

# HISTORY

**adb** was developed by Google as part of the Android SDK, first released with Android 1.0 in **2008**. It has evolved to support features like wireless debugging, scoped storage access, and improved security through RSA key authentication.

# SEE ALSO

[fastboot](/man/fastboot)(1), [aapt](/man/aapt)(1), [logcat](/man/logcat)(1)
