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

Standard ZIP encryption is weak. Use 7z for stronger encryption. Part of Info-ZIP.

# HISTORY

**zipcloak** is part of **Info-ZIP** utilities. It provides simple encryption for ZIP archives.

# SEE ALSO

[zip](/man/zip)(1), [unzip](/man/unzip)(1), [7z](/man/7z)(1)
