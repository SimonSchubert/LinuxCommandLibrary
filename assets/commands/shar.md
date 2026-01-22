# TLDR

Create a **basic shell archive**

```shar -V [path/to/file1] [path/to/file2] > [archive.sh]```

Create archive with **compression**

```shar -C xz [path/to/file1] [path/to/file2] > [archive.sh]```

Treat all files as **binary** (uuencode everything)

```shar -B [path/to/file1] [path/to/file2] > [archive.sh]```

Treat all files as **text**

```shar -T [path/to/file1] [path/to/file2] > [archive.sh]```

Include **archive name** and cut mark

```shar -n "My Archive" -c [path/to/file1] > [archive.sh]```

**Split** archive into multiple parts

```shar -L 100K [path/to/file1] [path/to/file2] -o [archive]```

# SYNOPSIS

**shar** [_OPTIONS_] [_file_...]

# PARAMETERS

**-V, --vanilla-operation**
> Create minimal archives using only echo, test, sed

**-B, --uuencode**
> Force uuencoding of all files (treat as binary)

**-T, --text-files**
> Treat all input files as text

**-M, --mixed-uuencode**
> Auto-detect binary vs text files (default)

**-C, --compactor** _program_
> Compress files using gzip, bzip2, xz, or compress

**-g, --level-of-compression** _num_
> Compression level 1-9 (default: 9)

**-o, --output-prefix** _str_
> Save to numbered files (prefix.01, prefix.02, etc.)

**-L, --split-size-limit** _num_
> Split archives to specified size

**-n, --archive-name** _str_
> Document archive with name in headers

**-c, --cut-mark**
> Start output with cut line

**-a, --net-headers**
> Add Submitted-by and Archive-name headers

**-x, --no-check-existing**
> Overwrite files without prompting on extraction

**-m, --no-timestamp**
> Skip restoration of file modification times

**-q, --quiet**
> Suppress progress messages

**-h, --help**
> Display usage information

# DESCRIPTION

**shar** (shell archive) creates self-extracting archive files that can be unpacked by running them through **/bin/sh**. The archive is a plain text shell script containing the encoded file data, making it suitable for transmission via email or posting to text-based systems.

Archives can contain multiple files and directories, with options for compression, binary encoding via uuencode, and splitting into multiple parts for size-limited transmission. To extract, run the archive with **sh archive.sh** or make it executable and run directly.

# CAVEATS

Shell archives execute shell commands during extraction, posing security risks with untrusted sources. Always inspect shar files before running. Large binary files significantly increase archive size even with uuencoding. Modern alternatives like tar with compression are generally preferred for file distribution.

# HISTORY

The **shar** format originated in the early **1980s** Unix community as a way to distribute source code via Usenet and email before binary attachments were common. GNU sharutils, containing **shar** and **unshar**, was developed as part of the GNU project. While largely superseded by modern archive formats, shar remains useful for distributing small text-based packages.

# SEE ALSO

[unshar](/man/unshar)(1), [tar](/man/tar)(1), [uuencode](/man/uuencode)(1), [uudecode](/man/uudecode)(1)
