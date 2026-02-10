# TAGLINE

fixes PHP coding standards

# TLDR

**Fix current directory**

```php-cs-fixer fix```

**Fix specific file**

```php-cs-fixer fix [file.php]```

**Dry run**

```php-cs-fixer fix --dry-run```

**Show diff**

```php-cs-fixer fix --diff```

**Use specific rules**

```php-cs-fixer fix --rules=@PSR12```

# SYNOPSIS

**php-cs-fixer** [_command_] [_options_]

# PARAMETERS

**fix** [_PATH_]
> Fix coding standards.

**--dry-run**
> Don't modify files.

**--diff**
> Show changes.

**--rules** _RULES_
> Coding standard rules.

**--config** _FILE_
> Configuration file.

**--help**
> Display help.

# DESCRIPTION

**php-cs-fixer** fixes PHP coding standards. Enforces consistent style.

The tool automatically formats code. Supports PSR standards.

# CAVEATS

Configuration via .php-cs-fixer.php. Rule sets customizable.

# HISTORY

PHP CS Fixer was created for **automatic PHP coding standards** enforcement.

# SEE ALSO

[phpcs](/man/phpcs)(1), [phpcbf](/man/phpcbf)(1), [php](/man/php)(1)

