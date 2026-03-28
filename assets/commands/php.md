# TAGLINE

PHP command-line interpreter

# TLDR

**Run a PHP script**

```php [script.php]```

**Execute PHP code inline**

```php -r 'echo "Hello\n";'```

**Start the built-in web server**

```php -S localhost:8000```

**Start the built-in server with a document root**

```php -S localhost:8000 -t [/path/to/docroot]```

**Enter interactive mode (REPL)**

```php -a```

**Check a script for syntax errors without executing**

```php -l [script.php]```

**Show phpinfo() output**

```php -i```

**Show loaded modules**

```php -m```

**Set a configuration directive** at runtime

```php -d [memory_limit=256M] [script.php]```

**Run with a specific php.ini**

```php -c [/path/to/php.ini] [script.php]```

**Show which php.ini files** are loaded

```php --ini```

# SYNOPSIS

**php** [_options_] [_-f_] [_file_] [_args_]

# PARAMETERS

_FILE_
> PHP script to execute.

**-r** _CODE_
> Execute PHP code without script tags.

**-S** _ADDR:PORT_
> Start the built-in development web server.

**-t** _DOCROOT_
> Document root for the built-in web server.

**-a**
> Run interactively (REPL mode).

**-l**
> Syntax check only (lint), does not execute.

**-i**
> Output phpinfo() configuration details.

**-m**
> Show compiled-in modules.

**-v**
> Show version information.

**-c** _PATH_
> Use a specific php.ini file or directory.

**-n**
> Run without a php.ini file.

**-d** _DIRECTIVE=VALUE_
> Set a php.ini directive at runtime.

**-e**
> Generate extended information for debuggers/profilers.

**-f** _FILE_
> Parse and execute the given file (explicit form).

**--ini**
> Show the configuration file names that PHP looks for and loads.

**-w**
> Output source with comments and whitespace stripped.

**-B** _CODE_
> Run code before processing stdin (with -R/-F).

**-R** _CODE_
> Run code for every input line from stdin.

**-F** _FILE_
> Parse and execute file for every input line from stdin.

# DESCRIPTION

**php** is the command-line interface to the PHP interpreter. It can execute PHP scripts, run inline code, lint files for syntax errors, and start a built-in development web server. PHP supports procedural, object-oriented, and functional programming paradigms.

The built-in web server (`-S`) is intended for development only and should not be used in production. It serves files from the current directory or a specified document root.

# CAVEATS

Configuration is controlled by php.ini; the loaded file location varies by system (use `php --ini` to find it). Extension availability depends on compile-time options and installed packages. The built-in web server is single-threaded and not suitable for production use.

# HISTORY

PHP was created by **Rasmus Lerdorf** in **1994**, originally as a set of CGI binaries for tracking visits to his web resume. It evolved into a full server-side scripting language. PHP 5 introduced a mature object model, and PHP 7 (2015) brought major performance improvements. PHP 8 (2020) added JIT compilation, named arguments, and attributes.

# SEE ALSO

[composer](/man/composer)(1), [phpunit](/man/phpunit)(1), [pecl](/man/pecl)(1), [php-cs-fixer](/man/php-cs-fixer)(1), [phpize](/man/phpize)(1), [php-config](/man/php-config)(1)

