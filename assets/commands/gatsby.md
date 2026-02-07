# TAGLINE

React-based static site generator

# TLDR

**Create new site**

```gatsby new [site-name]```

**Create from starter**

```gatsby new [site-name] [https://github.com/user/starter]```

**Start development server**

```gatsby develop```

**Build for production**

```gatsby build```

**Serve production build**

```gatsby serve```

**Clean cache**

```gatsby clean```

**Show info**

```gatsby info```

# SYNOPSIS

**gatsby** _command_ [_options_]

# SUBCOMMANDS

**new**
> Create new site.

**develop**
> Start development server.

**build**
> Build production site.

**serve**
> Serve production build.

**clean**
> Clean cache and artifacts.

**info**
> Show environment info.

**repl**
> Interactive REPL.

# PARAMETERS

**-H**, **--host** _host_
> Development server host.

**-p**, **--port** _port_
> Development server port.

**--prefix-paths**
> Build with path prefix.

# CONFIGURATION

**gatsby-config.js**
> Main configuration file for plugins, site metadata, and build settings.

**gatsby-node.js**
> Node API configuration for dynamic page creation and build-time customization.

# DESCRIPTION

**gatsby** is a React-based static site generator that creates fast, optimized websites using React components and GraphQL for data fetching. It combines modern web technologies with automatic code splitting, image optimization, and progressive enhancement.

Gatsby builds static HTML at build time while maintaining React's interactive capabilities through hydration. The framework uses a rich plugin ecosystem for integrating CMSs, APIs, and services. GraphQL provides a unified data layer for querying content from multiple sources.

The development server includes hot module replacement for rapid iteration, while production builds are optimized for performance with techniques like prefetching, lazy loading, and asset optimization.

# CAVEATS

Build times can be slow for large sites. GraphQL layer has learning curve. Some plugins may be outdated. Real-time data requires client-side fetching. Requires Node.js and npm.

# HISTORY

Gatsby was created by **Kyle Mathews** in **2015** as a modern static site generator. It gained popularity for combining React with GraphQL and was acquired by **Netlify** in **2023**. The framework helped popularize the Jamstack architecture.

# SEE ALSO

[npm](/man/npm)(1), [webpack](/man/webpack)(1)

