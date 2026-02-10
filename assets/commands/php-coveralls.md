# TAGLINE

uploads coverage to Coveralls

# TLDR

**Upload coverage to Coveralls**

```php-coveralls```

**Specify coverage file**

```php-coveralls -v --coverage_clover=[coverage.xml]```

**Dry run**

```php-coveralls --dry-run```

**Use config file**

```php-coveralls -c [.coveralls.yml]```

# SYNOPSIS

**php-coveralls** [_options_]

# PARAMETERS

**--coverage_clover** _FILE_
> Clover XML file.

**-c** _FILE_
> Config file.

**--dry-run**
> Test without uploading.

**-v**
> Verbose output.

**--help**
> Display help.

# DESCRIPTION

**php-coveralls** uploads coverage to Coveralls. PHP code coverage reporting.

The tool integrates with CI systems. Tracks test coverage over time.

# CAVEATS

Requires Coveralls account. CI environment variables needed.

# HISTORY

php-coveralls was created for **PHP code coverage** reporting to Coveralls.

# SEE ALSO

[phpunit](/man/phpunit)(1), [codecov](/man/codecov)(1)

