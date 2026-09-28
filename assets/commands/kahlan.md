# TAGLINE

BDD testing framework for PHP

# TLDR

**Run** all specs in the spec directory

```vendor/bin/kahlan```

Run a **specific spec** file or directory

```kahlan --spec=[spec/MySpec.php]```

Match spec files by a **filename pattern**

```kahlan --grep="[*Test.php]"```

Show a **code coverage** summary (detail level 0-4)

```kahlan --coverage=[4]```

Show detailed coverage for a **specific class or method**

```kahlan --coverage="[App\Service::run()]"```

Export coverage in **Clover XML** format for CI

```kahlan --clover=[clover.xml]```

Use a different **reporter** and also write TAP output to a file

```kahlan --reporter=[verbose] --reporter=[tap]:[results.tap]```

**Stop** after the first failure

```kahlan --ff=1```

# SYNOPSIS

**kahlan** [_options_]

# PARAMETERS

**--config**=_FILE_
> PHP configuration file (default: kahlan-config.php).

**--src**=_PATH_
> Source directories (default: src). Repeatable.

**--spec**=_PATH_
> Spec files or directories (default: spec). Repeatable.

**--grep**=_PATTERN_
> Shell wildcard for spec files (default: \*Spec.php and \*.spec.php).

**--reporter**=_NAME_[:_FILE_]
> Reporter: dot (default), bar, json, tap, tree or verbose; optionally redirected to a file. Repeatable.

**--coverage**=_LEVEL_|_SCOPE_
> Coverage report detail (0-4), or a namespace, class or method for a detailed report. Requires Xdebug or PCOV.

**--clover**=_FILE_
> Export coverage as Clover XML.

**--istanbul**=_FILE_
> Export coverage as istanbul-compatible JSON.

**--lcov**=_FILE_
> Export coverage in lcov format.

**--part**=_N_/_M_
> Run only part N of M, for parallel testing (default: 1/1).

**--ff**=_N_
> Fast fail after N failures; 0 means unlimited (default: 0).

**--no-colors**
> Disable colored output.

**--no-header**
> Do not print the header.

**--include**=_PATH_, **--exclude**=_PATH_
> Paths to include or exclude from code patching.

**--persistent**=_BOOL_
> Cache patched files (default: true).

**--cc**
> Clear the cache before running specs.

**--help**
> Display help information.

**--version**
> Print the Kahlan version.

# DESCRIPTION

**Kahlan** is a BDD testing framework for PHP. It uses a **describe-it** syntax similar to Jasmine and RSpec, with **expect()** matchers such as **toBe**, **toEqual** and **toThrow**.

It supports stubbing and mocking of classes and functions, including monkey patching of core PHP functions without extensions, by patching source code on the fly when it is loaded. Built-in code coverage and several reporters are included, and runs are customized through a **kahlan-config.php** file.

# CAVEATS

Usually installed per project via Composer, so the binary lives at **vendor/bin/kahlan**. Code coverage needs Xdebug or PCOV. The syntax differs from PHPUnit, so test suites are not interchangeable.

# HISTORY

Kahlan was created by **Simon Jaillet** in **2013** and is developed on GitHub under the kahlan organization.

# SEE ALSO

[phpunit](/man/phpunit)(1), [phpspec](/man/phpspec)(1), [pest](/man/pest)(1), [composer](/man/composer)(1)

# RESOURCES

```[Source code](https://github.com/kahlan/kahlan)```

```[Documentation](https://kahlan.github.io/docs/)```

<!-- verified: 2026-09-29 -->
