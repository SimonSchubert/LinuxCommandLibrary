# TAGLINE

dependency manager for PHP projects

# TLDR

**Install** dependencies

```composer install```

**Add** package

```composer require [vendor/package]```

**Update** packages

```composer update```

**Create** project

```composer create-project [laravel/laravel] [myapp]```

**Show** installed packages

```composer show```

**Remove** package

```composer remove [vendor/package]```

# SYNOPSIS

**composer** _command_ [_options_]

# DESCRIPTION

**composer** is the dependency manager for PHP. It manages project dependencies, autoloading, and provides tools for package installation and version management through Packagist and other repositories.

The tool is essential for modern PHP development and used by virtually all PHP frameworks.

# PARAMETERS

**install**
> Install dependencies from composer.json

**require** _package_
> Add package to dependencies

**update** [_packages_]
> Update dependencies

**remove** _package_
> Remove package

**create-project** _package_ _dir_
> Create new project

**show** [_package_]
> Show packages

**search** _query_
> Search packages

**dump-autoload**
> Regenerate autoloader

**self-update**
> Update Composer itself

# CONFIGURATION

**composer.json**
> Project dependencies and metadata.

**composer.lock**
> Locked dependency versions for reproducible installs.

**~/.composer/config.json**
> Global composer configuration.

**~/.composer/auth.json**
> Authentication credentials for private repositories.

# COMPOSER.JSON

```json
{
    "name": "vendor/project",
    "require": {
        "php": "^8.1",
        "monolog/monolog": "^3.0"
    },
    "require-dev": {
        "phpunit/phpunit": "^10.0"
    },
    "autoload": {
        "psr-4": {
            "App\\": "src/"
        }
    }
}
```

# WORKFLOW

```bash
# Initialize new project
composer init

# Add dependency
composer require guzzlehttp/guzzle

# Add dev dependency
composer require --dev phpunit/phpunit

# Install all dependencies
composer install

# Update specific package
composer update monolog/monolog

# Update all
composer update

# Show why package is installed
composer why vendor/package

# Check for security issues
composer audit
```

# VERSION CONSTRAINTS

- **^1.2.3** - >=1.2.3 <2.0.0 (recommended)
- **~1.2.3** - >=1.2.3 <1.3.0
- **1.2.*** - >=1.2.0 <1.3.0
- **>=1.2.3** - 1.2.3 or higher
- **dev-master** - Latest from master branch

# FEATURES

- Dependency resolution
- Autoloading (PSR-4, PSR-0, classmap)
- Scripts and hooks
- Platform requirements
- Private repositories
- Security auditing
- Lock file (composer.lock)

# CAVEATS

First install can be slow. Memory-intensive for large projects. Network required for updates. composer.lock should be committed (for applications). Version conflicts can be frustrating. Some packages abandoned or poorly maintained.

# HISTORY

**Composer** was created by Nils Adermann and Jordi Boggiano in **2011**, inspired by npm and bundler, becoming PHP's standard dependency manager by **2013**.

# SEE ALSO

[npm](/man/npm)(1), [pip](/man/pip)(1), [bundle](/man/bundle)(1)
