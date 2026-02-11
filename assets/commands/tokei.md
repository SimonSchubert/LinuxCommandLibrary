# TAGLINE

Fast source code line counter

# TLDR

**Count lines of code**

```tokei```

**Count specific directory**

```tokei [path/to/project]```

**Exclude directories**

```tokei -e [vendor] -e [node_modules]```

**Show files individually**

```tokei --files```

**Sort by specific column**

```tokei -s [code]```

**Output as JSON**

```tokei -o json```

**Count specific languages**

```tokei -t [Rust,Python]```

**Show languages only**

```tokei --languages```

# SYNOPSIS

**tokei** [_path_] [_-e exclude_] [_-t types_] [_-s column_] [_-o format_] [_options_]

# PARAMETERS

**-e**, **--exclude** _PATTERN_
> Exclude files/directories matching pattern.

**-t**, **--type** _TYPES_
> Count only specified languages.

**-s**, **--sort** _COLUMN_
> Sort by: files, lines, blanks, code, comments.

**-o**, **--output** _FORMAT_
> Output format: json, yaml, cbor.

**--files**
> Show individual file statistics.

**--hidden**
> Include hidden files.

**--no-ignore**
> Don't use .gitignore.

**--compact**
> Compact output.

**--languages**
> Print supported languages.

**-c**, **--columns** _NUM_
> Set output width.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**tokei** counts lines of code quickly and accurately. It identifies languages by file extension, categorizing lines as code, comments, or blank.

The tool is extremely fast, written in Rust with parallel file processing. Large codebases analyze in seconds. Results show per-language breakdown with totals.

Language detection supports over 150 languages with proper handling of multi-line comments, nested comments, and language-specific syntax.

File filtering respects .gitignore by default, excluding generated code and dependencies. Additional excludes target specific directories or patterns.

Individual file mode (--files) shows statistics per file rather than aggregated, useful for finding verbose files or tracking specific components.

Machine-readable output (JSON, YAML) enables integration with other tools, CI/CD pipelines, or tracking metrics over time.

# CAVEATS

Lines of code is an imperfect metric. Generated code may skew results. Multi-language files counted once. Extension-based detection may misidentify some files. Binary files are skipped.

# HISTORY

**tokei** was created by **Erin Power** (Aaronepower) around **2016**. The Japanese name means "clock/statistics." Written in Rust for performance, it became a popular alternative to cloc and other line counting tools. The project emphasizes speed and accuracy across many programming languages.

# SEE ALSO

[cloc](/man/cloc)(1), [scc](/man/scc)(1), [wc](/man/wc)(1), [loc](/man/loc)(1)
