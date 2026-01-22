# TLDR

**Run mutation testing**

```infection```

**Run with specific threads**

```infection --threads=[4]```

**Target specific files**

```infection --filter=[src/Service/]```

**Set minimum score**

```infection --min-msi=[70]```

**Show mutations**

```infection --show-mutations```

**Output to file**

```infection --log-verbosity=all --logger-text=[infection.log]```

# SYNOPSIS

**infection** [_options_]

# PARAMETERS

**--threads** _N_
> Parallel execution threads.

**--filter** _PATH_
> Filter source files to mutate.

**--min-msi** _N_
> Minimum Mutation Score Indicator.

**--min-covered-msi** _N_
> Minimum covered code MSI.

**--show-mutations**
> Display mutation details.

**--mutators** _LIST_
> Specific mutators to use.

**--help**
> Display help information.

# DESCRIPTION

**infection** is a PHP mutation testing framework. It modifies code to test the effectiveness of your test suite.

The tool creates mutants (modified code) and runs tests against them. Surviving mutants indicate weak test coverage.

infection performs PHP mutation testing.

# CAVEATS

PHP-only. Requires PHPUnit or Codeception. Resource intensive on large codebases.

# HISTORY

infection was created as a mutation testing tool for **PHP**, inspired by similar tools in other languages like Stryker.

# SEE ALSO

[phpunit](/man/phpunit)(1), [phpspec](/man/phpspec)(1), [pest](/man/pest)(1)
