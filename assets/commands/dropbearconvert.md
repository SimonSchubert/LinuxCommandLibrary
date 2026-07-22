# TAGLINE

convert SSH keys between Dropbear and OpenSSH formats

# TLDR

Convert **OpenSSH to Dropbear** format

```dropbearconvert openssh dropbear ~/.ssh/id_rsa output_key```

Convert **Dropbear to OpenSSH** format

```dropbearconvert dropbear openssh input_key ~/.ssh/id_rsa```

# SYNOPSIS

**dropbearconvert** _input_type_ _output_type_ _input_file_ _output_file_

# DESCRIPTION

**dropbearconvert** converts private keys between Dropbear and OpenSSH formats. Dropbear and OpenSSH use different private key formats, and this utility bridges the two implementations.

# PARAMETERS

**input_type**
> Format of the input key: "dropbear" or "openssh"

**output_type**
> Format of the output key: "dropbear" or "openssh"

**input_file**
> Path to the input private key file

**output_file**
> Path for the converted output key file

# CAVEATS

**Passphrase-protected keys cannot be converted.** dropbearconvert has no way to prompt for a passphrase, so an encrypted OpenSSH key must be decrypted first, for example with `ssh-keygen -p -N "" -f key`, and the resulting plaintext key handled carefully. Note also that Dropbear's own format has no encrypted variant at all: converting *to* Dropbear always yields an unprotected private key on disk.

Only private keys are converted. Public keys need no conversion, since both implementations use the same one-line `authorized_keys` format.

The tool overwrites the output file without asking, and converting the wrong direction silently produces a file the other end cannot read, so keep a copy of the original.

# HISTORY

**dropbearconvert** exists because Dropbear predates OpenSSH's current key format and chose its own compact encoding, suited to devices where parsing PEM was an unwelcome cost. That decision left the two implementations mutually unreadable, and this small converter is the bridge. It ships with Dropbear itself, and on space-constrained firmware it is often the first binary left out, which is why key conversion is usually done on a workstation and the result copied across.

# INSTALL

```apt: sudo apt install dropbear-bin```

```apk: sudo apk add dropbear-convert```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dropbear](/man/dropbear)(8), [dropbearkey](/man/dropbearkey)(1), [dbclient](/man/dbclient)(1), [ssh-keygen](/man/ssh-keygen)(1)

# RESOURCES

```[Source code](https://github.com/mkj/dropbear)```

```[Homepage](https://matt.ucc.asn.au/dropbear/dropbear.html)```

<!-- verified: 2026-07-14 -->

