# TAGLINE

SpecBDD framework for designing and testing PHP code

# TLDR

**Run all specifications** in the project

```phpspec run```

**Generate a new specification** for a class

```phpspec describe "[App\\Calculator]"```

**Run a single spec file**

```phpspec run [spec/App/CalculatorSpec.php]```

**Run only the example** defined on a given line

```phpspec run [spec/App/CalculatorSpec.php]:[42]```

**Use a specific output formatter** (progress, pretty, dot, junit, json, tap, html)

```phpspec run --format [pretty]```

**Run without prompting** for code generation (for CI)

```phpspec run --no-interaction```

**Run with a custom configuration file**

```phpspec run --config [phpspec.ci.yml]```

**Stop on the first failure**

```phpspec run --stop-on-failure```

**Show full backtraces** for verbose debugging

```phpspec run -vvv```

# SYNOPSIS

**phpspec** _command_ [_arguments_] [_options_]

# COMMANDS

**run** [_spec_[:_line_]]
> Run all specs (or a single spec file, directory or example line) and offer to generate missing code interactively.

**describe** _CLASS_
> Create a new spec file for the given fully qualified class name.

**help** [_command_]
> Show help for a specific command.

**list**
> List all available commands.

# PARAMETERS

**-c**, **--config** _FILE_
> Use a specific configuration file (default: phpspec.yml or phpspec.yml.dist).

**-f**, **--format** _NAME_
> Output formatter: progress (default), pretty, dot, junit, json, tap, html.

**--stop-on-failure**
> Halt the run as soon as a spec fails.

**--no-code-generation**
> Do not prompt for generating missing classes or methods.

**--no-rerun**
> Do not rerun the suite after code has been generated.

**--fake**
> Automatically fake return values of generated methods when possible.

**-b**, **--bootstrap** _FILE_
> PHP file to run before the specs (e.g. an autoloader).

**-n**, **--no-interaction**
> Do not ask any interactive questions (also disables code generation).

**-v** / **-vv** / **-vvv**
> Increase verbosity. **-vvv** prints exception traces.

**--ansi** / **--no-ansi**
> Force or disable ANSI color output.

**-q**, **--quiet**
> Suppress all output.

**-V**, **--version**
> Display the phpspec version.

# DESCRIPTION

**phpspec** is a SpecBDD (Specification Behaviour-Driven Development) tool for PHP. Rather than verifying existing implementations like a traditional unit test runner, it drives the design of objects: you write a spec describing how a class should behave, run phpspec, and it offers to scaffold the missing class, methods, and return statements for you.

Specs are plain PHP classes that extend **PhpSpec\\ObjectBehavior**. Each `it_*` / `its_*` method is a single example. Collaborators are described as type-hinted parameters and phpspec automatically supplies prophecy-based test doubles for them.

Configuration lives in `phpspec.yml` (also `.phpspec.yml`, `phpspec.yml.dist` and the `.yaml` variants) at the project root, optionally merged with `~/.phpspec.yml`, and controls suites, bootstrap files, formatters, and matchers/extensions. PhpSpec is intentionally narrower than PHPUnit: it focuses on isolated, design-first object specs and pairs naturally with a higher-level acceptance tool such as Behat.

# CONFIGURATION

**phpspec.yml**
> Project configuration: declares suites, namespaces, source directories, formatter, and extensions.

# CAVEATS

PhpSpec is not a drop-in replacement for PHPUnit: it cannot test static methods, final classes (without extensions), or exercise framework-level integration. Generated code is intentionally minimal; you are expected to fill in the real implementation after scaffolding.

This page describes phpspec 8.x, the current stable series. phpspec 9 (in release candidate stage as of late 2026) is a complete rewrite for PHP 8.3+ that replaces **ObjectBehavior** and Prophecy with a closure-based DSL and adds new commands such as an AI-assisted **pair** mode, so specs and options differ.

# HISTORY

The original PHPSpec was created in 2007 by **Pádraic Brady** and **Travis Swicegood**. It was rewritten from scratch as phpspec 2 (released 2014) by **Marcello Duarte** and **Konstantin Kudryashov**, and later maintained largely by **Ciaran McNulty**. It is maintained on GitHub under the `phpspec` organisation and is installable via Composer.

# SEE ALSO

[phpunit](/man/phpunit)(1), [behat](/man/behat)(1), [composer](/man/composer)(1), [php](/man/php)(1)

# RESOURCES

```[Source code](https://github.com/phpspec/phpspec)```

```[Homepage](https://phpspec.net/)```

```[Documentation](https://phpspec.net/8.x/manual/introduction.html)```

<!-- verified: 2026-11-23 -->

