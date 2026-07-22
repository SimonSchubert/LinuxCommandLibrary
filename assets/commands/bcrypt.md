# TAGLINE

Encrypt and decrypt files using Blowfish

# TLDR

**Encrypt** a file (creates file.txt.bfe, removes the original)

```bcrypt [file.txt]```

**Decrypt** a file (any .bfe input is decrypted)

```bcrypt [file.txt.bfe]```

**Encrypt** but keep the original file

```bcrypt -r [file.txt]```

**Encrypt** without compressing first

```bcrypt -c [file.txt]```

# SYNOPSIS

**bcrypt** [_-orc_] [_-s_ _N_] _file_...

# DESCRIPTION

**bcrypt** is a cross-platform file encryption utility using the Blowfish cipher. Files are encrypted with a passphrase and saved with a **.bfe** (Blowfish Encrypted) extension. Any file ending in .bfe is assumed to be encrypted and is decrypted; all other input files are encrypted.

By default bcrypt compresses each input file before encryption, removes the input file after it is processed successfully, and overwrites the original with random data first to hinder recovery. Passphrases may be 8 to 56 characters; the key is always hashed internally to the 448-bit maximum supported by Blowfish.

# PARAMETERS

**-o**
> Print output to standard out (implies **-r**).

**-r**
> Do not remove input files after processing.

**-c**
> Do not compress files before encryption.

**-s** _N_
> Overwrite input files with random data _N_ times before deleting (default 3).

# WORKFLOW

```bash
# Encrypt (creates file.txt.bfe, removes file.txt)
bcrypt file.txt

# Decrypt (restores file.txt)
bcrypt file.txt.bfe

# Encrypt but keep the original
bcrypt -r file.txt
```

# CAVEATS

Older tool with limited maintenance. The passphrase resides in memory during operation. Blowfish has largely been superseded by AES, so consider **gpg** or **ccrypt** for modern needs. Forgetting the passphrase makes the data unrecoverable.

# HISTORY

**bcrypt** was written by **Johnny Shelley** as a lightweight, portable file encryption tool. It uses Paul Kocher's implementation of the Blowfish cipher, which was designed by **Bruce Schneier** in **1993**. This file utility is unrelated to the **bcrypt** password-hashing function of the same name.

# INSTALL

```dnf: sudo dnf install bcrypt```

```brew: brew install bcrypt```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[gpg](/man/gpg)(1), [openssl](/man/openssl)(1), [ccrypt](/man/ccrypt)(1), [age](/man/age)(1)

# RESOURCES

```[Homepage](https://bcrypt.sourceforge.net/)```

<!-- verified: 2026-06-19 -->
