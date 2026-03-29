# TAGLINE

extract the first member of a ZIP or gzip archive from a pipe

# TLDR

**Extract first file from a ZIP archive via stdin**

```cat [file.zip] | funzip > [output]```

**Extract from a gzip file via stdin**

```cat [file.gz] | funzip > [output]```

**Download and extract in one step**

```curl -s [url/file.zip] | funzip > [output]```

**Extract from a file argument directly**

```funzip [file.zip] > [output]```

**Extract a password-protected ZIP archive**

```funzip -[password] [file.zip] > [output]```

**Extract a tar.zip archive using a secondary archiver**

```cat [archive.tar.zip] | funzip | tar xf -```

# SYNOPSIS

**funzip** [**-**_password_] [_input_[.zip|.gz]]

# DESCRIPTION

**funzip** acts as a filter to extract the first member from a ZIP archive or a gzip file. Without a file argument, it reads from standard input and writes to standard output. When given a file argument, it reads from that file instead. It also handles gzip compressed files.

This is most useful for extracting single-file archives from pipes without creating intermediate files, or in combination with a secondary archiver like **tar**(1) for tape backups.

# PARAMETERS

**-**_password_
> Decryption password for encrypted ZIP archives. Passing passwords on the command line is insecure as they may be visible via ps(1).

# CAVEATS

Only extracts the first member from a ZIP archive. For multi-file archives, use **unzip** instead. When the first member is a directory, funzip simply creates it and exits.

# SEE ALSO

[gzip](/man/gzip)(1), [unzip](/man/unzip)(1), [unzipsfx](/man/unzipsfx)(1), [zip](/man/zip)(1), [zipinfo](/man/zipinfo)(1)

