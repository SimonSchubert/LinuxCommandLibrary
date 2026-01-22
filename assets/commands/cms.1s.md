# TLDR

**Sign a file** with a certificate and output in S/MIME format

```openssl cms -sign -in [file.txt] -out [signed.p7m] -signer [cert.pem] -inkey [key.pem]```

**Verify a signed message**

```openssl cms -verify -in [signed.p7m] -CAfile [ca-cert.pem]```

**Encrypt a file** for a recipient

```openssl cms -encrypt -in [file.txt] -out [encrypted.p7m] -recip [recipient.pem]```

**Decrypt a CMS message**

```openssl cms -decrypt -in [encrypted.p7m] -recip [cert.pem] -inkey [key.pem]```

**Create a detached signature**

```openssl cms -sign -in [file.txt] -out [signature.p7s] -signer [cert.pem] -inkey [key.pem] -nodetach```

**Extract content from signed message**

```openssl cms -verify -in [signed.p7m] -out [content.txt] -noverify```

# SYNOPSIS

**openssl cms** [_operation_] [_options_]

# PARAMETERS

**-sign**
> Sign the input data with certificate and private key.

**-verify**
> Verify a signed CMS message.

**-encrypt**
> Encrypt the input data for one or more recipients.

**-decrypt**
> Decrypt a CMS encrypted message.

**-in** _FILE_
> Input file to process.

**-out** _FILE_
> Output file for the result.

**-signer** _FILE_
> Certificate file to use for signing.

**-recip** _FILE_
> Recipient certificate for encryption or decryption.

**-inkey** _FILE_
> Private key file for signing or decryption.

**-CAfile** _FILE_
> File containing trusted CA certificates for verification.

**-nodetach**
> Include the signed content within the CMS message (not detached).

**-noverify**
> Do not verify the signer's certificate.

**-text**
> Add text/plain MIME headers for S/MIME email.

# DESCRIPTION

**openssl cms** is the OpenSSL utility for handling Cryptographic Message Syntax (CMS) data. CMS is a standard for cryptographic protection of data, defined in RFC 5652, and is the successor to PKCS#7.

The command provides operations for signing, verification, encryption, and decryption of data. It supports multiple content types, allows detached signatures, and handles S/MIME email format. CMS is widely used in secure email (S/MIME), digital signatures, and encrypted data containers.

Key operations include creating signed messages with optional timestamp authority integration, encrypting data for multiple recipients with different certificates, and verifying signatures against certificate chains with proper trust validation.

# CAVEATS

Certificate trust chains must be properly configured for verification. Self-signed certificates require explicit trust settings. The **-noverify** option bypasses certificate validation and should only be used for testing. Default encryption algorithms may vary by OpenSSL version.

# HISTORY

CMS was standardized as **RFC 5652** in **2009**, building upon PKCS#7 from RSA Laboratories. OpenSSL added the **cms** command as an improvement over the older **smime** command, offering better support for CMS-specific features and more modern cryptographic options.

# SEE ALSO

[smime](/man/smime)(1), [pkcs7](/man/pkcs7)(1), [x509](/man/x509)(1), [openssl](/man/openssl)(1)
