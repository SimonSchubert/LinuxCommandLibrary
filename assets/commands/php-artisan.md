# TLDR

**List commands**

```php artisan list```

**Start development server**

```php artisan serve```

**Run migrations**

```php artisan migrate```

**Generate controller**

```php artisan make:controller [UserController]```

**Generate model with migration**

```php artisan make:model [User] -m```

**Clear cache**

```php artisan cache:clear```

# SYNOPSIS

**php artisan** _command_ [_options_] [_arguments_]

# PARAMETERS

**serve**
> Start development server.

**migrate**
> Run database migrations.

**make:controller** _name_
> Generate controller.

**make:model** _name_
> Generate model.

**make:migration** _name_
> Generate migration.

**cache:clear**
> Clear application cache.

**config:cache**
> Cache configuration.

**route:list**
> List all routes.

**tinker**
> Start interactive shell.

# DESCRIPTION

**php artisan** is the Laravel framework's command line interface. Provides commands for common development tasks like code generation, database migrations, caching, and server management.

# SEE ALSO

[php](/man/php)(1), [composer](/man/composer)(1)

