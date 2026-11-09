# TAGLINE

Manage ZeroTier cryptographic identities

# TLDR

**Generate new identity** and print it

```zerotier-idtool generate```

**Generate identity files**

```zerotier-idtool generate [identity.secret] [identity.public]```

**Generate an identity with a vanity address prefix**

```zerotier-idtool generate [identity.secret] [identity.public] [abc]```

**Get public identity from secret**

```zerotier-idtool getpublic [identity.secret]```

**Validate an identity**

```zerotier-idtool validate [identity.secret]```

**Sign a file**

```zerotier-idtool sign [identity.secret] [file] > [file.sig]```

**Verify signature**

```zerotier-idtool verify [identity.public] [file] [signature]```

**Create a moon definition** from a seed identity

```zerotier-idtool initmoon [identity.public] > [moon.json]```

# SYNOPSIS

**zerotier-idtool** _command_ [_args_]

# SUBCOMMANDS

**generate** [_identity.secret_] [_identity.public_] [_vanity_]
> Generate a new identity. Writes to the given files, or prints the secret identity to stdout if none are given. _vanity_ is a hex prefix for the address.

**validate** _identity_
> Check that a secret or public identity is valid

**getpublic** _identity.secret_
> Output public identity from secret

**sign** _identity.secret_ _file_
> Sign a file and print the hex signature to stdout

**verify** _identity_ _file_ _signature_
> Verify a signature against a secret or public identity

**initmoon** _identity.public_
> Print a moon (custom root) JSON definition for the first seed

**genmoon** _moon_json_
> Generate a **.moon** file from a JSON definition

# DESCRIPTION

**zerotier-idtool** manages ZeroTier cryptographic identities. Identities consist of a secret key (kept private) and a public key that derives the 10-digit ZeroTier address.

The tool can generate new identities, extract public keys, and perform cryptographic operations like signing and verification. This is useful for backup, migration, and creating custom network infrastructure.

Identities are automatically generated when zerotier-one first starts, stored in the ZeroTier home directory (typically /var/lib/zerotier-one/).

For advanced users, the tool supports creating "moons" - custom root servers for private ZeroTier infrastructure.

# CAVEATS

**identity.secret** files must be kept secure. Anyone with this file can impersonate that ZeroTier node.

Regenerating an identity creates a new address. Existing network memberships must be re-authorized.

Moon creation requires understanding ZeroTier's root server architecture.

# SEE ALSO

[zerotier-cli](/man/zerotier-cli)(1), [zerotier-one](/man/zerotier-one)(8)

# RESOURCES

```[Source code](https://github.com/zerotier/ZeroTierOne)```

```[Homepage](https://www.zerotier.com)```

```[Documentation](https://docs.zerotier.com)```

<!-- verified: 2026-11-09 -->
