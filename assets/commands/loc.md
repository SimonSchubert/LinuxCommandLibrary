# TAGLINE

counts lines of code quickly

# TLDR

**Count lines in current directory**

```loc```

**Count in specific directory**

```loc [src/]```

**Exclude directories**

```loc --exclude [test/,vendor/]```

**Show detailed stats**

```loc -d```

**Count specific languages**

```loc --include [rs,go]```

**Output as JSON**

```loc --output-type json```

# SYNOPSIS

**loc** [_options_] [_paths_]

# PARAMETERS

_PATHS_
> Directories or files to analyze.

**--exclude** _DIRS_
> Directories to exclude.

**--include** _LANGS_
> Languages to include.

**-d**
> Show detailed breakdown.

**--output-type** _FORMAT_
> Output format (text, json).

**--help**
> Display help information.

# DESCRIPTION

**loc** counts lines of code quickly. It identifies languages and separates code, comments, and blanks.

The tool is written in Rust for speed. It supports many programming languages.

# CAVEATS

Results may differ from other counters. Language detection heuristic. Rust-based tool.

# HISTORY

loc was created as a fast **Rust-based** alternative to cloc and other lines-of-code counting tools.

# SEE ALSO

[cloc](/man/cloc)(1), [tokei](/man/tokei)(1), [sloccount](/man/sloccount)(1)

