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

# SYNOPSIS

**phpcbf** [_options_] [_files_...]

# PARAMETERS

_FILES_
> Files or directories to fix.

**--standard=**_NAME_
> Coding standard to use (e.g., PSR1, PSR2, PSR12, Squiz, PEAR).

**--sniffs=**_LIST_
> Comma-separated list of specific sniffs to apply.

**--exclude=**_LIST_
> Comma-separated list of sniffs to exclude.

**--extensions=**_LIST_
> Comma-separated file extensions to fix (default: php,inc). Can include type: module/php,es/js.

**--suffix=**_SUFFIX_
> Write fixed files with this suffix instead of overwriting originals.

**--no-patch**
> Use PHP for file replacement instead of diff/patch commands.

**--diff**
> Generate a diff of changes instead of applying them.

**-p**
> Show progress during fixing.

**--help**
> Display help information.

# DESCRIPTION

**phpcbf** (PHP Code Beautifier and Fixer) automatically corrects coding standard violations detected by phpcs. It is the companion fixer tool in the **PHP_CodeSniffer** package.

The tool modifies files in-place by default, applying fixes for violations that have an automatic fixer defined. Not all phpcs violations are auto-fixable; phpcbf will only fix those with corresponding fixer implementations. Use **--suffix** to write fixed copies instead of overwriting originals, or **--diff** to generate a patch without modifying files.

# CAVEATS

Part of PHP_CodeSniffer. Not all coding standard violations are automatically fixable. Always review changes after fixing, especially on first use with a codebase.

# HISTORY

PHPCBF is part of **PHP_CodeSniffer**, originally by **Greg Sherwood** (Squiz Labs), now maintained by **PHPCSStandards**.

# SEE ALSO

[phpcs](/man/phpcs)(1), [php-cs-fixer](/man/php-cs-fixer)(1)

