# TLDR

**Show PHP include directory**

```php-config --include-dir```

**Show extension directory**

```php-config --extension-dir```

**Show configure options**

```php-config --configure-options```

**Show PHP version**

```php-config --version```

# SYNOPSIS

**php-config** [_options_]

# PARAMETERS

**--prefix**
> Installation prefix.

**--includes**
> Include paths for compiling.

**--ldflags**
> Linker flags.

**--libs**
> Libraries.

**--extension-dir**
> Extension installation path.

**--include-dir**
> Header files directory.

**--php-binary**
> Path to php binary.

**--configure-options**
> Configure options used.

**--version**
> PHP version.

# DESCRIPTION

**php-config** provides information about PHP's compile-time configuration. Essential for building PHP extensions and modules.

# EXAMPLES

```bash
# Get extension directory
php-config --extension-dir

# Use in Makefile
INCLUDES = $(shell php-config --includes)
LDFLAGS = $(shell php-config --ldflags)

# Check installed features
php-config --configure-options | tr ' ' '\n' | grep enable

# Build extension with phpize
phpize
./configure --with-php-config=/usr/bin/php-config
make
```

# OUTPUT EXAMPLE

```
$ php-config --version
8.2.0

$ php-config --extension-dir
/usr/lib/php/20220829
```

# CAVEATS

Output varies by PHP installation. Multiple php-config for multiple PHP versions. Essential for extension development.

# HISTORY

php-config is part of the **PHP** distribution, providing build configuration information since PHP 4.

# SEE ALSO

[phpize](/man/phpize)(1), [php](/man/php)(1), [pecl](/man/pecl)(1)
