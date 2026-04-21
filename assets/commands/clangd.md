# TAGLINE

C/C++ language server for IDE features

# TLDR

**Start the language server (normally launched by an editor)**

```clangd```

**Use a specific compile_commands.json directory**

```clangd --compile-commands-dir=[/path/to/build]```

**Enable persistent background indexing and clang-tidy checks**

```clangd --background-index --clang-tidy```

**Reduce memory pressure on large projects**

```clangd --pch-storage=memory -j=[4]```

**Parse a single file outside the server loop to debug config**

```clangd --check=[src/main.cpp]```

**Enable verbose logging for troubleshooting**

```clangd --log=verbose --pretty```

**Check version**

```clangd --version```

# SYNOPSIS

**clangd** [_options_]

# DESCRIPTION

**clangd** is a C/C++/Objective-C language server that provides IDE features like code completion, diagnostics, go-to-definition, and refactoring for editors supporting the Language Server Protocol (LSP).

It uses the clang compiler frontend for parsing and understanding code, providing accurate results based on real compilation. clangd reads compile_commands.json or compile_flags.txt to understand project build settings.

The server communicates over stdin/stdout using JSON-RPC, making it compatible with VS Code, Vim, Emacs, Sublime Text, and other LSP-capable editors.

# PARAMETERS

**--compile-commands-dir=** _DIR_
> Look for compile_commands.json in _DIR_ instead of the source tree.

**--background-index**
> Index project sources in the background and persist the index on disk for faster startup.

**--clang-tidy**
> Run clang-tidy checks as part of diagnostics.

**--completion-style=** _STYLE_
> Granularity of completion items: `detailed` (one per overload) or `bundled` (grouped).

**--header-insertion=** _MODE_
> Auto-include headers on completion: `iwyu` (include-what-you-use) or `never`.

**--all-scopes-completion**
> Suggest symbols from namespaces not currently in scope, inserting qualifiers as needed.

**--fallback-style=** _STYLE_
> clang-format style applied when no .clang-format file is found (e.g. `LLVM`, `Google`).

**--log=** _LEVEL_
> Log verbosity on stderr: `error`, `info`, or `verbose`.

**--pretty**
> Pretty-print JSON-RPC output (useful with --log for debugging).

**--pch-storage=** _TYPE_
> Store precompiled headers on `disk` (default, low memory) or in `memory` (faster).

**--query-driver=** _GLOBS_
> Comma-separated globs of compiler binaries clangd may execute to detect system include paths.

**-j** _N_
> Number of async worker threads (also used for background indexing).

**--limit-results=** _N_
> Cap the number of results returned per request (default 100; 0 = unlimited).

**--limit-references=** _N_
> Cap the number of references returned (default 1000; 0 = unlimited).

**--offset-encoding=** _ENC_
> Force position encoding: `utf-8`, `utf-16`, or `utf-32`.

**--enable-config**
> Read user and project configuration from `.clangd` and `clangd/config.yaml` YAML files.

**--check** [= _FILE_ ]
> Parse a single file in isolation instead of running as a server; useful for reproducing crashes or diagnosing setup.

**--version**
> Display version information.

**--help**
> Display available options (use `--help-hidden` to include experimental flags).

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

[clang](/man/clang)(1), [clang-format](/man/clang-format)(1), [clang-tidy](/man/clang-tidy)(1)
