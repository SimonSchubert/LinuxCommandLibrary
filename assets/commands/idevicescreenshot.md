# TAGLINE

captures screenshots from iOS devices

# TLDR

**Take screenshot**

```idevicescreenshot [screenshot.png]```

**Auto-name screenshot**

```idevicescreenshot```

**Target specific device**

```idevicescreenshot -u [udid] [output.png]```

**Debug mode**

```idevicescreenshot -d [output.png]```

# SYNOPSIS

**idevicescreenshot** [_options_] [_output_]

# PARAMETERS

_OUTPUT_
> Output filename.

**-u** _UDID_
> Target device by UDID.

**-n**
> Use network connection.

**-d**, **--debug**
> Debug output.

**--help**
> Display help information.

# DESCRIPTION

**idevicescreenshot** captures screenshots from iOS devices. It saves the current screen as a PNG or TIFF file.

The tool requires the device to be paired and trusted. Screenshots are taken at device resolution.

# CAVEATS

Part of libimobiledevice. Device must be paired. Some apps may block screenshots.

# HISTORY

idevicescreenshot is part of **libimobiledevice** for iOS device screen capture.

# SEE ALSO

[idevice_id](/man/idevice_id)(1), [idevicepair](/man/idevicepair)(1), [scrcpy](/man/scrcpy)(1)
