# TAGLINE

Configure YubiKey device settings

# TLDR

**Show device info**

```ykman config info```

**Set lock code**

```ykman config set-lock-code```

**Enable USB interface**

```ykman config usb --enable [OTP]```

**Disable NFC interface**

```ykman config nfc --disable [FIDO2]```

# SYNOPSIS

**ykman** **config** _command_ [_options_]

# PARAMETERS

**info**
> Show configuration.

**set-lock-code**
> Set or change lock code.

**usb** [_options_]
> Configure enabled applications over USB (OTP, FIDO2, U2F, OATH, PIV, OPENPGP, HSMAUTH).

**nfc** [_options_]
> Configure enabled applications over NFC.

**--enable** _APP_
> Enable the named application for the selected transport.

**--disable** _APP_
> Disable the named application for the selected transport.

**--enable-all**
> Enable all supported applications for the transport.

**--disable-all**
> Disable all applications for the transport.

**--lock-code** _HEX_
> Provide the current lock code when changing protected settings.

**-f**, **--force**
> Apply changes without confirmation.

# DESCRIPTION

**ykman config** manages YubiKey device configuration. Enable or disable applications and interfaces. Set lock codes for configuration protection.

# SEE ALSO

[ykman](/man/ykman)(1), [ykman-fido](/man/ykman-fido)(1)

