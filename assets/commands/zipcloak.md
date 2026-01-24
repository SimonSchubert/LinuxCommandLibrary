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

**zipcloak** encrypts or decrypts ZIP archives. It adds password protection.

Encryption prompts for password. All files in archive encrypted.

Decryption removes password. Requires original password.

Output option preserves original. Creates new encrypted file.

In-place mode modifies archive. Original replaced.

Standard ZIP encryption used. Compatible with most tools.

# CAVEATS

Standard ZIP encryption is weak. Use 7z for stronger encryption. Part of Info-ZIP.

# HISTORY

**zipcloak** is part of **Info-ZIP** utilities. It provides simple encryption for ZIP archives.

# SEE ALSO

[zip](/man/zip)(1), [unzip](/man/unzip)(1), [7z](/man/7z)(1)
