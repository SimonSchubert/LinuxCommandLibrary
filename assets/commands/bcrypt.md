# TLDR

**Encrypt** file

```bcrypt [file.txt]```

**Decrypt** file

```bcrypt [file.txt.bfe]```

**Remove** original after encryption

```bcrypt -r [file.txt]```

# SYNOPSIS

**bcrypt** [_options_] _file_...

# DESCRIPTION

**bcrypt** is a file encryption utility using the Blowfish cipher. It encrypts files in place with a password, creating .bfe (Blowfish Encrypted) files.

The tool provides simple command-line encryption for individual files.

# PARAMETERS

**-r**
> Remove original file after encryption

**-c**
> Compress before encryption

# WORKFLOW

```bash
# Encrypt (creates file.txt.bfe)
bcrypt file.txt

# Decrypt (restores file.txt)
bcrypt file.txt.bfe

# Encrypt and remove original
bcrypt -r file.txt
```

# CAVEATS

Older tool with limited maintenance. Password stored in memory during operation. Consider using gpg or age for modern encryption needs. Blowfish superseded by AES in many applications. Files encrypted in place.

# HISTORY

**bcrypt** was created as a simple file encryption tool using the Blowfish cipher, developed by Bruce Schneier in **1993**.

# SEE ALSO

[gpg](/man/gpg)(1), [openssl](/man/openssl)(1), [age](/man/age)(1)
