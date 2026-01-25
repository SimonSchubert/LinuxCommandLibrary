# TLDR

**Add a new TOTP secret** for an account

```2fa -add [account_name]```

**Generate a TOTP code** for a specific account

```2fa [account_name]```

**List all configured accounts**

```2fa -list```

**Add a secret with a specific issuer**

```2fa -add -issuer=[issuer_name] [account_name]```

**Generate codes for all accounts**

```2fa```

# SYNOPSIS

**2fa** [**-add**] [**-list**] [**-issuer** _name_] [_account_]

# PARAMETERS

**-add**
> Add a new account. Prompts for the base32-encoded TOTP secret.

**-list**
> List all configured account names.

**-issuer** _name_
> Specify the issuer name when adding an account (for organization).

**-clip**
> Copy the generated code to clipboard instead of printing.

# DESCRIPTION

**2fa** is a command-line two-factor authentication tool that generates time-based one-time passwords (TOTP) compatible with services like Google Authenticator. It stores secrets securely in a local file and produces 6-digit codes that refresh every 30 seconds.

The tool reads TOTP secrets in base32 format (the same format shown when setting up 2FA on websites). When run without arguments, it displays codes for all configured accounts. Specify an account name to get only that code.

Secrets are stored in **~/.2fa** by default. The file should be protected with appropriate permissions as it contains sensitive authentication material.

# CAVEATS

Secrets are stored unencrypted in a plain text file. Ensure proper file permissions (**chmod 600**) on the storage file. System clock must be accurate for TOTP codes to work correctly; time drift will cause authentication failures.

# HISTORY

The **2fa** command was created by Russ Cox and released as an open-source Go utility. It provides a minimal Unix-philosophy approach to TOTP generation, designed for users who prefer command-line tools over mobile authenticator apps.

# SEE ALSO

[oathtool](/man/oathtool)(1), [pass-otp](/man/pass-otp)(1), [gpg](/man/gpg)(1)
