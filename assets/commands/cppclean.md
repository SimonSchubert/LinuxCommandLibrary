# TAGLINE

C++ unused header and code finder

# TLDR

**Find unused includes** in a directory

```cppclean [path/to/source]```

**Check specific files**

```cppclean [file1.cpp] [file2.cpp]```

**Include additional paths**

```cppclean --include-path [/path/to/includes] [source/]```

# SYNOPSIS

**cppclean** [_options_] _paths..._

# DESCRIPTION

**cppclean** finds problems in C++ source that slow development and increase compilation time. It detects unused #include directives, unnecessary headers, and other issues that bloat build times without contributing to functionality.

The tool analyzes code to identify which headers can be safely removed, reducing compilation dependencies and speeding up incremental builds. It also finds forward declarations that could replace full includes, further optimizing compile times.

By cleaning up unused includes and identifying unnecessary dependencies, cppclean helps maintain lean, efficient C++ codebases and improves developer productivity through faster build cycles.

# PARAMETERS

**--include-path** _path_
> Additional include search paths.

**--exclude** _pattern_
> Exclude files matching pattern.

# CAVEATS

May report false positives for conditionally compiled code. Results should be verified before removing includes.

# SEE ALSO

[clang-tidy](/man/clang-tidy)(1), [include-what-you-use](/man/include-what-you-use)(1)
