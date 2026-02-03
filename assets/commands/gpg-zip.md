# TLDR

**Encrypt directory with symmetric encryption**

```gpg-zip --symmetric --output [archive.gpg] [directory]```

**Encrypt for a recipient**

```gpg-zip --encrypt --output [archive.gpg] --gpg-args "-r [recipient]" [directory]```

**Decrypt an archive**

```gpg-zip --decrypt [archive.gpg]```

**List archive contents**

```gpg-zip --list-archive [archive.gpg]```

**Sign and encrypt**

```gpg-zip --encrypt --sign --output [archive.gpg] [directory]```

# SYNOPSIS

**gpg-zip** [_options_] [_files_]

# PARAMETERS

**-e**, **--encrypt**
> Encrypt data.

**-d**, **--decrypt**
> Decrypt data.

**-c**, **--symmetric**
> Encrypt with symmetric cipher using passphrase.

**-s**, **--sign**
> Sign data.

**--list-archive**
> List archive contents.

**-o**, **--output** _file_
> Output file.

**--gpg-args** _args_
> Pass options to gpg.

**--tar** _command_
> Use alternative tar command.

# DESCRIPTION

**gpg-zip** encrypts or signs files into an archive using GnuPG. It combines tar archiving with GPG encryption in a format compatible with PGP Zip. Supports both symmetric (passphrase) and asymmetric (public-key) encryption.

# CAVEATS

**gpg-zip** is deprecated. Use **gpgtar** instead.

# SEE ALSO

[gpgtar](/man/gpgtar)(1), [gpg](/man/gpg)(1), [tar](/man/tar)(1)

