# TAGLINE

Shell frontend for uncompressing/unpacking tools

# TLDR

**Extract archive**

```unp [archive.tar.gz]```

**Extract multiple** archives

```unp [file1.zip] [file2.tar.bz2]```

**Extract into** a subdirectory named after the archive

```unp -u [archive.zip]```

**Simulate extraction** without writing files

```unp -n [archive.tar.gz]```

**Force extraction** even if checks fail or directory collision occurs

```unp -f [archive.zip]```

**Show supported** formats

```unp -s```

**Pass options** to the backend tool

```unp [archive.tar.gz] -- [-C] [/tmp]```

# SYNOPSIS

**unp** [_OPTION_]... [_FILE_]... [**--** _TOOL-OPTION_...]

# PARAMETERS

**-f**
> Continue even if program availability checks fail or directory collision occurs.

**-u**
> Extract into a subdirectory named after the archive. For Debian packages, extracts data.tar.gz and control.tar.gz separately.

**-U**
> Smart mode: acts like -u if archive contains multiple elements, but places a single file/directory element in the current directory.

**-s**
> Show the list of supported formats.

**-n**, **--dry-run**
> Display the calculated commands without running them.

**-v**
> Increase output verbosity.

**--**
> Pass subsequent arguments to the backend tool (e.g., tar options).

# DESCRIPTION

**unp** is a shell frontend for various uncompressing and unpacking tools. It automatically detects the format of an archive and calls the appropriate decompression program. Instead of remembering different commands for tar, gzip, bzip2, zip, rar, 7z, and dozens of other formats, users can simply run unp on any archive file.

By default, unp extracts to the current directory. It can optionally create a subdirectory for the extracted contents to prevent cluttering the working directory. Arguments after **--** are passed to the underlying extraction tool.

# SUPPORTED FORMATS

tar, gz, bz2, xz, zip, rar, 7z, arj, lha, deb, rpm, cpio

# CAVEATS

Requires the underlying extraction tools to be installed for each format. The **-n** dry-run output should be examined carefully, as malicious filenames in archives could be dangerous if pasted into a shell.

# HISTORY

**unp** was created as a universal unpacking script that automatically detects and extracts various archive formats.

# SEE ALSO

[unar](/man/unar)(1), [atool](/man/atool)(1), [tar](/man/tar)(1), [unzip](/man/unzip)(1)
