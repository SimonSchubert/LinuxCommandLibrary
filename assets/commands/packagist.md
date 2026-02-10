# TAGLINE

main repository for PHP packages used by Composer

# TLDR

**Search packages**

```composer search [query]```

**Show package info**

```composer show [vendor/package]```

**Require package**

```composer require [vendor/package]```

**Browse on web**

```xdg-open https://packagist.org/packages/[vendor/package]```

# SYNOPSIS

**Packagist** - PHP package repository

# DESCRIPTION

**Packagist** is the main repository for PHP packages used by Composer. It aggregates PHP packages from GitHub, GitLab, and other sources, making them installable via Composer.

Packagist is not a command but a service accessed through Composer and web interface.

# COMPOSER COMMANDS

```bash
# Search packages
composer search monolog

# Get package info
composer info monolog/monolog

# Install package
composer require monolog/monolog

# Update packages
composer update
```

# PUBLISHING

```bash
# Submit to Packagist
# 1. Create composer.json
# 2. Push to GitHub
# 3. Submit URL at packagist.org
```

# PACKAGE NAMING

```
vendor/package
monolog/monolog
symfony/console
laravel/framework
```

# CAVEATS

Requires Composer installed. Packages need composer.json. Auto-updates from VCS repositories.

# HISTORY

Packagist was created by **Jordi Boggiano** and **Nils Adermann** in **2011** as the default repository for Composer, PHP's dependency manager.

# SEE ALSO

[composer](/man/composer)(1), [php](/man/php)(1), [phpunit](/man/phpunit)(1)
