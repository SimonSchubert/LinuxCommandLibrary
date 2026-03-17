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

Written in Perl with no external module dependencies, cloc is easy to install and runs on any platform with a Perl interpreter. It correctly handles multi-language files and uses language-specific comment detection rules for accurate counting. It can also operate on git repositories directly, comparing branches or commits.

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

**--include-ext**=_list_
> Only count files with the given comma-separated extensions.

**--max-file-size**=_MB_
> Skip files larger than _MB_ megabytes (default: 100).

**--show-lang**
> List recognized languages and exit.

**--git**
> Forces inputs to be interpreted as git targets (commit hashes, branch names).

**--vcs**=_VCS_
> Use _VCS_ to obtain list of files to count (e.g., git, svn).

**--xml**
> Output in XML format.

**--yaml**
> Output in YAML format.

**--quiet**
> Suppress progress output.

**--force-lang**=_LANG_
> Process all files with the given language counter.

**--config** _FILE_
> Read command-line switches from _FILE_ instead of defaults.

# OUTPUT FIELDS

Language, files, blank lines, comment lines, code lines

# CAVEATS

Does not analyze semantic code complexity. Some edge cases in multi-language files may be miscounted. Requires Perl but has no external module dependencies. Supports over 250 programming languages.

# HISTORY

**cloc** was created by **Al Danial**, first released on SourceForge and later moved to GitHub. It has become one of the most widely used open-source code counting tools.

# SEE ALSO

[wc](/man/wc)(1), [sloccount](/man/sloccount)(1), [tokei](/man/tokei)(1)
