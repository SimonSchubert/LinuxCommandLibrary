# TLDR

**Generate compilation database** from make

```compiledb make```

**Generate from make dry-run**

```compiledb -n make```

**Parse existing build log**

```compiledb --parse [build.log]```

**Output to specific file**

```compiledb -o [compile_commands.json] make```

**Exclude specific paths**

```compiledb --exclude [/path/to/exclude] make```

# SYNOPSIS

**compiledb** [_options_] _command_ [_args_]

# DESCRIPTION

**compiledb** generates a compilation database (compile_commands.json) from build commands. This database is used by tools like clangd, clang-tidy, and IDEs for code intelligence and static analysis.

The tool intercepts or parses make command output, extracting compiler invocations with their flags and source files. It supports both running builds and parsing existing build logs.

# PARAMETERS

**-n**, **--no-build**
> Parse make output without actually building.

**-p**, **--parse** _file_
> Parse existing build log file.

**-o**, **--output** _file_
> Output file (default: compile_commands.json).

**--exclude** _path_
> Exclude paths from database.

**-f**, **--full-path**
> Use full paths for source files.

**--command-style**
> Use command string instead of arguments array.

**-S**, **--strict**
> Exit with error on parse failures.

# CAVEATS

Only captures commands from make output. May miss compiler calls not going through make. Complex build systems may need additional configuration. Does not work with all build systems.

# HISTORY

**compiledb** was created to bridge the gap between make-based builds and modern C/C++ tooling that requires compilation databases. It emerged as the clangd and clang-tidy ecosystem grew in popularity in the late **2010s**, providing a simpler alternative to cmake or bear for generating compile_commands.json.

# SEE ALSO

[make](/man/make)(1), [bear](/man/bear)(1), [cmake](/man/cmake)(1), [clangd](/man/clangd)(1)
