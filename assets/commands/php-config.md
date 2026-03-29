# TAGLINE

Display information about PHP's compile-time configuration

# TLDR

**Show the PHP installation prefix**

```php-config --prefix```

**Show the extension directory path**

```php-config --extension-dir```

**Show the header file include directory**

```php-config --include-dir```

**Show compiler include flags for building extensions**

```php-config --includes```

**Show the configure options PHP was built with**

```php-config --configure-options```

**Show the PHP version**

```php-config --version```

**Show the path to the PHP binary**

```php-config --php-binary```

**Show all available SAPI modules**

```php-config --php-sapis```

# SYNOPSIS

**php-config** [_options_]

# PARAMETERS

**--prefix**
> PHP installation prefix directory (e.g., /usr or /usr/local).

**--includes**
> Compiler -I flags for all include directories, used when building extensions.

**--ldflags**
> Linker flags PHP was compiled with.

**--libs**
> Extra libraries PHP was compiled with.

**--extension-dir**
> Default directory where extensions are installed and loaded from.

**--include-dir**
> Directory prefix where header files are installed.

**--php-binary**
> Full path to the PHP CLI or CGI binary.

**--php-sapis**
> List all available SAPI (Server API) modules (e.g., cli, fpm, apache2handler).

**--configure-options**
> The ./configure options used when PHP was built, useful for recreating the same build.

**--version**
> PHP version string.

**--vernum**
> PHP version as an integer (e.g., 80200 for 8.2.0), useful in scripts.

**--ini-path**
> Directory from which PHP reads its main INI configuration file.

**--ini-dir**
> Directory from which PHP scans for additional INI configuration files.

# DESCRIPTION

**php-config** is a shell script that provides information about PHP's compile-time configuration. It is essential for building PHP extensions with **phpize** and for writing Makefiles that need to link against PHP.

Typical usage in extension development involves passing **--includes** and **--ldflags** to the compiler, and specifying the full path to php-config via **./configure --with-php-config=/path/to/php-config**.

# CAVEATS

Output varies by PHP installation and version. When multiple PHP versions are installed, each has its own php-config (e.g., php-config7.4, php-config8.2). Always use the path corresponding to the target PHP version when building extensions.

# SEE ALSO

[phpize](/man/phpize)(1), [php](/man/php)(1), [pecl](/man/pecl)(1)
