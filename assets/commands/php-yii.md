# TAGLINE

Yii framework console command runner

# TLDR

**List available commands**

```php yii help```

**Run database migrations**

```php yii migrate```

**Create a new migration**

```php yii migrate/create [create_users_table]```

**Rollback last migration**

```php yii migrate/down```

**Generate model from table**

```php yii gii/model --tableName=[table] --modelClass=[ModelName]```

**Generate CRUD**

```php yii gii/crud --modelClass=[app\\models\\Post]```

**Clear all caches**

```php yii cache/flush-all```

**Get help for a specific command**

```php yii help [migrate]```

# SYNOPSIS

**php** **yii** [_command_] [_--option=value_...]

# SUBCOMMANDS

**help** [_command_]
> Show available commands or help for a specific command.

**migrate**
> Run pending database migrations.

**migrate/create** _name_
> Create a new migration file.

**migrate/down** [_count_]
> Rollback migrations. Default: 1.

**migrate/redo** [_count_]
> Redo migrations (down then up).

**gii/model**
> Generate model class from database table.

**gii/crud**
> Generate CRUD controller and views.

**gii/controller**
> Generate controller class.

**cache/flush-all**
> Clear all application caches.

**cache/flush** _component_
> Flush a specific cache component.

**asset/compress** _configFile_ _bundleFile_
> Combine and compress JavaScript and CSS files.

**serve**
> Run PHP built-in web server.

# PARAMETERS

**--tableName** _name_
> Database table name (gii/model).

**--modelClass** _class_
> Model class name (gii/model, gii/crud).

**--interactive** _0|1_
> Run in non-interactive mode. Default: 1.

**--color** _0|1_
> Enable/disable ANSI color output.

# DESCRIPTION

**yii** is the console entry point for Yii 2.0 PHP framework applications. It provides access to built-in commands for database migrations, code generation, caching, asset management, and application serving.

Console commands use the route format **controller/action** (e.g., migrate/create). Options are passed as **--option=value**. Custom console commands can be created by extending yii\console\Controller.

The **gii** commands provide code generation capabilities for models, controllers, CRUD interfaces, forms, modules, and extensions. The **migrate** commands manage database schema changes through versioned migration files.

# CAVEATS

Must be run from the project root directory where the yii bootstrap file exists. Requires a properly configured Yii 2.0 application. Some commands like gii require the yii2-gii extension. Database commands require configured database connection.

# HISTORY

The Yii console was introduced with **Yii 2.0**, released in **2014** by **Qiang Xue**. The console runner replaced the yiic tool from Yii 1.x with a more flexible command architecture.

# SEE ALSO

[php](/man/php)(1), [composer](/man/composer)(1), [artisan](/man/artisan)(1), [symfony](/man/symfony)(1)

