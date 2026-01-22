# TLDR

**Create** archive

```arc a [archive.arc] [files]```

**Extract** archive

```arc x [archive.arc]```

**List** archive contents

```arc l [archive.arc]```

**Test** archive integrity

```arc t [archive.arc]```

# SYNOPSIS

**arc** _command_ [_archive_] [_files_]

# DESCRIPTION

**arc** creates and manipulates archives in the old ARC format, popular in the MS-DOS era. It provides compatibility with legacy archive files from the 1980s.

The tool supports various compression methods used in historical ARC files.

# PARAMETERS

**a**
> Add files to archive

**x**
> Extract files

**e**
> Extract to current directory

**l**
> List contents

**t**
> Test archive

**d**
> Delete files from archive

**p**
> Print file contents

**v**
> View with details

# CAVEATS

The ARC format is obsolete; use modern formats like zip or tar.gz for new archives. Limited compression compared to modern algorithms. Mainly for legacy compatibility.

# HISTORY

The ARC format was created by System Enhancement Associates in **1985** and was one of the first popular file compression formats for personal computers.

# SEE ALSO

[unzip](/man/unzip)(1), [tar](/man/tar)(1), [gzip](/man/gzip)(1)
