# TAGLINE

Encrypt or decrypt ZIP archives

# TLDR

**Encrypt ZIP file**

```zipcloak [archive.zip]```

**Decrypt ZIP file**

```zipcloak -d [archive.zip]```

**Encrypt with output**

```zipcloak -O [encrypted.zip] [archive.zip]```

**Quiet mode**

```zipcloak -q [archive.zip]```

# SYNOPSIS

**zipcloak** [_-d_] [_-O output_] [_options_] _zipfile_

# PARAMETERS

**-d**, **--decrypt**
> Decrypt archive.

**-O** _FILE_
> Output to new file.

**-q**, **--quiet**
> Quiet mode.

**-b** _PATH_
> Temp file path.

**-h**, **--help**
> Show help.

**-v**, **--version**
> Show version.

# DESCRIPTION

**zipcloak** encrypts or decrypts ZIP archives by adding or removing password protection. When encrypting, it prompts for a password and applies encryption to all files within the archive. When decrypting with the **-d** flag, it removes encryption after verifying the original password.

By default, zipcloak modifies the archive in place, replacing the original file. The **-O** option allows writing the encrypted or decrypted result to a new file, preserving the original archive unchanged.

zipcloak uses standard ZIP encryption (PKZIP), which is widely compatible with most ZIP tools and operating systems. It is part of the Info-ZIP suite of utilities.

# CAVEATS

Standard ZIP encryption (PKZIP/ZipCrypto) is considered weak by modern standards and can be broken with known-plaintext attacks. For stronger encryption, consider using **7z** with AES-256. The **-O** option should be used when you want to preserve the original unencrypted archive. Encryption applies to file contents only; filenames and metadata remain visible.

# HISTORY

**zipcloak** is part of the **Info-ZIP** suite of utilities, originally developed in the early 1990s as free, portable implementations of the ZIP archive format tools. It provides a convenient way to add or remove password protection from existing ZIP archives without needing to recreate them.

# SEE ALSO

[zip](/man/zip)(1), [unzip](/man/unzip)(1), [7z](/man/7z)(1), [zipinfo](/man/zipinfo)(1), [zipnote](/man/zipnote)(1)
