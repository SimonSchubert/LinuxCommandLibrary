# TAGLINE

Display YubiKey device information

# TLDR

**Show all YubiKey information**

```ykinfo -a```

**Show serial number in decimal**

```ykinfo -s```

**Show serial number in hex**

```ykinfo -H```

**Show firmware version**

```ykinfo -v```

**Check if slot 1 is programmed**

```ykinfo -1```

**Show capabilities (quiet mode for scripting)**

```ykinfo -c -q```

# SYNOPSIS

**ykinfo** [_options_]

# PARAMETERS

**-a**
> Show all available information.

**-s**
> Serial number in decimal.

**-m**
> Serial number in modhex.

**-H**
> Serial number in hex.

**-v**
> Firmware version.

**-t**
> Touch level.

**-p**
> Programming sequence.

**-1**
> Check if slot 1 is programmed.

**-2**
> Check if slot 2 is programmed.

**-c**
> Capabilities.

**-q**
> Quiet mode; output values without labels.

# DESCRIPTION

**ykinfo** queries a connected YubiKey device and displays its identification information. It can report the serial number, firmware version, and supported capabilities of the hardware token.

The **-a** flag shows all available information at once. Individual flags like **-s** (serial), **-v** (version), and **-c** (capabilities) display specific details. Quiet mode (**-q**) outputs values without labels for use in scripts.

When multiple YubiKeys are connected, the tool can select a specific device by serial number. It is part of the **yubikey-personalization** package and is useful for diagnostics, inventory, and scripting around YubiKey management.

# CAVEATS

Requires a YubiKey connected via USB. Part of the **yubikey-personalization** package. The yubikey-personalization project is in maintenance mode; **ykman** is the recommended tool for newer YubiKeys.

# HISTORY

**ykinfo** is part of **yubikey-personalization**, providing information about connected YubiKey devices.

# SEE ALSO

[ykman](/man/ykman)(1), [ykpersonalize](/man/ykpersonalize)(1), [gpg](/man/gpg)(1)
