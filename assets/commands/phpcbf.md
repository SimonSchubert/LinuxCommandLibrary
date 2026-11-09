# TAGLINE

PHP Code Beautifier and Fixer

# TLDR

**Fix coding standard violations in a file**

```phpcbf [path/to/file.php]```

**Fix all files in a directory**

```phpcbf [path/to/src/]```

**Fix using a specific coding standard**

```phpcbf --standard=[PSR12] [path/to/file.php]```

**Fix only specific sniffs**

```phpcbf --sniffs=[Sniff.Name] [path/to/file.php]```

**Write fixed files with a suffix** instead of overwriting

```phpcbf --suffix=[.fixed] [path/to/file.php]```

**Fix only specific file extensions**

```phpcbf --extensions=[php,inc] [path/to/src/]```

**Skip paths matching patterns** and show progress

```phpcbf -p --ignore=[*/vendor/*,*/tests/*] [path/to/src/]```

**Fix files in parallel**

```phpcbf --parallel=[8] [path/to/src/]```

**List installed coding standards**

```phpcbf -i```

# SYNOPSIS

**phpcbf** [_options_] [_files_...]

# PARAMETERS

_FILES_
> Files or directories to fix.

**--standard=**_NAME_
> Name of or path to the coding standard (e.g., PSR1, PSR2, PSR12, Squiz, PEAR). Can be a comma-separated list. Without it, a [.]phpcs.xml[.dist] ruleset is searched for in the current directory and those above it.

**--sniffs=**_LIST_
> Comma-separated list of specific sniffs to apply.

**--exclude=**_LIST_
> Comma-separated list of sniffs to exclude.

**--extensions=**_LIST_
> Comma-separated file extensions to fix (default: php,inc).

**--ignore=**_PATTERNS_
> Comma-separated patterns of files and directories to skip.

**--parallel=**_N_
> Number of files to process simultaneously (default: 1). Needs the PHP PCNTL extension.

**-l**
> Process the local directory only, without recursion.

**-n**
> Do not include warnings, only errors.

**--suffix=**_SUFFIX_
> Write fixed files with this suffix instead of overwriting originals.

**-p**
> Show progress during fixing.

**-q**
> Quiet mode, disables progress and verbose output.

**-i**
> List installed coding standards.

**--help**
> Display help information.

# DESCRIPTION

**phpcbf** (PHP Code Beautifier and Fixer) automatically corrects coding standard violations detected by phpcs. It is the companion fixer tool in the **PHP_CodeSniffer** package.

The tool modifies files in-place by default, applying fixes for violations that have an automatic fixer defined. Not all phpcs violations are auto-fixable; phpcbf will only fix those with corresponding fixer implementations. Use **--suffix** to write fixed copies instead of overwriting originals. To preview changes without modifying files, run **phpcs --report=diff**.

# CAVEATS

Part of PHP_CodeSniffer. Not all coding standard violations are automatically fixable. Always review changes after fixing, especially on first use with a codebase. Version 4.0 and later only process PHP files; JS and CSS scanning and the _ext/tokenizer_ form of **--extensions** are no longer supported.

# EXIT CODES

Since version 4.0 the exit code is a bitmask, so values can combine. Earlier versions use different codes.

**0**
> No issues remain.

**1**
> Auto-fixable issues remain.

**2**
> Issues that cannot be auto-fixed remain.

**4**
> A file failed to fix, typically due to conflicting sniffs.

**16**
> Processing error, such as an invalid option or ruleset.

**64**
> Requirements to run are not met.

# HISTORY

PHPCBF is part of **PHP_CodeSniffer**, originally by **Greg Sherwood** (Squiz Labs), now maintained by **PHPCSStandards**.

# SEE ALSO

[phpcs](/man/phpcs)(1), [php-cs-fixer](/man/php-cs-fixer)(1)

# RESOURCES

```[Source code](https://github.com/PHPCSStandards/PHP_CodeSniffer)```

```[Documentation](https://github.com/PHPCSStandards/PHP_CodeSniffer/wiki)```

<!-- verified: 2026-11-09 -->
