# TAGLINE

command-line interface for Magento/Adobe Commerce e-commerce platform

# TLDR

**List available commands**

```magento list```

**Enable maintenance mode**

```magento maintenance:enable```

**Disable maintenance mode**

```magento maintenance:disable```

**Clear cache**

```magento cache:clean```

**Flush cache**

```magento cache:flush```

**Reindex all**

```magento indexer:reindex```

**Compile dependency injection**

```magento setup:di:compile```

**Deploy static content**

```magento setup:static-content:deploy```

# SYNOPSIS

**magento** [_command_] [_--help_] [_options_] [_arguments_]

# PARAMETERS

**cache:clean**
> Clean cache types.

**cache:flush**
> Flush cache storage.

**cache:status**
> Show cache status.

**cache:enable** _TYPE_
> Enable cache types.

**cache:disable** _TYPE_
> Disable cache types.

**indexer:reindex**
> Reindex all indexers.

**indexer:status**
> Show indexer status.

**maintenance:enable**
> Enable maintenance mode.

**maintenance:disable**
> Disable maintenance mode.

**setup:upgrade**
> Upgrade database schema.

**setup:di:compile**
> Compile dependency injection.

**setup:static-content:deploy**
> Deploy static view files.

**module:enable** _MODULE_
> Enable module.

**module:disable** _MODULE_
> Disable module.

**deploy:mode:set** _MODE_
> Set application mode (developer, production).

# DESCRIPTION

**magento** is the command-line interface for Magento/Adobe Commerce e-commerce platform. It manages store operations, deployments, and maintenance tasks.

Cache management is critical for performance. Clean removes specific cached data while flush clears all storage. Different cache types (config, layout, block_html, collections, etc.) can be targeted individually.

The deployment process involves dependency injection compilation, static content deployment, and database upgrades. These steps are required after code changes or module installations.

Indexers keep derived data synchronized with source data. Reindexing is needed after catalog changes, price updates, or inventory modifications.

Maintenance mode shows a service unavailable page to customers while allowing administrators to work. IP exceptions can be configured.

# CAVEATS

Commands must run from Magento root directory. File permissions critical - run as web server user. Static content deployment takes time on large catalogs. Memory limits may need increasing for large stores.

# HISTORY

**Magento** was founded in **2008** by **Varien** and later acquired by **eBay** in **2011**, then spun off as an independent company. **Adobe** acquired Magento in **2018**. The CLI was introduced with Magento 2 in **2015**, replacing the earlier admin-based configuration approach.

# SEE ALSO

[composer](/man/composer)(1), [php](/man/php)(1), [mysql](/man/mysql)(1), [nginx](/man/nginx)(8)
