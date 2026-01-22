# TLDR

**Generate an SSH key pair** (Ed25519, recommended)

```ssh-keygen -t ed25519```

**Generate an RSA key** with 4096 bits

```ssh-keygen -t rsa -b 4096```

**Generate a key with custom filename** and comment

```ssh-keygen -t ed25519 -f [~/.ssh/mykey] -C "[user@host]"```

**Change the passphrase** of an existing key

```ssh-keygen -p -f [~/.ssh/id_ed25519]```

**View the fingerprint** of a key

```ssh-keygen -l -f [~/.ssh/id_ed25519.pub]```

**Extract public key** from private key

```ssh-keygen -y -f [~/.ssh/id_ed25519] > [~/.ssh/id_ed25519.pub]```

**Generate host keys** (all standard types)

```sudo ssh-keygen -A```

**Convert key to different format**

```ssh-keygen -e -f [~/.ssh/id_rsa.pub] -m [RFC4716]```

# SYNOPSIS

**ssh-keygen** [_options_]

**ssh-keygen** -t _type_ [-b _bits_] [-f _file_] [-C _comment_]

# PARAMETERS

**-t** _TYPE_
> Key type: ed25519 (recommended), rsa, ecdsa, dsa

**-b** _BITS_
> Key size in bits (RSA: 2048-4096, ECDSA: 256/384/521)

**-f** _FILE_
> Output filename for the key

**-C** _COMMENT_
> Comment to embed in key (typically user@host)

**-N** _PASSPHRASE_
> New passphrase for the key

**-P** _PASSPHRASE_
> Old passphrase when changing

**-p**
> Change passphrase of existing key

**-l**
> Show fingerprint of key file

**-E** _HASH_
> Hash algorithm for fingerprint (md5, sha256)

**-y**
> Output public key from private key

**-e**
> Export key to other formats

**-i**
> Import key from other formats

**-m** _FORMAT_
> Key format (RFC4716, PKCS8, PEM)

**-A**
> Generate all missing host key types

**-R** _HOST_
> Remove host from known_hosts

**-F** _HOST_
> Search for host in known_hosts

**-q**
> Quiet mode

# DESCRIPTION

**ssh-keygen** generates, manages, and converts authentication keys for SSH. It creates public/private key pairs used for passwordless authentication and host verification.

The private key stays on your machine (protected by passphrase), while the public key is copied to servers you want to access. Modern best practice recommends **Ed25519** keys for their security and performance, though **RSA 4096** remains widely compatible.

Keys are stored in **~/.ssh/** by default: private key as **id_ed25519** (or id_rsa, etc.) and public key with **.pub** extension. The public key is copied to **~/.ssh/authorized_keys** on remote servers for authentication.

# CAVEATS

Private keys must be kept secure—anyone with access can authenticate as you. Use a strong passphrase to protect private keys. DSA keys are deprecated and disabled in newer OpenSSH versions. Default RSA key size (3072) is secure but 4096 provides additional margin. Key permissions must be restrictive (600 for private, 644 for public).

# HISTORY

ssh-keygen is part of **OpenSSH**, which originated from the OpenBSD project in **1999** as a free implementation of SSH. The original SSH protocol was developed by **Tatu Ylönen** in **1995**. OpenSSH added support for newer key types over time: ECDSA in 2011 and Ed25519 in 2014. Ed25519 became the default key type in OpenSSH 8.0 (2019) due to its security and efficiency.

# SEE ALSO

[ssh](/man/ssh)(1), [ssh-copy-id](/man/ssh-copy-id)(1), [ssh-agent](/man/ssh-agent)(1), [sshd](/man/sshd)(8)
