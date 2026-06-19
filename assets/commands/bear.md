# TAGLINE

Generate compilation database for clang tooling

# TLDR

**Generate** compilation database

```bear -- make```

**Append** to existing database

```bear --append -- make clean all```

**Custom output** file

```bear --output [compile_commands.json] -- ninja```

# SYNOPSIS

**bear** [_options_] **--** _build-command_

# DESCRIPTION

**bear** (Build EAR) generates a compilation database (compile_commands.json) by intercepting compiler calls during a build. This database enables tools like clangd, clang-tidy, and IDEs to understand the project structure without custom configuration.

The tool works with any build system by recording actual compiler invocations. From version 3 onward, the build command must be separated from bear's own options by a `--`; older 2.4.x packages omit it.

# PARAMETERS

**-o** _file_, **--output** _file_
> Output file (default: compile_commands.json)

**-a**, **--append**
> Append results to an existing database instead of overwriting it

**-c** _file_, **--config** _file_
> Read settings (output formatting, compiler/source filters) from a configuration file

**-h**, **--help**
> Print help information

**-V**, **--version**
> Print version information

# WORKFLOW

```bash
# With Make
bear -- make

# With CMake/Ninja
bear -- ninja

# Clean build
bear -- make clean all

# Append incremental build
bear --append -- make module
```

# FEATURES

- Build system agnostic
- Intercepts compiler calls
- Supports parallel builds
- Works with make, ninja, etc.
- No build system modification needed

# COMPILATION DATABASE

Generated compile_commands.json format:
```json
[
  {
    "directory": "/path/to/project",
    "command": "gcc -c file.c -o file.o",
    "file": "file.c"
  }
]
```

# CAVEATS

Requires running full build. May not capture all compilation units if cached. Some build systems have native support (CMake: -DCMAKE_EXPORT_COMPILE_COMMANDS=ON). Different interception methods on different platforms.

# HISTORY

**bear** was created by László Nagy (rizsotto) around **2012** to generate compilation databases for C/C++ projects using any build system. Version 3 introduced the `--` separator syntax, and version 4 rewrote the tool in Rust.

# SEE ALSO

[compiledb](/man/compiledb)(1), [cmake](/man/cmake)(1), [clangd](/man/clangd)(1), [make](/man/make)(1), [ninja](/man/ninja)(1), [clang](/man/clang)(1)

# RESOURCES

```[Source code](https://github.com/rizsotto/Bear)```

```[Documentation](https://github.com/rizsotto/Bear/blob/master/README.md)```

<!-- verified: 2026-06-19 -->
