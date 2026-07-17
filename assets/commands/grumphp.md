# TAGLINE

PHP code quality enforcement via git hooks

# TLDR

**Generate a starter configuration file**

```grumphp configure```

**Run all configured tasks**

```grumphp run```

**Run specific tasks**

```grumphp run --tasks=[phpcs,phpunit]```

**Run a specific testsuite**

```grumphp run --testsuite=[mytestsuite]```

**Register GrumPHP's git hooks**

```grumphp git:init```

**Unregister GrumPHP's git hooks**

```grumphp git:deinit```

**Manually run the pre-commit hook tasks**

```grumphp git:pre-commit```

# SYNOPSIS

**grumphp** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Command to run.

**configure**
> Generate a starter grumphp.yml configuration file, guessing sensible defaults.

**run**
> Execute all configured tasks against the codebase.

**git:init**
> Register GrumPHP's git hooks (run automatically after `composer install`).

**git:deinit**
> Unregister GrumPHP's git hooks.

**git:pre-commit**
> Run the tasks bound to the pre-commit hook.

**git:commit-msg**
> Run the tasks that validate the commit message.

**--tasks** _TASK1,TASK2_
> Only run the given comma-separated tasks.

**--testsuite** _NAME_
> Only run tasks belonging to the given testsuite.

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

# RESOURCES

```[Source code](https://github.com/phpro/grumphp)```

```[Documentation](https://github.com/phpro/grumphp/tree/v2.x/doc)```

<!-- verified: 2026-07-17 -->
