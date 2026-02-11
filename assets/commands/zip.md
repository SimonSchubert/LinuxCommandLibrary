# TAGLINE

Create and modify ZIP archives

# TLDR

**Create a ZIP archive**

```zip [archive.zip] [file1] [file2]```

**Create archive from directory**

```zip -r [archive.zip] [directory/]```

**Add files to existing archive**

```zip [archive.zip] [newfile.txt]```

**Create archive with compression level**

```zip -9 [archive.zip] [files]```

**Create encrypted archive**

```zip -e [archive.zip] [files]```

**Exclude files from archive**

```zip -r [archive.zip] [directory/] -x "*.log"```

**Update only changed files**

```zip -u [archive.zip] [files]```

**Create archive excluding directory**

```zip -r [archive.zip] [dir/] -x [dir/subdir/*]```

**Delete file from archive**

```zip -d [archive.zip] [file_to_remove]```

# SYNOPSIS

**zip** [_options_] _archive_ _files_...

# DESCRIPTION

**zip** creates and modifies ZIP archives, a widely supported compressed archive format. It compresses files using the DEFLATE algorithm (or store without compression) and packages them with metadata including names, timestamps, and permissions.

ZIP archives are cross-platform compatible and supported natively on Windows, macOS, and most Unix systems. The format supports directory structures, encryption, and archives spanning multiple files.

zip can create new archives, add files to existing ones, update changed files, or delete entries. It's commonly used for file distribution, backups, and data exchange.

# PARAMETERS

**-r**
> Recurse into directories.

**-9**
> Maximum compression.

**-0**
> Store only (no compression).

**-e**
> Encrypt archive (prompts for password).

**-P** _password_
> Use specified password.

**-u**
> Update only changed files.

**-f**
> Freshen (update existing entries only).

**-d**
> Delete entries from archive.

**-x** _pattern_
> Exclude files matching pattern.

**-i** _pattern_
> Include only matching files.

**-j**
> Junk directory paths.

**-q**
> Quiet mode.

**-v**
> Verbose output.

**-@**
> Read file list from stdin.

**-s** _size_
> Split archive at size.

**-y**
> Store symbolic links.

# CAVEATS

Default encryption is weak (ZipCrypto); use 7z for strong encryption. Maximum file size is 4GB without ZIP64. Password on command line is insecure. Timestamps may lose precision.

# HISTORY

The ZIP format was created by **Phil Katz** for **PKZIP** in **1989**. The **Info-ZIP** project was started the same year to provide free implementations. Info-ZIP's zip became the standard Unix ZIP utility and is included in virtually all Unix-like systems. The format has evolved to support larger files (ZIP64) and better compression.

# SEE ALSO

[unzip](/man/unzip)(1), [tar](/man/tar)(1), [gzip](/man/gzip)(1), [7z](/man/7z)(1)
