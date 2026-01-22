# TLDR

**Start an interactive console** with the Rails application loaded

```rails console```

**Start in sandbox mode** (all database changes rolled back on exit)

```rails console --sandbox```

**Start console in a specific environment**

```rails console -e [production|test|development]```

**Start console in production environment**

```rails console --environment=production```

# SYNOPSIS

**rails console** [**-e** _environment_] [**--sandbox**] [**-h**]

# PARAMETERS

**-e**, **--environment** _ENV_
> Specify the Rails environment (development, test, production)

**--sandbox**, **-s**
> Rollback any database changes made during the session on exit

**-h**, **--help**
> Show help information

# DESCRIPTION

**rails console** opens an interactive Ruby (IRB) session with the full Rails application environment loaded. This includes all models, configuration, and database connections, making it a powerful tool for exploring and debugging applications.

The console provides direct access to ActiveRecord models for querying and manipulating data, testing methods and business logic, and inspecting application state. It inherits the full context of the specified Rails environment.

Sandbox mode wraps the entire session in a database transaction that rolls back when you exit. This allows safe experimentation with data without permanent changes, useful for testing destructive operations or debugging production issues.

# CAVEATS

Must be run from within a Rails application directory. The console loads the entire application, so startup time increases with application size.

In production environments, be cautious with data modifications. Even without sandbox mode, the console provides full database access with user privileges.

Sandbox mode only protects database changes. File system modifications, external API calls, or other side effects are not rolled back.

# SEE ALSO

[rails](/man/rails)(1), [irb](/man/irb)(1), [rails-db](/man/rails-db)(1), [ruby](/man/ruby)(1)
