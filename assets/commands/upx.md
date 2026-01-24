# TLDR

**Compress executable**

```upx [program]```

**Compress with best ratio**

```upx --best [program]```

**Compress with fastest speed**

```upx -1 [program]```

**Decompress executable**

```upx -d [program]```

**Test compressed file**

```upx -t [program]```

**List compression info**

```upx -l [program]```

**Keep backup**

```upx -k [program]```

**Compress quietly**

```upx -q [program]```

# SYNOPSIS

**upx** [_-d_] [_-t_] [_-l_] [_--best_] [_-1..-9_] [_options_] _files_

# PARAMETERS

**-1** to **-9**
> Compression level (1=fast, 9=best).

**--best**
> Best compression.

**--brute**
> Try all methods (slow).

**-d**
> Decompress.

**-t**
> Test integrity.

**-l**
> List compression info.

**-k**
> Keep backup file.

**-o** _FILE_
> Output to file.

**-f**
> Force compression.

**-q**
> Quiet mode.

**-v**
> Verbose mode.

**--no-backup**
> Don't create backup.

# DESCRIPTION

**upx** (Ultimate Packer for eXecutables) compresses executables. Compressed programs decompress in memory when run.

Compression reduces file size significantly, often 50-70% for binaries. This saves disk space and download bandwidth.

The compressed executable is self-extracting. It decompresses to memory at load time without user intervention.

Multiple executable formats are supported: Linux ELF, Windows PE, macOS Mach-O, and others.

Decompression is fast with minimal runtime overhead. The original executable behavior is preserved exactly.

Testing verifies compressed files are valid. This catches corruption before deployment.

# CAVEATS

Some security tools flag UPX-compressed files. Code signing may be invalidated. Slight startup overhead from decompression. Some formats not supported.

# HISTORY

**UPX** was created by **Markus Oberhumer** and **László Molnár** in **1996**. It became the standard tool for executable compression, widely used for software distribution.

# SEE ALSO

[strip](/man/strip)(1), [gzip](/man/gzip)(1), [objcopy](/man/objcopy)(1)
