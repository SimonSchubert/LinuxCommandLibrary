# TLDR

**Create new app**

```sails new [project-name]```

**Start development server**

```sails lift```

**Generate API**

```sails generate api [user]```

**Generate model**

```sails generate model [user]```

**Generate controller**

```sails generate controller [user]```

**Open console**

```sails console```

**Show routes**

```sails inspect```

# SYNOPSIS

**sails** _command_ [_options_] [_args_]

# PARAMETERS

**new** _NAME_
> Create new app.

**lift**
> Start server.

**generate** _TYPE_ _NAME_
> Generate component.

**console**
> Interactive REPL.

**inspect**
> Show app info.

**debug**
> Start in debug mode.

**--port** _PORT_
> Server port.

**--prod**
> Production mode.

# DESCRIPTION

**Sails.js** is an MVC framework for Node.js. It provides conventions for building APIs and web apps.

Blueprints auto-generate REST APIs. Models get CRUD endpoints automatically.

Waterline ORM works with multiple databases. MySQL, PostgreSQL, MongoDB supported.

Socket.io integration enables real-time features. Blueprints work over WebSockets too.

Policies provide access control. Middleware-like hooks protect routes.

# CAVEATS

Framework has learning curve. Configuration can be complex. Performance tuning may be needed.

# HISTORY

**Sails.js** was created by **Mike McNeil** and released in **2012**. Inspired by Rails, it brings convention-over-configuration to Node.js development.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1), [express](/man/express)(1)
