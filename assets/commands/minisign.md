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
> Generate a new key pair.

**-S**
> Sign a file.

**-V**
> Verify a signature.

**-R**
> Re-create a public key file from an existing secret key.

**-m** _FILE_
> File to sign or verify.

**-o**
> With **-S**, emit a pre-hashed signature (required for files >1 GiB).

**-H**
> With **-V**, require the signature to be a pre-hashed signature.

**-q**
> Quiet mode; suppress the "Comment" banner on successful verification.

**-Q**
> Pretty-print the public key and the signature comment.

**-s** _FILE_
> Secret key file (default `~/.minisign/minisign.key`).

**-p** _FILE_
> Public key file.

**-P** _KEY_
> Public key supplied on the command line (base64).

**-x** _FILE_
> Signature file path (default `<input>.minisig`).

**-c** _COMMENT_
> Untrusted comment stored in the signature.

**-t** _COMMENT_
> Trusted comment (signed, cannot be tampered with without invalidating the signature).

**-f**
> Force: overwrite existing files without prompting.

**-W**
> Do not encrypt the newly generated secret key.

**-v**
> Show the minisign version and exit.

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

[gpg](/man/gpg)(1), [age](/man/age)(1), [ssh-keygen](/man/ssh-keygen)(1)

