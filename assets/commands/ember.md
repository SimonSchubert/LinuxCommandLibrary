# TLDR

**Create new Ember** app

```ember new [app-name]```

**Generate component**

```ember generate component [component-name]```

**Start development** server

```ember serve```

**Build for production**

```ember build --environment production```

**Run tests**

```ember test```

**Install addon**

```ember install [addon-name]```

# SYNOPSIS

**ember** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Ember CLI command: new, generate, serve, build, test, install.

**new** _NAME_
> Create new application.

**generate** _TYPE_ _NAME_
> Generate blueprint (component, route, etc.).

**serve**, **s**
> Start development server.

**build**, **b**
> Build application.

**test**, **t**
> Run test suite.

**install** _ADDON_
> Install Ember addon.

**--help**
> Display help information.

# DESCRIPTION

**ember** is the command-line interface for Ember.js, a JavaScript framework for building ambitious web applications. It handles project scaffolding, development, building, and testing.

The CLI provides generators for creating components, routes, services, and other Ember constructs following conventions. The development server includes live reload.

Ember CLI manages dependencies, build configuration, and addon installation, providing a complete development workflow.

# CAVEATS

Requires Node.js and npm. Large initial project size. Convention-heavy approach has learning curve. Some addons may not be maintained.

# HISTORY

Ember CLI was created to provide a standard toolchain for Ember.js development. Ember.js itself was created by **Yehuda Katz** (also known for jQuery and Rust's Cargo) and **Tom Dale**, released in **2011**.

# SEE ALSO

[npm](/man/npm)(1), [node](/man/node)(1), [angular](/man/angular)(1)
