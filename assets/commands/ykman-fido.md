# TAGLINE

Manage YubiKey FIDO2 credentials

# TLDR

**Show FIDO info**

```ykman fido info```

**List credentials**

```ykman fido credentials list```

**Delete credential**

```ykman fido credentials delete [id]```

**Reset FIDO**

```ykman fido reset```

# SYNOPSIS

**ykman** **fido** _command_ [_options_]

# PARAMETERS

**info**
> Show FIDO2 information.

**credentials** _cmd_
> Manage resident credentials.

**reset**
> Reset FIDO application.

**access** _cmd_
> Manage PIN and fingerprints.

# DESCRIPTION

**ykman fido** manages FIDO2/WebAuthn on YubiKey. View and manage passkeys and resident credentials. Configure PIN and biometric authentication.

# CAVEATS

Reset permanently removes all FIDO credentials from the device.

# SEE ALSO

[ykman](/man/ykman)(1), [ykman-oath](/man/ykman-oath)(1)

