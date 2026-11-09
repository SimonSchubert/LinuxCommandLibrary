# TAGLINE

Perform low-level public key operations

# TLDR

**Sign data using a private key (with raw input hashing)**

```openssl pkeyutl -sign -rawin -digest sha256 -in [data] -inkey [key.pem] -out [signature]```

**Verify a signature**

```openssl pkeyutl -verify -rawin -digest sha256 -in [data] -sigfile [sig] -pubin -inkey [pub.pem]```

**Encrypt data using a public key with OAEP padding**

```openssl pkeyutl -encrypt -in [data] -pubin -inkey [pub.pem] -pkeyopt rsa_padding_mode:oaep -out [encrypted]```

**Decrypt data using a private key**

```openssl pkeyutl -decrypt -in [encrypted] -inkey [key.pem] -out [decrypted]```

**Derive a shared secret via ECDH**

```openssl pkeyutl -derive -inkey [key.pem] -peerkey [peer_pub.pem] -out [secret]```

**Encapsulate a shared secret to a public key (KEM)**

```openssl pkeyutl -encap -pubin -inkey [pub.pem] -out [ciphertext] -secret [shared_secret]```

**Decapsulate the shared secret with the private key**

```openssl pkeyutl -decap -inkey [key.pem] -in [ciphertext] -secret [shared_secret]```

# SYNOPSIS

**openssl** **pkeyutl** [_options_]

# PARAMETERS

**-sign**
> Sign the input data and output the signed result. Requires a private key. This is the default operation.

**-verify**
> Verify the input data against a signature file specified with **-sigfile**.

**-verifyrecover**
> Recover the original data from a signature. RSA only.

**-encrypt**
> Encrypt the input data using a public key.

**-decrypt**
> Decrypt the input data using a private key.

**-derive**
> Derive a shared secret using a peer public key (ECDH/DH).

**-encap**
> Encapsulate a shared secret to a peer's public key (KEM operations, e.g. ML-KEM).

**-decap**
> Decapsulate to recover a shared secret (KEM operations, e.g. ML-KEM).

**-in** _FILE_
> Input file (stdin if not specified).

**-out** _FILE_
> Output file (stdout if not specified).

**-secret** _FILE_
> Output file for the shared secret in encapsulation/decapsulation operations.

**-inkey** _FILE_|_URI_
> Input key file. Private key by default; use **-pubin** or **-certin** to supply a public key.

**-sigfile** _FILE_
> Signature file, required for **-verify** operations.

**-peerkey** _FILE_
> Peer public key file, used with **-derive** for ECDH/DH key agreement.

**-pubin**
> Treat the key supplied via **-inkey** as a public key.

**-certin**
> Treat the key supplied via **-inkey** as a certificate from which the public key is extracted.

**-keyform** _PEM_|_DER_|_P12_
> Format of the key file. Unspecified by default.

**-peerform** _PEM_|_DER_|_P12_
> Format of the peer key file. Unspecified by default.

**-passin** _ARG_
> Password source for encrypted private keys (e.g. `pass:secret`, `env:VAR`, `file:path`).

**-rawin**
> Treat the input of **-sign** or **-verify** as raw unhashed data, hashed internally where the algorithm needs it. Implied for EdDSA and by **-digest** since OpenSSL 3.5; required in earlier versions.

**-digest** _ALGORITHM_
> Hash algorithm to apply to raw input with **-sign** or **-verify** (e.g. `sha256`, `sha512`). Defaults to SHA-256 for RSA/DSA/ECDSA and SM3 for SM2. Not supported with Ed25519, Ed448, ML-DSA or SLH-DSA.

**-pkeyopt** _opt_:_value_
> Set an algorithm-specific option. May be repeated. Common options:
>
> - `rsa_padding_mode:pkcs1|oaep|pss|x931|none`: RSA padding mode (default: `pkcs1`)
> - `rsa_oaep_md:digest`: Digest for the OAEP hash function (default: `sha1`)
> - `rsa_mgf1_md:digest`: MGF1 digest for PSS or OAEP
> - `rsa_pss_saltlen:len|digest|max|auto`: PSS salt length
> - `distid:string`: SM2 distinguishing ID (must match for sign/verify)

**-kdf** _ALGORITHM_
> Key derivation function to use (e.g. `TLS1-PRF`, `HKDF`).

**-kdflen** _LENGTH_
> Output length in bytes for the KDF operation.

**-pkeyopt_passin** _opt_[:_passarg_]
> Read a public key option from stdin or a password source.

**-kemop** _MODE_
> KEM mode for **-encap** and **-decap**. No longer required since OpenSSL 3.5.

**-rev**
> Reverse the input buffer byte order before processing. Incompatible with **-rawin**.

**-hexdump**
> Hex dump the output data.

**-asn1parse**
> Parse the ASN.1 output data to check its DER encoding and print any errors.

# DESCRIPTION

**openssl pkeyutl** performs low-level public key cryptographic operations including signing, verification, encryption, decryption, key derivation, and key encapsulation/decapsulation (KEM). It is algorithm-agnostic and works with any key type supported by OpenSSL, including RSA, EC, DSA, Ed25519, Ed448, X25519, X448, SM2, and post-quantum algorithms such as ML-DSA and ML-KEM.

Unlike higher-level OpenSSL commands, it operates directly on data, offering fine-grained control over padding schemes, digest selection, and key agreement protocols. Unless **-rawin** is used or implied, it treats the input as already digested; pass **-digest** to have the tool hash the data itself before operating.

Ed25519 and Ed448 are one-shot algorithms that do not support pre-hashing. Since OpenSSL 4.1, raw input from a file may be memory-mapped on supported platforms instead of being loaded into memory.

# CAVEATS

Part of OpenSSL. Input size for non-raw operations is limited to `EVP_MAX_MD_SIZE` (64 bytes); use **-rawin** for arbitrary-length inputs. RSA PKCS#1 v1.5 decryption applies implicit rejection (returning deterministic random plaintext on padding failure) to mitigate Bleichenbacher attacks. Use OAEP padding (`-pkeyopt rsa_padding_mode:oaep`) for new RSA encryption applications. Ed25519/Ed448 sign and verify need the input size to be known, so they fail when reading from stdin.

# HISTORY

**openssl pkeyutl** provides public key operations across all algorithms and supersedes the older **rsautl** subcommand for RSA-specific work. KEM operations (**-encap**/**-decap**) and post-quantum algorithm support were added in OpenSSL 3.x. Since OpenSSL 3.5, **-digest** implies **-rawin**. The **-engine** option was removed in OpenSSL 4.0.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-pkey](/man/openssl-pkey)(1), [openssl-genpkey](/man/openssl-genpkey)(1), [openssl-dgst](/man/openssl-dgst)(1)

# RESOURCES

```[Source code](https://github.com/openssl/openssl)```

```[Homepage](https://openssl-library.org)```

```[Documentation](https://docs.openssl.org/master/man1/openssl-pkeyutl/)```

<!-- verified: 2026-11-09 -->
