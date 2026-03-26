# TAGLINE

perform message digest operations

# TLDR

**Calculate SHA256 hash of a file**

```openssl dgst -sha256 [file]```

**Calculate MD5 hash**

```openssl dgst -md5 [file]```

**Output hash in coreutils-compatible format**

```openssl dgst -sha256 -r [file]```

**Calculate hash and write output to a file**

```openssl dgst -sha256 -out [hash.txt] [file]```

**Create an HMAC using a key**

```openssl dgst -sha256 -hmac "[secret_key]" [file]```

**Sign a file with a private key**

```openssl dgst -sha256 -sign [private.pem] -out [signature.bin] [file]```

**Verify a signature with a public key**

```openssl dgst -sha256 -verify [public.pem] -signature [signature.bin] [file]```

# SYNOPSIS

**openssl** **dgst** [_options_] [_file_...]

# PARAMETERS

**-sha256**, **-sha512**, **-sha384**, **-sha1**, **-md5**
> Hash algorithm to use. Default is sha256.

**-sign** _keyfile_
> Sign the digest using the private key in the specified file.

**-verify** _keyfile_
> Verify the signature using the public key in the specified file.

**-prverify** _keyfile_
> Verify the signature using the private key in the specified file.

**-signature** _file_
> The signature file to verify against.

**-hmac** _key_
> Create a hashed MAC using the given key.

**-out** _filename_
> Output filename. Default is standard output.

**-r**
> Output hash in coreutils-compatible format.

**-hex**
> Output as hex dump (default).

**-binary**
> Output the digest in binary form.

**-c**
> Print the digest in two-digit groups separated by colons.

**-keyform** _arg_
> Key format: PEM, DER, P12, or ENGINE.

**-passin** _arg_
> Private key password source.

**-sigopt** _nm:v_
> Pass options to the signature algorithm during sign or verify.

**-list**
> Print a list of supported digest algorithms.

# DESCRIPTION

**openssl dgst** outputs the message digest of files in hexadecimal form. It supports various algorithms including SHA-256, SHA-512, SHA-384, SHA-1, and MD5. Can also generate and verify digital signatures using asymmetric keys, and create HMACs. If no files are specified, standard input is used.

# SEE ALSO

[openssl](/man/openssl)(1), [sha256sum](/man/sha256sum)(1), [openssl-genrsa](/man/openssl-genrsa)(1), [openssl-rsa](/man/openssl-rsa)(1)

