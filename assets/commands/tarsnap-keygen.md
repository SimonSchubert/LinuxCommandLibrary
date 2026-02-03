# TLDR

**Generate new key**

```tarsnap-keygen --keyfile [/root/tarsnap.key] --user [email@example.com] --machine [hostname]```

**Generate with passphrase**

```tarsnap-keygen --keyfile [/root/tarsnap.key] --user [email@example.com] --machine [hostname] --passphrased```

# SYNOPSIS

**tarsnap-keygen** [_options_]

# PARAMETERS

**--keyfile** _path_
> Output key file path.

**--user** _email_
> Tarsnap account email.

**--machine** _name_
> Machine name identifier.

**--passphrased**
> Encrypt key with passphrase.

# DESCRIPTION

**tarsnap-keygen** generates encryption keys for Tarsnap backup service. Creates machine-specific keys for encrypted, deduplicated backups. Keys are required for tarsnap operations.

# CAVEATS

Keep the key file secure and backed up. Losing the key means losing access to backups.

# SEE ALSO

[tarsnap](/man/tarsnap)(1), [tarsnap-keymgmt](/man/tarsnap-keymgmt)(1)

