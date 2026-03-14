# TAGLINE

Perform low-level public key operations

# TLDR

**Sign data**

```openssl pkeyutl -sign -in [data] -inkey [key.pem] -out [signature]```

**Verify signature**

```openssl pkeyutl -verify -in [data] -sigfile [sig] -inkey [key.pem]```

**Encrypt data**

```openssl pkeyutl -encrypt -in [data] -pubin -inkey [pub.pem] -out [encrypted]```

**Decrypt data**

```openssl pkeyutl -decrypt -in [encrypted] -inkey [key.pem] -out [decrypted]```

# SYNOPSIS

**openssl** **pkeyutl** [_options_]

# PARAMETERS

**-sign**
> Sign the input data and output the signed result.

**-verify**
> Verify the input data against a signature file.

**-verifyrecover**
> Verify and recover the original signed data.

**-encrypt**
> Encrypt the input data using a public key.

**-decrypt**
> Decrypt the input data using a private key.

**-derive**
> Derive a shared secret using peer key.

**-in** _FILE_
> Input file (stdin if not specified).

**-out** _FILE_
> Output file (stdout if not specified).

**-inkey** _FILE_
> Input key file (private key by default).

**-sigfile** _FILE_
> Signature file for verify operations.

**-pubin**
> Input key is a public key.

**-certin**
> Input is a certificate containing a public key.

**-keyform** _PEM|DER|ENGINE_
> Key format.

**-pkeyopt** _opt:value_
> Set algorithm-specific option (e.g. rsa_padding_mode:oaep).

**-hexdump**
> Hex dump the output data.

**-asn1parse**
> Parse the ASN.1 output data.

# DESCRIPTION

**openssl pkeyutl** performs low-level public key cryptographic operations including signing, verification, encryption, decryption, and key derivation. Unlike higher-level OpenSSL commands, it operates directly on raw data without hashing or padding abstractions.

This tool works with any key type supported by OpenSSL and is algorithm-agnostic. It is useful for custom cryptographic workflows where fine-grained control over the signing or encryption process is needed, such as working with specific padding schemes or key agreement protocols.

# CAVEATS

Part of OpenSSL. Low-level operations require understanding of the underlying algorithm. RSA padding mode defaults to PKCS#1. Algorithm-specific options are set via **-pkeyopt**.

# HISTORY

openssl pkeyutl provides **public key operations** across algorithms. It supersedes the older **rsautl** command for RSA-specific operations.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-pkey](/man/openssl-pkey)(1)

