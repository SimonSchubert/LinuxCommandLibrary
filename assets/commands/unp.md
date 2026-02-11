# TAGLINE

Universal archive extraction wrapper

# TLDR

**Extract archive**

```unp [archive.tar.gz]```

**Extract multiple**

```unp [file1.zip] [file2.tar.bz2]```

**Extract to directory**

```unp -d [dir] [archive.zip]```

**Force overwrite**

```unp -f [archive.zip]```

# SYNOPSIS

**unp** [_-d dir_] [_-f_] [_options_] _archives_

# PARAMETERS

**-d** _DIR_
> Extract directory.

**-f**
> Force overwrite.

**-u**
> Create subdirectory.

**-s**
> Simulate only.

# DESCRIPTION

**unp** is a universal archive extraction tool that automatically detects the format of an archive and calls the appropriate decompression program. Instead of remembering different commands for tar, gzip, bzip2, zip, rar, 7z, and dozens of other formats, users can simply run unp on any archive file.

The tool works as a Perl wrapper script that inspects file headers and extensions to determine the correct extraction method. It supports a wide range of formats including tar, gz, bz2, xz, zip, rar, 7z, arj, lha, deb, rpm, and cpio, delegating to the appropriate underlying tool for each format.

By default, unp extracts to the current directory. It can optionally create a subdirectory for the extracted contents to prevent cluttering the working directory, and supports simulation mode to preview what would be extracted without actually writing files.

# SUPPORTED FORMATS

tar, gz, bz2, xz, zip, rar, 7z, arj, lha, deb, rpm, cpio

# CAVEATS

Needs underlying tools. Perl required. Wrapper script.

# HISTORY

**unp** was created as a universal unpacking script that automatically detects and extracts various archive formats.

# SEE ALSO

[unar](/man/unar)(1), [atool](/man/atool)(1), [tar](/man/tar)(1), [unzip](/man/unzip)(1)
