# TAGLINE

laravel framework's command line interface

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

**Generate migration**

```php artisan make:migration [create_users_table]```

**Rollback last migration**

```php artisan migrate:rollback```

**List all routes**

```php artisan route:list```

**Start interactive shell (tinker)**

```php artisan tinker```

**Cache configuration**

```php artisan config:cache```

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

**queue:work**
> Start processing jobs on the queue.

**schedule:run**
> Run the scheduled commands.

**migrate:rollback**
> Rollback the last database migration.

**migrate:fresh**
> Drop all tables and re-run all migrations.

**make:middleware** _name_
> Generate middleware class.

**make:seeder** _name_
> Generate database seeder class.

**-v**, **-vv**, **-vvv**
> Increase verbosity of output.

**--env** _ENV_
> The environment the command should run under.

# DESCRIPTION

**php artisan** is the Laravel framework's command line interface. Provides commands for common development tasks like code generation, database migrations, caching, and server management.

# SEE ALSO

[php](/man/php)(1), [composer](/man/composer)(1), [laravel](/man/laravel)(1)

