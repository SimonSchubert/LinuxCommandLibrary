# TAGLINE

MVC web framework for Node.js

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

**Show version**

```sails --version```

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

**debug**
> Start app in debug mode.

**--version**
> Show installed Sails version.

**--port** _PORT_
> Set server port.

**--prod**
> Start in production mode.

# DESCRIPTION

**Sails.js** is an MVC web framework for Node.js, inspired by Ruby on Rails. It provides conventions and scaffolding for rapidly building REST APIs and web applications with a familiar structure of models, views, and controllers.

A standout feature is Blueprints, which auto-generate RESTful API endpoints for models with full CRUD operations. Combined with the Waterline ORM, which supports MySQL, PostgreSQL, MongoDB, and other databases through a unified interface, applications can be prototyped with minimal code.

Built-in Socket.io integration enables real-time features, allowing Blueprint routes to work over both HTTP and WebSockets. Policies provide middleware-like access control for protecting routes and enforcing authentication.

# CAVEATS

Framework has learning curve. Configuration can be complex. Performance tuning may be needed.

# HISTORY

**Sails.js** was created by **Mike McNeil** and released in **2012**. Inspired by Rails, it brings convention-over-configuration to Node.js development.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1), [express](/man/express)(1)
