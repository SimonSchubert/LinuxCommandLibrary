# TAGLINE

shell-based ACME SSL/TLS certificate client

# TLDR

**Issue** a certificate using webroot mode

```acme.sh --issue -d [example.com] -w [/var/www/html]```

Issue a **wildcard certificate** using DNS mode

```acme.sh --issue -d [example.com] -d [*.example.com] --dns [dns_cf]```

**Install** a certificate

```acme.sh --install-cert -d [example.com] --key-file [/path/to/key.pem] --fullchain-file [/path/to/cert.pem] --reloadcmd "[systemctl reload nginx]"```

**Renew** all certificates

```acme.sh --renew-all```

**List** all issued certificates

```acme.sh --list```

# SYNOPSIS

**acme.sh** _--issue_|_--install-cert_|_--renew_ [_-d domain_] [_options_]

# DESCRIPTION

**acme.sh** is a pure Unix shell ACME client for obtaining free SSL/TLS certificates from Let's Encrypt and other ACME-compliant certificate authorities. It supports multiple validation methods including webroot, standalone, DNS, and Apache/Nginx plugins.

The tool automatically handles certificate renewal through cron jobs and supports wildcard certificates via DNS validation. It requires no dependencies beyond a POSIX-compliant shell and common utilities like curl or wget.

# PARAMETERS

**--issue**
> Issue a new certificate

**--install-cert**
> Install issued certificate to specified locations

**--renew**
> Renew a specific certificate

**--renew-all**
> Renew all issued certificates

**--list**
> List all issued certificates

**-d** _domain_
> Domain name (can be repeated for multiple domains/SANs)

**-w** _path_
> Webroot path for HTTP validation

**--dns** _provider_
> Use DNS validation with specified provider (dns_cf, dns_aws, etc.)

**--standalone**
> Use standalone mode (starts temporary web server)

**--nginx**
> Use Nginx mode for validation

**--apache**
> Use Apache mode for validation

**--key-file** _path_
> Path to install private key

**--fullchain-file** _path_
> Path to install full certificate chain

**--reloadcmd** _cmd_
> Command to reload service after installation

**--force**
> Force renewal regardless of expiry

# CONFIGURATION

**~/.acme.sh/account.conf**
> Main configuration file storing default settings, CA server, email, and DNS API credentials.

**~/.acme.sh/[domain]/[domain].conf**
> Per-domain configuration storing issuance parameters, validation method, and renewal settings.

**~/.acme.sh/[domain]/[domain].cer**
> Issued certificate file for the domain.

**~/.acme.sh/[domain]/[domain].key**
> Private key file for the domain.

# CAVEATS

DNS validation requires API credentials for your DNS provider. Webroot mode requires the web server to be running and accessible. Standalone mode requires ports 80/443 to be available. Automatic renewal depends on cron; ensure it's running.

# HISTORY

**acme.sh** was created by Neil Pang (Neilpang) and first released in **2015** shortly after Let's Encrypt announced their service. It was designed as a lightweight, dependency-free alternative to Certbot, becoming one of the most popular ACME clients for shell environments.

# SEE ALSO

[certbot](/man/certbot)(1), [openssl](/man/openssl)(1), [nginx](/man/nginx)(8), [apache2](/man/apache2)(8)
