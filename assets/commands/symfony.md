# TAGLINE

Symfony PHP framework development CLI

# TLDR

**Create new project**

```symfony new [project_name]```

**Create web app**

```symfony new [project_name] --webapp```

**Start development server**

```symfony server:start```

**Stop server**

```symfony server:stop```

**Show server status**

```symfony server:status```

**Open in browser**

```symfony open:local```

**Run console command**

```symfony console [command]```

**Check security**

```symfony check:security```

# SYNOPSIS

**symfony** _command_ [_options_] [_args_]

# PARAMETERS

**new** _NAME_
> Create project.

**server:start**
> Start local server.

**server:stop**
> Stop server.

**server:status**
> Show status of the local server.

**server:log**
> Show logs from the local web server and PHP-FPM.

**console** _CMD_
> Run Symfony console (wrapped bin/console).

**open:local**
> Open local project URL in browser.

**check:security**
> Check for known vulnerabilities in composer.lock dependencies.

**local:php:list**
> List installed PHP versions.

**--webapp**
> Scaffold full web app template (Twig, Doctrine, security, etc.).

**--version** _VER_
> Install a specific Symfony version (e.g. lts, 6.4, 7.1).

**-d**, **--daemon**
> Run the local server in the background.

**--allow-http**
> Disable HTTPS on the local server.

# DESCRIPTION

**symfony** is the official command-line tool for managing Symfony PHP framework projects. It provides project scaffolding, a built-in local development server with PHP support, and wrappers for common Symfony console commands.

Project creation offers templates ranging from minimal microservice skeletons to full web applications with pre-configured bundles. The local development server includes automatic HTTPS via locally-trusted certificates, PHP version management, and Docker service integration for databases and other dependencies.

The console wrapper executes Symfony console commands (cache clearing, database migrations, route listing) with automatic environment detection. Security checking scans project dependencies against known vulnerability databases and recommends updates.

# CAVEATS

Requires PHP. Full features need Docker. Symfony account for cloud features.

# HISTORY

The **Symfony CLI** was created by **SensioLabs** for Symfony framework development. It consolidates project management and local development.

# SEE ALSO

[php](/man/php)(1), [composer](/man/composer)(1)
