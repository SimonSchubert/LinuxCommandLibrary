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
> Set host for develop/serve (default: localhost).

**-p**, **--port** _port_
> Set port for develop/serve (default: 8000 for develop, 9000 for serve).

**-o**, **--open**
> Open the site in the default browser.

**-S**, **--https**
> Enable HTTPS for the development server.

**--inspect**
> Open a debugging port for Node.js inspector.

**--prefix-paths**
> Build/serve with path prefix (requires pathPrefix in gatsby-config).

**--no-uglify**
> Build without uglifying JS bundles (for debugging).

**--profile**
> Enable React profiling during build.

**--verbose**
> Turn on verbose output.

**-C**, **--clipboard**
> Copy environment info to clipboard (gatsby info).

# CONFIGURATION

**gatsby-config.js** (or **gatsby-config.ts**)
> Main configuration file for plugins, site metadata, and build settings.

**gatsby-node.js** (or **gatsby-node.ts**)
> Node API configuration for dynamic page creation and build-time customization.

# DESCRIPTION

**gatsby** is a React-based static site generator that creates fast, optimized websites using React components and GraphQL for data fetching. It combines modern web technologies with automatic code splitting, image optimization, and progressive enhancement.

Gatsby builds static HTML at build time while maintaining React's interactive capabilities through hydration. The framework uses a rich plugin ecosystem for integrating CMSs, APIs, and services. GraphQL provides a unified data layer for querying content from multiple sources.

The development server includes hot module replacement for rapid iteration, while production builds are optimized for performance with techniques like prefetching, lazy loading, and asset optimization.

# CAVEATS

Build times can be slow for large sites. GraphQL layer has learning curve. Some plugins may be outdated. Real-time data requires client-side fetching. Requires Node.js and npm.

# HISTORY

Gatsby was created by **Kyle Mathews** in **2015** as a modern static site generator. It gained popularity for combining React with GraphQL and was acquired by **Netlify** in **February 2023**. The framework helped popularize the Jamstack architecture. Gatsby 5, released in **November 2022**, introduced the Slice API and partial hydration.

# SEE ALSO

[npm](/man/npm)(1), [node](/man/node)(1), [hugo](/man/hugo)(1)

