# TAGLINE

Encrypted storage volume manager

# TLDR

**Create** a new tomb (100 MB)

```tomb dig -s 100 secret.tomb```

**Forge** a new key file

```tomb forge secret.tomb.key```

**Lock** a tomb with its key

```tomb lock secret.tomb -k secret.tomb.key```

**Open** a tomb and mount it

```tomb open secret.tomb -k secret.tomb.key```

**Close** a tomb

```tomb close secret.tomb```

**Slam** all tombs forcefully

```tomb slam all```

**List** all open tombs

```tomb list```

**Resize** a tomb

```tomb resize secret.tomb -s 200```

# SYNOPSIS

**tomb** [_options_] _command_ [_arguments_]

# DESCRIPTION

**tomb** manages encrypted storage directories that can be safely transported and hidden in a filesystem. It creates LUKS-encrypted containers that can be mounted as regular directories. Tombs are useful for secure storage of sensitive data.

# PARAMETERS

**dig**
> Create a new tomb container

**forge**
> Create a new key file for locking a tomb

**lock**
> Initialize and lock an empty tomb with a key

**open**
> Mount a tomb using its key file

**close**
> Unmount a tomb

**slam**
> Forcefully close tombs, killing processes using them

**list**
> List all open tombs

**resize**
> Change the size of a tomb

**passwd**
> Change the passphrase protecting a key file

**setkey**
> Replace the key of an existing tomb with a different one

**bury**
> Hide a key file inside a JPEG image (steganography)

**exhume**
> Recover a key file previously buried in an image

**engrave**
> Print a key as a QR code for paper backup

**index**, **search**, **recompose**
> Maintain and query a recoll full-text index of tombs

**-s SIZE**
> Specify size in megabytes

**-k KEYFILE**
> Specify key file to use

**-f, --force**
> Force operation (e.g., forge key despite swap)

**-o MOUNT_OPTIONS**
> Specify mount options

**--kdf** _N_
> Use strong KDF with _N_ rounds of key derivation (hardens against brute-force).

**--tomb-pwd** _FD_
> Read passphrase from file descriptor _FD_ (for automation).

**-g, --gpg-key** _KEYID_
> Encrypt the tomb key with a GPG public key instead of a passphrase.

# CAVEATS

Tomb refuses to forge keys if swap is enabled (to prevent key material from being written to swap). Use -f to override this check. Tombs are implemented using LUKS and require cryptsetup.

# HISTORY

**tomb** was created by the Dyne.org foundation as a user-friendly wrapper for creating and managing LUKS-encrypted volumes in a portable way.

# SEE ALSO

[cryptsetup](/man/cryptsetup)(8), [gpg](/man/gpg)(1), [dm-crypt](/man/dm-crypt)(8)
