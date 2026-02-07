# TAGLINE

Interactive REPL environment for Haskell

# TLDR

**Start interactive session**

```ghci```

**Load a file**

```ghci [file.hs]```

**Load module in session**

```:load [file.hs]```

**Get type of expression**

```:type [expression]```

**Reload current module**

```:reload```

# SYNOPSIS

**ghci** [_options_] [_files_]

# PARAMETERS

_FILES_
> Haskell files to load.

**:load** _FILE_
> Load a module.

**:reload**
> Reload current modules.

**:type** _EXPR_
> Show expression type.

**:info** _NAME_
> Show info about name.

**:quit**
> Exit GHCi.

**-i** _DIR_
> Add to import path.

**--help**
> Display help information.

# DESCRIPTION

**ghci** is the interactive environment for GHC (Glasgow Haskell Compiler). It provides a REPL for evaluating Haskell expressions, loading modules, and exploring types interactively.

GHCi supports all GHC language extensions and can compile modules on the fly. It provides introspection commands for examining types, kinds, and documentation. Tab completion and command history enhance usability.

# CONFIGURATION

**~/.ghci**
> Startup file loaded when GHCi starts, containing default settings, imports, and custom commands.

# CAVEATS

Some compiled code may behave differently in interpreter. Memory usage can grow with large expressions. Restart clears interpreter state.

# HISTORY

GHCi was introduced with **GHC 5.0** in **2001**, providing interactive Haskell evaluation alongside the batch compiler.

# SEE ALSO

[ghc](/man/ghc)(1), [ghcid](/man/ghcid)(1), [cabal](/man/cabal)(1)
