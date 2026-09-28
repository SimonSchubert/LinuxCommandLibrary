# TAGLINE

PHP mutation testing framework

# TLDR

**Run mutation testing**

```infection```

Run with **all CPU cores**

```infection --threads=max```

**Mutate specific files** only

```infection [src/Service/Mailer.php] [src/Entity/]```

**Fail the build** below a minimum score

```infection --min-msi=[70] --min-covered-msi=[80]```

Mutate only **lines changed** in the current branch

```infection --git-diff-lines --git-diff-base=[origin/main]```

Show **all mutation diffs**

```infection --show-mutations=max```

**Write an HTML report**

```infection --logger-html=[infection.html]```

Reuse **existing coverage** and skip the initial test run

```infection --coverage=[build/coverage] --skip-initial-tests```

# SYNOPSIS

**infection** [_options_] [_paths_...]

# PARAMETERS

**-j**, **--threads** _N|max_
> Number of parallel test processes; **max** uses all CPU cores.

**--min-msi** _N_
> Minimum Mutation Score Indicator required; fail otherwise.

**--min-covered-msi** _N_
> Minimum MSI for code covered by tests.

**-s**, **--show-mutations** _N|max_
> Number of mutation diffs to show (default 20, **0** for none).

**--mutators** _LIST_
> Comma-separated mutators or profiles to use.

**--test-framework** _NAME_
> Test framework: phpunit, phpspec, codeception.

**--test-framework-extra-args** _ARGS_
> Extra arguments for the test framework.

**--git-diff-filter** _FILTER_
> Mutate only files matching a git diff filter, e.g. **AM**.

**--git-diff-lines**
> Mutate only added or changed lines.

**--git-diff-base** _BRANCH_
> Base branch for git diff options.

**--coverage** _DIR_
> Use existing coverage reports.

**--skip-initial-tests**
> Skip the initial test run (requires **--coverage**).

**--only-covered**
> Mutate only code covered by tests.

**--logger-text**, **--logger-html**, **--logger-github**, **--logger-gitlab** _FILE_
> Write a report in the given format.

**--log-verbosity** _all|default|none_
> Detail level of file logs.

**-c**, **--configuration** _FILE_
> Custom configuration file (default **infection.json5**).

**--dry-run**
> Generate mutants without running tests.

**--filter** _PATH_
> Deprecated since 0.34.0; pass paths as arguments instead.

**--help**
> Display help information.

# DESCRIPTION

**infection** is a PHP mutation testing framework. It makes small changes (mutants) to your source code and runs the test suite against each one.

A killed mutant means tests caught the change; an escaped mutant indicates weak tests. Results are summarized as the Mutation Score Indicator (MSI). Configuration lives in **infection.json5**, created interactively on first run.

# CAVEATS

PHP-only. Requires a coverage driver (Xdebug, PCOV or phpdbg) and PHPUnit, PhpSpec or Codeception. Resource intensive on large codebases. Tests that depend on each other or a shared database can produce false results with multiple threads.

# HISTORY

Infection was created by **Maks Rafalko** and first released in **2017**, bringing AST-based mutation testing to PHP.

# SEE ALSO

[phpunit](/man/phpunit)(1), [phpspec](/man/phpspec)(1), [pest](/man/pest)(1), [composer](/man/composer)(1)

# RESOURCES

```[Source code](https://github.com/infection/infection)```

```[Homepage](https://infection.github.io)```

```[Documentation](https://infection.github.io/guide/command-line-options.html)```

<!-- verified: 2026-09-29 -->
