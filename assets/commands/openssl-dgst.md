# TLDR

**Calculate SHA256 hash**

```openssl dgst -sha256 [file]```

**Calculate MD5 hash**

```openssl dgst -md5 [file]```

**Output hash only**

```openssl dgst -sha256 -r [file]```

**Sign file with private key**

```openssl dgst -sha256 -sign [private.key] -out [signature] [file]```

**Verify signature**

```openssl dgst -sha256 -verify [public.key] -signature [signature] [file]```

# SYNOPSIS

**openssl** **dgst** [_options_] [_file_...]

# PARAMETERS

**-sha256**, **-sha512**, **-md5**
> Hash algorithm to use.

**-sign** _key_
> Sign with private key.

**-verify** _key_
> Verify with public key.

**-signature** _file_
> Signature file for verification.

**-r**
> Output hash in coreutils format.

**-hex**
> Output as hex (default).

**-binary**
> Output in binary.

# DESCRIPTION

**openssl dgst** calculates message digests (hashes) of files. Supports various algorithms including SHA-256, SHA-512, and MD5. Can also sign and verify files using asymmetric keys.

# SEE ALSO

[openssl](/man/openssl)(1), [sha256sum](/man/sha256sum)(1)

