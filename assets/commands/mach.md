# TAGLINE

Compiler and build tool for the Mach systems language

# TLDR

**Scaffold a new** project

```mach init [project_name]```

**Build** the project

```mach build```

**Build and run** the produced binary

```mach run```

**Build and run** the project's tests

```mach test```

**Build an optimized** release binary

```mach build --release```

**Manage git-backed** dependencies

```mach dep [subcommand]```

# SYNOPSIS

**mach** _command_ [_options_]

# DESCRIPTION

**mach** is the command-line driver for the Mach programming language, a statically typed, compiled systems language with manual memory management and no hidden control flow. A single self-contained binary handles the whole workflow: it compiles and links projects, runs tests, vendors dependencies, generates documentation, and cross-compiles to other targets.

The compiler is self-hosted (written in Mach) and does not depend on LLVM. Build-related subcommands share a common configuration parser, so global flags such as **--target**, **--profile**, and **--release** apply consistently across building, running, testing, and documenting.

# COMMANDS

**build**
> Compile the project to object files and, for a binary target, a linked executable.

**run**
> Build the project, then execute the produced binary.

**test**
> Build the test binary and run the collected tests.

**dep**
> Manage git-backed dependencies (clone, lock, vendor).

**init**
> Scaffold a new project.

**doc**
> Generate Markdown reference documentation from source doc-comments.

**info**
> Print the compiler version, build host, and registered target capabilities.

**help**
> Display usage information for a command.

# PARAMETERS

**--release**, **-O0**, **-O1**, **-O2**
> Select the optimization level for the build.

**--target** _TRIPLE_
> Cross-compile for the given target.

**--profile** _NAME_
> Select a named build profile.

**--bin** _NAME_, **--lib**
> Choose the binary or library artifact to act on.

**-o** _PATH_
> Write output to _PATH_.

**--emit-asm**, **--emit-ir**
> Emit assembly or intermediate representation instead of (or alongside) the normal output.

**-L** _PATH_, **-l** _NAME_
> Add a library search path or link against a named library.

**--verbose**, **--quiet**
> Increase or decrease the amount of output.

# CAVEATS

Mach is a young language under active development; the standard library is intentionally minimal ("batteries not included") and the syntax and tooling may change between releases. Memory is managed manually with explicit allocator passing.

# HISTORY

**mach** ships as part of the Mach language project, which provides a self-hosted compiler with no LLVM dependency. It is installed as a single binary, typically via the install script at machlang.org.

# SEE ALSO

[zig](/man/zig)(1), [rustc](/man/rustc)(1), [cargo](/man/cargo)(1), [clang](/man/clang)(1), [tcc](/man/tcc)(1)

# RESOURCES

```[Source code](https://github.com/octalide/mach)```

```[Homepage](https://machlang.org)```

<!-- verified: 2026-06-14 -->
