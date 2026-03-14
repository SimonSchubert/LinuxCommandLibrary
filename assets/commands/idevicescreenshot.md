# TAGLINE

captures screenshots from iOS devices

# TLDR

**Take a screenshot and save to a file**

```idevicescreenshot [screenshot.png]```

**Take a screenshot with auto-generated filename**

```idevicescreenshot```

**Take a screenshot from a specific device by UDID**

```idevicescreenshot -u [udid] [output.png]```

**Take a screenshot over network connection**

```idevicescreenshot -n [output.png]```

**Enable debug output**

```idevicescreenshot -d [output.png]```

# SYNOPSIS

**idevicescreenshot** [_options_] [_output_]

# PARAMETERS

_OUTPUT_
> Output filename. If omitted, generates a timestamped filename.

**-u** _UDID_
> Target device by its unique device identifier (UDID).

**-n**
> Use network connection instead of USB.

**-d**, **--debug**
> Enable debug output.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**idevicescreenshot** captures screenshots from connected iOS devices. It saves the current screen as a PNG or TIFF file depending on the device and iOS version. The tool communicates with the device's screenshot service via the usbmuxd protocol.

The device must be paired and trusted before screenshots can be taken. Use **idevicepair** to manage device pairing.

# CAVEATS

Part of the **libimobiledevice** suite. The device must be paired and trusted. The output format (PNG vs TIFF) depends on the iOS version. DRM-protected content may appear as black in screenshots.

# SEE ALSO

[idevice_id](/man/idevice_id)(1), [idevicepair](/man/idevicepair)(1), [ideviceinfo](/man/ideviceinfo)(1), [scrcpy](/man/scrcpy)(1)
