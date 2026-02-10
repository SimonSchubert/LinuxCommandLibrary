# TAGLINE

archiver for creating and manipulating static library archives

# TLDR

**Create archive from object files**

```llvm-ar rcs [libname.a] [file1.o] [file2.o]```

**List archive contents**

```llvm-ar t [archive.a]```

**Extract files from archive**

```llvm-ar x [archive.a]```

**Add files to archive**

```llvm-ar r [archive.a] [file.o]```

**Delete file from archive**

```llvm-ar d [archive.a] [file.o]```

# SYNOPSIS

**llvm-ar** [_options_] _operation_ _archive_ [_files_...]

# PARAMETERS

**r**
> Replace or add files to archive.

**c**
> Create archive without warning.

**s**
> Create archive index.

**t**
> List archive contents.

**x**
> Extract files from archive.

**d**
> Delete files from archive.

**--format** _type_
> Archive format (gnu, darwin, bsd).

# DESCRIPTION

**llvm-ar** is the LLVM archiver for creating and manipulating static library archives. Drop-in replacement for GNU ar. Creates archives compatible with the system linker for static linking.

# SEE ALSO

[ar](/man/ar)(1), [llvm-ranlib](/man/llvm-ranlib)(1)

