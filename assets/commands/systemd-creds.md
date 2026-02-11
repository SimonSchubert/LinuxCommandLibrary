# TAGLINE

Manage encrypted service credentials

# TLDR

**Encrypt** file with name

```systemd-creds encrypt --name [name] [input] [output]```

**Decrypt** file

```systemd-creds decrypt [input] [output]```

Encrypt from **stdin**

```echo -n [text] | systemd-creds encrypt --name [name] - [output]```

Encrypt with **pretty** format for unit files

```echo -n [text] | systemd-creds encrypt --name [name] --pretty - - >> [unit.service]```

Create credential with **expiry**

```systemd-creds encrypt --not-after "[timestamp]" [input] [output]```

# SYNOPSIS

**systemd-creds** [_OPTIONS_] _COMMAND_

# COMMANDS

**encrypt** _INPUT_ _OUTPUT_
> Encrypt a credential

**decrypt** _INPUT_ _OUTPUT_
> Decrypt a credential

**list**
> List available credentials

**cat** _CREDENTIAL_
> Show credential content

# PARAMETERS

**--name=** _NAME_
> Set credential name

**--pretty**
> Output in format suitable for unit files

**--not-after=** _TIMESTAMP_
> Set credential expiry time

**--with-key=** _TYPE_
> Encryption key source (host, tpm2, etc.)

# DESCRIPTION

**systemd-creds** manages encrypted credentials for systemd services. Credentials are encrypted secrets that can be securely passed to services via the `$CREDENTIALS_DIRECTORY` mechanism.

Credentials can be encrypted with the host key, TPM2, or both. They support time-based expiry and can be embedded directly in unit files using the `--pretty` format.

# CAVEATS

Host-encrypted credentials are tied to the specific machine. TPM2-encrypted credentials require TPM hardware. Credentials must be decrypted by systemd, not manually accessible to services.

# HISTORY

**systemd-creds** was added to provide secure secret management for services, replacing environment variables and world-readable files for storing sensitive configuration.

# SEE ALSO

[systemd.exec](/man/systemd.exec)(5), [systemctl](/man/systemctl)(1)
