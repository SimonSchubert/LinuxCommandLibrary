# TAGLINE

BDD testing framework for PHP

# TLDR

**Run tests**

```kahlan```

**Run specific spec**

```kahlan --spec=[spec/MySpec.php]```

**Filter by pattern**

```kahlan --pattern="[*Spec.php]"```

**Generate coverage**

```kahlan --coverage=[4]```

**Output as reporter**

```kahlan --reporter=[dot|bar|verbose]```

**Run with config**

```kahlan --config=[kahlan-config.php]```

# SYNOPSIS

**kahlan** [_options_]

# PARAMETERS

**--spec** _PATH_
> Specific spec file/directory.

**--pattern** _GLOB_
> File pattern.

**--coverage** _LEVEL_
> Coverage level (1-4).

**--reporter** _NAME_
> Output reporter.

**--config** _FILE_
> Configuration file.

**--help**
> Display help information.

# DESCRIPTION

**Kahlan** is a BDD testing framework for PHP. It uses a describe-it syntax similar to Jasmine/RSpec.

The tool supports mocking, stubbing, and code coverage. It focuses on behavior-driven development.

# CAVEATS

PHP-based. Different syntax from PHPUnit. Requires Composer.

# HISTORY

Kahlan was created as a PHP testing framework with JavaScript-like BDD syntax and powerful mocking.

# SEE ALSO

[phpunit](/man/phpunit)(1), [phpspec](/man/phpspec)(1), [pest](/man/pest)(1)
