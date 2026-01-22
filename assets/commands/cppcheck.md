# TLDR

**Check single file**

```cppcheck [file.cpp]```

**Check directory**

```cppcheck [src/]```

**Enable all checks**

```cppcheck --enable=all [file.cpp]```

**Enable specific checks**

```cppcheck --enable=warning,style [src/]```

**Check with C++ standard**

```cppcheck --std=c++17 [file.cpp]```

**Output to XML**

```cppcheck --xml [src/] 2> [report.xml]```

**Suppress specific warning**

```cppcheck --suppress=uninitvar [file.cpp]```

**Use multiple cores**

```cppcheck -j [4] [src/]```

# SYNOPSIS

**cppcheck** [_options_] _path_...

# DESCRIPTION

**cppcheck** performs static analysis on C/C++ source code. Detects bugs, undefined behavior, and dangerous coding patterns. Focuses on low false positive rate. Supports C++11 through C++20.

# PARAMETERS

**--enable**=_checks_
> Enable checks: all, warning, style, performance, portability, information, unusedFunction

**--std**=_standard_
> C/C++ standard: c89, c99, c11, c++03, c++11, c++14, c++17, c++20

**-j** _n_
> Use n threads

**--xml**
> Output as XML

**--suppress**=_id_
> Suppress warning type

**--suppressions-list**=_file_
> Suppress from file

**-I** _dir_
> Include directory

**-D** _name_
> Define preprocessor symbol

**--force**
> Check all configurations

**--inconclusive**
> Report uncertain results

**-q**, **--quiet**
> Suppress progress output

# CHECK TYPES

**error**: Bugs and undefined behavior
**warning**: Defensive coding issues
**style**: Code style issues
**performance**: Optimization suggestions
**portability**: Cross-platform issues

# CAVEATS

Cannot analyze included headers without proper include paths. Use with clang-tidy for comprehensive analysis.

# SEE ALSO

[clang-tidy](/man/clang-tidy)(1), [cpplint](/man/cpplint)(1), [gcc](/man/gcc)(1)
