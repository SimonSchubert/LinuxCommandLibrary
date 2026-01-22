# TLDR

**Compile and run a file**

```zig run [file.zig]```

**Build a project**

```zig build```

**Compile to executable**

```zig build-exe [file.zig]```

**Compile to object file**

```zig build-obj [file.zig]```

**Format Zig code**

```zig fmt [file.zig]```

**Run tests**

```zig test [file.zig]```

**Start REPL (interactive mode)**

```zig repl```

# SYNOPSIS

**zig** [_command_] [_options_] [_arguments_]

# SUBCOMMANDS

**build**
> Build project using build.zig

**build-exe**
> Compile to executable

**build-lib**
> Compile to library

**build-obj**
> Compile to object file

**run**
> Compile and run immediately

**test**
> Run unit tests

**fmt**
> Format source code

**cc**
> Use Zig as a C compiler

**c++**
> Use Zig as a C++ compiler

**translate-c**
> Translate C code to Zig

**init-exe**
> Initialize executable project

**init-lib**
> Initialize library project

# PARAMETERS

**-O** _mode_
> Optimization mode (Debug, ReleaseSafe, ReleaseFast, ReleaseSmall)

**-target** _triple_
> Cross-compilation target

**-I** _dir_
> Add include directory

**-l** _lib_
> Link library

**-femit-asm**
> Output assembly

**-freference-trace**
> Show compile error reference traces

# DESCRIPTION

**Zig** is a systems programming language focused on safety, performance, and maintainability. The zig command is both a compiler and build system.

Key features include compile-time code execution (comptime), optional safety checks, C interoperability, and built-in cross-compilation to many targets without external toolchains.

Zig can also serve as a drop-in C/C++ compiler (**zig cc**, **zig c++**) with consistent cross-compilation capabilities, making it useful even for non-Zig projects.

The build system uses **build.zig** files written in Zig itself, providing full language power for build configuration.

# CAVEATS

Zig is still pre-1.0 and the language/standard library may change between versions.

Debug builds include runtime safety checks that catch bugs but have performance overhead.

Cross-compilation is powerful but target-specific system libraries may still be needed for some features.

# SEE ALSO

[gcc](/man/gcc)(1), [clang](/man/clang)(1), [rustc](/man/rustc)(1), [make](/man/make)(1)
