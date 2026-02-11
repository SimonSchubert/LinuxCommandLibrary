# TAGLINE

Universal multi-format archive extractor

# TLDR

**Extract archive**

```unar [archive.zip]```

**Extract to directory**

```unar -o [output_dir] [archive.rar]```

**Extract with password**

```unar -p [password] [encrypted.zip]```

**Force overwrite**

```unar -f [archive.zip]```

**Extract without directory**

```unar -D [archive.tar.gz]```

**List contents only**

```lsar [archive.7z]```

**Extract specific encoding**

```unar -e [shift_jis] [japanese.zip]```

# SYNOPSIS

**unar** [_-o dir_] [_-p password_] [_-e encoding_] [_options_] _archive_

# PARAMETERS

**-o** _DIR_
> Output directory.

**-p** _PASSWORD_
> Archive password.

**-e** _ENCODING_
> Filename encoding.

**-f**, **--force**
> Overwrite without asking.

**-D**, **--no-directory**
> Don't create containing directory.

**-d**, **--directory**
> Always create directory.

**-k** _MODE_
> How to handle existing files.

**-q**, **--quiet**
> Quiet mode.

**-t**, **--test**
> Test archive.

**-nr**, **--no-recursion**
> Don't extract nested archives.

**-h**, **--help**
> Show help.

# DESCRIPTION

**unar** extracts archives of many formats. It handles Zip, RAR, 7-Zip, tar, gzip, bzip2, ISO, and many legacy formats.

Format detection is automatic. The tool examines archive contents rather than relying solely on extensions.

Encoding handling processes international filenames correctly. Japanese, Chinese, Korean, and other encodings are supported and auto-detected.

Password handling works for encrypted archives. Both header-encrypted and content-encrypted formats are supported.

The tool handles broken or non-standard archives that other extractors reject. It attempts to recover what it can.

By default, archives extract to a directory named after the archive. This can be controlled with -d or -D options.

# CAVEATS

Not installed by default. Some formats have limited metadata support. Very old formats may have quirks.

# HISTORY

**unar** is part of **The Unarchiver**, created by **Dag Ågren** starting around **2006**. Originally a macOS GUI application, command-line tools were added later for scripting.

# SEE ALSO

[lsar](/man/lsar)(1), [unzip](/man/unzip)(1), [unrar](/man/unrar)(1), [7z](/man/7z)(1), [tar](/man/tar)(1)
