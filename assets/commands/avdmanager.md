# TLDR

**List all available Android Virtual Device targets**

```avdmanager list target```

**List all available device definitions**

```avdmanager list device```

**List all created AVDs**

```avdmanager list avd```

**Create a new AVD**

```avdmanager create avd -n [avd_name] -k "[system_image]" -d "[device_id]"```

**Create AVD with specific settings**

```avdmanager create avd -n [avd_name] -k "system-images;android-[34];google_apis;x86_64" -d "pixel_6"```

**Delete an AVD**

```avdmanager delete avd -n [avd_name]```

**Move/rename an AVD**

```avdmanager move avd -n [old_name] -r [new_name]```

# SYNOPSIS

**avdmanager** _command_ [_options_]

# PARAMETERS

**list target**
> List available Android targets for AVD creation.

**list device**
> List available device definitions (phone, tablet, TV).

**list avd**
> List all created Android Virtual Devices.

**create avd**
> Create a new Android Virtual Device.

**delete avd**
> Delete an existing AVD.

**move avd**
> Move or rename an AVD.

**-n**, **--name** _name_
> Name for the AVD.

**-k**, **--package** _path_
> System image package path.

**-d**, **--device** _id_
> Device definition to use.

**-c**, **--sdcard** _size_
> Size of SD card (e.g., 512M).

**-p**, **--path** _directory_
> Custom location for AVD files.

**-f**, **--force**
> Force creation, overwriting existing AVD.

# DESCRIPTION

**avdmanager** is the Android SDK command-line tool for creating and managing Android Virtual Devices (AVDs). AVDs are emulator configurations that define the hardware profile and system image for Android emulator instances.

Each AVD specifies a device type (phone, tablet, TV, wear), Android API level, system image (with or without Google APIs/Play Store), and hardware characteristics like screen size, RAM, and storage. These configurations are used by the Android emulator to simulate various Android devices.

The tool works alongside **sdkmanager** for downloading system images and **emulator** for running the virtual devices. AVDs are stored in **~/.android/avd/** by default.

# CAVEATS

Creating an AVD requires the corresponding system image to be installed via sdkmanager first. Hardware acceleration (KVM on Linux, HAXM on macOS/Windows) is strongly recommended for acceptable emulator performance. AVDs for different architectures (arm64, x86_64) are not interchangeable.

# HISTORY

**avdmanager** was introduced in Android SDK Tools version 25.3 (2017) as a replacement for the **android** command's AVD management functionality. It is part of Google's effort to provide focused, standalone command-line tools for Android development. The tool is distributed as part of the Android SDK command-line tools package.

# SEE ALSO

[sdkmanager](/man/sdkmanager)(1), [emulator](/man/emulator)(1), [adb](/man/adb)(1)
