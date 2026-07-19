# TAGLINE

tool for suggesting improvements to Haskell source code

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

Run using **all available processors**

```hlint [path/to/directory] -j```

**Ignore a specific hint**

```hlint [path/to/file.hs] --ignore="Use camelCase"```

Output suggestions as **JSON**

```hlint [path/to/file.hs] --json```

# SYNOPSIS

**hlint** [_options_] [_files_]

# PARAMETERS

**-r**, **--report**[**=**_FILE_]
> Generate an HTML report of suggestions (default: report.html)

**--refactor**
> Automatically apply suggestions, using the `refactor` tool from apply-refact

**--refactor-options** _OPTIONS_
> Pass extra options to the `refactor` executable

**-d**, **--default**
> Print a default .hlint.yaml, ignoring all hints currently triggered, to stdout

**-h**, **--hint** _FILE_
> Use hints from the specified file

**-i**, **--ignore** _HINT_
> Ignore a specific hint

**-s**, **--show**
> Show all hints, including those normally skipped

**-j**[_N_], **--threads**[**=**_N_]
> Run on N processors (default: 1; -j alone uses all physical cores)

**-c**, **--colour**, **--color**[**=**_always|never|auto_]
> Control colored output

**--json**
> Output hint data as JSON

**--sarif**
> Output hint data as SARIF

**-f**, **--find** _FILE_
> Search a Haskell file for patterns to turn into new hints

**-X** _EXTENSION_, **--language** _EXTENSION_
> Enable or disable a GHC language extension (e.g. -XNoCPP)

**--cpp-define** _NAME_[**=**_VALUE_], **--cpp-include** _DIR_
> Configure the cpphs C preprocessor run over input files

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

# RESOURCES

```[Source code](https://github.com/ndmitchell/hlint)```

```[Documentation](https://hackage.haskell.org/package/hlint)```

<!-- verified: 2026-07-19 -->
