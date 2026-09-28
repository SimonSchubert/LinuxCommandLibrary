# TAGLINE

command-line interface for Magento/Adobe Commerce e-commerce platform

# TLDR

**List available commands**

```bin/magento list```

**Enable maintenance mode**, allowing access from your IP

```bin/magento maintenance:enable --ip=[203.0.113.10]```

**Disable maintenance mode**

```bin/magento maintenance:disable```

**Clean** specific cache types

```bin/magento cache:clean [config] [layout] [full_page]```

**Flush** all cache storage

```bin/magento cache:flush```

**Reindex** all indexers

```bin/magento indexer:reindex```

Show **indexer status**

```bin/magento indexer:status```

Apply **database schema and data upgrades** after installing modules

```bin/magento setup:upgrade```

**Compile dependency injection**

```bin/magento setup:di:compile```

**Deploy static content** for specific locales

```bin/magento setup:static-content:deploy -f [en_US] [de_DE]```

Switch to **production mode**

```bin/magento deploy:mode:set production```

Show **module status**

```bin/magento module:status```

Create an **admin user**

```bin/magento admin:user:create --admin-user=[admin] --admin-password=[password] --admin-email=[admin@example.com] --admin-firstname=[First] --admin-lastname=[Last]```

# SYNOPSIS

**bin/magento** _command_ [_options_] [_arguments_]

# PARAMETERS

**cache:clean** [_TYPE_...]
> Clean enabled cache types (all if none given).

**cache:flush** [_TYPE_...]
> Flush the cache storage, including entries not created by Magento.

**cache:status**
> Show cache status.

**cache:enable** _TYPE_
> Enable cache types.

**cache:disable** _TYPE_
> Disable cache types.

**indexer:reindex** [_INDEXER_...]
> Reindex all or the given indexers.

**indexer:status**
> Show indexer status.

**indexer:set-mode** _MODE_ [_INDEXER_...]
> Set indexer mode (realtime or schedule).

**maintenance:enable** [_--ip=IP_]
> Enable maintenance mode, optionally exempting IP addresses.

**maintenance:disable**
> Disable maintenance mode.

**setup:upgrade** [_--keep-generated_]
> Upgrade database schema and data after module changes.

**setup:di:compile**
> Compile dependency injection.

**setup:static-content:deploy** [_LOCALES_] [_-f_] [_--jobs=N_]
> Deploy static view files. **-f** forces deployment outside production mode.

**module:status**
> List enabled and disabled modules.

**module:enable** _MODULE_
> Enable module.

**module:disable** _MODULE_
> Disable module.

**deploy:mode:set** _MODE_
> Set application mode (default, developer, production).

**deploy:mode:show**
> Show the current application mode.

**cron:run**
> Run scheduled cron jobs.

**config:set** _PATH_ _VALUE_
> Set a configuration value.

**admin:user:create**
> Create an administrator account.

# DESCRIPTION

**bin/magento** is the command-line interface for the Magento Open Source and Adobe Commerce e-commerce platform. It is a Symfony Console application shipped in the **bin/** directory of every Magento 2 installation and manages store operations, deployments, and maintenance tasks. Extensions can register additional commands.

Cache management is critical for performance. Clean removes specific cached data while flush clears all storage. Different cache types (config, layout, block_html, collections, etc.) can be targeted individually.

The deployment process involves dependency injection compilation, static content deployment, and database upgrades. These steps are required after code changes or module installations.

Indexers keep derived data synchronized with source data. Reindexing is needed after catalog changes, price updates, or inventory modifications.

Maintenance mode is toggled by the **var/.maintenance.flag** file and shows a service unavailable page to customers. IP addresses listed with **--ip** (stored in var/.maintenance.ip) can still reach the store.

# CAVEATS

Commands are run as **bin/magento** from the Magento root directory (or **php bin/magento**); there is no global magento binary. Run them as the file system owner, not root, to avoid permission problems. Static content deployment takes time on large catalogs. Memory limits may need increasing for large stores.

# HISTORY

**Magento** was released in **2008** by **Varien**, fully acquired by **eBay** in **2011**, then spun off as an independent company in 2015. **Adobe** acquired Magento in **2018** and sells the commercial edition as **Adobe Commerce**. The bin/magento CLI was introduced with **Magento 2** in **2015**; Magento 1 reached end of life in June 2020.

# SEE ALSO

[composer](/man/composer)(1), [php](/man/php)(1), [mysql](/man/mysql)(1), [nginx](/man/nginx)(8)

# RESOURCES

```[Source code](https://github.com/magento/magento2)```

```[Documentation](https://experienceleague.adobe.com/en/docs/commerce-operations/tools/cli-reference/commerce-on-premises)```

<!-- verified: 2026-09-29 -->
