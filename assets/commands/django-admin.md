# TLDR

**Start a new project**

```django-admin startproject [project_name]```

**Start a new app**

```django-admin startapp [app_name]```

**Run development server**

```django-admin runserver```

**Create database migrations**

```django-admin makemigrations```

**Apply database migrations**

```django-admin migrate```

**Create superuser**

```django-admin createsuperuser```

**Open Django shell**

```django-admin shell```

# SYNOPSIS

**django-admin** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Django management command to execute.

**startproject** _NAME_
> Create new Django project.

**startapp** _NAME_
> Create new Django app.

**runserver** [_PORT_]
> Run development server.

**makemigrations** [_APP_]
> Create migration files.

**migrate** [_APP_]
> Apply migrations.

**createsuperuser**
> Create admin user.

**shell**
> Open interactive Python shell with Django context.

**--settings** _MODULE_
> Settings module to use.

**--help**
> Display help information.

# DESCRIPTION

**django-admin** is Django's command-line utility for administrative tasks. It provides commands for project setup, database management, testing, and development server operation.

The tool requires a Django settings module to function. When inside a project directory, it automatically discovers the settings; otherwise, the DJANGO_SETTINGS_MODULE environment variable or --settings flag specifies the configuration.

django-admin is typically aliased or replaced by manage.py within projects, which automatically configures the settings module. Both provide identical functionality.

# CAVEATS

Requires Django installed. Some commands require configured settings and database. Development server not suitable for production. Migration commands require database access.

# HISTORY

django-admin is part of **Django**, created by **Adrian Holovaty** and **Simon Willison** at the Lawrence Journal-World newspaper. Django was released as open source in **2005** and has become one of the most popular Python web frameworks.

# SEE ALSO

[python](/man/python)(1), [pip](/man/pip)(1), [manage.py](/man/manage.py)(1)
