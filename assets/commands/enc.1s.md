# TAGLINE

symmetric encryption and decryption utility

# TLDR

**Encrypt file** with AES-256-CBC using PBKDF2

```openssl enc -aes-256-cbc -pbkdf2 -in [plaintext] -out [encrypted]```

**Decrypt file**

```openssl enc -d -aes-256-cbc -pbkdf2 -in [encrypted] -out [plaintext]```

**Encrypt with base64** output

```openssl enc -aes-256-cbc -pbkdf2 -a -in [plaintext] -out [encrypted.b64]```

**Encrypt with explicit password** source

```openssl enc -aes-256-cbc -pbkdf2 -pass pass:[password] -in [file] -out [encrypted]```

**Print key and IV** without encrypting

```openssl enc -aes-256-cbc -pbkdf2 -P -pass pass:[password]```

**List available ciphers**

```openssl enc -list```

# SYNOPSIS

**openssl enc** **-**_cipher_ [_options_]

**openssl** _cipher_ [_options_]

# PARAMETERS

**-e**
> Encrypt the input data (default).

**-d**
> Decrypt the input data.

**-in** _FILE_
> Input file.

**-out** _FILE_
> Output file.

**-a**, **-base64**
> Base64 encode/decode the data.

**-A**
> With **-a**, process base64 as a single line without newlines.

**-pass** _SOURCE_
> Password source (e.g., pass:password, file:pathname, env:var, stdin).

**-k** _PASSWORD_
> Password for key derivation. Superseded by -pass.

**-kfile** _FILE_
> Read the password from the first line of a file. Superseded by -pass.

**-md** _DIGEST_
> Digest used to derive the key (default: sha-256).

**-pbkdf2**
> Use PBKDF2 key derivation (recommended; default iteration count 10000).

**-iter** _COUNT_
> Set the PBKDF2 iteration count; also enables PBKDF2.

**-saltlen** _SIZE_
> Salt length with -pbkdf2 (default 8 bytes, maximum 16). Must match when decrypting.

**-S** _SALT_
> Actual salt to use, in hex.

**-salt**
> Use a random salt for key derivation (default).

**-nosalt**
> Do not use salt. Not recommended except for testing.

**-K** _KEY_
> Actual encryption key in hex.

**-iv** _IV_
> Actual initialization vector in hex.

**-P**
> Print key and IV then exit; do not encrypt or decrypt.

**-p**
> Print key and IV, then proceed with encryption/decryption.

**-list**
> List all supported ciphers.

**-nopad**
> Disable standard block padding.

**-z**
> Compress with zlib, if OpenSSL was built with it.

**-v**
> Show statistics about I/O and buffer sizes.

# DESCRIPTION

**openssl enc** performs symmetric encryption and decryption using various cipher algorithms. It is the general-purpose encryption command in OpenSSL.

The command supports numerous ciphers including AES, DES, Blowfish, Camellia, ChaCha20, and others. When deriving keys from passwords, use **-pbkdf2** for secure key derivation with a salt (enabled by default). Output can be binary or base64-encoded with **-a**.

Common use cases include file encryption, creating encrypted backups, and data protection workflows.

# CAVEATS

Without **-pbkdf2**, OpenSSL uses a legacy key derivation function that is vulnerable to dictionary attacks. The **-k** option is superseded by **-pass**. Using **-nosalt** is insecure except for testing. Authenticated modes such as GCM and CCM are not supported; upstream recommends **openssl cms** for bulk encryption. Decryption must use the same **-md**, **-pbkdf2**, **-iter** and **-saltlen** settings as encryption. Passing **-pass pass:** exposes the password in the process list, so prefer **env:** or **file:**. Some older ciphers are only available with the appropriate provider configured. Lost passwords mean lost data.

# HISTORY

openssl enc is part of **OpenSSL**, the open-source cryptography toolkit. It provides command-line access to symmetric encryption algorithms for data protection.

# SEE ALSO

[openssl](/man/openssl)(1), [gpg](/man/gpg)(1), [age](/man/age)(1)

# RESOURCES

```[Source code](https://github.com/openssl/openssl)```

```[Homepage](https://openssl-library.org/)```

```[Documentation](https://docs.openssl.org/master/man1/openssl-enc/)```

<!-- verified: 2026-11-09 -->
