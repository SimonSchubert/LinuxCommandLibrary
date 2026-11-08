# TAGLINE

Scaffold Rails application components from templates

# TLDR

**Generate model**

```rails generate model [Name] [field:type]```

**Generate controller**

```rails generate controller [Name] [action]```

**Generate scaffold**

```rails generate scaffold [Name] [field:type]```

**Generate migration**

```rails generate migration [Name]```

**Preview** generated files

```rails generate scaffold [Name] --pretend```

**List all generators**

```rails generate```

**Use the short alias**

```rails g model [Name] [field:type]```

# SYNOPSIS

**rails** **generate** _generator_ _name_ [_options_]

# PARAMETERS

**model** _name_
> Generate model.

**controller** _name_
> Generate controller.

**scaffold** _name_
> Generate full CRUD.

**migration** _name_
> Generate migration.

**-p**, **--pretend**
> Preview without creating.

**-f**, **--force**
> Overwrite files that already exist.

**-s**, **--skip**
> Skip files that already exist.

**-q**, **--quiet**
> Suppress status output.

**--skip-routes**
> Don't add routes to config/routes.rb (controller generator).

# DESCRIPTION

**rails generate** creates boilerplate files from templates for common Rails application components. It scaffolds models with database migrations, controllers with associated views and routes, and full CRUD interfaces through the scaffold generator, following Rails naming conventions and directory structure automatically.

Each generator produces the appropriate set of files including source code, test stubs, and configuration entries. The **--pretend** flag previews what would be created without writing files, and **--skip-routes** prevents automatic route additions. Custom generators can be created to match project-specific patterns, and the inverse operation **rails destroy** removes all files a generator created.

# SEE ALSO

[rails](/man/rails)(1), [rails-destroy](/man/rails-destroy)(1)

# RESOURCES

```[Source code](https://github.com/rails/rails)```

```[Documentation](https://guides.rubyonrails.org/generators.html)```

<!-- verified: 2026-11-08 -->
