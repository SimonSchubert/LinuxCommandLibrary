# TLDR

**Create 7z archive**

```7zr a [archive.7z] [files...]```

**Extract 7z archive**

```7zr x [archive.7z]```

**List archive contents**

```7zr l [archive.7z]```

**Test archive integrity**

```7zr t [archive.7z]```

**Create with maximum compression**

```7zr a -mx=9 [archive.7z] [files]```

# SYNOPSIS

**7zr** _command_ [_switches_] _archive_ [_files_...]

# COMMANDS

**a**
> Add files to archive

**x**
> Extract with full paths

**e**
> Extract (flat, no paths)

**l**
> List archive contents

**t**
> Test archive integrity

**d**
> Delete from archive

**u**
> Update archive

# PARAMETERS

**-o**_dir_
> Output directory

**-mx=**_n_
> Compression level (0-9)

**-r**
> Recurse subdirectories

**-y**
> Assume yes to queries

# DESCRIPTION

**7zr** is a minimal, reduced version of the 7-Zip command-line tool that only supports the 7z format. It's the lightest-weight option in the 7-Zip family.

7zr is ideal when:
- Only 7z format is needed
- Minimal dependencies are desired
- Embedding in scripts or systems with size constraints

The command syntax matches 7z and 7za. For 7z-only operations, 7zr provides the smallest footprint.

# CAVEATS

7zr only handles the 7z format. It cannot process ZIP, TAR, GZIP, or any other formats.

No encryption support in some builds.

The "r" stands for "reduced" - minimal format support, not recursive.

# SEE ALSO

[7z](/man/7z)(1), [7za](/man/7za)(1), [tar](/man/tar)(1)
