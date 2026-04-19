# TAGLINE

SpecBDD framework for designing and testing PHP code

# TLDR

**Run all specifications** in the project

```phpspec run```

**Generate a new specification** for a class

```phpspec describe "[App\\Calculator]"```

**Run a single spec file**

```phpspec run [spec/App/CalculatorSpec.php]```

**Use a specific output formatter** (pretty, progress, junit, dot, tap, html)

```phpspec run --format [pretty]```

**Run without prompting** to auto-generate missing classes/methods

```phpspec run --no-interaction```

**Stop on the first failure**

```phpspec run --stop-on-failure```

**Show full backtraces** for verbose debugging

```phpspec run -vvv```

# SYNOPSIS

**phpspec** _command_ [_arguments_] [_options_]

# COMMANDS

**run** [_spec_]
> Run all specs (or a single spec file/class) and offer to generate missing code interactively.

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
> Output formatter: progress (default), pretty, junit, dot, tap, html.

**--stop-on-failure**
> Halt the run as soon as a spec fails.

**--fake**
> Make generated dummy methods return realistic fake data.

**-n**, **--no-interaction**
> Do not ask any interactive questions; assume defaults.

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

Configuration lives in `phpspec.yml` (or `phpspec.yml.dist`) at the project root and controls suites, bootstrap files, formatters, and matchers/extensions. PhpSpec is intentionally narrower than PHPUnit — it focuses on isolated, design-first object specs and pairs naturally with a higher-level acceptance tool such as Behat.

# CONFIGURATION

**phpspec.yml**
> Project configuration: declares suites, namespaces, source directories, formatter, and extensions.

# CAVEATS

PhpSpec is not a drop-in replacement for PHPUnit — it cannot test static methods, final classes (without extensions), or exercise framework-level integration. Generated code is intentionally minimal; you are expected to fill in the real implementation after scaffolding.

# HISTORY

PhpSpec was started in 2007 by **Marcello Duarte** and rewritten as PhpSpec 2 in 2014 with help from **Konstantin Kudryashov** and the Behat community. It is maintained on GitHub under the `phpspec` organisation and is installable via Composer.

# SEE ALSO

[phpunit](/man/phpunit)(1), [behat](/man/behat)(1), [composer](/man/composer)(1)

