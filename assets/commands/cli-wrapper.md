# TAGLINE

PHP built-in server wrapper for local development

# TLDR

**Start a local development server** on default port

```cli-wrapper serve```

**Serve on a specific port**

```cli-wrapper serve --port [8080]```

**Serve with a specific document root**

```cli-wrapper serve --docroot [public/]```

**Run with verbose output**

```cli-wrapper serve -v```

**Specify PHP binary** to use

```cli-wrapper serve --php [/usr/bin/php8.1]```

# SYNOPSIS

**cli-wrapper** _command_ [_options_]

# PARAMETERS

**serve**
> Start the built-in PHP development server.

**--port** _PORT_
> Port number for the server to listen on (default: 8000).

**--docroot** _DIR_
> Document root directory for serving files.

**--php** _PATH_
> Path to the PHP binary to use.

**-v**, **--verbose**
> Enable verbose output for debugging.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**cli-wrapper** is a command-line utility designed to simplify running PHP's built-in development server with proper configuration. It is commonly used with PHP frameworks and CMSs that require specific server routing rules.

The tool wraps PHP's built-in server with sensible defaults and additional features for local development environments. It handles routing for applications that use front controllers, manages static file serving, and provides convenient options for common development scenarios.

cli-wrapper is particularly useful when working with frameworks that need specific request routing, as it can configure the server to pass all requests through the application's entry point while still serving static assets directly.

# CAVEATS

The built-in PHP server is intended for development only and should not be used in production environments. It handles requests sequentially, making it unsuitable for high-traffic scenarios.

# HISTORY

cli-wrapper emerged from the PHP development community's need for simpler local server management. It builds upon PHP's built-in web server, introduced in **PHP 5.4** in **2012**, providing a more user-friendly interface for common development workflows.

# SEE ALSO

[php](/man/php)(1), [artisan](/man/artisan)(1), [symfony](/man/symfony)(1)
