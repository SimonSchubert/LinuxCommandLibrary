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

**:type**, **:t** _EXPR_
> Show expression type.

**:kind**, **:k** _TYPE_
> Show the kind of a type.

**:info** _NAME_
> Show info about name, including definition and instances.

**:browse** _MODULE_
> List identifiers exported by a module.

**:set** _OPTION_
> Set a GHCi or compiler option for the session.

**:main** _ARGS_
> Run the program's `main` with the given arguments.

**:quit**, **:q**
> Exit GHCi.

**-i** _DIR1:...:DIRn_
> Add directories to the source file search path.

**--help**
> Display help information.

# DESCRIPTION

**ghci** is the interactive environment for GHC (Glasgow Haskell Compiler). It provides a REPL for evaluating Haskell expressions, loading modules, and exploring types interactively.

GHCi supports all GHC language extensions and can compile modules on the fly. It provides introspection commands for examining types, kinds, and documentation. Tab completion and command history enhance usability.

# CONFIGURATION

**~/.ghci**
> Per-user startup file loaded when GHCi starts, containing default settings, imports, and custom commands.

**./.ghci**
> Project-local startup file loaded after the user file (must have safe permissions to be read).

# CAVEATS

Some compiled code may behave differently in interpreter. Memory usage can grow with large expressions. Restart clears interpreter state.

# HISTORY

GHCi was introduced with **GHC 5.0** in **2001**, providing interactive Haskell evaluation alongside the batch compiler.

# SEE ALSO

[ghc](/man/ghc)(1), [ghcid](/man/ghcid)(1), [cabal](/man/cabal)(1), [stack](/man/stack)(1), [runghc](/man/runghc)(1)
