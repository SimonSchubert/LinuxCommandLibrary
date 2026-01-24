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

**ykinfo** shows YubiKey info. It queries the device.

Device identification. Serial number.

Firmware version. Check capabilities.

Multiple keys. Select by serial.

Diagnostic tool. Troubleshooting.

# CAVEATS

YubiKey required. USB connection. Part of yubikey-personalization.

# HISTORY

**ykinfo** is part of **yubikey-personalization**, providing information about connected YubiKey devices.

# SEE ALSO

[ykman](/man/ykman)(1), [ykpersonalize](/man/ykpersonalize)(1), [gpg](/man/gpg)(1)
