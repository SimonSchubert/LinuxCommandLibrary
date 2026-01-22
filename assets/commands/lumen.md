# TLDR

**Create new project**

```lumen new [project-name]```

**Serve application**

```php -S localhost:8000 -t public```

**Generate key**

```php artisan key:generate```

**Run migrations**

```php artisan migrate```

**List routes**

```php artisan route:list```

**Clear cache**

```php artisan cache:clear```

# SYNOPSIS

**lumen** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Lumen command to execute.

**new** _NAME_
> Create new project.

**--help**
> Display help information.

# DESCRIPTION

**lumen** is a PHP micro-framework by Laravel. It's designed for fast microservices and APIs.

The framework provides routing, caching, and Eloquent ORM with minimal overhead.

lumen is Laravel's micro-framework.

# CAVEATS

Requires PHP and Composer. Subset of Laravel features. Uses artisan for commands.

# HISTORY

Lumen was created by **Taylor Otwell** in 2015 as a lightweight version of Laravel for microservices.

# SEE ALSO

[php](/man/php)(1), [composer](/man/composer)(1), [artisan](/man/artisan)(1)

