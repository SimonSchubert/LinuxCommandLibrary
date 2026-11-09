# TAGLINE

React-based static site generator

# TLDR

**Create new site** interactively

```gatsby new```

**Create from starter**

```gatsby new [site-name] [https://github.com/user/starter]```

**Start development server**

```gatsby develop```

**Start development server** on all interfaces

```gatsby develop -H [0.0.0.0] -p [8000]```

**Build for production**

```gatsby build```

**Serve production build**

```gatsby serve```

**Clean cache**

```gatsby clean```

**Show environment info**

```gatsby info```

# SYNOPSIS

**gatsby** _command_ [_options_]

# SUBCOMMANDS

**new** [_rootPath_] [_starter_]
> Create new site.

**develop**
> Start development server.

**build**
> Build production site.

**serve**
> Serve production build.

**clean**
> Wipe the local cache and built assets.

**info**
> Show environment info.

**repl**
> Open a Node REPL with the Gatsby environment.

**plugin** _docs|ls_
> Commands relating to Gatsby plugins.

**telemetry** [_--enable|--disable_]
> Enable or disable anonymous analytics collection.

**feedback** [_--enable|--disable_]
> Opt in or out of feedback requests.

**options** [_cmd_] [_key_] [_value_]
> View or set gatsby-cli configuration such as the package manager.

# PARAMETERS

**-H**, **--host** _host_
> Set host for develop/serve (default: localhost).

**-p**, **--port** _port_
> Set port for develop/serve (default: 8000 for develop, 9000 for serve).

**-o**, **--open**
> Open the site in the default browser.

**-S**, **--https**
> Use HTTPS for the development server.

**-c**, **--cert-file** _path_
> Custom HTTPS certificate file (also requires --https and --key-file).

**-k**, **--key-file** _path_
> Custom HTTPS key file (also requires --https and --cert-file).

**--inspect** [_port_]
> Open a port for the Node.js inspector.

**--inspect-brk** [_port_]
> Open a debug port and wait for a debugger to attach.

**--prefix-paths**
> Build/serve with path prefix (requires pathPrefix in gatsby-config).

**--no-uglify**
> Build without uglifying JS bundles (for debugging).

**--profile**
> Enable React profiling during build.

**--verbose**
> Turn on verbose output.

**--no-color**
> Turn off the color in output.

**--json**
> Turn on the JSON logger.

**-C**, **--clipboard**
> Copy environment info to clipboard (gatsby info).

# DESCRIPTION

**gatsby** is a React-based static site generator that creates fast, optimized websites using React components and GraphQL for data fetching. It combines modern web technologies with automatic code splitting, image optimization, and progressive enhancement.

Gatsby builds static HTML at build time while maintaining React's interactive capabilities through hydration. The framework uses a rich plugin ecosystem for integrating CMSs, APIs, and services. GraphQL provides a unified data layer for querying content from multiple sources.

The development server includes hot module replacement for rapid iteration, while production builds are optimized for performance with techniques like prefetching, lazy loading, and asset optimization.

# CONFIGURATION

**gatsby-config.js** (or **gatsby-config.ts**)
> Main configuration file for plugins, site metadata, and build settings.

**gatsby-node.js** (or **gatsby-node.ts**)
> Node API configuration for dynamic page creation and build-time customization.

# CAVEATS

Build times can be slow for large sites. GraphQL layer has learning curve. Some plugins may be outdated, and releases have become infrequent since the Netlify acquisition. Real-time data requires client-side fetching. Requires Node.js, with **gatsby-cli** installed globally or run through **npx**.

# HISTORY

Gatsby was created by **Kyle Mathews** in **2015** as a modern static site generator. It gained popularity for combining React with GraphQL and was acquired by **Netlify** in **February 2023**. The framework helped popularize the Jamstack architecture. Gatsby 5, released in **November 2022**, introduced the Slice API and partial hydration.

# SEE ALSO

[npm](/man/npm)(1), [node](/man/node)(1), [hugo](/man/hugo)(1)

# RESOURCES

```[Source code](https://github.com/gatsbyjs/gatsby)```

```[Homepage](https://www.gatsbyjs.com/)```

```[Documentation](https://www.gatsbyjs.com/docs/reference/gatsby-cli/)```

<!-- verified: 2026-11-09 -->
