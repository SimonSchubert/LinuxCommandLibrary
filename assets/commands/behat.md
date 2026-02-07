# TAGLINE

BDD testing framework for PHP

# TLDR

**Initialize a new Behat project**

```behat --init```

**Run all feature tests**

```behat```

**Run tests for a specific feature file**

```behat [features/login.feature]```

**Run a specific scenario** by line number

```behat [features/login.feature:15]```

**Run tests with a specific tag**

```behat --tags [smoke]```

**Generate step definitions** for undefined steps

```behat --snippets-for --append-snippets```

**Run tests with verbose output**

```behat -v```

**Output results in JUnit format**

```behat --format junit --out [reports/]```

# SYNOPSIS

**behat** [_options_] [_feature_file_]

# DESCRIPTION

**behat** is a BDD (Behavior-Driven Development) framework for PHP that tests business expectations using human-readable scenarios. It is the PHP implementation of Cucumber, using Gherkin syntax to define test scenarios.

Behat allows teams to describe application behavior in plain language that developers, QA, and stakeholders can all understand. Scenarios are written in feature files and executed against step definitions implemented in PHP.

# PARAMETERS

**--init**
> Initialize a new Behat project with the necessary directory structure

**--tags** _value_
> Run only scenarios with matching tags (e.g., @smoke, @regression)

**-f, --format** _value_
> Output format: pretty, progress, html, junit, json

**--out** _value_
> Write output to a file or directory

**--snippets-for** _value_
> Generate step definition snippets for undefined steps

**--append-snippets**
> Append generated snippets to context files

**-v, --verbose**
> Increase verbosity of output

**--colors** / **--no-colors**
> Force colored or non-colored output

**--suite** _value_
> Run only the specified test suite

**--profile** _value_
> Use a specific configuration profile

# CAVEATS

Behat requires PHP 5.3.1 or higher. Feature files must use Gherkin syntax with proper indentation. Step definitions must be unique; duplicate definitions cause ambiguity errors. The default context file is **FeatureContext.php** in features/bootstrap/.

# HISTORY

Behat was created by **Konstantin Kudryashov** (everzet) in **2010** as the PHP port of Cucumber. It became the de facto BDD testing framework for PHP, widely adopted in the Symfony and Drupal communities for acceptance testing.

# SEE ALSO

[phpunit](/man/phpunit)(1), [phpspec](/man/phpspec)(1), [cucumber](/man/cucumber)(1)
