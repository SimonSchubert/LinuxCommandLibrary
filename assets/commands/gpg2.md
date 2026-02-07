# TAGLINE

GnuPG 2 encryption and digital signatures

# TLDR

**Generate key pair**

```gpg2 --full-generate-key```

**List keys**

```gpg2 --list-keys```

**Encrypt file for recipient**

```gpg2 -e -r [recipient@email.com] [file]```

**Decrypt file**

```gpg2 -d [file.gpg]```

**Sign file**

```gpg2 --sign [file]```

**Verify signature**

```gpg2 --verify [file.sig]```

**Export public key**

```gpg2 --armor --export [keyid] > [public.asc]```

# SYNOPSIS

**gpg2** [_options_] [_files_]

# PARAMETERS

**-e**, **--encrypt**
> Encrypt data.

**-d**, **--decrypt**
> Decrypt data.

**-s**, **--sign**
> Sign data.

**--verify**
> Verify signature.

**-r**, **--recipient** _name_
> Encrypt for recipient.

**-a**, **--armor**
> ASCII armored output.

**--gen-key**, **--full-generate-key**
> Generate key pair.

**--list-keys**
> List public keys.

**--list-secret-keys**
> List private keys.

**--export** _keyid_
> Export public key.

**--import** _file_
> Import keys.

**--keyserver** _server_
> Keyserver to use.

# DESCRIPTION

**gpg2** (GnuPG 2) is the modern version of GNU Privacy Guard, implementing the OpenPGP standard for encryption, digital signatures, and key management. It uses a modular architecture with separate daemons for improved security.

On most modern systems, **gpg** is aliased to gpg2. The two share keyrings and are functionally equivalent, with gpg2 offering improved architecture and daemon management.

# CONFIGURATION

**~/.gnupg/gpg.conf**
> User configuration file for default options, preferred algorithms, and keyserver settings.

**~/.gnupg/gpg-agent.conf**
> Configuration for the gpg-agent daemon handling passphrase caching and key operations.

# CAVEATS

Key management requires understanding of web of trust. Private keys must be protected. Passphrase selection is critical. gpg and gpg2 share keyrings on modern systems.

# HISTORY

GnuPG was created by **Werner Koch** in **1997** as a free replacement for PGP. GPG 2.0 was released in **2006** with a modular architecture. It's a fundamental tool for secure email and software signing.

# SEE ALSO

[gpg](/man/gpg)(1), [gpg-agent](/man/gpg-agent)(1), [gpgconf](/man/gpgconf)(1)
