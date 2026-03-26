# TAGLINE

Let's Encrypt certificate management

# TLDR

Obtain certificate via **webroot** authorization

```sudo certbot certonly --webroot -w [path/to/webroot] -d [subdomain.example.com]```

Obtain and install certificate for **nginx**

```sudo certbot --nginx -d [subdomain.example.com]```

Obtain and install certificate for **apache**

```sudo certbot --apache -d [subdomain.example.com]```

**Renew** all certificates expiring soon

```sudo certbot renew```

**Dry run** to test without saving certificates

```sudo certbot --webroot -w [path/to/webroot] -d [subdomain.example.com] --dry-run```

**Obtain certificate** using standalone mode (no web server needed)

```sudo certbot certonly --standalone -d [subdomain.example.com]```

**List all managed certificates**

```sudo certbot certificates```

# SYNOPSIS

**certbot** [_options_] _command_

# DESCRIPTION

**certbot** is the official Let's Encrypt client for automatically obtaining and renewing free TLS/SSL certificates. It can configure web servers like Apache and Nginx automatically.

Certificates are valid for 90 days. The renew command should be run regularly (typically via cron) to maintain valid certificates.

# SUBCOMMANDS

**certonly**
> Obtain certificate without installing

**run**
> Obtain and install certificate

**renew**
> Renew expiring certificates

**revoke**
> Revoke a certificate

**delete**
> Delete a certificate

**certificates**
> List installed certificates

# PARAMETERS

**-d, --domain** _domain_
> Domain name for certificate

**-w, --webroot-path** _path_
> Webroot path for validation

**--nginx**
> Use nginx plugin

**--apache**
> Use apache plugin

**--dry-run**
> Test without saving

**--standalone**
> Use built-in web server for validation

**--test-cert**
> Use staging server (untrusted certificates)

**--non-interactive**
> Run without user interaction

**--agree-tos**
> Agree to terms of service

**-m**, **--email** _email_
> Email for account registration

**--preferred-challenges** _type_
> Preferred challenge type: http-01, dns-01, or tls-alpn-01

**--deploy-hook** _command_
> Command to run after successful certificate deployment (e.g., reload web server)

# CONFIGURATION

**/etc/letsencrypt/renewal/**
> Per-certificate renewal configuration files controlling automatic renewal behavior.

**/etc/letsencrypt/cli.ini**
> Global certbot defaults for all certificate operations.

# CAVEATS

Webroot validation requires web server to be running. Rate limits apply on Let's Encrypt production servers. Restart web server after renewal for new certificates to take effect.

# HISTORY

**certbot** was developed by the Electronic Frontier Foundation (EFF) and originally known as the Let's Encrypt client. Let's Encrypt launched in **2016** to provide free, automated TLS certificates.

# SEE ALSO

[openssl](/man/openssl)(1), [nginx](/man/nginx)(8), [apache2](/man/apache2)(8)
