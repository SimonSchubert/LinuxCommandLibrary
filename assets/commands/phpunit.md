# TAGLINE

PHP testing framework

# TLDR

**Run all tests**

```phpunit```

**Run specific test file**

```phpunit [tests/ExampleTest.php]```

**Run tests in directory**

```phpunit [tests/]```

**Run specific test**

```phpunit --filter [testMethodName]```

**Generate coverage report**

```phpunit --coverage-html [coverage/]```

**Use configuration**

```phpunit -c [phpunit.xml]```

# SYNOPSIS

**phpunit** [_options_] [_files_...]

# PARAMETERS

_FILES_
> Test files or directories.

**--filter** _PATTERN_
> Filter tests.

**--coverage-html** _DIR_
> HTML coverage report.

**-c** _FILE_
> Configuration file.

**--testdox**
> TestDox output.

**--help**
> Display help.

# DESCRIPTION

**phpunit** is the de facto unit and integration testing framework for PHP, based on the xUnit family. It discovers and runs test classes that extend `PHPUnit\Framework\TestCase`, providing rich assertions, data providers, test doubles, and code coverage reporting.

Tests are typically organized under a `tests/` directory and configured via a `phpunit.xml` file at the project root, which defines test suites, bootstrap files, and coverage filters. Results can be output in TestDox, JUnit XML, and other formats for CI integration.

# CONFIGURATION

**phpunit.xml**, **phpunit.xml.dist**
> Project configuration: test suites, bootstrap, coverage filters, and PHP settings.

# CAVEATS

Configuration via phpunit.xml. Code coverage requires Xdebug or PCOV to be installed. Major versions (9, 10, 11) have removed deprecated APIs, so test code may need updates when upgrading.

# HISTORY

PHPUnit was created by **Sebastian Bergmann** as the standard **PHP testing framework**.

# INSTALL

```apk: sudo apk add phpunit```

```brew: brew install phpunit```

```nix: nix profile install nixpkgs#phpunit```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[phpspec](/man/phpspec)(1), [pest](/man/pest)(1), [php](/man/php)(1)

