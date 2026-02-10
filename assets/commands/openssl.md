# TAGLINE

robust toolkit for cryptographic operations, SSL/TLS protocols

# TLDR

**Generate a private key**

```openssl genrsa -out [private.key] [2048]```

**Generate a certificate signing request**

```openssl req -new -key [private.key] -out [request.csr]```

**Generate a self-signed certificate**

```openssl req -x509 -newkey rsa:4096 -keyout [key.pem] -out [cert.pem] -days [365] -nodes```

**View certificate details**

```openssl x509 -in [certificate.crt] -text -noout```

**Check certificate expiration**

```openssl x509 -enddate -noout -in [certificate.crt]```

**Verify certificate chain**

```openssl verify -CAfile [ca.crt] [certificate.crt]```

**Test SSL connection**

```openssl s_client -connect [host:443]```

**Encrypt a file**

```openssl enc -aes-256-cbc -salt -in [plaintext.txt] -out [encrypted.enc]```

**Decrypt a file**

```openssl enc -aes-256-cbc -d -in [encrypted.enc] -out [decrypted.txt]```

**Generate random bytes**

```openssl rand -base64 [32]```

# SYNOPSIS

**openssl** _command_ [_options_] [_arguments_]

# DESCRIPTION

**OpenSSL** is a robust toolkit for cryptographic operations, SSL/TLS protocols, and certificate management. It provides commands for generating keys, creating certificates, encrypting data, testing connections, and performing various cryptographic functions.

The toolkit supports numerous algorithms for encryption (AES, DES, ChaCha20), hashing (SHA, MD5), and public key cryptography (RSA, ECDSA, Ed25519). It can act as a client or server for testing SSL/TLS connections.

OpenSSL is essential for system administrators managing certificates, developers implementing secure communications, and security professionals analyzing cryptographic configurations.

# COMMON COMMANDS

**genrsa**
> Generate RSA private key.

**req**
> Certificate signing request operations.

**x509**
> Certificate operations.

**rsa**
> RSA key processing.

**enc**
> Symmetric encryption/decryption.

**dgst**
> Message digest (hashing).

**s_client**
> SSL/TLS client for testing.

**s_server**
> SSL/TLS server for testing.

**verify**
> Certificate verification.

**rand**
> Random number generation.

**pkcs12**
> PKCS#12 operations.

**ca**
> Certificate authority operations.

# PARAMETERS

**-in** _file_
> Input file.

**-out** _file_
> Output file.

**-noout**
> No output (for viewing).

**-text**
> Human-readable output.

**-nodes**
> No DES encryption of private key.

**-days** _n_
> Certificate validity period.

**-subj** _subject_
> Certificate subject DN.

# CAVEATS

Old versions have known vulnerabilities (update regularly). Encryption commands prompt for passwords interactively. Self-signed certificates cause browser warnings. Some legacy algorithms (MD5, DES) are insecure.

# HISTORY

**OpenSSL** originated from **SSLeay**, created by **Eric Young** and **Tim Hudson** in **1995**. It was forked as OpenSSL in **1998** when development of SSLeay ended. The project gained critical importance for internet security, though the **Heartbleed** vulnerability in **2014** highlighted maintenance challenges. This led to increased funding and the **LibreSSL** fork by OpenBSD.

# SEE ALSO

[ssh-keygen](/man/ssh-keygen)(1), [certbot](/man/certbot)(1), [gpg](/man/gpg)(1), [stunnel](/man/stunnel)(1)
