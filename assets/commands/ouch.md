# TLDR

**Compress files**

```ouch compress [file1] [file2] [archive.tar.gz]```

**Decompress archive**

```ouch decompress [archive.zip]```

**List archive contents**

```ouch list [archive.tar.gz]```

**Decompress to directory**

```ouch decompress [archive.zip] -d [output/]```

# SYNOPSIS

**ouch** [_command_] [_options_] _files_

# PARAMETERS

**compress** _FILES_ _ARCHIVE_
> Create archive.

**decompress** _ARCHIVE_
> Extract archive.

**list** _ARCHIVE_
> List contents.

**-d** _DIR_
> Output directory.

**-y**
> Yes to all prompts.

**--help**
> Display help information.

# DESCRIPTION

**ouch** compresses and decompresses archives. Smart format detection.

The tool handles multiple archive formats. Rust-based compression utility.

ouch manages archive files.

# CAVEATS

Format detected by extension. Written in Rust. Supports many formats.

# HISTORY

ouch was created as a **user-friendly compression** tool with smart format detection.

# SEE ALSO

[tar](/man/tar)(1), [zip](/man/zip)(1), [7z](/man/7z)(1)

