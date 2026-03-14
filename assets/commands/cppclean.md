# TAGLINE

C++ unused code and header finder

# TLDR

**Find problems** in a directory

```cppclean [path/to/source]```

**Check specific files**

```cppclean [file1.cpp] [file2.cpp]```

**Include additional header search paths**

```cppclean --include-path [/path/to/includes] [source/]```

**Run with verbose output**

```cppclean --verbose [path/to/source]```

**Suppress output messages**

```cppclean --quiet [path/to/source]```

# SYNOPSIS

**cppclean** [_options_] _paths..._

# DESCRIPTION

**cppclean** finds problems in C++ source that slow development in large code bases, including various forms of unused code. It detects unnecessary #include directives in header files, unused forward declarations, functions declared but not defined, and classes with virtual methods but no virtual destructor.

The tool identifies which headers can be safely removed, reducing compilation dependencies and speeding up incremental builds. It also detects inconsistent casing in #include paths (e.g., `foo.h` vs `Foo.h`) and global/static data that may cause problems with threads.

# PARAMETERS

**--include-path** _path_
> Additional include search path (like gcc -I). Can be specified multiple times. Not recursive.

**--verbose**
> Enable verbose output for debugging.

**--quiet**
> Suppress output messages.

# CAVEATS

May report false positives for conditionally compiled code (e.g., `#ifdef` blocks). Results should be verified before removing includes. Detection of unnecessary includes in source files (not headers) is limited.

# SEE ALSO

[clang-tidy](/man/clang-tidy)(1), [gcc](/man/gcc)(1), [cmake](/man/cmake)(1)
