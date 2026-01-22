# TLDR

**Run PHP script**

```php [script.php]```

**Execute code**

```php -r 'echo "Hello\n";'```

**Start built-in server**

```php -S localhost:8000```

**Interactive mode**

```php -a```

**Check syntax**

```php -l [script.php]```

**Show configuration**

```php -i```

**Show version**

```php -v```

# SYNOPSIS

**php** [_options_] [_file_] [_args_]

# PARAMETERS

_FILE_
> PHP script to run.

**-r** _CODE_
> Execute code.

**-S** _ADDR:PORT_
> Built-in server.

**-a**
> Interactive shell.

**-l**
> Syntax check.

**-i**
> Show phpinfo.

**-v**
> Show version.

# DESCRIPTION

**php** is the PHP interpreter. Server-side scripting language.

The tool runs PHP scripts. Web and CLI applications.

php executes PHP code.

# CAVEATS

Configuration via php.ini. Extension availability varies.

# HISTORY

PHP was created by **Rasmus Lerdorf** in 1994 for web development.

# SEE ALSO

[composer](/man/composer)(1), [phpunit](/man/phpunit)(1), [pecl](/man/pecl)(1)

