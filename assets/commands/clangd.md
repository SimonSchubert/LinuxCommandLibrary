# TAGLINE

C/C++ language server for IDE features

# TLDR

**Start clangd** language server

```clangd```

**Start with specific compile commands database**

```clangd --compile-commands-dir=[/path/to/build]```

**Enable more inlay hints**

```clangd --inlay-hints```

**Start with background indexing**

```clangd --background-index```

**Limit memory usage**

```clangd --malloc-trim --pch-storage=memory```

**Enable verbose logging**

```clangd --log=verbose```

**Check version**

```clangd --version```

# SYNOPSIS

**clangd** [_options_]

# DESCRIPTION

**clangd** is a C/C++/Objective-C language server that provides IDE features like code completion, diagnostics, go-to-definition, and refactoring for editors supporting the Language Server Protocol (LSP).

It uses the clang compiler frontend for parsing and understanding code, providing accurate results based on real compilation. clangd reads compile_commands.json or compile_flags.txt to understand project build settings.

The server communicates over stdin/stdout using JSON-RPC, making it compatible with VS Code, Vim, Emacs, Sublime Text, and other LSP-capable editors.

# PARAMETERS

**--compile-commands-dir=** _dir_
> Directory containing compile_commands.json.

**--background-index**
> Build an index in the background.

**--clang-tidy**
> Enable clang-tidy diagnostics.

**--completion-style=** _style_
> Style of completion (detailed, bundled).

**--header-insertion=** _mode_
> Auto-include headers (iwyu, never).

**--inlay-hints**
> Enable inlay hints.

**--log=** _level_
> Log level (error, info, verbose).

**--pch-storage=** _type_
> PCH storage (disk, memory).

**--query-driver=** _paths_
> Allow system includes from compilers.

**-j** _threads_
> Number of worker threads.

**--enable-config**
> Enable .clangd configuration files.

**--version**
> Display version information.

# CONFIGURATION

**.clangd**
> Project-level configuration for compiler flags, diagnostics, and completion behavior.

**compile_commands.json**
> Build system-generated compilation database for accurate project analysis.

**compile_flags.txt**
> Simple per-line compiler flags as an alternative to compile_commands.json.

# CAVEATS

Requires compile_commands.json or compile_flags.txt for accurate analysis. Initial indexing can be slow for large projects. Memory usage scales with project size. Some features require recent clangd versions. May not find system headers without proper configuration.

# HISTORY

**clangd** was developed as part of the **LLVM/Clang project** starting around **2017** to provide a modern language server for C-family languages. It replaced earlier tools like libclang-based completers. The project has seen rapid development, with features like semantic highlighting, inlay hints, and improved indexing added over time. It's now considered one of the most capable C++ language servers.

# SEE ALSO

[clang](/man/clang)(1), [clang-format](/man/clang-format)(1), [clang-tidy](/man/clang-tidy)(1), [ccls](/man/ccls)(1)
