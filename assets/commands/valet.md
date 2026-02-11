# TAGLINE

Laravel local development environment for macOS

# TLDR

**Install Valet**

```valet install```

**Register current directory for all sites**

```valet park```

**Link current directory as site**

```valet link [site-name]```

**Serve site over HTTPS**

```valet secure [site-name]```

**Share site publicly via ngrok**

```valet share```

**Switch PHP version globally**

```valet use php@[8.2]```

**Isolate site to specific PHP version**

```valet isolate php@[7.4]```

# SYNOPSIS

**valet** _command_ [_options_]

# COMMANDS

**install**: Install and configure Valet (Nginx, DnsMasq).

**park**: Register directory for wildcard site serving.

**link** _name_: Link current directory as named site.

**unlink** _name_: Remove a linked site.

**links**: List all linked sites.

**secure** _site_: Serve site over HTTPS.

**unsecure** _site_: Revert to HTTP.

**share**: Share site publicly via ngrok or Expose.

**use** _php_: Switch global PHP version.

**isolate** _php_: Pin site to specific PHP version.

**unisolate**: Remove PHP version isolation.

**php** _args_: Proxy to site's configured PHP.

**composer** _args_: Proxy to site's configured Composer.

**restart**: Restart Nginx and DnsMasq services.

**stop**: Stop Valet services.

**start**: Start Valet services.

**trust**: Add sudoers entries for passwordless commands.

# DESCRIPTION

**valet** is Laravel's minimalist development environment for macOS. It configures your Mac to run Nginx in the background, using DnsMasq to proxy all requests on the *.test domain to local sites.

Valet provides a lightweight alternative to full VM or container-based stacks. It uses minimal resources while enabling instant site access at project-name.test URLs. The park command registers an entire directory, automatically serving each subdirectory as its own site.

Sites can be served over HTTPS with automatic certificate generation, shared publicly via tunneling services, and configured with different PHP versions per-project.

# CAVEATS

macOS only. Requires Homebrew and PHP. Port 80 must be available (no Apache or other servers running). The *.test domain is hardcoded by default but can be changed.

# HISTORY

**Laravel Valet** was created by Taylor Otwell and the Laravel team as a zero-configuration development environment for macOS. It emerged as a simpler alternative to Homestead (Vagrant-based) for developers who prefer native performance. Community forks exist for Linux (Valet Linux) with similar functionality.

# SEE ALSO

[nginx](/man/nginx)(8), [php](/man/php)(1), [composer](/man/composer)(1), [brew](/man/brew)(1)
