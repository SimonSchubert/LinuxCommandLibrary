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

The tool works with any build system by recording actual compiler invocations.

# PARAMETERS

**--append**, **-a**
> Append to existing compilation database

**--output** _file_, **-o** _file_
> Output file (default: compile_commands.json)

**--force-preload**
> Force library preload method

**--force-wrapper**
> Force compiler wrapper method

**--verbose**, **-v**
> Verbose output

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

**bear** was created by László Nagy around **2012** to generate compilation databases for C/C++ projects using any build system.

# SEE ALSO

[compiledb](/man/compiledb)(1), [cmake](/man/cmake)(1), [clangd](/man/clangd)(1)
