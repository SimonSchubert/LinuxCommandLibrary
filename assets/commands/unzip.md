# TLDR

**Extract files** to current directory

```unzip [archive.zip]```

**Extract to specific directory**

```unzip [archive.zip] -d [/path/to/directory]```

**List contents** without extracting

```unzip -l [archive.zip]```

**Extract specific files**

```unzip [archive.zip] [file1.txt] [file2.txt]```

**Extract with pattern**

```unzip [archive.zip] "*.txt"```

**Extract quietly** (minimal output)

```unzip -q [archive.zip]```

**Extract and overwrite** existing files

```unzip -o [archive.zip]```

**Test archive integrity**

```unzip -t [archive.zip]```

**Extract preserving directory structure**

```unzip [archive.zip]```

# SYNOPSIS

**unzip** [_options_] _file_[.zip] [_file(s)_] [**-x** _xfile(s)_] [**-d** _exdir_]

# DESCRIPTION

**unzip** extracts files from ZIP archives. It handles archives created by zip, WinZip, PKZIP, and other ZIP-compatible programs. The tool supports various compression methods and can handle encrypted archives.

By default, unzip extracts all files to the current directory, preserving the directory structure stored in the archive. Individual files or patterns can be specified for selective extraction.

unzip is part of the InfoZip project and is the standard ZIP extraction tool on Unix-like systems.

# PARAMETERS

**-l**
> List archive contents.

**-v**
> Verbose listing with compression info.

**-t**
> Test archive integrity.

**-d** _dir_
> Extract to specified directory.

**-o**
> Overwrite existing files without prompt.

**-n**
> Never overwrite existing files.

**-q**
> Quiet mode.

**-qq**
> Very quiet mode.

**-j**
> Junk paths (don't make directories).

**-p**
> Extract to stdout (pipe).

**-P** _password_
> Use password for encrypted files.

**-x** _files_
> Exclude specified files.

**-C**
> Case-insensitive matching.

**-a**
> Convert text file line endings.

# CAVEATS

Password on command line is insecure (visible in process list). Large archives with many files may be slow to extract. Some ZIP features (ZIP64, certain compression methods) require recent versions. Symlinks in archives may pose security risks.

# HISTORY

**unzip** is part of **Info-ZIP**, a project started in **1989** to provide free ZIP utilities. The tools were created by **Mark Adler**, **Jean-loup Gailly**, **Greg Roelofs**, and others to provide open-source alternatives to PKWARE's PKZIP. Info-ZIP utilities became the standard ZIP tools on Unix systems.

# SEE ALSO

[zip](/man/zip)(1), [tar](/man/tar)(1), [gzip](/man/gzip)(1), [7z](/man/7z)(1)
