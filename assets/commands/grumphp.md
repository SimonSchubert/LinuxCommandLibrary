# TAGLINE

PHP code quality enforcement via git hooks

# TLDR

**Initialize GrumPHP**

```grumphp configure```

**Run all tasks**

```grumphp run```

**Run specific task**

```grumphp run --tasks=[phpcs]```

**Check git hooks**

```grumphp git:init```

**Pre-commit check**

```grumphp git:pre-commit```

# SYNOPSIS

**grumphp** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Command to run.

**configure**
> Initialize configuration.

**run**
> Execute all configured tasks.

**git:init**
> Install git hooks.

**git:pre-commit**
> Run pre-commit tasks.

**--tasks** _TASKS_
> Specify tasks to run.

**--help**
> Display help information.

# DESCRIPTION

**GrumPHP** is a PHP code quality tool that runs checks on git commits. It enforces coding standards by running tasks like PHPStan, PHP_CodeSniffer, and PHPUnit before allowing commits.

The tool integrates with git hooks to prevent commits that fail quality checks. It is configurable via a grumphp.yml file in the project root.

# CONFIGURATION

**grumphp.yml**
> Project-level configuration file defining tasks, parameters, and git hook settings.

# CAVEATS

PHP project specific. Requires Composer. May slow down commits with many tasks.

# HISTORY

GrumPHP was created by **phpro** to automate PHP code quality enforcement through git hooks.

# SEE ALSO

[composer](/man/composer)(1), [phpcs](/man/phpcs)(1), [phpstan](/man/phpstan)(1)
