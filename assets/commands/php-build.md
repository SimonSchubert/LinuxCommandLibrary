# TAGLINE

builds PHP versions from source for use with phpenv or standalone

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

**php-build** builds PHP versions from source for use with phpenv or standalone. It handles downloading, configuring, compiling, and installing multiple PHP versions, including selecting the correct OpenSSL/curl/ICU dependencies and applying patches for older releases.

It is normally invoked via **phpenv install** but can also be run directly to install a PHP version into any prefix.

# ENVIRONMENT

**PHP_BUILD_CONFIGURE_OPTS**
> Extra options passed to the PHP **./configure** script.

**PHP_BUILD_EXTRA_MAKE_ARGUMENTS**
> Additional arguments passed to **make** during compilation.

**PHP_BUILD_ROOT**
> Build root directory.

# CAVEATS

Compilation takes time. Requires build dependencies. Used with phpenv for version management.

# HISTORY

php-build is part of the **phpenv** ecosystem, inspired by ruby-build, for managing multiple PHP versions.

# INSTALL

```dnf: sudo dnf install php```

```pacman: sudo pacman -S php```

```apk: sudo apk add php85```

```brew: brew install php```

```nix: nix profile install nixpkgs#php85```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[phpenv](/man/phpenv)(1), [php](/man/php)(1), [pecl](/man/pecl)(1)
