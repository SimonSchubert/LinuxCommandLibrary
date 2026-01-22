# TLDR

**Run** tests

```atoum -f [tests/units/MyTest.php]```

Run **all tests** in directory

```atoum -d [tests/units]```

Run with **code coverage**

```atoum -d [tests/] -c```

Generate **HTML** coverage report

```atoum -d [tests/] --coverage-html [coverage/]```

Run tests in **debug** mode

```atoum -d [tests/] --debug```

# SYNOPSIS

**atoum** [_-f file_] [_-d directory_] [_-c_] [_options_]

# DESCRIPTION

**atoum** is a modern PHP unit testing framework emphasizing simplicity and clarity. It provides an intuitive API for writing tests with minimal boilerplate, featuring mocking, code coverage, and parallel execution.

The framework uses a natural, fluent assertion syntax and includes tools for test isolation and dependency injection.

# PARAMETERS

**-f** _file_
> Run specific test file

**-d** _directory_
> Run all tests in directory

**-c**, **--coverage**
> Generate code coverage

**--coverage-html** _dir_
> HTML coverage report

**--coverage-xml** _file_
> XML coverage report

**--debug**
> Debug mode

**-l**, **--loop**
> Run tests in continuous mode

**-p** _n_, **--max-children-number** _n_
> Parallel test execution

**--fail-if-void-methods**
> Fail if test methods are empty

# CAVEATS

Requires PHP 5.6+. Less widely adopted than PHPUnit. Some IDE integrations may be limited. Documentation primarily in French.

# HISTORY

**atoum** was created by Frédéric Hardy and first released in **2011** as a modern alternative to PHPUnit, emphasizing developer experience and test clarity.

# SEE ALSO

[phpunit](/man/phpunit)(1), [phpspec](/man/phpspec)(1), [behat](/man/behat)(1)
