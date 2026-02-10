# TAGLINE

prepares PHP extensions for compilation

# TLDR

**Prepare extension for building**

```phpize```

**Clean generated files**

```phpize --clean```

**Show version**

```phpize --version```

**Use specific PHP version**

```/usr/bin/phpize[7.4]```

# SYNOPSIS

**phpize** [_--clean_] [_--version_]

# PARAMETERS

**--clean**
> Remove generated files.

**--version**
> Show phpize version.

**--help**
> Show help.

# DESCRIPTION

**phpize** prepares PHP extensions for compilation. It generates configure scripts and build files.

Run phpize in the extension source directory. It creates necessary autoconf files.

The configure script is generated from config.m4. This enables standard ./configure && make installation.

Multiple PHP versions may have separate phpize binaries. Use the version matching your target PHP installation.

After phpize, run configure with PHP config path. Then make and make install complete the build.

# BUILD STEPS

1. **phpize** - Generate configure script
2. **./configure** - Configure build options
3. **make** - Compile extension
4. **make install** - Install extension
5. Add extension to php.ini

# CAVEATS

Requires PHP development headers. Extension must be compatible with PHP version. Autoconf and build tools needed.

# HISTORY

**phpize** is part of PHP's build system, originating from PHP 4. It enables PECL extensions and custom modules to be built separately from the main PHP installation.

# SEE ALSO

[php](/man/php)(1), [php-config](/man/php-config)(1), [pecl](/man/pecl)(1), [make](/man/make)(1)
