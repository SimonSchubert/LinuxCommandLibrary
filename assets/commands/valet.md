# TAGLINE

Laravel local development environment for macOS

# TLDR

**Install Valet**

```valet install```

**Serve every subdirectory** of the current directory as a site

```valet park```

**Link current directory as site**

```valet link [site-name]```

**Serve site over HTTPS**

```valet secure [site-name]```

**Choose the sharing tool** (ngrok, expose or cloudflared)

```valet share-tool [ngrok]```

**Share site publicly**

```valet share```

**Proxy a domain** to another local service

```valet proxy [name] [http://127.0.0.1:9200]```

**Switch PHP version globally**

```valet use php@[8.2]```

**Isolate site to specific PHP version**

```valet isolate php@[7.4]```

# SYNOPSIS

**valet** _command_ [_options_]

# COMMANDS

**install**: Install and configure Valet (Nginx, DnsMasq).

**park** [_path_]: Register directory for wildcard site serving.

**parked**: List sites in parked directories.

**paths**: List all parked paths.

**forget** [_path_]: Remove a directory from the parked list.

**link** _name_: Link current directory as named site.

**unlink** _name_: Remove a linked site.

**links**: List all linked sites.

**secure** _site_: Serve site over HTTPS.

**unsecure** _site_: Revert to HTTP. Use **--all** for every site.

**secured**: List secured sites.

**proxy** _domain_ _host_: Proxy a domain to another service. Add **--secure** for TLS.

**unproxy** _domain_: Remove a proxy.

**proxies**: List proxied sites.

**share**: Share site publicly through the configured tool.

**share-tool** [_tool_]: Get or set the tool: ngrok, expose or cloudflared.

**set-ngrok-token** _token_: Store the ngrok authentication token.

**tld** [_tld_]: Get or set the top-level domain for sites.

**use** _php_: Switch global PHP version.

**isolate** _php_: Pin site to specific PHP version.

**unisolate**: Remove PHP version isolation.

**isolated**: List isolated sites and their PHP versions.

**which-php** [_site_]: Show the PHP executable for a site.

**php** _args_: Proxy to site's configured PHP.

**composer** _args_: Proxy to site's configured Composer.

**restart**: Restart Nginx and DnsMasq services.

**stop**: Stop Valet services.

**start**: Start Valet services.

**trust**: Add sudoers entries for passwordless commands.

**log** [_-f_] [_-l lines_] [_key_]: View logs written by Valet services.

**diagnose**: Output diagnostics for debugging.

**directory-listing** [_status_]: Get or set directory listing behavior.

**uninstall** [_--force_]: Show manual uninstall steps, or remove all Valet resources with **--force**.

# DESCRIPTION

**valet** is Laravel's minimalist development environment for macOS. It configures your Mac to run Nginx in the background, using DnsMasq to proxy all requests on the *.test domain to local sites.

Valet provides a lightweight alternative to full VM or container-based stacks. It uses minimal resources while enabling instant site access at project-name.test URLs. The park command registers an entire directory, automatically serving each subdirectory as its own site.

Sites can be served over HTTPS with automatic certificate generation, shared publicly via tunneling services, and configured with different PHP versions per-project.

# CAVEATS

macOS only. Requires Homebrew, PHP and Composer. Port 80 must be available (no Apache or other servers running). The default domain is *.test; change it with **valet tld**. Valet serves one global PHP version at a time unless sites are isolated.

# HISTORY

**Laravel Valet** was created by Taylor Otwell and the Laravel team as a zero-configuration development environment for macOS. It emerged as a simpler alternative to Homestead (Vagrant-based) for developers who prefer native performance. Community forks exist for Linux (Valet Linux) with similar functionality.

# SEE ALSO

[nginx](/man/nginx)(8), [php](/man/php)(1), [composer](/man/composer)(1), [brew](/man/brew)(1)

# RESOURCES

```[Source code](https://github.com/laravel/valet)```

```[Documentation](https://laravel.com/framework/docs/valet)```

<!-- verified: 2026-11-09 -->
