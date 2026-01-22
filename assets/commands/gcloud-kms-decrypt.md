# TLDR

**Decrypt file**

```gcloud kms decrypt --ciphertext-file=[encrypted.enc] --plaintext-file=[decrypted.txt] --key=[key] --keyring=[keyring] --location=[global]```

**Decrypt from stdin**

```cat [encrypted.enc] | gcloud kms decrypt --ciphertext-file=- --plaintext-file=[output.txt] --key=[key] --keyring=[keyring] --location=[global]```

**Decrypt to stdout**

```gcloud kms decrypt --ciphertext-file=[encrypted.enc] --plaintext-file=- --key=[key] --keyring=[keyring] --location=[global]```

# SYNOPSIS

**gcloud kms decrypt** [_options_]

# PARAMETERS

**--ciphertext-file** _FILE_
> Encrypted input file.

**--plaintext-file** _FILE_
> Decrypted output file.

**--key** _KEY_
> Crypto key name.

**--keyring** _KEYRING_
> Key ring name.

**--location** _LOCATION_
> Key location.

**--help**
> Display help information.

# DESCRIPTION

**gcloud kms decrypt** decrypts data using Cloud KMS keys. It reverses encryption performed with the corresponding encrypt command, using the same key.

The command handles encryption key management centrally, allowing secure data protection without managing keys locally. It supports envelope encryption patterns.

gcloud kms decrypt is used for secrets management and secure data handling.

# CAVEATS

Requires KMS permissions. Key must match encryption key. Location must be correct.

# HISTORY

gcloud kms decrypt is part of the **Google Cloud SDK** for Cloud KMS, Google's managed service for cryptographic key management.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-kms-encrypt](/man/gcloud-kms-encrypt)(1)
