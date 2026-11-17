# TAGLINE

Interactive C++ interpreter from the LLVM Clang project

# TLDR

Start the **REPL**

```clang-repl```

Load a **source file** by including it

```clang-repl '#include "[test.cpp]"'```

Run **statements** passed as arguments

```clang-repl '#include <iostream>' 'std::cout << "test\n";'```

At the prompt, **print** a value

```24```

**Undo** the last statement

```%undo```

**Link** a shared library

```%lib [library.so.1]```

**Leave** the session

```%quit```

Show **meta-command help**

```%help```

# SYNOPSIS

**clang-repl** [_statements_]...

# DESCRIPTION

**clang-repl** is LLVM's interactive C++ interpreter. It reads statements, compiles them with Clang, and prints results. A statement can be given on the command line or typed at the prompt. To bring in a file, pass a quoted include of that path.

Lines that start with **%** are meta-commands, not C++. **%undo** drops the last statement, **%lib** loads a dynamic library, **%help** lists the meta-commands, and **%quit** exits. Ctrl-C also leaves the session.

This is its own program. It is not a subcommand of **clang**, though it ships with the same LLVM/Clang toolchain.

# CAVEATS

Code typed at the prompt runs with the privileges of the process, and it can load libraries from disk. Treat the session like a compiler, not a sandbox.

# INSTALL

```apk: sudo apk add clang22-extra-tools```

<!-- packages: 2026-11-17 -->

# SEE ALSO

[clang](/man/clang)(1), [clang++](/man/clang++)(1), [clangd](/man/clangd)(1)

# RESOURCES

```[Source code](https://github.com/llvm/llvm-project)```

```[Homepage](https://clang.llvm.org/)```

```[Documentation](https://clang.llvm.org/docs/ClangRepl.html)```

<!-- verified: 2026-11-17 -->
