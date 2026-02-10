# TAGLINE

manages PHP Archive files, which bundle PHP applications into single

# TLDR

**Add** files to a PHAR archive

```phar add -f [path/to/archive.phar] [files...]```

**List** contents of archive

```phar list -f [path/to/archive.phar]```

**Delete** file from archive

```phar delete -f [path/to/archive.phar] -e [file]```

**Compress** archive contents

```phar compress -f [path/to/archive.phar] -c [gzip|bzip2]```

**Get info** about archive

```phar info -f [path/to/archive.phar]```

**Sign** with hash algorithm

```phar sign -f [path/to/archive.phar] -h [sha256|sha512]```

Display **help**

```phar help```

# SYNOPSIS

**phar** _command_ [**-f** _archive_] [_options_] [_files_...]

# COMMANDS

**add**
> Add files or directories to archive

**list**
> List contents of archive

**delete**
> Remove files from archive

**compress**
> Compress archive contents

**info**
> Display archive information

**sign**
> Sign archive with hash or key

**extract**
> Extract archive contents

# PARAMETERS

**-f _archive_**
> PHAR archive file to operate on

**-c _algorithm_**
> Compression algorithm (gzip, bzip2)

**-h _algorithm_**
> Hash algorithm for signing

**-y _keyfile_**
> Private key file for OpenSSL signing

**-e _entry_**
> Specific entry within archive

# DESCRIPTION

**phar** manages PHP Archive (PHAR) files, which bundle PHP applications into single distributable files. PHAR files can include PHP code, assets, and metadata, and can be executed directly by PHP.

The tool supports creating, modifying, extracting, and signing PHAR archives. Signing ensures archive integrity and authenticity using hash algorithms or OpenSSL keys.

# CAVEATS

Requires phar.readonly=0 in php.ini for write operations. OpenSSL signing requires the OpenSSL extension. Large archives may consume significant memory during operations.

# HISTORY

**PHAR** (PHP Archive) was introduced in PHP 5.3 as a native way to distribute PHP applications. The phar command-line tool provides archive management capabilities outside of PHP scripts.

# SEE ALSO

[php](/man/php)(1), [composer](/man/composer)(1)
