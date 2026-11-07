# TAGLINE

main repository for PHP packages used by Composer

# TLDR

**Search packages**

```composer search [query]```

**Show package info** (remote, including all versions)

```composer show --all [vendor/package]```

**Require package**

```composer require [vendor/package]```

**Open** the package homepage/repository

```composer browse [vendor/package]```

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

# Get package info (installed or remote)
composer show --all monolog/monolog

# Install package
composer require monolog/monolog

# Update packages
composer update
```

# PUBLISHING

```bash
# 1. Validate composer.json (needs a "name": "vendor/package")
composer validate
# 2. Push to a public VCS repo and tag a release
git tag v1.0.0 && git push --tags
# 3. Submit the repo URL at https://packagist.org/packages/submit
# 4. Enable the GitHub/GitLab webhook so new tags update automatically
```

# PACKAGE NAMING

```
vendor/package
monolog/monolog
symfony/console
laravel/framework
```

# CAVEATS

Requires Composer installed. Packages need a valid composer.json with a **vendor/package** name. Versions come from VCS tags and branches; without a webhook, Packagist only re-crawls periodically. Private packages need **Private Packagist** or a custom **repositories** entry. Metadata is served via the Composer v2 API at **repo.packagist.org**.

# HISTORY

Packagist was created by **Jordi Boggiano** and **Nils Adermann** in **2011** as the default repository for Composer, PHP's dependency manager.

# SEE ALSO

[composer](/man/composer)(1), [php](/man/php)(1), [phpunit](/man/phpunit)(1)

# RESOURCES

```[Homepage](https://packagist.org)```

```[Source code](https://github.com/composer/packagist)```

```[Documentation](https://packagist.org/about)```

<!-- verified: 2026-11-07 -->
