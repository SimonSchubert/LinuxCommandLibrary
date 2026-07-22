# TAGLINE

generate SSH keys for Dropbear

# TLDR

Generate **ed25519** key

```dropbearkey -t ed25519 -f [path/to/key_file]```

Generate **ECDSA** key

```dropbearkey -t ecdsa -f [path/to/key_file]```

Generate **RSA** key with 4096 bits

```dropbearkey -t rsa -s 4096 -f [path/to/key_file]```

Print **fingerprint and public key**

```dropbearkey -y -f [path/to/key_file]```

# SYNOPSIS

**dropbearkey** [_options_]

# DESCRIPTION

**dropbearkey** generates SSH host and user keys in Dropbear's native format. Dropbear is a lightweight SSH implementation commonly used on embedded systems, routers, and resource-constrained devices where OpenSSH would be too large.

The tool supports modern key types including Ed25519, ECDSA, and RSA with configurable key sizes. Generated keys are stored in Dropbear's own format, which differs from OpenSSH's format. If you need to use keys with OpenSSH or vice versa, use dropbearconvert to convert between formats.

Host keys are typically stored in /etc/dropbear/, while user keys can be placed in standard SSH locations.

# PARAMETERS

**-t** _type_
> Key type: **rsa**, **ecdsa**, **ed25519**, or **dss**.

**-f** _file_
> File to write the private key to.

**-s** _bits_
> Key size in bits, which should be a multiple of 8. Applies to RSA and ECDSA; Ed25519 has a fixed size and ignores it.

**-y**
> Print the public key and fingerprint of an existing private key instead of generating one.

# CAVEATS

The generated file is in **Dropbear's own private key format**, not OpenSSH's, so it cannot be handed to `ssh -i` directly: convert it first with `dropbearconvert`. The *public* key printed by **-y** is in the usual OpenSSH one-line form, so it can be pasted straight into an `authorized_keys` file.

Unlike `ssh-keygen`, dropbearkey does **not** encrypt the private key with a passphrase, and there is no option to do so. Anyone who can read the file has the key. For user keys that matter, generate with `ssh-keygen` and convert, rather than the other way round.

Prefer **ed25519**: it is small, fast, and well supported. **dss** is obsolete, rejected by modern SSH implementations, and should never be chosen for a new key.

Generating an RSA key on a slow embedded device can take a surprisingly long time, and on a freshly booted system the entropy pool may not be seeded, so host key generation at first boot is a classic source of both delay and weak keys.

# INSTALL

```apt: sudo apt install dropbear-bin```

```dnf: sudo dnf install dropbear```

```pacman: sudo pacman -S dropbear```

```apk: sudo apk add dropbear```

```brew: brew install dropbear```

```nix: nix profile install nixpkgs#dropbear```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dropbearconvert](/man/dropbearconvert)(1), [dropbear](/man/dropbear)(8), [dbclient](/man/dbclient)(1), [ssh-keygen](/man/ssh-keygen)(1)

# RESOURCES

```[Source code](https://github.com/mkj/dropbear)```

```[Homepage](https://matt.ucc.asn.au/dropbear/dropbear.html)```

<!-- verified: 2026-07-14 -->

