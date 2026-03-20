# TAGLINE

captures screenshots from iOS devices

# TLDR

**Take a screenshot and save to a file**

```idevicescreenshot [screenshot.tiff]```

**Take a screenshot with auto-generated filename**

```idevicescreenshot```

**Take a screenshot from a specific device by UDID**

```idevicescreenshot -u [udid] [output.tiff]```

**Take a screenshot over network connection**

```idevicescreenshot -n [output.tiff]```

**Enable debug output**

```idevicescreenshot -d [output.tiff]```

# SYNOPSIS

**idevicescreenshot** [_options_] [_output_]

# PARAMETERS

_OUTPUT_
> Output filename. If omitted, generates a timestamped filename (e.g. screenshot-2024-01-15-12-30-00.tiff).

**-u**, **--udid** _UDID_
> Target device by its unique device identifier (UDID).

**-n**, **--network**
> Connect to network device instead of USB.

**-d**, **--debug**
> Enable communication debugging.

**-v**, **--version**
> Display version information.

**-h**, **--help**
> Display usage information.

# DESCRIPTION

**idevicescreenshot** captures screenshots from connected iOS devices. It saves the current screen as a TIFF image. The tool communicates with the device's screenshotr service via the usbmuxd protocol.

A mounted developer disk image is required on the device, otherwise the screenshotr service is not available. The device must be paired and trusted before screenshots can be taken. Use **idevicepair** to manage device pairing.

# CAVEATS

Part of the **libimobiledevice** suite. The device must be paired and trusted. Requires a mounted developer disk image. DRM-protected content may appear as black in screenshots.

# SEE ALSO

[idevice_id](/man/idevice_id)(1), [idevicepair](/man/idevicepair)(1), [ideviceinfo](/man/ideviceinfo)(1), [scrcpy](/man/scrcpy)(1)
