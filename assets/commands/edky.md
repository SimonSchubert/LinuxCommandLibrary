# TAGLINE

Convert Ed25519 public keys between encodings

# TLDR

**List** supported public key encoding formats

```edky list```

**Convert** an Iroh key to a libp2p/multibase key

```edky convert -f iroh -t libp2p [key]```

**Convert** a libp2p key back to Iroh (base32z)

```edky convert -f libp2p -t iroh [key]```

**Convert** a NEAR key to raw hex

```edky convert -f near -t hex [key]```

**Convert** hex to a NEAR-style key

```edky convert -f hex -t near [key]```

**Parse** a key in a given encoding

```edky parse -f openssh [key]```

# SYNOPSIS

**edky** [_options_] [_command_] [_args_]

# DESCRIPTION

**edky** (pronounced "ed-key") converts **Ed25519** public keys between common encoding formats used across cryptography and peer-to-peer stacks. It is available as a command-line tool and as libraries for Rust, TypeScript/JavaScript, Dart, Python, and Ruby.

Supported encodings for **--from** / **--to** include **hex** / **base16**, **base32z**, **base58**, **base64**, **base64url**, **multibase**, and ecosystem aliases such as **iroh**, **libp2p**, **ipfs**, **near**, **openssh**, and **asimov**. Subcommands are **list** (enumerate formats), **convert** (re-encode keys), and **parse** (validate and inspect keys).

Install the CLI via Cargo with the **cli** feature (**cargo install edky --locked --features=cli**) or **cargo binstall edky**. Default input and output encoding for convert/parse is **hex** when not specified.

# PARAMETERS

**list**
> Print supported public key encoding format names.

**convert** [**-f** _FROM_] [**-t** _TO_] [_INPUTS_…]
> Convert each input key from encoding _FROM_ to encoding _TO_. Defaults: **hex** → **hex**.

**parse** [**-f** _FROM_] [_INPUTS_…]
> Parse keys in encoding _FROM_ (default **hex**).

**-f**, **--from** _FORMAT_
> Input encoding format.

**-t**, **--to** _FORMAT_
> Output encoding format (**convert** only).

**-d**, **--debug**
> Enable debugging output.

**-v**, **--verbose**
> Increase verbosity (repeatable).

**-V**, **--version**
> Print version information.

**--license**
> Show license information.

**--color** _auto|always|never_
> Control color output (default **auto**).

**-h**, **--help**
> Print help.

# CAVEATS

Operates on **public** keys only; it does not convert private keys or sign data. Encoding aliases may map to the same wire format (for example **iroh** and **base32z**, or **libp2p** / **ipfs** / **multibase** for multibase-encoded DID keys). Invalid input length or alphabet for the chosen format causes an error.

# HISTORY

**edky** is public-domain (Unlicense) software by Arto Bendiken, aimed at interop among ASIMOV, IPFS, Iroh, libp2p, NEAR, OpenSSH, and related Ed25519 encodings.

# SEE ALSO

[ssh-keygen](/man/ssh-keygen)(1), [age-keygen](/man/age-keygen)(1), [openssl](/man/openssl)(1)

# RESOURCES

```[Source code](https://github.com/artob/edky)```

```[Homepage](https://edky.dev)```

<!-- verified: 2026-07-22 -->
