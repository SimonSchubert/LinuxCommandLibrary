# TLDR

**Find unused includes** in a directory

```cppclean [path/to/source]```

**Check specific files**

```cppclean [file1.cpp] [file2.cpp]```

**Include additional paths**

```cppclean --include-path [/path/to/includes] [source/]```

# SYNOPSIS

**cppclean** [_options_] _paths..._

# PARAMETERS

**--include-path** _path_
> Additional include search paths.

**--exclude** _pattern_
> Exclude files matching pattern.

# DESCRIPTION

**cppclean** finds problems in C++ source that slow development and includes unnecessary headers. It detects unused #include directives, unused local variables, and other issues that increase compilation time.

This helps reduce build times by identifying headers that can be removed.

# CAVEATS

May report false positives for conditionally compiled code. Results should be verified before removing includes.

# SEE ALSO

[clang-tidy](/man/clang-tidy)(1), [include-what-you-use](/man/include-what-you-use)(1)
