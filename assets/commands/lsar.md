# TAGLINE

lists the contents of archive files

# TLDR

**List archive contents**

```lsar [archive.zip]```

**List with detailed info**

```lsar -l [archive.rar]```

**List very long format**

```lsar -L [archive.7z]```

**Test archive integrity**

```lsar -t [archive.zip]```

**List with password**

```lsar -p [password] [encrypted.zip]```

**List specific encoding**

```lsar -e [shift_jis] [japanese.zip]```

**Print only filenames**

```lsar -1 [archive.tar.gz]```

# SYNOPSIS

**lsar** [_-l_] [_-L_] [_-t_] [_-p password_] [_-e encoding_] [_archive_]

# PARAMETERS

**-l**
> Long listing with size, date, permissions.

**-L**
> Very long listing with extra details.

**-t**
> Test archive integrity.

**-p** _PASSWORD_
> Specify password for encrypted archives.

**-e** _ENCODING_
> Force character encoding for filenames.

**-1**
> Print only filenames, one per line.

**-j**
> Output as JSON.

**-q**
> Quiet mode.

**-nr**
> Don't recurse into nested archives.

**-h**, **--help**
> Show help.

# DESCRIPTION

**lsar** lists the contents of archive files. It supports a wide variety of formats including Zip, RAR, 7-Zip, tar, gzip, bzip2, ISO, and many legacy formats.

The tool is part of The Unarchiver suite. While unar extracts files, lsar provides inspection without extraction. It handles archives that standard tools may fail on, including corrupted or non-standard archives.

Encoding detection handles international filenames automatically. For archives with mislabeled encodings, the -e flag forces specific character sets like Shift_JIS, GBK, or EUC-KR.

Long listing shows file sizes (compressed and uncompressed), modification dates, and permissions where available. The test mode (-t) verifies archive integrity without extracting.

JSON output enables scripting and integration with other tools.

# CAVEATS

Not installed by default on most systems - requires The Unarchiver package. Some formats may have limited metadata support. Encrypted RAR5 archives require specific builds.

# HISTORY

**lsar** is part of **The Unarchiver**, created by **Dag Ågren** starting around **2006**. Originally a macOS application, command-line tools were added later. The project focuses on compatibility with many archive formats and proper handling of international filenames.

# SEE ALSO

[unar](/man/unar)(1), [unzip](/man/unzip)(1), [tar](/man/tar)(1), [7z](/man/7z)(1), [unrar](/man/unrar)(1)
