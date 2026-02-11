# TAGLINE

Ruby on Rails web application framework CLI

# TLDR

**Create a new Rails application**

```rails new [app_name]```

**Create a new app with PostgreSQL** database

```rails new [app_name] --database=postgresql```

**Start the development server** on port 3000

```rails server```

**Open an interactive console** with the application loaded

```rails console```

**Generate a model** with attributes

```rails generate model [ModelName] [field:type] [field:type]```

**Generate a controller** with actions

```rails generate controller [ControllerName] [action1] [action2]```

**Run database migrations**

```rails db:migrate```

**List all routes** in the application

```rails routes```

# SYNOPSIS

**rails** _command_ [_options_] [_arguments_]

# PARAMETERS

**new** _app_name_
> Create a new Rails application with standard directory structure

**server**, **s**
> Start the Puma web server (default port 3000)

**console**, **c**
> Open an interactive IRB session with the application context

**generate**, **g**
> Run code generators for models, controllers, migrations, etc.

**destroy**, **d**
> Remove files created by a generator

**db:migrate**
> Run pending database migrations

**db:create**
> Create the database

**db:seed**
> Load seed data from db/seeds.rb

**db:setup**
> Create database, load schema, and seed data

**routes**
> Display all defined routes

**test**
> Run the test suite

**--help**, **-h**
> Display help for any command

**--version**
> Show the Rails version

**-e**, **--environment** _ENV_
> Specify environment (development, test, production)

**-p**, **--port** _PORT_
> Set server port (default 3000)

# DESCRIPTION

**rails** is the command-line interface for the Ruby on Rails web application framework. It provides tools for creating, developing, and managing Rails applications through a unified interface.

The command operates in two contexts: outside an application (primarily **rails new** for creating projects) and inside an application directory (all other commands). Within a project, commands are typically invoked via **bin/rails** to ensure the correct bundled version is used.

Rails emphasizes convention over configuration, and its CLI reflects this by providing generators that create boilerplate code following Rails conventions. The framework integrates database management, testing, asset compilation, and server operation into cohesive command-line workflows.

# CONFIGURATION

**config/database.yml**
> Database connection settings for each environment (development, test, production), specifying adapter, host, credentials, and pool size.

**config/routes.rb**
> Application URL routing definitions mapping HTTP methods and paths to controller actions.

**config/application.rb**
> Main application configuration including framework defaults, middleware, and autoload paths.

**config/environments/**
> Per-environment settings files (development.rb, test.rb, production.rb) controlling caching, logging, and asset behavior.

**RAILS_ENV**
> Environment variable selecting the active environment (defaults to development).

# CAVEATS

Most commands must be run from within a Rails application directory. The **rails new** command is the exception and creates that directory structure.

Generated code should be reviewed before use. Generators create standard patterns that may need customization for specific requirements.

Database commands require proper database configuration in **config/database.yml** and the appropriate database adapter gem.

# HISTORY

Rails was created by **David Heinemeier Hansson** and extracted from the Basecamp project management tool in **2004**. The first public release was version 1.0 in December **2005**. The framework popularized the MVC pattern for web development and introduced conventions like RESTful routing that influenced many subsequent frameworks.

# SEE ALSO

[ruby](/man/ruby)(1), [bundle](/man/bundle)(1), [rake](/man/rake)(1), [gem](/man/gem)(1)
