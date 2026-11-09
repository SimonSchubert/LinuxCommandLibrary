# TAGLINE

MVC web framework for Node.js

# TLDR

**Create new app**

```sails new [project-name]```

**Create an API-only app** without frontend assets

```sails new [project-name] --no-frontend```

**Start development server**

```sails lift```

**Start on a specific port**

```sails lift --port [8080]```

**Generate API** (model and controller)

```sails generate api [user]```

**Generate model** with attributes

```sails generate model [user] [username] [isAdmin:boolean]```

**Generate controller**

```sails generate controller [user]```

**Open console** without starting the HTTP server

```sails console --dontLift```

**Show version**

```sails --version```

# SYNOPSIS

**sails** _command_ [_options_] [_args_]

# PARAMETERS

**new** [_PATH_]
> Create a new app. Accepts **--no-frontend** and **--fast** (skip installing node modules).

**lift**, **l**
> Start the app in the current directory.

**generate** _TYPE_ _NAME_
> Generate code. Types include api, model, controller, action, helper, hook, page, response, adapter and generator.

**console**, **c**
> Interactive REPL with the app loaded. **--dontLift** starts it without the HTTP server.

**run** _SCRIPT_
> Run a script from the scripts/ folder.

**test**, **lint**
> Run the app's test or lint script.

**inspect**
> Start the app with the Node inspector.

**debug**
> Legacy debugger for Node v5 and below; use **inspect** on newer versions.

**debug-console**, **dc**
> Start the console with the debugger attached.

**www**
> Compile assets into a standalone www folder.

**version**, **-v**, **--version**
> Show installed Sails version.

**--port** _PORT_
> Listen on the given port with **lift** (default 1337).

**--prod**
> Lift in the production environment.

**--staging**
> Lift in the staging environment.

**--silent**, **--verbose**, **--silly**
> Set the log level for **lift** and **console**.

# DESCRIPTION

**Sails.js** is an MVC web framework for Node.js, inspired by Ruby on Rails. It provides conventions and scaffolding for rapidly building REST APIs and web applications with a familiar structure of models, views, and controllers.

A standout feature is Blueprints, which auto-generate RESTful API endpoints for models with full CRUD operations. Combined with the Waterline ORM, which supports MySQL, PostgreSQL, MongoDB, and other databases through a unified interface, applications can be prototyped with minimal code.

Built-in Socket.io integration enables real-time features, allowing Blueprint routes to work over both HTTP and WebSockets. Policies provide middleware-like access control for protecting routes and enforcing authentication.

# CAVEATS

**sails lift** prefers the Sails version in the app's own node_modules over a globally installed one. In development, asset and view changes apply on reload, but changes to config/, api/ or node_modules/ need a restart.

# HISTORY

**Sails.js** was created by **Mike McNeil** and released in **2012**. Inspired by Rails, it brings convention-over-configuration to Node.js development.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1), [express](/man/express)(1)

# RESOURCES

```[Source code](https://github.com/balderdashy/sails)```

```[Homepage](https://sailsjs.com)```

```[Documentation](https://sailsjs.com/documentation/reference/command-line-interface)```

<!-- verified: 2026-11-09 -->
