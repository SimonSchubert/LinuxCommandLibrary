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

**usb** _options_
> Configure USB interfaces.

**nfc** _options_
> Configure NFC interfaces.

**--enable** _app_
> Enable application.

**--disable** _app_
> Disable application.

# DESCRIPTION

**ykman config** manages YubiKey device configuration. Enable or disable applications and interfaces. Set lock codes for configuration protection.

# SEE ALSO

[ykman](/man/ykman)(1), [ykman-fido](/man/ykman-fido)(1)

