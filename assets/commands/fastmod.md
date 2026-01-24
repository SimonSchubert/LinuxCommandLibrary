# TLDR

**Replace string in files**

```fastmod "[old_string]" "[new_string]"```

**Replace with regex**

```fastmod -m "[pattern]" "[replacement]"```

**Replace in specific directory**

```fastmod "[old]" "[new]" [directory]```

**Replace with file extension filter**

```fastmod --extensions "[py,js]" "[old]" "[new]"```

**Accept all replacements**

```fastmod --accept-all "[old]" "[new]"```

**Preview without changes**

```fastmod --print-only "[old]" "[new]"```

# SYNOPSIS

**fastmod** [_options_] _pattern_ _replacement_ [_paths_...]

# DESCRIPTION

**fastmod** performs fast, interactive codemod operations across files. It searches for patterns and offers interactive confirmation for replacements, making bulk code changes safer.

The tool combines the speed of ripgrep for searching with interactive review of changes. It's designed for large-scale refactoring in codebases.

# PARAMETERS

**-m**, **--multiline**
> Enable multiline regex matching.

**-i**, **--ignore-case**
> Case insensitive matching.

**--extensions** _exts_
> Filter by file extensions.

**--accept-all**
> Accept all replacements.

**--print-only**
> Show matches without changing.

**-d**, **--dir** _path_
> Search directory.

**--glob** _pattern_
> Include/exclude files.

**--hidden**
> Search hidden files.

**--fixed-strings**
> Treat pattern as literal.

# CAVEATS

Regex syntax differs from some tools. Interactive mode requires terminal. Large replacements may need review. Backup recommended before bulk changes.

# HISTORY

**fastmod** was developed at **Facebook** (Meta) as a tool for large-scale code modifications. It addresses the need for interactive, safe refactoring across massive codebases. Released as open source, it uses Rust for performance.

# SEE ALSO

[sed](/man/sed)(1), [ripgrep](/man/ripgrep)(1), [codemod](/man/codemod)(1), [comby](/man/comby)(1)
