# TLDR

**Create** archive from files

```ar rcs [archive.a] [file1.o] [file2.o]```

**List** archive contents

```ar t [archive.a]```

**Extract** all files

```ar x [archive.a]```

**Extract** specific file

```ar x [archive.a] [file.o]```

**Add** file to archive

```ar r [archive.a] [newfile.o]```

**Delete** file from archive

```ar d [archive.a] [file.o]```

# SYNOPSIS

**ar** [_-X32_64_] [_-_]_operation_[_modifiers_] _archive_ [_files_...]

# DESCRIPTION

**ar** creates, modifies, and extracts from archives. It's primarily used to create static libraries (.a files) from object files for use with the linker.

Archives contain multiple files with a table of contents for quick access. Unlike tar, ar is optimized for random access to individual members.

# PARAMETERS

**r**
> Insert (replace) files

**c**
> Create archive

**s**
> Create/update archive index (ranlib)

**t**
> Table of contents

**x**
> Extract files

**d**
> Delete files

**q**
> Quick append (no checking)

**v**
> Verbose output

**u**
> Update only newer files

# CAVEATS

Primarily used for static libraries. For general archiving, use tar instead. Archive index (s) is needed for linker to use the library. No compression.

# HISTORY

**ar** dates back to early Unix in the **1970s**. It predates tar and was originally a general-purpose archiver before becoming specialized for library creation.

# SEE ALSO

[ranlib](/man/ranlib)(1), [nm](/man/nm)(1), [tar](/man/tar)(1), [ld](/man/ld)(1)
