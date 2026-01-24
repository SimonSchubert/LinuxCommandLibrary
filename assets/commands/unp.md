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

**unp** extracts any archive. It detects format automatically.

Format detection. Automatic handling.

Many formats. zip, tar, gz, bz2, etc.

Simple interface. One command for all.

Perl-based tool. Wrapper script.

# SUPPORTED FORMATS

tar, gz, bz2, xz, zip, rar, 7z, arj, lha, deb, rpm, cpio

# CAVEATS

Needs underlying tools. Perl required. Wrapper script.

# HISTORY

**unp** was created as a universal unpacking script that automatically detects and extracts various archive formats.

# SEE ALSO

[unar](/man/unar)(1), [atool](/man/atool)(1), [tar](/man/tar)(1), [unzip](/man/unzip)(1)
