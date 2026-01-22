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

**phpunit** is PHP testing framework. Unit and integration testing.

The tool provides assertions and mocks. Standard PHP testing tool.

phpunit runs PHP tests.

# CAVEATS

Configuration via phpunit.xml. Coverage needs Xdebug/PCOV.

# HISTORY

PHPUnit was created by **Sebastian Bergmann** as the standard **PHP testing framework**.

# SEE ALSO

[phpspec](/man/phpspec)(1), [pest](/man/pest)(1), [php](/man/php)(1)

