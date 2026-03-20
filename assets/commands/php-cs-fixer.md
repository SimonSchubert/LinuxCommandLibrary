# TAGLINE

Automatically fix PHP coding standards issues

# TLDR

**Fix current directory**

```php-cs-fixer fix```

**Fix specific file**

```php-cs-fixer fix [file.php]```

**Dry run** showing what would change

```php-cs-fixer fix --dry-run```

**Show diff** of changes

```php-cs-fixer fix --diff```

**Use specific rule set**

```php-cs-fixer fix --rules=@PSR12```

**Fix with verbose output**

```php-cs-fixer fix -v```

**List files that need fixing**

```php-cs-fixer list-files```

# SYNOPSIS

**php-cs-fixer** _command_ [_options_] [_path_]

# PARAMETERS

**fix** [_PATH_]
> Fix coding standards in the given path or current directory.

**check** [_PATH_]
> Shorthand for `fix --dry-run`. Analyze without modifying files.

**--dry-run**
> Don't modify files, only show what would change.

**--diff**
> Show a diff of applied changes.

**--rules** _RULES_
> Coding standard rules or rule sets (e.g., @PSR12, @Symfony).

**--config** _FILE_
> Path to configuration file.

**--allow-risky** _yes|no_
> Allow risky rules that may change code behavior.

**--using-cache** _yes|no_
> Enable or disable caching (default: yes).

**--cache-file** _FILE_
> Path to cache file (default: .php-cs-fixer.cache).

**--format** _FORMAT_
> Output format (txt, json, checkstyle, gitlab, junit, xml).

**--stop-on-violation**
> Stop execution on first violation.

**--path-mode** _override|intersection_
> How to treat paths from config vs command arguments (default: override).

# DESCRIPTION

**PHP CS Fixer** automatically fixes PHP code to follow coding standards. It supports PSR-1, PSR-2, PSR-12, Symfony, and custom rule sets. The tool parses PHP files, applies configured fixers, and rewrites files with corrected formatting.

# CONFIGURATION

**.php-cs-fixer.php** or **.php-cs-fixer.dist.php**
> PHP configuration file defining rules, finders, and project-specific settings. Searched in the current directory by default.

# CAVEATS

Risky fixers may change code behavior and must be explicitly allowed. Configuration via PHP file provides more flexibility than command-line rules.

# SEE ALSO

[phpcs](/man/phpcs)(1), [phpcbf](/man/phpcbf)(1), [php](/man/php)(1)

