# TLDR

**List available PHP versions**

```php-build --definitions```

**Install PHP version**

```php-build [8.2.0] [~/.phpenv/versions/8.2.0]```

**Install with configure options**

```PHP_BUILD_CONFIGURE_OPTS="--with-openssl" php-build [8.2.0] [/path/to/install]```

**Install specific version with debug**

```php-build -v [8.2.0] [/path/to/install]```

# SYNOPSIS

**php-build** [_options_] _version_ _install-path_

# PARAMETERS

**--definitions**
> List available versions.

**-v**
> Verbose mode.

**-i** _file_
> Read custom definitions.

**--pear**
> Install PEAR.

# DESCRIPTION

**php-build** builds PHP versions from source for use with phpenv or standalone. It handles downloading, configuring, compiling, and installing multiple PHP versions.

# EXAMPLES

```bash
# List versions
php-build --definitions

# Install PHP 8.2
php-build 8.2.0 ~/.phpenv/versions/8.2.0

# With extensions
PHP_BUILD_CONFIGURE_OPTS="--with-curl --with-openssl" \
php-build 8.1.0 /opt/php-8.1.0

# Install with verbose output
php-build -v 8.2.5 ~/.php/8.2.5
```

# ENVIRONMENT

```bash
PHP_BUILD_CONFIGURE_OPTS  # Extra configure options
PHP_BUILD_EXTRA_MAKE_ARGUMENTS  # Extra make arguments
PHP_BUILD_ROOT  # Build directory
```

# CAVEATS

Compilation takes time. Requires build dependencies. Used with phpenv for version management.

# HISTORY

php-build is part of the **phpenv** ecosystem, inspired by ruby-build, for managing multiple PHP versions.

# SEE ALSO

[phpenv](/man/phpenv)(1), [php](/man/php)(1), [pecl](/man/pecl)(1)
