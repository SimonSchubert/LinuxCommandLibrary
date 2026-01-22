# TLDR

**Set up** server with default PHP version

```larasail setup```

Set up server with **specific PHP** version

```larasail setup [php71]```

**Add** a new Laravel site

```larasail host [domain] [path/to/site_directory]```

Retrieve Larasail **user password**

```larasail pass```

Retrieve **MySQL password**

```larasail mysqlpass```

# SYNOPSIS

**larasail** _command_ [_arguments_]

# PARAMETERS

**setup** [_php_version_]
> Set up server with Laravel dependencies

**host** _domain_ _directory_
> Add a new Laravel site

**pass**
> Display the Larasail user password

**mysqlpass**
> Display the MySQL password

# DESCRIPTION

**larasail** is a server provisioning tool for deploying Laravel applications on Digital Ocean servers. It automates the installation of PHP, Nginx, MySQL, Composer, and other Laravel dependencies.

The tool simplifies the process of setting up a production Laravel environment, handling web server configuration, SSL certificates, and database setup.

# CAVEATS

Designed specifically for Digital Ocean droplets running Ubuntu. Requires root access on the server. SSL certificate configuration may require additional steps.

# HISTORY

Larasail was created by DevDojo to simplify Laravel deployment, providing a lightweight alternative to more complex server management tools.

# SEE ALSO

[composer](/man/composer)(1), [php](/man/php)(1), [nginx](/man/nginx)(8)
