# TAGLINE

builds an Angular application and starts a development server

# TLDR

**Start development server**

```ng serve```

**Serve on specific port**

```ng serve --port [4200]```

**Serve and open browser**

```ng serve --open```

**Serve specific project**

```ng serve [project-name]```

**Serve with production config**

```ng serve --configuration=production```

**Serve with proxy**

```ng serve --proxy-config [proxy.conf.json]```

# SYNOPSIS

**ng serve** [_project_] [_options_]

# PARAMETERS

**--port** _port_
> Port number.

**--open**, **-o**
> Open in browser.

**--host** _host_
> Bind address.

**--configuration** _name_
> Build configuration.

**--proxy-config** _file_
> Proxy configuration.

**--ssl**
> Enable HTTPS.

**--watch**
> Rebuild on changes (default).

**--live-reload**
> Enable live reload.

# DESCRIPTION

**ng serve** builds an Angular application and starts a development server. It watches for file changes and automatically rebuilds, with live reload updating the browser.

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

Development only; use ng build for production. Memory-intensive for large projects. Part of Angular CLI.

# HISTORY

Angular CLI's serve command was introduced with Angular CLI in **2016**, providing a complete development server solution for Angular applications.

# SEE ALSO

[ng](/man/ng)(1), [webpack](/man/webpack)(1), [vite](/man/vite)(1)
