# TLDR

**Encrypt a file**

```ccrypt [file.txt]```

**Decrypt a file**

```ccrypt -d [file.txt.cpt]```

**Decrypt to stdout**

```ccat [file.txt.cpt]```

**Change encryption key**

```ccrypt -x [file.cpt]```

**Encrypt with key from file**

```ccrypt -k [keyfile] [file.txt]```

**Force overwrite**

```ccrypt -f [file.txt]```

# SYNOPSIS

**ccrypt** [_options_] [_file_...]

**ccencrypt** [_options_] [_file_...]

**ccdecrypt** [_options_] [_file_...]

**ccat** [_options_] [_file_...]

# DESCRIPTION

**ccrypt** encrypts and decrypts files using the Rijndael cipher (AES) with 256-bit keys. Provides secure symmetric encryption for files and streams. Encrypted files get .cpt extension.

# PARAMETERS

**-e**, **--encrypt**
> Encrypt mode

**-d**, **--decrypt**
> Decrypt mode

**-c**, **--cat**
> Decrypt to stdout

**-x**, **--keychange**
> Change encryption key

**-k** _file_, **--keyfile** _file_
> Read key from file

**-K** _key_, **--key** _key_
> Specify key on command line (unsafe)

**-f**, **--force**
> Overwrite without asking

**-v**, **--verbose**
> Print progress info

**-q**, **--quiet**
> Suppress warnings

**-b**, **--brave**
> Ask for key only once

**-S** _suf_, **--suffix** _suf_
> Use suffix instead of .cpt

**-l**, **--symlinks**
> Process symbolic links

# COMMANDS

**ccencrypt**: Equivalent to ccrypt -e

**ccdecrypt**: Equivalent to ccrypt -d

**ccat**: Equivalent to ccrypt -c

# CAVEATS

Using -K on command line exposes key in process list. Use -k with keyfile or stdin for security. Based on AES/Rijndael cipher.

# SEE ALSO

[gpg](/man/gpg)(1), [openssl](/man/openssl)(1), [age](/man/age)(1)
