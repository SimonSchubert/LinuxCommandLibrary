# TAGLINE

uploads PHP code coverage reports to Coveralls

# TLDR

**Upload coverage to Coveralls**

```php-coveralls```

**Upload a specific Clover coverage file with logging**

```php-coveralls -v --coverage_clover=[build/logs/clover.xml]```

**Generate the JSON without uploading**

```php-coveralls --dry-run -v```

**Use a config file**

```php-coveralls -c [.coveralls.yml]```

**Upload from a local machine**

```COVERALLS_RUN_LOCALLY=1 COVERALLS_REPO_TOKEN=[token] php-coveralls -v```

# SYNOPSIS

**php-coveralls** [_options_]

# PARAMETERS

**-x**, **--coverage_clover** _FILE_
> Path to a Clover XML coverage file. Can be given multiple times.

**-c**, **--config** _FILE_
> Path to configuration file (default: .coveralls.yml).

**-o**, **--json_path** _FILE_
> Path for JSON output to upload (default: build/logs/coveralls-upload.json).

**-r**, **--root_dir** _DIR_
> Root directory of the project (default: current directory).

**-e**, **--env** _ENV_
> Runtime environment name: test, dev or prod (default: prod).

**--entry_point** _URL_
> API endpoint to send reports to (default: https://coveralls.io).

**--exclude-no-stmt**
> Exclude source files that have no executable statements.

**--dry-run**
> Do not send the JSON file to the Coveralls Jobs API.

**-k**, **--insecure**
> Skip the SSL certificate check.

**-v**, **--verbose**
> Show logs.

**-h**, **--help**
> Display help.

# DESCRIPTION

**php-coveralls** converts a Clover XML report produced by PHPUnit into the Coveralls JSON format and uploads it to the Coveralls Jobs API. It is normally run as a final CI step, as `vendor/bin/php-coveralls` after a Composer install or from the standalone PHAR.

It reads optional settings from `.coveralls.yml`. By default it expects coverage at `build/logs/clover.xml`.

# CAVEATS

Requires a Coveralls project and an existing coverage report; it does not collect coverage itself. On CI services without built-in support, set **COVERALLS_REPO_TOKEN**. Keep the token out of version control. Version 2.9 and later require PHP 7.4 or newer.

# SEE ALSO

[phpunit](/man/phpunit)(1), [codecov](/man/codecov)(1)

# RESOURCES

```[Source code](https://github.com/php-coveralls/php-coveralls)```

<!-- verified: 2026-11-09 -->
