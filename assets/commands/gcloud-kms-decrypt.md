# TAGLINE

decrypt data using Cloud KMS keys

# TLDR

**Decrypt file**

```gcloud kms decrypt --ciphertext-file=[encrypted.enc] --plaintext-file=[decrypted.txt] --key=[key] --keyring=[keyring] --location=[global]```

**Decrypt from stdin**

```cat [encrypted.enc] | gcloud kms decrypt --ciphertext-file=- --plaintext-file=[output.txt] --key=[key] --keyring=[keyring] --location=[global]```

**Decrypt to stdout**

```gcloud kms decrypt --ciphertext-file=[encrypted.enc] --plaintext-file=- --key=[key] --keyring=[keyring] --location=[global]```

Decrypt using the **full key resource name**

```gcloud kms decrypt --key=projects/[project]/locations/[global]/keyRings/[keyring]/cryptoKeys/[key] --ciphertext-file=[encrypted.enc] --plaintext-file=[decrypted.txt]```

Decrypt data that was encrypted with **additional authenticated data**

```gcloud kms decrypt --ciphertext-file=[encrypted.enc] --plaintext-file=[decrypted.txt] --additional-authenticated-data-file=[aad.txt] --key=[key] --keyring=[keyring] --location=[global]```

# SYNOPSIS

**gcloud kms decrypt** **--ciphertext-file**=_FILE_ **--plaintext-file**=_FILE_ [**--key**=_KEY_] [**--keyring**=_KEYRING_] [**--location**=_LOCATION_] [_options_]

# PARAMETERS

**--ciphertext-file** _FILE_
> Encrypted input file (output of **gcloud kms encrypt**). Use **-** to read from stdin.

**--plaintext-file** _FILE_
> Decrypted output file. Use **-** to write to stdout.

**--key** _KEY_
> Crypto key name or full resource ID. For symmetric keys the key version is detected from the ciphertext and must not be specified.

**--keyring** _KEYRING_
> Key ring name.

**--location** _LOCATION_
> Key location.

**--additional-authenticated-data-file** _FILE_
> File with the additional authenticated data (AAD) used during encryption (max 64 KiB). Use **-** for stdin.

**--skip-integrity-verification**
> Skip the CRC32C integrity checks on request and response (enabled by default).

**--project** _PROJECT_
> Global flag selecting the project that owns the key.

**--help**
> Display help information.

# DESCRIPTION

**gcloud kms decrypt** uses Cloud Key Management Service to decrypt data that was previously encrypted with a Cloud KMS key. KMS provides centralized cryptographic key management, separating key storage and access control from the applications that use them.

The decryption operation requires specifying the exact key, keyring, and location used during encryption. Access to decrypt is controlled by IAM permissions on the key, allowing fine-grained control over who can decrypt sensitive data. This enables secure secrets management where encrypted data can be stored in version control or configuration files while keys remain secured in KMS.

The command supports reading from files or stdin and writing to files or stdout, enabling integration into pipelines and scripts. Cloud KMS is commonly used for envelope encryption, where data encryption keys are themselves encrypted by KMS keys, providing an additional security layer. This is the standard pattern for encrypting application secrets, database credentials, and other sensitive configuration data in Google Cloud environments.

# CAVEATS

Requires the **roles/cloudkms.cryptoKeyDecrypter** (or EncrypterDecrypter) IAM role on the key. Only works for ciphertext produced by symmetric **encrypt**; asymmetric keys use **gcloud kms asymmetric-decrypt**. Direct encryption is limited to 64 KiB of plaintext, so larger data should use envelope encryption. The ciphertext and AAD cannot both be read from stdin. Ciphertext from a destroyed key version cannot be decrypted.

# HISTORY

gcloud kms decrypt is part of the **Google Cloud SDK** for Cloud KMS, Google's managed service for cryptographic key management.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-iam](/man/gcloud-iam)(1)

# RESOURCES

```[Documentation](https://docs.cloud.google.com/sdk/gcloud/reference/kms/decrypt)```

<!-- verified: 2026-11-23 -->
