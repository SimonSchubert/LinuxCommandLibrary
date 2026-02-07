# TAGLINE

decrypt data using Cloud KMS keys

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

**gcloud kms decrypt** uses Cloud Key Management Service to decrypt data that was previously encrypted with a Cloud KMS key. KMS provides centralized cryptographic key management, separating key storage and access control from the applications that use them.

The decryption operation requires specifying the exact key, keyring, and location used during encryption. Access to decrypt is controlled by IAM permissions on the key, allowing fine-grained control over who can decrypt sensitive data. This enables secure secrets management where encrypted data can be stored in version control or configuration files while keys remain secured in KMS.

The command supports reading from files or stdin and writing to files or stdout, enabling integration into pipelines and scripts. Cloud KMS is commonly used for envelope encryption, where data encryption keys are themselves encrypted by KMS keys, providing an additional security layer. This is the standard pattern for encrypting application secrets, database credentials, and other sensitive configuration data in Google Cloud environments.

# CAVEATS

Requires KMS permissions. Key must match encryption key. Location must be correct.

# HISTORY

gcloud kms decrypt is part of the **Google Cloud SDK** for Cloud KMS, Google's managed service for cryptographic key management.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-kms-encrypt](/man/gcloud-kms-encrypt)(1)
