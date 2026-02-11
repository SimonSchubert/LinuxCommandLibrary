# TAGLINE

Manage ZeroTier cryptographic identities

# TLDR

**Generate new identity**

```zerotier-idtool generate [identity.secret]```

**Get public identity from secret**

```zerotier-idtool getpublic [identity.secret]```

**Sign a file**

```zerotier-idtool sign [identity.secret] [file]```

**Verify signature**

```zerotier-idtool verify [identity.public] [file] [signature]```

**Show identity address**

```zerotier-idtool info [identity.secret]```

# SYNOPSIS

**zerotier-idtool** _command_ [_args_]

# SUBCOMMANDS

**generate** _secret_file_
> Generate new identity, write to file

**getpublic** _secret_file_
> Output public identity from secret

**sign** _secret_file_ _file_to_sign_
> Sign file with identity

**verify** _public_file_ _file_ _signature_
> Verify signature against public identity

**info** _identity_file_
> Display identity information (address, type)

**initmoon** _identity_file_
> Initialize moon (custom root) definition

**genmoon** _moon_json_
> Generate moon.d file from JSON definition

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
