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

**ykman** manages YubiKey devices. It configures all YubiKey applications.

OATH manages TOTP/HOTP. Store and generate codes.

FIDO2 handles WebAuthn. Passwordless authentication.

PIV manages certificates. Smart card functionality.

OpenPGP configures GPG. Sign, encrypt, authenticate.

Device info shows capabilities. Serial, firmware, applications.

# CAVEATS

Requires YubiKey. Some operations are destructive. Backup before reset.

# HISTORY

**ykman** (YubiKey Manager) is the official CLI from **Yubico**. It replaces older tools with unified management.

# SEE ALSO

[gpg](/man/gpg)(1), [ssh-keygen](/man/ssh-keygen)(1)
