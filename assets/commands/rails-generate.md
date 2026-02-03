# TLDR

**Generate model**

```rails generate model [Name] [field:type]```

**Generate controller**

```rails generate controller [Name] [action]```

**Generate scaffold**

```rails generate scaffold [Name] [field:type]```

**Generate migration**

```rails generate migration [Name]```

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

**--skip-routes**
> Don't add routes.

# DESCRIPTION

**rails generate** creates files from templates. Scaffolds models, controllers, views, and migrations. Core Rails workflow for adding application components.

# SEE ALSO

[rails](/man/rails)(1), [rails-destroy](/man/rails-destroy)(1)

