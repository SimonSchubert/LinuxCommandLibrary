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
> Path to clover.xml coverage file.

**--coverage-php** _FILE_
> Path to PHP code coverage report file.

**-c**, **--config** _FILE_
> Path to configuration file.

**-o**, **--json_path** _FILE_
> Path for JSON output to upload (default: build/logs/coveralls-upload.json).

**-r**, **--root_dir** _DIR_
> Root directory of the project.

**--dry-run**
> Test without uploading.

**-v**
> Verbose output.

**-h**, **--help**
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

