# TLDR

**List OATH accounts**

```ykman oath accounts list```

**Add TOTP account**

```ykman oath accounts add [name] [secret]```

**Generate code**

```ykman oath accounts code [name]```

**Delete account**

```ykman oath accounts delete [name]```

# SYNOPSIS

**ykman** **oath** _command_ [_options_]

# PARAMETERS

**accounts** _cmd_
> Manage OATH accounts.

**info**
> Show OATH information.

**access** _cmd_
> Manage password protection.

**reset**
> Reset OATH application.

# DESCRIPTION

**ykman oath** manages TOTP/HOTP accounts on YubiKey. Store 2FA secrets securely on hardware. Generate one-time passwords for authentication.

# SEE ALSO

[ykman](/man/ykman)(1), [ykman-fido](/man/ykman-fido)(1)

