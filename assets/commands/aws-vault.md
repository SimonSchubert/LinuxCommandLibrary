# TAGLINE

Securely store and access AWS credentials in the system keychain.

# TLDR

**Add** AWS credentials

```aws-vault add [profile-name]```

**Execute** command with credentials

```aws-vault exec [profile-name] -- aws s3 ls```

**Login** to AWS console

```aws-vault login [profile-name]```

**List** stored credentials

```aws-vault list```

**Remove** credentials

```aws-vault remove [profile-name]```

**Rotate** credentials

```aws-vault rotate [profile-name]```

# SYNOPSIS

**aws-vault** _command_ [_options_] _profile_

# DESCRIPTION

**aws-vault** securely stores and accesses AWS credentials using your operating system's keychain. It generates temporary credentials using STS, avoiding long-lived access keys in plain text files.

The tool provides defense-in-depth security for AWS credentials and enables easy switching between multiple AWS accounts.

# PARAMETERS

**add** _profile_
> Add new credentials to keychain

**exec** _profile_ **--** _command_
> Execute command with temporary credentials

**login** _profile_
> Open AWS Console in browser

**list**
> List profiles and session status

**remove** _profile_
> Remove credentials from keychain

**rotate** _profile_
> Rotate access keys

**export** _profile_
> Export credentials as environment variables

**--duration=**_time_
> Session duration (e.g., 12h, 1h30m)

**--mfa-token=**_token_
> MFA token code

**--no-session**
> Don't create STS session

# FEATURES

- Secure credential storage in system keychain
- Automatic MFA prompting
- Temporary credential generation
- Multiple AWS account support
- Credential rotation
- Console login generation

# WORKFLOW

```bash
aws-vault add work
aws-vault exec work -- aws s3 ls
aws-vault exec work
aws-vault login work
```

# CONFIGURATION

**~/.aws/config**
> AWS profile settings including role_arn, source_profile, mfa_serial, and region.

**~/.aws/credentials**
> Master credentials stored in system keychain; this file is read for profile discovery.

# CAVEATS

Requires system keychain access (macOS Keychain, GNOME Keyring, etc.). MFA devices must be configured in AWS. Temporary credentials expire. Some tools don't work with session credentials.

# HISTORY

**aws-vault** was created by 99designs in **2015** to provide secure credential management for AWS, addressing the security risks of storing credentials in plain text.

# SEE ALSO

[aws](/man/aws)(1), [aws-configure](/man/aws-configure)(1), [pass](/man/pass)(1)
