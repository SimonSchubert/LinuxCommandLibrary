# TAGLINE

Manage archives in various formats with a unified interface

# TLDR

**Extract an archive (auto-detects format)**

```atool -x [archive.tar.gz]```

**List archive contents**

```atool -l [archive.zip]```

**Create an archive from files or directories**

```atool -a [output.tar.gz] [file1] [file2]```

**Extract into a specific directory**

```atool -X [/path/to/dir] [archive.zip]```

**Extract each archive in the current directory**

```atool -e -x *.zip```

**Print a file from an archive to standard output**

```atool -c [archive.tar.gz] [path/inside/archive]```

**Show the diff between two archives**

```atool -d [old.tar.gz] [new.tar.gz]```

# SYNOPSIS

**atool** [_-lxacdX_] [_options_] _archive_ [_files_...]

# PARAMETERS

**-l**, **--list**
> List the contents of an archive.

**-x**, **--extract**
> Extract files from an archive. By default a unique subdirectory is created if the archive is not already tidy.

**-X** _PATH_, **--extract-to=**_PATH_
> Extract the archive into the given directory.

**-a**, **--add**
> Create a new archive from the supplied files. The archive format is inferred from the output file's extension.

**-c**, **--cat**
> Extract a single file from the archive to standard output.

**-d**, **--diff**
> Extract two archives and run **diff**(1) on their contents.

**-e**, **--each**
> Perform the requested action on each of the remaining arguments individually (useful for batch extraction).

**-F** _EXT_, **--format=**_EXT_
> Override automatic format detection.

**-O** _OPT_, **--format-option=**_OPT_
> Pass an extra option to the underlying archiver (for example `-O-mx=9` to set 7z compression level).

**-D**, **--subdir**
> Always create a subdirectory when extracting, even if the archive already contains a top-level directory.

**-f**, **--force**
> Overwrite existing files or archives without asking.

**-S**, **--simulate**
> Show what would be done without modifying the filesystem.

**-E**, **--explain**
> Print the underlying commands that atool runs.

**-p**, **--page**
> Pipe output through a pager.

**-q**, **--quiet**
> Decrease verbosity.

**-v**, **--verbose**
> Increase verbosity.

**-o** _KEY=VAL_, **--option=**_KEY=VAL_
> Override a configuration setting on the command line.

**--config=**_FILE_
> Load a non-default configuration file.

# RELATED COMMANDS

**aunpack** _archive_
> Shortcut for `atool -x`; also cleans up if the archive is untidy.

**apack** _archive_ _files..._
> Shortcut for `atool -a`.

**als** _archive_
> Shortcut for `atool -l`.

**acat** _archive_ _file_
> Shortcut for `atool -c`.

**adiff** _archive1_ _archive2_
> Shortcut for `atool -d`.

**arepack** _old_ _new_
> Convert one archive format to another in a single step.

# SUPPORTED FORMATS

- tar (plain, gzip, bzip2, xz, lzma, zstd, compress)
- zip, jar, war
- rar, 7z, lzh, arj, arc
- ar, cpio, shar
- deb, rpm (for listing/extraction via backend tools)

# CONFIGURATION

**~/.atoolrc**
> Per-user configuration file that sets defaults and format preferences.

**/etc/atoolrc**
> System-wide configuration file.

# CAVEATS

Requires the appropriate backend tools to be installed (tar, unzip, unrar, 7z, zstd, ...); atool only orchestrates them. Archive format detection is primarily based on file extension, so **-F** may be needed when extensions are missing or misleading.

# HISTORY

**atool** is written in Perl by **Oskar Liljeblad** and is distributed by the GNU project (nongnu.org/atool). It was created to provide a unified front end for the large number of archive formats found on Unix systems.

# SEE ALSO

[tar](/man/tar)(1), [unzip](/man/unzip)(1), [7z](/man/7z)(1), [unrar](/man/unrar)(1), [unar](/man/unar)(1), [zip](/man/zip)(1), [gzip](/man/gzip)(1), [bzip2](/man/bzip2)(1), [xz](/man/xz)(1), [zstd](/man/zstd)(1)
