# TLDR

**Check for misspellings** in the current directory

```codespell```

**Check specific files** or directories

```codespell [path/to/file.py] [path/to/directory]```

**Fix misspellings interactively**

```codespell -i 3 [path/to/directory]```

**Write corrections automatically** to files

```codespell -w [path/to/directory]```

**Ignore specific words**

```codespell -I [wordlist.txt] [path/to/directory]```

**Skip specific files** or directories

```codespell --skip="[*.min.js,node_modules]" [path/to/directory]```

**Check only specific file types**

```codespell --include-file="[*.py,*.md]" [path/to/directory]```

# SYNOPSIS

**codespell** [_options_] [_path_...]

# PARAMETERS

**-w**, **--write-changes**
> Automatically write corrections to files.

**-i** _N_, **--interactive** _N_
> Interactive mode: 0=no, 1=ask, 2=ask+confirm, 3=ask+show context.

**-I** _FILE_, **--ignore-words** _FILE_
> File containing words to ignore (one per line).

**-L** _WORDS_, **--ignore-words-list** _WORDS_
> Comma-separated list of words to ignore.

**--skip** _PATTERNS_
> Comma-separated glob patterns of files to skip.

**--include-file** _PATTERNS_
> Only check files matching these glob patterns.

**-d**, **--disable-colors**
> Disable colored output.

**--builtin** _DICT_
> Specify which built-in dictionaries to use.

**-q** _N_, **--quiet-level** _N_
> Set quiet level (0=normal, 1=hide warnings, 2=hide all).

**--count**
> Print only the count of misspellings.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**codespell** is a tool designed to find and fix common misspellings in source code, documentation, and text files. It uses a curated dictionary of frequent typos and their corrections, making it effective at catching errors that regular spell checkers miss.

The tool is particularly useful in CI/CD pipelines to catch typos before they enter the codebase. It understands programming contexts and avoids false positives from intentional technical terms, variable names, and code patterns.

codespell can operate in check-only mode for verification, interactive mode for manual review, or write mode for automatic correction. Custom ignore lists allow adaptation to project-specific terminology that might otherwise trigger false positives.

# CAVEATS

Automatic write mode may incorrectly "fix" intentional non-standard spellings or technical jargon. The built-in dictionary focuses on English and common programming terms. Some valid technical terms may need to be added to an ignore list.

# HISTORY

codespell was created by Lucas De Marchi and is maintained as an open-source project. It emerged from the need to catch common misspellings in large codebases, particularly in open-source projects with many contributors. The tool has been adopted by numerous projects including the Linux kernel.

# SEE ALSO

[aspell](/man/aspell)(1), [hunspell](/man/hunspell)(1), [spell](/man/spell)(1)
