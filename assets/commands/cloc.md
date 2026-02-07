# TAGLINE

source code line counter

# TLDR

**Count lines in directory**

```cloc [directory]```

**Count lines in file**

```cloc [file.cpp]```

**Count with file-by-file report**

```cloc --by-file [directory]```

**Count in archive**

```cloc [archive.tar.gz]```

**Compare two versions**

```cloc --diff [old/] [new/]```

**Output as CSV**

```cloc --csv [directory]```

**Output as JSON**

```cloc --json [directory]```

**Exclude directory**

```cloc --exclude-dir=[test,vendor] [directory]```

**List supported languages**

```cloc --show-lang```

# SYNOPSIS

**cloc** [_options_] _file|directory|archive_...

# DESCRIPTION

**cloc** (Count Lines of Code) counts blank lines, comment lines, and physical lines of source code in over 200 programming languages. It analyzes individual files, entire directory trees, and compressed archives, producing summary reports broken down by language or by file.

The tool includes a diff mode that compares two codebases and reports added, removed, modified, and unchanged lines. Output can be generated in plain text, CSV, JSON, SQL, or XML format for integration with other tools and reporting systems.

Written in Perl with no external dependencies, cloc is easy to install and runs on any platform with a Perl interpreter. It correctly handles multi-language files and uses language-specific comment detection rules for accurate counting.

# PARAMETERS

**--by-file**
> Report results per source file

**--by-file-by-lang**
> Report per file and per language

**--diff**
> Compare two code bases

**--csv**
> Output in CSV format

**--json**
> Output in JSON format

**--sql**=_file_
> Output as SQL insert statements

**--exclude-dir**=_list_
> Comma-separated directories to exclude

**--exclude-lang**=_list_
> Comma-separated languages to exclude

**--include-lang**=_list_
> Only count specified languages

**--max-file-size**=_MB_
> Skip files larger than MB (default: 100)

**--show-lang**
> List recognized languages

**--quiet**
> Suppress progress output

# OUTPUT FIELDS

Language, files, blank lines, comment lines, code lines

# DIFF MODE

```cloc --diff old_version/ new_version/```

Shows added, removed, modified, and same lines between versions.

# CAVEATS

Does not analyze semantic code complexity. Some edge cases in multi-language files may be miscounted. Supports 200+ languages.

# SEE ALSO

[wc](/man/wc)(1), [sloccount](/man/sloccount)(1)
