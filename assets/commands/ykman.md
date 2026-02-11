# TAGLINE

YubiKey device management CLI

# TLDR

**List YubiKeys**

```ykman list```

**Show device info**

```ykman info```

**List OATH accounts**

```ykman oath accounts list```

**Generate TOTP code**

```ykman oath accounts code [account_name]```

**Add OATH account**

```ykman oath accounts add -t [name] [secret]```

**Reset FIDO2**

```ykman fido reset```

**Set FIDO2 PIN**

```ykman fido access change-pin```

**List PIV certificates**

```ykman piv certificates list```

# SYNOPSIS

**ykman** [_options_] _command_ [_subcommand_] [_args_]

# PARAMETERS

**list**
> List devices.

**info**
> Device info.

**oath**
> OATH commands.

**fido**
> FIDO commands.

**piv**
> PIV commands.

**openpgp**
> OpenPGP commands.

**config**
> Configuration.

**-d** _SERIAL_
> Device serial.

# DESCRIPTION

**ykman** (YubiKey Manager) is the official CLI from Yubico for managing all aspects of YubiKey hardware security tokens. It provides a unified interface to configure and interact with the various applications available on the device.

The **oath** subcommand manages TOTP and HOTP accounts, storing two-factor authentication secrets on the hardware and generating one-time codes. The **fido** subcommand handles FIDO2/WebAuthn credentials for passwordless authentication, including PIN management and resident key storage. The **piv** subcommand manages X.509 certificates for smart card operations, and **openpgp** configures PGP keys for signing, encryption, and SSH authentication.

The **config** subcommand controls device-level settings such as enabling or disabling USB and NFC interfaces for specific applications. The **info** and **list** commands display device details including serial number, firmware version, and available applications. The **-d** flag selects a specific device when multiple YubiKeys are connected.

# CAVEATS

Requires YubiKey. Some operations are destructive. Backup before reset.

# HISTORY

**ykman** (YubiKey Manager) is the official CLI from **Yubico**. It replaces older tools with unified management.

# SEE ALSO

[gpg](/man/gpg)(1), [ssh-keygen](/man/ssh-keygen)(1)
