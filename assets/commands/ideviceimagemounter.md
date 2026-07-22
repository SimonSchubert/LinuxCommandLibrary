# TAGLINE

mounts disk images on iOS devices

# TLDR

**Mount developer disk image**

```ideviceimagemounter [DeveloperDiskImage.dmg]```

**Mount with signature**

```ideviceimagemounter [DeveloperDiskImage.dmg] [DeveloperDiskImage.dmg.signature]```

**List mounted images**

```ideviceimagemounter -l```

**Target specific device**

```ideviceimagemounter -u [device-udid] [image.dmg]```

# SYNOPSIS

**ideviceimagemounter** [_options_] _image_ [_signature_]

# PARAMETERS

**-u** _udid_
> Target specific device.

**-l**
> List mounted images.

**-n**
> Connect over network.

**-t** _type_
> Image type (default: Developer).

# DESCRIPTION

**ideviceimagemounter** mounts disk images on iOS devices. Part of the libimobiledevice suite. Primarily used to mount Developer Disk Images for debugging and development tools like Xcode instruments. Requires the corresponding signature file.

# INSTALL

```apt: sudo apt install libimobiledevice-utils```

```dnf: sudo dnf install libimobiledevice-utils```

```apk: sudo apk add libimobiledevice-progs```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ideviceinfo](/man/ideviceinfo)(1)

