# TAGLINE

Compiler for the s-expression based Adscript language

# TLDR

**Compile** a file to an object file

```adscript -o [path/to/file.o] [path/to/input.adscript]```

Compile and link a **standalone executable**

```adscript -e -o [path/to/program] [path/to/input.adscript]```

Emit **LLVM IR** instead of native machine code

```adscript -l -o [path/to/file.ll] [path/to/input.adscript]```

**Cross-compile** for another architecture or operating system

```adscript -t [i386-linux-elf] -o [path/to/file.o] [path/to/input.adscript]```

Show the **version**

```adscript -v```

# SYNOPSIS

**adscript** [**-ehlv**] [**-o** _file_] [**-t** _target-triple_] _files_

# DESCRIPTION

**adscript** is the compiler for **Adscript**, a high-performance programming language based on **s-expressions** (Lisp-like syntax) that is compiled natively through **LLVM**.

By default the compiler produces an object file for the host platform. It can alternatively link a standalone executable, emit textual LLVM IR, or cross-compile for any target triple LLVM supports. Data literals use **adn** (Adscript Data Notation), a modified version of EDN.

# PARAMETERS

**-e**, **--executable**
> Generate an executable instead of an object file.

**-l**, **--llvm-ir**
> Emit LLVM IR instead of native code.

**-o**, **--output** _FILE_
> Specify the output file.

**-t**, **--target-triple** _TRIPLE_
> Target triple to compile for (e.g. i386-linux-elf).

**-h**, **--help**
> Print a short help text.

**-v**, **--version**
> Print information about the Adscript version.

# CAVEATS

Adscript is a small hobby project; the language specification is incomplete. Building the compiler requires **LLVM 12 or 13** specifically; newer LLVM versions are not supported. The upstream repository has seen no development since **2022**.

# SEE ALSO

[clang](/man/clang)(1), [llc](/man/llc)(1), [clojure](/man/clojure)(1)

# RESOURCES

```[Source code](https://github.com/Amplus2/Adscript)```

<!-- verified: 2026-11-23 -->
