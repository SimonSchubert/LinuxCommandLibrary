# TAGLINE

Encrypt secrets in structured config files

# TLDR

**Encrypt file**

```sops -e [secrets.yaml] > [secrets.enc.yaml]```

**Decrypt file**

```sops -d [secrets.enc.yaml]```

**Edit encrypted file**

```sops [secrets.enc.yaml]```

**Encrypt with specific key**

```sops -e --age [age-public-key] [file.yaml]```

**Rotate keys**

```sops -r [secrets.enc.yaml]```

**Add KMS key**

```sops --add-kms [arn:aws:kms:...] [file.yaml]```

# SYNOPSIS

**sops** [_options_] _file_

# DESCRIPTION

**sops** (Secrets OPerationS) encrypts files while keeping their format intact. It encrypts values but leaves keys readable, making diffs and reviews practical.

The tool supports multiple key sources including AWS KMS, GCP KMS, Azure Key Vault, age, and PGP.

# PARAMETERS

**-e**, **--encrypt**
> Encrypt file.

**-d**, **--decrypt**
> Decrypt file.

**-r**, **--rotate**
> Rotate data key.

**-i**, **--in-place**
> Modify file in place.

**--age** _key_
> Age public key.

**--pgp** _key_
> PGP fingerprint.

**--kms** _arn_
> AWS KMS key ARN.

**--gcp-kms** _resource_
> GCP KMS key.

**--azure-kv** _url_
> Azure Key Vault key.

**--input-type** _type_
> Input format.

**--output-type** _type_
> Output format.

# CONFIGURATION

**.sops.yaml**
> Project-level configuration defining default encryption keys and rules for matching files to specific key sets.

**SOPS_AGE_KEY_FILE**
> Path to the age private key file for decryption (default: ~/.config/sops/age/keys.txt).

**SOPS_AGE_KEY**
> Age private key provided directly as an environment variable.

# CAVEATS

Requires key access for decryption. Multiple keys recommended for redundancy. Key rotation should be periodic. Some formats have limitations.

# HISTORY

**sops** was created by **Mozilla** for managing secrets in configuration files. It emerged from needs at Mozilla and has been adopted widely for secrets management in GitOps workflows.

# SEE ALSO

[age](/man/age)(1), [gpg](/man/gpg)(1), [vault](/man/vault)(1), [sealed-secrets](/man/sealed-secrets)(1)
