# TLDR

**List connected tokens**

```fido2-token -L```

**Get token info**

```fido2-token -I [/dev/hidraw0]```

**Set PIN**

```fido2-token -S [/dev/hidraw0]```

**Change PIN**

```fido2-token -C [/dev/hidraw0]```

**Reset token**

```fido2-token -R [/dev/hidraw0]```

**List resident credentials**

```fido2-token -L -r [/dev/hidraw0]```

# SYNOPSIS

**fido2-token** [_options_] [_device_]

# PARAMETERS

**-L**
> List connected tokens.

**-I** _device_
> Get device information.

**-S** _device_
> Set new PIN.

**-C** _device_
> Change existing PIN.

**-R** _device_
> Reset device (dangerous).

**-r**
> With -L, list resident credentials.

**-b**
> With -L, list biometric templates.

**-c**
> Blob (largeBlob) operations.

**-d**
> Debug output.

# DESCRIPTION

**fido2-token** manages FIDO2/WebAuthn security keys. It can list, configure, and reset hardware tokens like YubiKeys, SoloKeys, and other FIDO2 authenticators.

The tool is part of libfido2 and provides command-line access to token management functions typically accessed through browser WebAuthn APIs.

# DEVICE PATH

Tokens appear as HID devices:
- Linux: /dev/hidraw*
- macOS: ioreg device path

# CAVEATS

Requires appropriate permissions (udev rules on Linux). Reset destroys all credentials on device. PIN operations may lock out token after too many failures. Not all tokens support all features.

# HISTORY

fido2-token is part of **libfido2**, developed by **Yubico** and first released around **2019**. It provides open-source tooling for the FIDO2 standard, which succeeded U2F for strong authentication.

# SEE ALSO

[fido2-cred](/man/fido2-cred)(1), [fido2-assert](/man/fido2-assert)(1), [ykman](/man/ykman)(1)
