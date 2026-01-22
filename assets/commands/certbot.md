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

Obtain **test certificate** (untrusted)

```sudo certbot --webroot -w [path/to/webroot] -d [subdomain.example.com] --test-cert```

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

**--test-cert**
> Use staging server (untrusted certificates)

# CAVEATS

Webroot validation requires web server to be running. Rate limits apply on Let's Encrypt production servers. Restart web server after renewal for new certificates to take effect.

# HISTORY

**certbot** was developed by the Electronic Frontier Foundation (EFF) and originally known as the Let's Encrypt client. Let's Encrypt launched in **2016** to provide free, automated TLS certificates.

# SEE ALSO

[openssl](/man/openssl)(1), [nginx](/man/nginx)(8), [apache2](/man/apache2)(8)
