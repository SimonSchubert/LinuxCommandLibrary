# TAGLINE

Laravel's command-line interface for PHP development tasks.

# TLDR

**List all available commands**

```php artisan list```

**Start the development server**

```php artisan serve```

**Run database migrations**

```php artisan migrate```

**Create a new controller**

```php artisan make:controller [UserController]```

**Create a new model** with migration

```php artisan make:model [Post] --migration```

**Generate application key**

```php artisan key:generate```

**Clear all caches**

```php artisan optimize:clear```

**Open interactive shell** (Tinker)

```php artisan tinker```

# SYNOPSIS

**php artisan** _command_ [_arguments_] [_options_]

# PARAMETERS

**list**
> Display all available commands

**serve**
> Start the built-in development server

**migrate**
> Run database migrations

**migrate:rollback**
> Rollback the last database migration

**db:seed**
> Run database seeders

**make:controller** _name_
> Create a new controller class

**make:model** _name_
> Create a new Eloquent model

**make:migration** _name_
> Create a new migration file

**make:command** _name_
> Create a new Artisan command

**cache:clear**
> Clear the application cache

**config:cache**
> Cache the configuration files

**route:list**
> List all registered routes

**queue:work**
> Process jobs from the queue

**tinker**
> Open an interactive REPL shell

**key:generate**
> Generate application encryption key

**optimize**
> Cache configuration, routes, and views

**optimize:clear**
> Clear all cached files

**--help**
> Display help for a command

**-v**, **-vv**, **-vvv**
> Increase verbosity of output

**--env=**_environment_
> Run command in a specific environment

# DESCRIPTION

**Artisan** is Laravel's command-line interface for PHP web application development. It provides commands for common tasks like database migrations, code generation, cache management, and queue processing.

The tool automates repetitive development tasks through its **make:** commands, which generate boilerplate code for controllers, models, migrations, tests, and other Laravel components. Database management is handled through migration commands that version-control schema changes.

**Tinker** provides an interactive REPL (Read-Eval-Print Loop) for exploring the application, testing code snippets, and interacting with Eloquent models directly.

Custom commands can be created with **make:command** and registered automatically from the **app/Console/Commands** directory. Commands support arguments, options, user prompts, and formatted output including tables and progress bars.

# CAVEATS

Must be run from the Laravel project root directory where the **artisan** file exists. Requires PHP to be installed and in the system PATH. Some commands like **migrate** require database configuration. When using Laravel Sail (Docker), prefix commands with **sail** instead of **php**.

# HISTORY

Artisan was introduced with **Laravel 3** in **2012** by Taylor Otwell, inspired by Symfony Console. It has grown with each Laravel release, adding new generators and utilities. The name references Laravel's positioning as "the framework for web artisans." Laravel Tinker, powered by PsySH, was added to provide interactive debugging capabilities.

# SEE ALSO

[composer](/man/composer)(1), [php](/man/php)(1), [symfony](/man/symfony)(1)
