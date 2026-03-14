# TAGLINE

Development server for Vue components

# TLDR

**Serve in development mode**

```vue serve```

**Serve specific file**

```vue serve [App.vue]```

**Serve on custom port**

```vue serve --port [8080]```

**Open browser automatically**

```vue serve --open```

# SYNOPSIS

**vue** **serve** [_options_] [_entry_]

# PARAMETERS

**-o**, **--open**
> Open browser automatically

**-c**, **--copy**
> Copy local URL to clipboard

**-p**, **--port** _port_
> Port number (default: 8080)

**-h**, **--host** _host_
> Host address (default: 0.0.0.0)

# DESCRIPTION

**vue serve** starts a development server with hot-reload for instant prototyping of Vue single-file components without a full project setup. It requires the **@vue/cli-service-global** package to be installed globally.

In Vue CLI v5, the instant prototyping feature was removed and **vue serve** became an alias for **npm run serve**. For standalone component prototyping, Vue now recommends using **Vite** instead.

# SEE ALSO

[vue](/man/vue)(1), [vue-build](/man/vue-build)(1), [vite](/man/vite)(1)

