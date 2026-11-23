# TAGLINE

Interactive Ruby console with Rails loaded

# TLDR

**Start an interactive console** with the Rails application loaded

```rails console```

**Use the short alias**

```rails c```

**Start in sandbox mode** (all database changes rolled back on exit)

```rails console --sandbox```

**Start console in a specific environment**

```rails console -e [production|test|development]```

**Sandbox in a specific environment**

```rails console -e staging --sandbox```

**Pass options through to IRB** after `--`

```rails console -- --nomultiline```

**Reload application code** inside a running console

```reload!```

# SYNOPSIS

**rails console** [**-e** _environment_] [**-s** | **--no-sandbox**] [_options_] [**--** _irb_options_]

**rails c** [_options_]

# PARAMETERS

**-e**, **--environment** _ENV_
> Specify the Rails environment (development, test, production). Defaults to development.

**-s**, **--sandbox**, **--no-sandbox**
> Roll back any database changes made during the session on exit. **--no-sandbox** overrides `config.sandbox_by_default`.

**-w**, **--skip-executor**
> Do not wrap the console with the Rails Executor (Rails 8.2+).

**-q**, **--query-cache**
> Enable the Active Record query cache for the session, which is disabled in the console by default (Rails 8.2+).

**--no-banner**
> Hide the startup banner (Rails 8.2+).

**-h**, **--help**
> Show help information.

# DESCRIPTION

**rails console** opens an interactive Ruby (IRB) session with the full Rails application environment loaded. This includes all models, configuration, and database connections, making it a powerful tool for exploring and debugging applications.

The console provides direct access to ActiveRecord models for querying and manipulating data, testing methods and business logic, and inspecting application state. It inherits the full context of the specified Rails environment.

Sandbox mode wraps the entire session in a database transaction that rolls back when you exit. This allows safe experimentation with data without permanent changes, useful for testing destructive operations or debugging production issues. Setting `config.sandbox_by_default = true` makes sandbox the default in non-local environments such as production.

The console adds helpers on top of IRB: **reload!** reloads application code, **app** returns an integration session for issuing requests and calling route helpers (e.g. `app.root_path`), and **helper** exposes view helpers.

# CAVEATS

Must be run from within a Rails application directory. The console loads the entire application, so startup time increases with application size.

In production environments, be cautious with data modifications. Even without sandbox mode, the console provides full database access with user privileges.

Sandbox mode only protects database changes. File system modifications, external API calls, background jobs, or other side effects are not rolled back. Long sandbox sessions hold an open transaction and may lock rows needed by the running application.

# SEE ALSO

[rails](/man/rails)(1), [irb](/man/irb)(1), [rails-db](/man/rails-db)(1), [rails-server](/man/rails-server)(1), [ruby](/man/ruby)(1)

# RESOURCES

```[Source code](https://github.com/rails/rails)```

```[Homepage](https://rubyonrails.org/)```

```[Documentation](https://guides.rubyonrails.org/command_line.html)```

<!-- verified: 2026-11-23 -->
