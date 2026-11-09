# TAGLINE

Automated PHP code refactoring and upgrades

# TLDR

**Run rector**

```vendor/bin/rector process [src/]```

**Dry run**

```vendor/bin/rector process [src/] --dry-run```

**Use a specific configuration file**

```vendor/bin/rector process [src/] --config [rector.php]```

**Run only a single rule**

```vendor/bin/rector process [src/] --only [TypedPropertyFromAssignsRector]```

**List the loaded rules**

```vendor/bin/rector list-rules```

**List every available rule**

```vendor/bin/rector list-rules --all```

**Check the configuration** without processing files

```vendor/bin/rector validate-config```

**Clear cache before processing**

```vendor/bin/rector process --clear-cache```

**Process a single file**

```vendor/bin/rector process [src/File.php]```

**Hide diffs and the progress bar** for CI output

```vendor/bin/rector process --no-diffs --no-progress-bar```

# SYNOPSIS

**rector** _command_ [_--dry-run_] [_--config file_] [_options_] [_paths_]

# PARAMETERS

**process**, **p**
> Run refactoring on the specified paths. This is what a bare **vendor/bin/rector** runs.

**list-rules**, **show-rules**
> Show the loaded rules. Accepts **--all**, **--only** and **--output-format json**.

**validate-config**
> Report config hygiene issues without processing any files.

**--dry-run**, **-n**
> Only show the diff of changes, without saving them.

**--config**, **-c** _FILE_
> Path to the configuration file.

**--autoload-file**, **-a** _FILE_
> Extra autoload file to include.

**--clear-cache**
> Clear the unchanged-files cache.

**--only** _RULE_
> Run only the given rule. Takes a fully qualified class name, or a short name if it is unambiguous. Repeat to run several rules.

**--output-format** _FORMAT_
> Output format (e.g., **json**) for piping results to other tools.

**--filter** _PATTERNS_
> Keep only files matching all comma-separated patterns, for example `/Controller/` or `*Repository.php`.

**--no-diffs**
> Hide diffs of changed files.

**--no-progress-bar**
> Hide the progress bar.

**--max-changes** _N_
> Stop after this many changes. Forces a non-parallel run.

**--memory-limit** _LIMIT_
> Memory limit for the process.

**--debug**
> Display debug output.

# DESCRIPTION

**Rector** performs automated refactoring of PHP codebases, applying rule-based transformations to upgrade syntax, modernize framework usage, and enforce code quality standards. It parses PHP files into an abstract syntax tree and applies configured rules to transform old constructs into their modern equivalents, handling PHP version upgrades (e.g., PHP 7.4 to 8.2) and framework migration (Symfony, Laravel, PHPUnit) automatically.

The **--dry-run** flag previews all changes without modifying files, making it safe to review transformations before applying them. Rules are organized into sets for common upgrade paths, and custom rules can be written for project-specific refactoring patterns. The tool is typically configured through a **rector.php** file that specifies which rule sets and individual rules to apply.

# CONFIGURATION

**rector.php**
> Main configuration file defining rule sets, individual rules, paths to process, and skip patterns. When none is found, Rector offers to create one on its first run.

# CAVEATS

Review dry-run output carefully. Complex code may need manual fixes. Git commit before running.

# HISTORY

**Rector** was created by **Tomas Votruba** for automated PHP refactoring. It enables safe, large-scale codebase modernization. The **setup-ci** and **custom-rule** commands were removed in October 2026.

# SEE ALSO

[phpstan](/man/phpstan)(1), [php-cs-fixer](/man/php-cs-fixer)(1), [phpcs](/man/phpcs)(1), [composer](/man/composer)(1)

# RESOURCES

```[Source code](https://github.com/rectorphp/rector)```

```[Homepage](https://getrector.com)```

```[Documentation](https://getrector.com/documentation)```

<!-- verified: 2026-11-09 -->
