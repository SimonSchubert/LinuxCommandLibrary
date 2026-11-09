# TAGLINE

Generate compilation database for Sailfish projects

# TLDR

**Generate a compile_commands.json** for the current project

```sfdk compiledb```

Generate it for a specific **build target**

```sfdk -c target=[target] compiledb```

Pass **extra arguments** to make

```sfdk compiledb [-j4]```

# SYNOPSIS

**sfdk compiledb** [_make-extra-arg_...]

# DESCRIPTION

**sfdk compiledb** generates a **compile_commands.json** compilation database for IDE integration and tooling. This file is used by clang-based tools, language servers, and IDEs to understand build flags, include paths, and compiler invocations for each source file.

The command runs rpmbuild, executing only the **%build** section of the RPM spec file. Unless the top-level makefile defines a **compiledb** or **compile_commands.json** target, make is wrapped with the **compiledb** tool. Paths in the result are then mapped to locations that exist on the host. It is part of the **Sailfish SDK** (sfdk) toolchain.

# CAVEATS

Tools may need extra configuration to see target-specific system headers and macros. For example clangd needs **--query-driver** pointing at the SDK compilers under **~/.config/SailfishSDK/libsfdk/build-target-tools/**, plus the **BuiltinHeaders: QueryDriver** setting.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-make](/man/sfdk-make)(1), [sfdk-cmake](/man/sfdk-cmake)(1), [sfdk-qmake](/man/sfdk-qmake)(1), [sfdk-deploy](/man/sfdk-deploy)(1), [compiledb](/man/compiledb)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-09 -->
