# TLDR

**Run rector**

```vendor/bin/rector process [src/]```

**Dry run**

```vendor/bin/rector process [src/] --dry-run```

**Specific rule**

```vendor/bin/rector process [src/] --config [rector.php]```

**Show available rules**

```vendor/bin/rector list-rules```

**Init configuration**

```vendor/bin/rector init```

**Clear cache**

```vendor/bin/rector process --clear-cache```

**Process single file**

```vendor/bin/rector process [src/File.php]```

# SYNOPSIS

**rector** _command_ [_--dry-run_] [_--config file_] [_options_] [_paths_]

# PARAMETERS

**process**
> Run refactoring.

**init**
> Create config file.

**list-rules**
> Show available rules.

**--dry-run**
> Show changes without applying.

**--config** _FILE_
> Configuration file.

**--clear-cache**
> Clear cache.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**Rector** performs automated PHP refactoring. It upgrades code and applies best practices.

PHP version upgrades modernize syntax. Old constructs are replaced with newer equivalents.

Framework upgrades handle breaking changes. Symfony, Laravel, and others supported.

Code quality rules improve standards. Dead code removal, type declarations added.

Custom rules enable project-specific refactoring. Extend for unique transformations.

# CAVEATS

Review dry-run output carefully. Complex code may need manual fixes. Git commit before running.

# HISTORY

**Rector** was created by **Tomas Votruba** for automated PHP refactoring. It enables safe, large-scale codebase modernization.

# SEE ALSO

[phpstan](/man/phpstan)(1), [php-cs-fixer](/man/php-cs-fixer)(1), [phpcs](/man/phpcs)(1)
