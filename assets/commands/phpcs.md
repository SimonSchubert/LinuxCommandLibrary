# TAGLINE

PHP CodeSniffer

# TLDR

**Check file**

```phpcs [file.php]```

**Check directory**

```phpcs [src/]```

**Use specific standard**

```phpcs --standard=PSR12 [file.php]```

**Show summary only**

```phpcs --report=summary [src/]```

**Generate report**

```phpcs --report-file=[report.txt] [src/]```

# SYNOPSIS

**phpcs** [_options_] [_files_...]

# PARAMETERS

_FILES_
> Files or directories.

**--standard** _NAME_
> Coding standard.

**--report** _TYPE_
> Report format.

**--report-file** _FILE_
> Save report to file.

**-n**
> Ignore warnings.

**-s**
> Show sniff codes in reports.

**-p**
> Show progress.

**--extensions** _LIST_
> File extensions to check.

**--ignore** _PATTERNS_
> Paths to skip.

**--help**
> Display help.

# DESCRIPTION

**phpcs** is PHP CodeSniffer. Detects coding standard violations.

The tool checks code style. Supports PSR, PEAR, and custom standards.

# CAVEATS

Configuration via phpcs.xml. Custom standards possible.

# HISTORY

PHP_CodeSniffer was created by **Squiz Labs** for enforcing PHP coding standards. That package is abandoned, and development continues under the **PHPCSStandards** organization.

# SEE ALSO

[phpcbf](/man/phpcbf)(1), [php-cs-fixer](/man/php-cs-fixer)(1), [phpmd](/man/phpmd)(1)

# RESOURCES

```[Source code](https://github.com/PHPCSStandards/PHP_CodeSniffer)```

<!-- verified: 2026-11-08 -->
