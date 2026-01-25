# TLDR

**Start Android emulator**

```emulator -avd [avd_name]```

**List available AVDs**

```emulator -list-avds```

**Start with wiped user data**

```emulator -avd [avd_name] -wipe-data```

**Start without snapshot**

```emulator -avd [avd_name] -no-snapshot-load```

**Start with GPU acceleration**

```emulator -avd [avd_name] -gpu host```

**Start in headless mode**

```emulator -avd [avd_name] -no-window```

# SYNOPSIS

**emulator** [_options_] **-avd** _name_

# PARAMETERS

**-avd** _name_
> Android Virtual Device name.

**-list-avds**
> List available AVDs.

**-wipe-data**
> Reset user data.

**-no-snapshot-load**
> Don't load snapshot.

**-no-snapshot-save**
> Don't save snapshot on exit.

**-gpu** _mode_
> GPU mode: auto, host, swiftshader, off.

**-no-window**
> Headless mode.

**-no-audio**
> Disable audio.

**-memory** _size_
> RAM size in MB.

**-port** _port_
> Console port number.

**-dns-server** _servers_
> DNS server addresses.

**-http-proxy** _proxy_
> HTTP proxy address.

# DESCRIPTION

**emulator** is the Android Emulator, part of the Android SDK. It runs Android Virtual Devices (AVDs) for app testing and development, simulating various Android devices with different API levels and configurations.

The emulator provides features like GPS simulation, network conditions, phone calls/SMS, camera, and accelerometer input. It integrates with Android Studio for debugging and testing.

# CAVEATS

Requires hardware virtualization (KVM on Linux, HAXM/Hypervisor on others). First boot is slow. x86 images run faster than ARM emulation. Requires significant RAM and CPU. Some hardware features cannot be fully emulated.

# HISTORY

The Android Emulator was introduced with the first Android SDK by **Google** in **2008**. It has evolved significantly, with QEMU-based architecture improving performance and accuracy. Modern versions use hardware acceleration and quick boot for faster startup.

# SEE ALSO

[adb](/man/adb)(1), [avdmanager](/man/avdmanager)(1), [sdkmanager](/man/sdkmanager)(1)
