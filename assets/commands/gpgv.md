# TLDR

**Verify a signed file**

```gpgv [file.sig]```

**Verify detached signature**

```gpgv [file.sig] [file]```

**Use specific keyring**

```gpgv --keyring [keyring.gpg] [file.sig]```

**Verbose verification**

```gpgv -v [file.sig]```

**Quiet mode**

```gpgv -q [file.sig]```

# SYNOPSIS

**gpgv** [_options_] [_sigfile_] [_files_]

# PARAMETERS

**-v**, **--verbose**
> More information during processing.

**-q**, **--quiet**
> Try to be as quiet as possible.

**--keyring** _file_
> Use specified keyring.

**--homedir** _dir_
> GnuPG home directory.

**--ignore-time-conflict**
> Turn timestamp checks into warnings.

**--weak-digest** _name_
> Treat digest as weak.

**--status-fd** _n_
> Write status strings to file descriptor.

# DESCRIPTION

**gpgv** is a stripped-down version of gpg for verifying OpenPGP signatures. It assumes all keys in the keyring are trustworthy and does not check for expired or revoked keys. By default, it uses the trustedkeys.kbx or trustedkeys.gpg keyring in the GnuPG home directory.

# CAVEATS

Returns 0 if verification succeeds, 1 if any signature is bad, and other codes for fatal errors. Unlike gpg, gpgv does not validate key trust.

# SEE ALSO

[gpg](/man/gpg)(1), [gpg2](/man/gpg2)(1)

