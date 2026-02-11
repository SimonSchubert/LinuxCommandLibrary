# TAGLINE

Display YubiKey device information

# TLDR

**Show YubiKey info**

```ykinfo -a```

**Show serial number**

```ykinfo -s```

**Show version**

```ykinfo -v```

**Show capabilities**

```ykinfo -c```

# SYNOPSIS

**ykinfo** [_-a_] [_-s_] [_-v_] [_-c_] [_options_]

# PARAMETERS

**-a**
> All information.

**-s**
> Serial number.

**-v**
> Firmware version.

**-c**
> Capabilities.

**-q**
> Quiet mode.

# DESCRIPTION

**ykinfo** queries a connected YubiKey device and displays its identification information. It can report the serial number, firmware version, and supported capabilities of the hardware token.

The **-a** flag shows all available information at once. Individual flags like **-s** (serial), **-v** (version), and **-c** (capabilities) display specific details. Quiet mode (**-q**) outputs values without labels for use in scripts.

When multiple YubiKeys are connected, the tool can select a specific device by serial number. It is part of the **yubikey-personalization** package and is useful for diagnostics, inventory, and scripting around YubiKey management.

# CAVEATS

YubiKey required. USB connection. Part of yubikey-personalization.

# HISTORY

**ykinfo** is part of **yubikey-personalization**, providing information about connected YubiKey devices.

# SEE ALSO

[ykman](/man/ykman)(1), [ykpersonalize](/man/ykpersonalize)(1), [gpg](/man/gpg)(1)
