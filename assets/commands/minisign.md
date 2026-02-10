# TAGLINE

creates and verifies signatures

# TLDR

**Generate key pair**

```minisign -G```

**Sign file**

```minisign -Sm [file]```

**Verify signature**

```minisign -Vm [file] -p [pubkey.pub]```

**Sign with comment**

```minisign -Sm [file] -c "[Signed by me]"```

**Verify with trusted key**

```minisign -Vm [file] -P [public_key_string]```

# SYNOPSIS

**minisign** [_options_]

# PARAMETERS

**-G**
> Generate key pair.

**-S**
> Sign file.

**-V**
> Verify signature.

**-m** _FILE_
> File to sign/verify.

**-p** _FILE_
> Public key file.

**-P** _KEY_
> Public key string.

**-c** _COMMENT_
> Signature comment.

**--help**
> Display help information.

# DESCRIPTION

**minisign** creates and verifies signatures. It's simpler than GPG with good security.

The tool uses Ed25519 signatures. Designed for signing software releases.

# CAVEATS

Not compatible with GPG. Signing only (no encryption). Simple by design.

# HISTORY

Minisign was created by **Frank Denis** as a dead-simple tool for signing files.

# SEE ALSO

[gpg](/man/gpg)(1), [signify](/man/signify)(1), [age](/man/age)(1)

