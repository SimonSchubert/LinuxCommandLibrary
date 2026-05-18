# TAGLINE

full-stack JavaScript framework

# TLDR

**Create new project**

```meteor create [project-name]```

**Run development server**

```meteor```

**Add package**

```meteor add [package-name]```

**Remove package**

```meteor remove [package-name]```

**Build for production**

```meteor build [output-dir]```

**Deploy to Galaxy**

```meteor deploy [app.meteorapp.com]```

# SYNOPSIS

**meteor** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Meteor command.

**create** _NAME_
> Create new project.

**add** _PKG_
> Add package.

**remove** _PKG_
> Remove package.

**build** _DIR_
> Build for production.

**deploy** _HOST_
> Deploy application.

**--help**
> Display help information.

# DESCRIPTION

**meteor** is the command-line driver for the **Meteor.js** full-stack JavaScript framework. Running **meteor** in a project directory bundles the client, server, and database scripts together, starts a local MongoDB instance, watches the source tree for changes, and serves the application with hot-code reload to connected clients.

Beyond the dev server, the CLI bootstraps new projects (**meteor create**), installs Atmosphere or npm packages (**meteor add**, **meteor npm install**), produces architecture-specific bundles for deployment (**meteor build**), and pushes apps to Meteor's hosted **Galaxy** platform (**meteor deploy**). Underneath sits a reactive data layer (DDP) that synchronizes documents between server-side MongoDB collections and client-side Minimongo caches over WebSockets.

# CAVEATS

Node.js-based; modern versions require Node 14 or later. MongoDB is the only first-class database, though external SQL stores can be reached through community packages. The reactivity model (Tracker, publications, subscriptions) has a learning curve and can become a performance bottleneck at scale.

# HISTORY

**Meteor** was launched by **Meteor Development Group** in **2012** and released **1.0** in **2014**. Stewardship moved to **Tiny** in **2022**, where development continues alongside Meteor's Galaxy hosting service.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1), [mongod](/man/mongod)(1)

