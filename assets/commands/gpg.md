# TLDR

**Generate a new key pair**

```gpg --gen-key```

**List all keys** in the public keyring

```gpg --list-keys```

**Encrypt a file** for a specific recipient

```gpg -e -r [recipient_email] [file]```

**Decrypt a file**

```gpg -d [file.gpg]```

**Sign a file** with your private key

```gpg --sign [file]```

**Verify a signature**

```gpg --verify [file.sig]```

**Export a public key** to a file

```gpg --export -a "[user_id]" > [public.key]```

**Import a public key**

```gpg --import [public.key]```

# SYNOPSIS

**gpg** [_--homedir dir_] [_--options file_] [_options_] _command_ [_args_]

# PARAMETERS

**-e**, **--encrypt**
> Encrypt data to one or more recipients

**-d**, **--decrypt**
> Decrypt data (default if input looks encrypted)

**-s**, **--sign**
> Make a signature

**--verify**
> Verify a signature

**-c**, **--symmetric**
> Encrypt with symmetric cipher using a passphrase

**-r** _name_, **--recipient** _name_
> Encrypt for the specified recipient

**-u** _name_, **--local-user** _name_
> Use specified key as the key to sign with

**-a**, **--armor**
> Create ASCII armored output

**-o** _file_, **--output** _file_
> Write output to specified file

**--gen-key**
> Generate a new key pair

**--full-gen-key**
> Generate a new key pair with dialog for all options

**--list-keys**
> List all keys from the public keyrings

**--list-secret-keys**
> List all keys from the secret keyrings

**--import**
> Import keys from a file

**--export**
> Export keys from the keyring

**--delete-keys** _name_
> Remove keys from the public keyring

**--delete-secret-keys** _name_
> Remove keys from the secret keyring

**--fingerprint**
> List keys and their fingerprints

**--keyserver** _url_
> Specify keyserver to use

**--send-keys** _keyids_
> Send keys to a keyserver

**--recv-keys** _keyids_
> Import keys from a keyserver

**--batch**
> Batch mode, never ask for input

**--yes**
> Assume yes on most questions

**--passphrase** _string_
> Use specified passphrase

# DESCRIPTION

**gpg** (GNU Privacy Guard) is a complete and free implementation of the OpenPGP standard as defined by RFC 4880. It allows you to encrypt and sign data and communications, features a versatile key management system, and provides access modules for public key directories.

GPG is a command-line tool with features for easy integration with other applications. It supports both symmetric (password-based) and asymmetric (public/private key) encryption. The program creates and manages key pairs for secure communication and can verify digital signatures to ensure data integrity and authenticity.

Common use cases include encrypting sensitive files, signing email messages, verifying software package authenticity, and establishing secure communication channels between parties.

# CAVEATS

Key management is critical; losing your private key or forgetting the passphrase means permanent loss of access to encrypted data. The web of trust model requires careful key verification to prevent man-in-the-middle attacks. Default algorithms and key sizes should be reviewed periodically as cryptographic standards evolve.

# HISTORY

GPG was first released in **1999** by **Werner Koch** as a free software replacement for PGP (Pretty Good Privacy). It was developed as part of the GNU Project and has since become the de facto standard for email encryption on Unix-like systems. GPG 2.0 introduced a modular architecture in **2006**, and version 2.2 brought improved default algorithms and keyserver handling. The project continues to be actively maintained and is widely used by journalists, activists, and security-conscious users worldwide.

# SEE ALSO

[ssh](/man/ssh)(1), [openssl](/man/openssl)(1), [age](/man/age)(1), [sha256sum](/man/sha256sum)(1)
