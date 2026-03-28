# TAGLINE

Fast, interactive codebase-wide find and replace

# TLDR

**Replace a string interactively** across the current directory

```fastmod "[old_string]" "[new_string]"```

**Replace using a regex** with multiline matching

```fastmod -m "[pattern]" "[replacement]"```

**Replace in a specific directory**

```fastmod "[old]" "[new]" [path/to/directory]```

**Replace only in files** with specific extensions

```fastmod -e "[py,js]" "[old]" "[new]"```

**Accept all replacements** without prompting

```fastmod --accept-all "[old]" "[new]"```

**Preview matches** without modifying files

```fastmod --print-only "[old]" "[new]"```

**Treat pattern as a literal string** instead of regex

```fastmod --fixed-strings "[old.string()]" "[new.string()]"```

# SYNOPSIS

**fastmod** [_options_] _pattern_ [_replacement_] [_paths_...]

# DESCRIPTION

**fastmod** performs fast, interactive codemod operations across files. It searches for regex patterns and prompts for confirmation before each replacement, making bulk code changes safer.

The tool uses the same regex engine as ripgrep for fast searching combined with interactive review of changes. By default, patterns are treated as regular expressions. If no replacement is given, fastmod deletes the matched text. If no paths are given, it searches the current directory recursively.

During interactive mode, press **y** to accept, **n** to skip, **e** to edit the replacement, **a** to accept all remaining, or **q** to quit.

# PARAMETERS

**-m**, **--multiline**
> Enable multiline regex matching (dot matches newlines).

**-i**, **--ignore-case**
> Case insensitive matching.

**-e**, **--extensions** _exts_
> Comma-separated list of file extensions to process (e.g., py,js,ts).

**--accept-all**
> Apply all replacements without interactive prompting.

**--print-only**
> Show matches without modifying files.

**-d**, **--dir** _path_
> Set the root search directory (default: current directory).

**--glob** _pattern_
> Include/exclude files by glob pattern (prefix with ! to exclude).

**--hidden**
> Include hidden files and directories in the search.

**--fixed-strings**, **-F**
> Treat the pattern as a literal string, not a regex.

**--count**
> Display the total number of matches/replacements.

# CAVEATS

Uses Rust's regex syntax, which may differ from PCRE or POSIX regex in some edge cases. Interactive mode requires a terminal. When using **--accept-all**, changes are applied without confirmation -- use **--print-only** first to preview.

# HISTORY

**fastmod** was developed at **Facebook** (Meta) as a tool for large-scale code modifications. It addresses the need for interactive, safe refactoring across massive codebases. Released as open source, it is written in Rust for performance.

# SEE ALSO

[sed](/man/sed)(1), [codemod](/man/codemod)(1), [comby](/man/comby)(1), [rg](/man/rg)(1)
