# TAGLINE

Command-line interface to the Botan cryptography library

# TLDR

**Hash** a file with SHA-256 (hex, filename beside the digest)

```botan hash --algo=[SHA-256] [path/to/file]```

Hash with **base64** encoding

```botan hash --format=base64 --algo=[SHA-384] [path/to/file]```

**Encrypt** a file with AES-256/GCM (key and nonce are hex)

```botan cipher --cipher=AES-256/GCM --key=[hex_key] --nonce=[hex_nonce] --output=[path/to/output] [path/to/file]```

**Decrypt** the same file

```botan cipher --cipher=AES-256/GCM --decrypt --key=[hex_key] --nonce=[hex_nonce] --output=[path/to/output] [path/to/file]```

Generate an **RSA** private key

```botan keygen --algo=RSA --params=2048 > [path/to/private.pem]```

Print **16 random bytes**

```botan rng 16```

Show **help** for one command

```botan [hash] --help```

Print the **version**

```botan version```

# SYNOPSIS

**botan** _command_ [_command-options_] [_arguments_]

# PARAMETERS

**hash** [_--algo=SHA-256_] [_--format=hex_] [_--buf-size=4096_] [_--no-fsname_] [_files..._]
> Digest each file (or standard input). Prints the filename next to the hash unless **--no-fsname**.

**hmac** [_--hash=SHA-256_] _key_ [_files..._]
> HMAC over files using the key in file _key_.

**cipher** [_--decrypt_] **--cipher**=_name_ **--key**=_hex_ **--nonce**=_hex_ [_--ad=_hex_] [_file_]
> Encrypt or decrypt with an AEAD such as AES-256/GCM.

**keygen** [_--algo=RSA_] [_--params=_] [_--passphrase=_] [_--der-out_]
> Generate a PKCS 8 private key. RSA **--params** is the modulus bit length (default 3072). EC **--params** is a curve name (default secp256r1).

**pkcs8** [_--pub-out_] [_--der-out_] [_--pass-in=_] [_--pass-out=_] _key_
> Open a PKCS 8 key; optionally re-encrypt it or write the public key.

**sign** [_--hash=SHA-256_] [_--padding=_] [_--passphrase=_] _key_ _file_
> Sign _file_ with the private key. RSA defaults to PSS.

**verify** [_--hash=SHA-256_] [_--padding=_] _pubkey_ _file_ _signature_
> Verify a signature produced by **sign**.

**rng** [_count_]
> Print random bytes.

**version**
> Print the Botan version.

**-h**, **--help**
> List commands, or describe one command when given after it.

# DESCRIPTION

**botan** is the command-line tool for the Botan C++ cryptography library. Every invocation is `botan <command> <options>`. With no command, an unknown command, or **--help**, it lists available commands. `botan <command> --help` prints that command's usage.

Starting in 2.9, commands that take a passphrase also accept `-` to mean read it from the terminal with echo disabled when the OS allows that. Most file arguments also accept `-` for standard input.

Password hashes include **gen_argon2** / **check_argon2**, **gen_bcrypt** / **check_bcrypt**, and **pbkdf_tune**. X.509 helpers include **gen_pkcs10**, **gen_self_signed**, **sign_cert**, **cert_info**, **cert_verify**, and **ocsp_check**.

# CAVEATS

The CLI covers a subset of the library. Cipher names must be ones Botan knows (for example AES-256/GCM). Encrypted PKCS 8 output is interoperable mainly with AES or 3DES in CBC on other implementations. Do not pass passphrases on the command line when `-` (terminal prompt) is available.

# HISTORY

Botan is a C++ cryptography library by Jack Lloyd, first released in **2002**. The **botan** CLI ships with the library and follows `botan <command>` syntax.

# INSTALL

```apt: sudo apt install botan```

```dnf: sudo dnf install botan```

```pacman: sudo pacman -S botan```

```apk: sudo apk add botan3```

```brew: brew install botan```

```nix: nix profile install nixpkgs#botan3```

<!-- packages: 2026-11-12 -->

# SEE ALSO

[openssl](/man/openssl)(1), [gpg](/man/gpg)(1)

# RESOURCES

```[Homepage](https://botan.randombit.net/)```

```[Documentation](https://botan.randombit.net/handbook/cli.html)```

```[Source code](https://github.com/randombit/botan)```

<!-- verified: 2026-11-12 -->
