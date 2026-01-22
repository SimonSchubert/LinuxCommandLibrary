# TLDR

**Determine file type**

```file [filename]```

**Check multiple files**

```file [file1] [file2] [file3]```

**Show MIME type**

```file --mime-type [filename]```

**Follow symlinks**

```file -L [symlink]```

**Read from stdin**

```cat [file] | file -```

# SYNOPSIS

**file** [_options_] _files_...

# PARAMETERS

_FILES_
> Files to identify.

**-b**, **--brief**
> Omit filename from output.

**-i**, **--mime**
> Output MIME type and encoding.

**--mime-type**
> Output MIME type only.

**-L**, **--dereference**
> Follow symlinks.

**-z**, **--uncompress**
> Look inside compressed files.

**-f** _FILE_
> Read filenames from file.

**--help**
> Display help information.

# DESCRIPTION

**file** determines file types by examining content rather than extensions. It uses magic number patterns and heuristics from a database to identify formats.

The tool recognizes thousands of file types including executables, archives, documents, images, and text encodings. It examines file headers and content patterns rather than trusting filename extensions.

file is essential for identifying unknown files and verifying file types in scripts.

# CAVEATS

May misidentify corrupted or unusual files. Custom formats may not be recognized. Magic database completeness varies.

# HISTORY

file dates back to **Unix Version 6** (1975). The magic file database approach was developed to identify the many file formats accumulating on Unix systems.

# SEE ALSO

[stat](/man/stat)(1), [hexdump](/man/hexdump)(1), [identify](/man/identify)(1)
