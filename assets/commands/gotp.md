# TAGLINE

TOTP/MFA authenticator for command line

# TLDR

**Show** current TOTP code

```gotp show [account-name]```

**Add** new TOTP account

```gotp add [name] [secret-key]```

**Generate** QR code for setup

```gotp qr [account-name]```

**List** all accounts

```gotp list```

# SYNOPSIS

**gotp** [_options_] _command_

# PARAMETERS

**show** _NAME_
> Show current TOTP code for account

**add** _NAME_ _SECRET_
> Add new TOTP account

**remove** _NAME_
> Remove account

**list**
> List all accounts

**qr** _NAME_
> Generate QR code for account

**export**
> Export accounts (encrypted)

**import** _FILE_
> Import accounts from file

**-c, --config** _FILE_
> Configuration file path

**--clip**
> Copy code to clipboard

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**gotp** is a command-line TOTP (Time-based One-Time Password) authenticator. It stores and generates 2FA/MFA codes for accounts without requiring a phone or browser extension.

The tool encrypts stored secrets and can generate QR codes for easy mobile app setup.

# SECURITY

Secrets are encrypted at rest using a master password. Clipboard integration for secure code copying. No network access required after setup.

# CAVEATS

System clock must be accurate for valid codes. Secrets are only as secure as the encryption password. Backup codes recommended for account recovery.

# HISTORY

**gotp** was created for users preferring terminal-based 2FA management or needing MFA access on headless servers.

# SEE ALSO

[oathtool](https://www.nongnu.org/oath-toolkit/), [keepassxc](https://keepassxc.org/), [1password-cli](https://developer.1password.com/docs/cli/)