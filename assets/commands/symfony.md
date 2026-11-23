# TAGLINE

Symfony PHP framework development CLI

# TLDR

**Create new project**

```symfony new [project_name]```

**Create web app**

```symfony new [project_name] --webapp```

Create a project with a **specific Symfony version**

```symfony new [project_name] --version=[lts]```

**Start development server**

```symfony server:start```

Start the server **in the background** and open the browser

```symfony server:start -d --open```

**Install the local CA** for trusted HTTPS

```symfony server:ca:install```

**Follow the server logs**

```symfony server:log```

**Stop server**

```symfony server:stop```

**Show server status**

```symfony server:status```

**Open in browser**

```symfony open:local```

**Run console command** with the project's PHP version

```symfony console [command]```

Run **Composer** with the project's PHP version

```symfony composer [install]```

**Check** composer.lock dependencies for **known vulnerabilities**

```symfony check:security```

**Check** that the system meets Symfony's **requirements**

```symfony check:requirements```

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

**server:ca:install**
> Create and trust a local certificate authority for HTTPS.

**server:log**
> Show logs from the local web server and PHP-FPM.

**console** _CMD_
> Run Symfony console (wrapped bin/console).

**open:local**
> Open local project URL in browser.

**check:security**
> Check for known vulnerabilities in composer.lock dependencies.

**check:requirements**
> Check that the system meets the requirements to run Symfony.

**local:php:list**
> List installed PHP versions.

**composer**, **php** _ARGS_
> Run Composer or PHP using the version selected for the project.

**--webapp**
> (new) Scaffold full web app template (Twig, Doctrine, security, etc.).

**--api**
> (new) Add the API pack for an API project.

**--version** _VER_
> (new) Install a specific Symfony version or one of lts, stable, next, previous.

**--demo**
> (new) Create the Symfony Demo application.

**--docker**
> (new) Enable Docker support.

**--no-git**
> (new) Do not initialize a Git repository.

**-d**, **--daemon**
> (server:start) Run the local server in the background.

**--port** _PORT_
> (server:start) Preferred HTTP port (default: 8000).

**--open**
> (server:start) Open the application in the browser after starting.

**--no-tls**
> (server:start) Use HTTP instead of HTTPS.

**--allow-http**
> (server:start) Do not auto-redirect HTTP requests to HTTPS.

**--allow-all-ip**
> (server:start) Listen on all network interfaces instead of 127.0.0.1.

# DESCRIPTION

**symfony** is the official command-line tool for managing Symfony PHP framework projects. It provides project scaffolding, a built-in local development server with PHP support, and wrappers for common Symfony console commands.

Project creation offers templates ranging from minimal microservice skeletons to full web applications with pre-configured bundles. The local development server includes automatic HTTPS via locally-trusted certificates, PHP version management, and Docker service integration for databases and other dependencies.

The console wrapper executes Symfony console commands (cache clearing, database migrations, route listing) with automatic environment detection. Security checking scans project dependencies against known vulnerability databases and recommends updates.

# CAVEATS

Requires PHP and Composer. Docker integration (database and other services exposed as environment variables) needs Docker Compose. The local web server is for development only and must not be used in production. Cloud commands deploy to **Upsun** (formerly Platform.sh) and need an account there.

# HISTORY

The **Symfony CLI** was created by **SensioLabs**/Symfony SAS for Symfony framework development, replacing the older PHP-based **symfony installer** and the **server:run** bundle. It was originally distributed as a closed-source binary and was **open-sourced in early 2022**; it is written in **Go**.

# SEE ALSO

[php](/man/php)(1), [composer](/man/composer)(1)

# RESOURCES

```[Source code](https://github.com/symfony-cli/symfony-cli)```

```[Homepage](https://symfony.com/download)```

```[Documentation](https://symfony.com/doc/current/setup/symfony_cli.html)```

<!-- verified: 2026-11-23 -->
