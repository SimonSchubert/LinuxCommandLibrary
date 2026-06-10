# TAGLINE

command-line two-factor authentication code generator

# TLDR

**Add a new TOTP secret** for an account

```2fa -add [account_name]```

**Generate a TOTP code** for a specific account

```2fa [account_name]```

**List all configured accounts**

```2fa -list```

**Add a counter-based (HOTP) account**

```2fa -add -hotp [account_name]```

**Add an account that produces 8-digit codes**

```2fa -add -8 [account_name]```

**Generate codes for all TOTP accounts**

```2fa```

# SYNOPSIS

**2fa** [**-add** [**-7**|**-8**] [**-hotp**] _name_]

**2fa** [**-list**]

**2fa** [**-clip**] _name_

# PARAMETERS

**-add**
> Add a new account with the given name. Prompts for the base32-encoded TOTP/HOTP key.

**-list**
> List all configured account names.

**-7**
> When adding a key, generate 7-digit codes instead of the default 6.

**-8**
> When adding a key, generate 8-digit codes instead of the default 6.

**-hotp**
> When adding a key, treat it as a counter-based HOTP key rather than time-based TOTP.

**-clip**
> Copy the generated code to the system clipboard instead of printing it.

# DESCRIPTION

**2fa** is a command-line two-factor authentication agent that generates one-time passwords compatible with services like Google Authenticator. It supports both time-based (TOTP) and counter-based (HOTP) keys, producing 6-digit codes by default (or 7 or 8 with **-7**/**-8**). TOTP codes refresh every 30 seconds.

The tool reads keys in base32 format (the same format shown when setting up 2FA on websites). When run without arguments, it displays codes for all configured TOTP accounts. Specify an account name to get only that code.

Secrets are stored in **~/.2fa** by default. The file should be protected with appropriate permissions as it contains sensitive authentication material.

# CAVEATS

Secrets are stored unencrypted in a plain text file. Ensure proper file permissions (**chmod 600**) on the storage file. System clock must be accurate for TOTP codes to work correctly; time drift will cause authentication failures.

# HISTORY

The **2fa** command was created by Russ Cox and released as an open-source Go utility. It provides a minimal Unix-philosophy approach to TOTP generation, designed for users who prefer command-line tools over mobile authenticator apps.

# SEE ALSO

[oathtool](/man/oathtool)(1), [pass-otp](/man/pass-otp)(1), [gpg](/man/gpg)(1)

# RESOURCES

```[Source code](https://github.com/rsc/2fa)```

<!-- verified: 2026-06-10 -->
