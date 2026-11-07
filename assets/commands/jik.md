# TAGLINE

Check, translate, build, and run Jik programs

# TLDR

Create a minimal project

```jik new [my-project]```

Run a source file (arguments after `--` go to the program)

```jik run [hello.jik] --cc [clang]```

Check types and regions **without** compiling

```jik check [hello.jik]```

Translate to C

```jik tran [hello.jik]```

Build an executable

```jik build [hello.jik] --release --out [hello]```

Print the compiler command and **do not** run it

```jik build [hello.jik] --preview```

Discover and run tests under the current directory

```jik test```

Show the resolved compiler and paths

```jik env```

# SYNOPSIS

**jik** _command_ [_arguments_] [**--**_option_ [_value_]...]

# PARAMETERS

**new** _directory_

> Create _directory_ with `src/` named after that directory, a README, and a `.gitignore`. The destination must not exist. Git is not initialized

**run** _file_ [_options_] [**--** _args_]

> Translate to C, compile, run, and delete the temporary build. Arguments after `--` are the program's, including empty strings and values that start with `-`

**check** _file_

> Syntax, types, and regions only. **--verbose** and **--dump-ast** are accepted. No C compiler is required

**tran** _file_

> Write C. **--out** sets the path (default: the source with `.jik` replaced by `.c`). **--embed-core** includes the support library. **--emit-source-loc** adds source comments. **--format-c** runs `clang-format` on the result

**build** _file_

> Translate and compile. **--out** is the executable (default: the source path without `.jik`, plus `.exe` on Windows). **--preview** prints the compiler command and writes nothing. **--release** compiles with `-O3`

**test** [_path_]

> Find test files under a directory: names that start with `test`, then an underscore, and end in `.jik`. The default directory is `.`. A path that is a `.jik` file may have any name. **--list** prints names and stops. **--emit-suite** _file_ writes a runner and stops. Those two flags cannot be combined and need no C compiler

**env**

> Print `key=value` lines: version, platform, root, library path, package path, include path, selected C compiler, its target, and Jik's compiler profile

**version**

> Print the Jik version

**help** [_topic_]

> Help for a command, a language topic, or a standard-library entry. **help topics** lists documentation keys

**--cc** _compiler_

> C compiler for **run**, **build**, and **test**. Else the JIK CC environment variable, else the first of `clang`, `gcc`, and `cc`

**--ccflags** _args_

> Extra arguments for that compiler

**--unsafe-no-bounds-checks**

> Disable runtime vector bounds checks

**--region-stats**, **--region-tree**

> After a run, print region statistics, or one row per region with nesting

**--dump-ast**

> Print the parsed syntax tree

**--verbose**

> Print pipeline status

# DESCRIPTION

**jik** is the compiler and runner for the Jik language. Command arguments come before options: `jik run hello.jik --cc clang`. **help** covers commands and the standard library (`jik help vector`, `jik help jik/string`).

**run** and **build** need a C compiler. **check**, **tran**, **test --list**, and **test --emit-suite** do not. Native directives in reachable modules (`@includedir`, `@libdir`, `@link`, `@copy`) are applied by **build** and **run**. `@platform` and `@profile` restrict those directives. Profile matching is checked before the host compiler runs. MSVC is not a native build profile.

Tests are top-level functions whose names start with the test prefix, taking one `jik/testing` suite argument and returning nothing. Discovery walks in relative-path order, skips linked directories, and does not follow imports out of the selected tree.

Package imports under `pkg/` resolve through the JIK PKG PATH environment variable.

# CAVEATS

**run** removes its temporary C and binary after the program exits. Use **build** when you need to keep the executable, and **tran** when you need the C.

**build --preview** and **test --list** do not prove the program links. **--release** is `-O3` only. It does not change Jik's safety checks unless you also pass **--unsafe-no-bounds-checks**.

On Windows the default **build** output adds `.exe`. Elsewhere the output is the source path with the `.jik` suffix removed.

# HISTORY

Jik is a language that compiles through C, with the CLI documented in the jik-lang/jik repository (`docs/cli.md`) and at jik-lang.org. The host compiler is clang, gcc, or cc. Windows and Linux are both targets.

# SEE ALSO

[gcc](/man/gcc)(1)

# RESOURCES

```[Source code](https://github.com/jik-lang/jik)```

```[Homepage](https://jik-lang.org)```

```[Documentation](https://github.com/jik-lang/jik/blob/main/docs/cli.md)```

<!-- verified: 2026-11-07 -->
