# TAGLINE

PHP Code Beautifier and Fixer

# TLDR

**Fix coding standards**

```phpcbf [file.php]```

**Fix directory**

```phpcbf [src/]```

**Use specific standard**

```phpcbf --standard=PSR12 [file.php]```

**Fix specific sniffs**

```phpcbf --sniffs=[Sniff.Name] [file.php]```

**Dry run**

```phpcbf -n [file.php]```

# SYNOPSIS

**phpcbf** [_options_] [_files_...]

# PARAMETERS

_FILES_
> Files or directories.

**--standard** _NAME_
> Coding standard.

**--sniffs** _LIST_
> Specific sniffs.

**-n**
> Do not apply changes.

**--help**
> Display help.

# DESCRIPTION

**phpcbf** is PHP Code Beautifier and Fixer. Fixes coding standard violations.

The tool auto-corrects style issues. Companion to phpcs.

# CAVEATS

Part of PHP_CodeSniffer. Not all issues fixable.

# HISTORY

PHPCBF is part of **PHP_CodeSniffer** for automatic code fixing.

# SEE ALSO

[phpcs](/man/phpcs)(1), [php-cs-fixer](/man/php-cs-fixer)(1)

