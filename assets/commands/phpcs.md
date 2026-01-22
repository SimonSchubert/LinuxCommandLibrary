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

**--help**
> Display help.

# DESCRIPTION

**phpcs** is PHP CodeSniffer. Detects coding standard violations.

The tool checks code style. Supports PSR, PEAR, and custom standards.

phpcs checks PHP style.

# CAVEATS

Configuration via phpcs.xml. Custom standards possible.

# HISTORY

PHP_CodeSniffer was created for **enforcing PHP coding standards**.

# SEE ALSO

[phpcbf](/man/phpcbf)(1), [php-cs-fixer](/man/php-cs-fixer)(1), [phpmd](/man/phpmd)(1)

