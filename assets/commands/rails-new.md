# TAGLINE

Create a new Ruby on Rails application

# TLDR

**Create a new Rails application**

```rails new [app_name]```

**Create an application with PostgreSQL** as the database

```rails new [app_name] --database=postgresql```

**Create an application with MySQL**

```rails new [app_name] --database=mysql```

**Create an API-only application** (no views or assets)

```rails new [app_name] --api```

**Create an application without Action Mailer**

```rails new [app_name] --skip-action-mailer```

**Create an application with a specific Rails version**

```rails _[version]_ new [app_name]```

**Create an application in the current directory**

```rails new .```

# SYNOPSIS

**rails new** _app_name_ [**--database**=_adapter_] [**--api**] [**--skip-***] [_options_]

# PARAMETERS

**--database**, **-d** _adapter_
> Preconfigure for selected database (sqlite3, mysql, postgresql, oracle, sqlserver, etc.)

**--api**
> Create an API-only application (smaller middleware stack, no views)

**--skip-git**
> Skip git init and .gitignore generation

**--skip-docker**
> Skip Dockerfile and related files

**--skip-action-mailer**
> Skip Action Mailer files

**--skip-action-mailbox**
> Skip Action Mailbox gem

**--skip-action-text**
> Skip Action Text gem

**--skip-active-record**
> Skip Active Record files (for non-database apps)

**--skip-active-storage**
> Skip Active Storage files

**--skip-action-cable**
> Skip Action Cable files

**--skip-asset-pipeline**
> Skip asset pipeline

**--skip-javascript**
> Skip JavaScript files

**--skip-hotwire**
> Skip Hotwire integration

**--skip-jbuilder**
> Skip jbuilder gem

**--skip-test**
> Skip test files

**--skip-bundle**
> Don't run bundle install

**--css** _processor_
> Choose CSS processor (tailwind, bootstrap, bulma, postcss, sass)

**--javascript** _bundler_
> Choose JavaScript bundler (importmap, bun, webpack, esbuild, rollup)

**--template**, **-m** _path_
> Apply an application template from a path or URL

**--force**, **-f**
> Overwrite files that already exist

**--pretend**, **-p**
> Run but do not make any changes

**--quiet**, **-q**
> Suppress status output

# DESCRIPTION

**rails new** creates a new Ruby on Rails application with the standard directory structure, configuration files, and dependencies. It generates everything needed to start developing a web application immediately.

The command creates directories for models, views, controllers, tests, and configurations. It initializes a Gemfile with common dependencies, sets up database configuration, and optionally initializes a git repository.

Rails applications follow convention over configuration. The generated structure establishes conventions that other Rails commands and the framework expect, enabling features like automatic routing and model discovery.

# CAVEATS

The **rails new** command is typically run outside of any existing Rails application directory. Running it inside an existing Rails app may cause conflicts.

The default database is SQLite, which is suitable for development but not recommended for production. Specify a production-ready database with **--database** when creating applications intended for deployment.

Bundle install runs automatically unless **--skip-bundle** is specified. This can take time on first run as gems are downloaded and compiled.

# SEE ALSO

[rails](/man/rails)(1), [bundle](/man/bundle)(1), [gem](/man/gem)(1), [ruby](/man/ruby)(1)
