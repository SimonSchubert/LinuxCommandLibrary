# TAGLINE

Generate compilation database for Sailfish projects

# TLDR

**Generate a compile_commands.json** for the current project

```sfdk compiledb```

**Generate compilation database** after a clean build

```sfdk build && sfdk compiledb```

# SYNOPSIS

**sfdk compiledb** [_options_]

# DESCRIPTION

**sfdk compiledb** generates a **compile_commands.json** compilation database for IDE integration and tooling. This file is used by clang-based tools, language servers, and IDEs to understand build flags, include paths, and compiler invocations for each source file.

The command must be run after a successful build so that build logs are available to extract compilation commands from. It is part of the **Sailfish SDK** (sfdk) toolchain.

# CAVEATS

Requires a prior successful build to extract compilation commands. The generated database reflects the last build configuration only.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-cmake](/man/sfdk-cmake)(1), [sfdk-qmake](/man/sfdk-qmake)(1), [sfdk-deploy](/man/sfdk-deploy)(1)

