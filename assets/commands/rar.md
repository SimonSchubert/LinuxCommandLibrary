# TAGLINE

Create and manage RAR compressed archives

# TLDR

**Create archive**

```rar a [archive.rar] [files]```

**Extract archive**

```rar x [archive.rar]```

**Extract to directory**

```rar x [archive.rar] [destination/]```

**List contents**

```rar l [archive.rar]```

**Add with password**

```rar a -p[password] [archive.rar] [files]```

**Add with compression level**

```rar a -m[5] [archive.rar] [files]```

**Test archive**

```rar t [archive.rar]```

**Add recovery record**

```rar a -rr[5%] [archive.rar] [files]```

# SYNOPSIS

**rar** _command_ [_-switches_] _archive_ [_files_]

# PARAMETERS

**a**
> Add files to archive.

**x**
> Extract with full paths.

**e**
> Extract without paths.

**l**, **v**
> List archive contents.

**t**
> Test archive.

**d**
> Delete from archive.

**u**
> Update files.

**-m** _N_
> Compression level (0-5).

**-p** [_PASSWORD_]
> Set password.

**-r**
> Recurse subdirectories.

**-rr** [_N_]
> Add recovery record (percent).

**-v** _SIZE_
> Create volumes.

**-y**
> Yes to all queries.

**-o+**, **-o-**
> Overwrite mode.

**-hp** [_PASSWORD_]
> Encrypt headers too.

# DESCRIPTION

**rar** creates and manages RAR archives. It provides high compression ratios and features like recovery records and solid archives.

Compression levels range from 0 (store) to 5 (maximum). Higher levels take more time but produce smaller files.

Recovery records protect against corruption. They add redundancy that can repair damage up to the specified percentage.

Header encryption (-hp) hides filenames in addition to content. Standard password protection (-p) encrypts data but shows names.

Volume splitting creates multi-part archives. Size can be specified in bytes, kilobytes, or megabytes.

Solid archives compress files together, improving ratios for similar files. Extraction of single files requires processing earlier files.

# CAVEATS

Proprietary format - requires rar or unrar. Free version is command-line only. Linux version available but not open-source.

# HISTORY

**RAR** was created by **Eugene Roshal** (Roshal ARchive) in **1993**. It became popular for distributing large files, especially before broadband. The format continues development with improved compression and encryption.

# SEE ALSO

[unrar](/man/unrar)(1), [7z](/man/7z)(1), [zip](/man/zip)(1), [tar](/man/tar)(1)
