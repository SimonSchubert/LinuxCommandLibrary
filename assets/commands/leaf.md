# TAGLINE

Command-line tool for scaffolding and managing Leaf PHP projects

# TLDR

**Create** a new Leaf project (interactive preset selection)

```leaf create [my-app]```

**Create** a bare Leaf 3 project

```leaf create [my-app] --basic```

**Create** a project from the API preset

```leaf create [my-app] --api```

**Create** a project from the MVC preset

```leaf create [my-app] --mvc```

**Install** a Leaf module or Composer package into the current project

```leaf install [package_name]```

**Start** the local PHP development server on a custom port

```leaf serve -p [8000]```

**Start** the local server with file watching and hot reload

```leaf serve --watch```

**Open** an interactive shell against the current Leaf application

```leaf interact```

# SYNOPSIS

**leaf** _command_ [_options_] [_arguments_]

# PARAMETERS

**create** _name_
> Scaffold a new Leaf project. Combine with **--basic**, **--api**, **--mvc**, or **--custom** to choose a preset.

**install** _package_
> Install a Leaf module (e.g. **ui**, **auth**, **db**) or any Composer package into the current project.

**serve** [**-p** _port_] [**--watch**]
> Start the built-in PHP development server. **-p** sets the port, **--watch** enables hot reload on file changes.

**interact**
> Open an interactive REPL bound to the current Leaf application context.

**test**
> Run the project test suite.

**deploy**
> Trigger a deployment for the current project (depends on configured driver).

**--basic**
> Use the bare Leaf 3 starter (router + core only).

**--api**
> Use the API-focused preset with routing, validation, and JSON helpers.

**--mvc**
> Use the MVC preset (controllers, views, models).

**--custom**
> Walk through an interactive setup to pick modules manually.

**-h**, **--help**
> Show help for the CLI or a specific subcommand.

**-v**, **--version**
> Print the installed CLI version.

# DESCRIPTION

**leaf** is the official command-line companion for the **Leaf PHP** micro-framework. It scaffolds new applications from curated presets, installs first-party modules and Composer packages, runs a local development server, and exposes an interactive shell for debugging and exploration.

The tool wraps **composer** and the PHP built-in web server, removing the boilerplate of project setup and module wiring. Presets such as **--api** and **--mvc** generate a ready-to-run directory layout with routing, environment loading, and module bindings already configured.

When run in **--watch** mode, **leaf serve** restarts the server on file changes, providing a fast inner-loop for development. **leaf interact** boots the application and drops the user into a Tinker-style REPL where routes, models, and services can be invoked directly.

# CONFIGURATION

Installed globally via Composer:

```
composer global require leafs/cli
```

Composer's vendor bin directory must be on **PATH**:

> **Linux:** **$HOME/.config/composer/vendor/bin** or **$HOME/.composer/vendor/bin**
> **macOS:** **$HOME/.composer/vendor/bin**
> **Windows:** **%USERPROFILE%\AppData\Roaming\Composer\vendor\bin**

Project-level configuration lives in **leaf.config.php** (or environment variables loaded from **.env**). The CLI reads the working directory's **composer.json** to determine project type and available modules.

# CAVEATS

Requires **PHP 7.4+** and **Composer**. The CLI only manages PHP-side dependencies — assets and frontend tooling must still be handled separately (e.g. via **npm**). The name **leaf** collides with several unrelated projects (a Go file watcher, a deep learning framework, a terminal markdown previewer); make sure to install the correct package (**leafs/cli**).

# HISTORY

The Leaf PHP framework was created by **Michael Darko** ("mychi.netlify.app") and the **leafsphp** organization, with the **leaf** CLI introduced to streamline project creation and module management. The CLI is published as **leafs/cli** on Packagist and is distributed under the **MIT** license.

# SEE ALSO

[composer](/man/composer)(1), [php](/man/php)(1), [artisan](/man/artisan)(1)
