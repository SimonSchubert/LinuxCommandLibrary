# TAGLINE

server provisioning tool for deploying Laravel applications on Digital Ocean

# TLDR

**Set up** server with default PHP version

```larasail setup```

Set up server with **specific PHP** version

```larasail setup [php84]```

Set up with **MariaDB and Redis** instead of the defaults

```larasail setup [php83] mariadb redis```

Create a **new Laravel project** with Nginx site and SSL

```larasail new [example.com] --www-alias```

**Add** a new Laravel site

```larasail host [domain] [path/to/site_directory]```

**Create a database** and user for the current project

```larasail database init --user [user] --db [database]```

Retrieve Larasail **user password**

```larasail pass```

Retrieve **MySQL password**

```larasail mysqlpass```

# SYNOPSIS

**larasail** _command_ [_arguments_]

# PARAMETERS

**setup** [_phpXY_] [**mariadb**] [**redis**]
> Install Nginx, PHP, MySQL (or MariaDB), Composer and optionally Redis

**new** _project_ [**--jet** _livewire_|_inertia_] [**--teams**] [**--wave**] [**--www-alias**]
> Create a Laravel (or Wave) project in /var/www with Nginx site and Let's Encrypt certificate

**host** _domain_ _directory_ [**--www-alias**]
> Add an Nginx site for an existing project

**database init** [**--user** _name_] [**--db** _name_] [**--force**]
> Create a database and user; updates **.env** when run inside the project directory

**database pass**
> Display the generated database password

**pass**
> Display the Larasail user password

**mysqlpass**
> Display the MySQL root password

# DESCRIPTION

**larasail** is a server provisioning tool for deploying Laravel applications on Digital Ocean servers. It automates the installation of PHP, Nginx, MySQL, Composer, and other Laravel dependencies.

The tool simplifies the process of setting up a production Laravel environment, handling web server configuration, SSL certificates, and database setup. It is installed on the server itself and creates a **larasail** user whose password, like the MySQL root password, is randomly generated.

# CAVEATS

Designed specifically for Digital Ocean droplets running Ubuntu. Requires root access on the server. The domain must point to the server before the Let's Encrypt certificate can be issued. The GitHub repository is **archived** and no longer maintained, so newer Ubuntu or PHP releases may not be supported.

# HISTORY

Larasail was created by DevDojo to simplify Laravel deployment, providing a lightweight alternative to more complex server management tools.

# SEE ALSO

[composer](/man/composer)(1), [php](/man/php)(1), [nginx](/man/nginx)(8), [certbot](/man/certbot)(1), [laravel](/man/laravel)(1)

# RESOURCES

```[Source code](https://github.com/thedevdojo/larasail)```

<!-- verified: 2026-09-29 -->
