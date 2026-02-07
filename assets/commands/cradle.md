# TAGLINE

CLI for the Cradle PHP framework

# TLDR

**Install Cradle** framework

```cradle install```

**Create a new module**

```cradle make:module [module_name]```

**Run database migrations**

```cradle migrate```

**Generate model from database** table

```cradle make:model [table_name]```

**Start the development server**

```cradle serve```

**Clear application cache**

```cradle cache:clear```

**List available commands**

```cradle list```

# SYNOPSIS

**cradle** _command_ [_options_] [_arguments_]

# PARAMETERS

**install**
> Install the Cradle framework and dependencies.

**serve**
> Start the built-in development server.

**migrate**
> Run database migrations.

**make:module** _NAME_
> Generate a new module scaffold.

**make:model** _TABLE_
> Generate a model from a database table.

**make:controller** _NAME_
> Generate a new controller.

**cache:clear**
> Clear the application cache.

**queue:work**
> Process jobs from the queue.

**list**
> Display all available commands.

**--help**
> Display help for a command.

# DESCRIPTION

**Cradle** is a PHP framework designed for rapid application development with a focus on modularity and developer experience. The CLI tool provides commands for scaffolding, database management, and development server operations.

The framework follows an event-driven architecture, allowing loose coupling between components. Modules can be developed independently and plugged into applications. The make commands generate boilerplate code following the framework's conventions.

Cradle CLI handles common development tasks including database migrations, model generation from existing schemas, and cache management. The built-in server provides quick access for local development without configuring external web servers.

# CAVEATS

Requires PHP 7.4+ and Composer. Database commands require proper configuration in the framework's settings. The development server is not suitable for production use.

# HISTORY

Cradle was developed as a modern PHP framework emphasizing event-driven programming and modularity. It emerged from the PHP development community's need for frameworks that balance convention with flexibility, providing structure without excessive constraints.

# SEE ALSO

[composer](/man/composer)(1), [php](/man/php)(1), [artisan](/man/artisan)(1)
