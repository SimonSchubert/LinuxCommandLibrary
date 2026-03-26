# TAGLINE

Fast source code line counter

# TLDR

**Count lines of code in the current directory**

```tokei```

**Count a specific directory**

```tokei [path/to/project]```

**Count multiple directories**

```tokei [path/to/project] [path/to/other]```

**Exclude directories or patterns**

```tokei -e [vendor] -e [node_modules]```

**Show files individually**

```tokei --files```

**Sort by a specific column**

```tokei -s [code]```

**Output as JSON**

```tokei -o json```

**Count only specific languages**

```tokei -t [Rust,Python]```

**Show supported languages**

```tokei --languages```

**Read from a previously saved JSON output**

```tokei [path/to/project] -i [stats.json]```

# SYNOPSIS

**tokei** [_path_...] [_options_]

# PARAMETERS

**-e**, **--exclude** _PATTERN_
> Ignore all files and directories matching the pattern. Uses gitignore syntax. Can be specified multiple times.

**-t**, **--type** _TYPES_
> Filter output by language type, separated by a comma (e.g. Rust,Markdown).

**-s**, **--sort** _COLUMN_
> Sort languages by column. Possible values: files, lines, blanks, code, comments. Default: alphabetical by language name.

**-o**, **--output** _FORMAT_
> Output in a machine-readable format. Possible values: json, yaml, cbor.

**-i**, **--input** _FILE_
> Read in the output of a previous tokei run and combine it with the current results. Pass a file path or "stdin" to read from stdin.

**-f**, **--files**
> Print statistics for individual files instead of aggregating by language.

**-l**, **--languages**
> Print a list of all supported languages and their file extensions.

**--hidden**
> Count hidden files and directories (those beginning with a dot).

**--no-ignore**
> Don't respect any ignore files (.gitignore, .ignore, etc.). Implies --no-ignore-parent, --no-ignore-dot, and --no-ignore-vcs.

**--no-ignore-dot**
> Don't respect .ignore and .tokeignore files, including those in parent directories.

**--no-ignore-parent**
> Don't respect ignore files in parent directories.

**--no-ignore-vcs**
> Don't respect VCS ignore files (.gitignore, .hgignore, etc.), including those in parent directories.

**-c**, **--columns** _NUM_
> Set a strict column width for terminal output.

**-v**, **--verbose**
> Increase log output level. Use up to three times (-vvv) for more detail.

# DESCRIPTION

**tokei** counts lines of code quickly and accurately. It identifies languages by file extension, categorising lines as code, comments, or blank, and groups results by language.

The tool is written in Rust with parallel file processing, making it capable of counting millions of lines in seconds. Results show a per-language breakdown with a grand total.

Language detection supports over 150 languages with correct handling of multi-line comments, nested comments, and strings containing comment-like syntax.

File filtering respects .gitignore and .ignore files by default, which excludes generated code and dependency directories. Additional patterns can be excluded with **-e**, or a .tokeignore file can be used with the same syntax as .gitignore.

Individual file mode (**--files**) shows statistics per file rather than aggregated by language, useful for identifying verbose or generated files.

Machine-readable output (JSON, YAML, CBOR) enables integration with other tools and CI/CD pipelines. A previous run's JSON output can be fed back in with **--input** to combine results across separate directory trees.

# CAVEATS

Lines of code is an imperfect metric. Generated code may skew results. Multi-language files (e.g. Markdown with embedded code blocks) are counted once under the primary language but embedded sub-language totals are shown separately. Extension-based detection may misidentify some files. Binary files are skipped. CBOR and YAML output require tokei to be compiled with the corresponding feature flags.

# HISTORY

**tokei** was created by **Erin Power** (XAMPPRocky) around **2016**. The Japanese name (時計) means "clock." Written in Rust for performance, it became a popular alternative to cloc and other line counting tools.

# SEE ALSO

[cloc](/man/cloc)(1), [scc](/man/scc)(1), [wc](/man/wc)(1), [loc](/man/loc)(1)
