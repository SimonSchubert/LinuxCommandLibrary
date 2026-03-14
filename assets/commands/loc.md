# TAGLINE

counts lines of code quickly

# TLDR

**Count lines of code in the current directory**

```loc```

**Count lines of code in a specific directory**

```loc [path/to/directory]```

**Show per-file statistics**

```loc --files```

**Exclude files matching a regex pattern**

```loc --exclude [test]```

**Count only files matching a regex pattern**

```loc --include [\.rs$]```

**Sort output by a specific column**

```loc --sort [code]```

**Include files ignored by .gitignore**

```loc -u```

**Include hidden files and directories as well**

```loc -uu```

# SYNOPSIS

**loc** [_options_] [_paths_]

# PARAMETERS

_PATHS_
> Directories or files to analyze. Defaults to the current directory.

**--files**
> Display statistics for each individual file parsed.

**--sort** _COLUMN_
> Sort results by the specified column (e.g., code, comment, lines, blank). Default is code in descending order.

**--include** _REGEX_
> Count only files matching the specified regex pattern.

**--exclude** _REGEX_
> Exclude files matching the specified regex pattern.

**-u**
> Unrestricted mode. Disregard .gitignore and .ignore files. Use twice (-uu) to also include hidden files and directories.

# DESCRIPTION

**loc** counts lines of code quickly. It identifies programming languages and separates code, comments, and blank lines. By default, it respects .gitignore and .ignore files and skips hidden files and directories.

The tool is written in Rust for speed and can process large codebases significantly faster than alternatives like cloc.

# CAVEATS

Results may differ from other line counters due to differing language detection heuristics and comment-parsing rules. The project is no longer actively maintained.

# SEE ALSO

[cloc](/man/cloc)(1), [tokei](/man/tokei)(1), [sloccount](/man/sloccount)(1)

