# TLDR

Display **suggestions** for a Haskell file

```hlint [path/to/file.hs]```

Check all Haskell files and generate a **report**

```hlint [path/to/directory] -r```

**Automatically apply** most suggestions

```hlint [path/to/file.hs] --refactor```

Display additional **refactor options**

```hlint [path/to/file.hs] --refactor-options```

Generate a **settings file** ignoring all current hints

```hlint [path/to/file.hs] --default > .hlint.yaml```

# SYNOPSIS

**hlint** [_options_] [_files_]

# PARAMETERS

**-r**, **--report**
> Generate an HTML report of suggestions

**--refactor**
> Automatically apply suggestions using refactor tool

**--refactor-options**
> Display available refactoring options

**--default**
> Generate default configuration ignoring current hints

**-h**, **--hint** _FILE_
> Use hints from specified file

**--ignore** _HINT_
> Ignore a specific hint

# DESCRIPTION

**hlint** is a tool for suggesting improvements to Haskell source code. It analyzes code and provides suggestions for simplification, redundancy removal, and style improvements based on common Haskell idioms.

Suggestions include simplifying expressions, removing unnecessary extensions, applying standard library functions, and following best practices. The tool can automatically apply many of its suggestions through the refactor mode.

Configuration files (.hlint.yaml) allow customizing which hints to apply or ignore on a per-project basis.

# CAVEATS

Not all suggestions are appropriate for every codebase. Some hints may conflict with specific coding standards or performance requirements. Always review automated refactoring changes before committing.

# HISTORY

hlint was created by Neil Mitchell and first released around **2006**. It has become a standard tool in the Haskell ecosystem for maintaining code quality and is commonly integrated into CI pipelines and editor plugins.

# SEE ALSO

[ghc](/man/ghc)(1), [cabal](/man/cabal)(1), [stack](/man/stack)(1)
