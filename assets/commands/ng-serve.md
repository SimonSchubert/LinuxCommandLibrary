# TAGLINE

builds an Angular application and starts a development server

# TLDR

**Start development server** on http://localhost:4200

```ng serve```

**Serve on specific port**

```ng serve --port [4201]```

**Serve and open browser**

```ng serve --open```

**Make the server reachable** from other devices on the network

```ng serve --host 0.0.0.0```

**Serve specific project**

```ng serve [project-name]```

**Serve with production config**

```ng serve --configuration=production```

**Serve with proxy**

```ng serve --proxy-config [proxy.conf.json]```

**Serve over HTTPS**

```ng serve --ssl```

# SYNOPSIS

**ng serve** [_project_] [_options_]

**ng dev** [_project_] [_options_]

**ng s** [_project_] [_options_]

# PARAMETERS

**--port** _port_
> Port to listen on (default 4200).

**-o**, **--open**
> Open the URL in the default browser.

**--host** _host_
> Host to listen on (default localhost).

**-c**, **--configuration** _name_
> Named build configuration(s) from angular.json, comma-separated (e.g. development, production).

**--proxy-config** _file_
> Proxy configuration file for forwarding requests to a backend.

**--ssl**
> Serve using HTTPS (a self-signed certificate is generated unless --ssl-cert and --ssl-key are given).

**--ssl-cert** _file_, **--ssl-key** _file_
> SSL certificate and key to use for HTTPS.

**--allowed-hosts**
> Hosts the development server responds to (Vite allowedHosts option).

**--serve-path** _path_
> Pathname where the application is served.

**--headers** _headers_
> Custom HTTP headers added to all responses.

**--hmr**
> Hot module replacement (defaults to the live-reload setting).

**--live-reload**
> Reload the page on change (default true).

**--watch**
> Rebuild on change (default true).

**--poll** _ms_
> Use polling for file watching with the given interval.

**--prebundle**
> Vite dependency prebundling (default true).

**--define** _KEY=VALUE_
> Replace global identifiers with constant values.

**--inspect** _host:port_
> Activate the Node.js debugging inspector (SSR/SSG only).

**--build-target** _target_
> Build target to serve, as project:target[:configuration].

**--verbose**
> More detailed output logging.

# DESCRIPTION

**ng serve** builds an Angular application and starts a development server. It watches for file changes and automatically rebuilds, with live reload or hot module replacement updating the browser.

With the default application builder (esbuild), the development server is based on **Vite**. Builds are kept in memory; nothing is written to dist/.

This is the primary command for Angular development workflow.

# PROXY CONFIG

```json
// proxy.conf.json
{
  "/api": {
    "target": "http://localhost:3000",
    "secure": false
  }
}
```

# CAVEATS

Development only; use ng build for production deployments. The default configuration for serve is development. Binding to 0.0.0.0 exposes the dev server on the network. Must be run inside an Angular workspace.

# HISTORY

Angular CLI's serve command was introduced with Angular CLI in **2016**, initially backed by webpack-dev-server. Since Angular 17 new projects use the esbuild-based application builder with a Vite dev server. Recent versions also accept **ng dev** as an alias.

# SEE ALSO

[ng](/man/ng)(1), [ng-build](/man/ng-build)(1), [vite](/man/vite)(1), [webpack](/man/webpack)(1)

# RESOURCES

```[Source code](https://github.com/angular/angular-cli)```

```[Documentation](https://angular.dev/cli/serve)```

<!-- verified: 2026-09-29 -->
