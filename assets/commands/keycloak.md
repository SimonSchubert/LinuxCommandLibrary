# TAGLINE

CLI for Keycloak, an open-source identity and access management

# TLDR

**Start Keycloak in development mode**

```kc.sh start-dev```

**Start in production mode**

```kc.sh start --hostname=[auth.example.com]```

**Build optimized configuration**

```kc.sh build```

**Export realm configuration**

```kc.sh export --dir [/export] --realm [myrealm]```

**Import realm configuration**

```kc.sh import --file [realm.json]```

**Show available options**

```kc.sh start --help```

**Show version**

```kc.sh --version```

# SYNOPSIS

**kc.sh** _command_ [_options_]

# COMMANDS

**start**
> Start server in production mode (requires build).

**start-dev**
> Start in development mode with defaults.

**build**
> Generate optimized server configuration.

**export**
> Export realm data to file.

**import**
> Import realm data from file.

**show-config**
> Display current configuration.

**tools**
> Utility commands for completions and vault operations.

# PARAMETERS

**--hostname** _name_
> Public hostname for the server.

**--hostname-admin** _name_
> Hostname for admin console.

**--http-port** _port_
> HTTP listen port. Default: 8080.

**--https-port** _port_
> HTTPS listen port. Default: 8443.

**--db** _type_
> Database vendor: dev-file, dev-mem, postgres, mysql, mariadb, mssql, oracle.

**--db-url** _url_
> Full database JDBC URL.

**--db-username** _user_
> Database username.

**--db-password** _pass_
> Database password.

**--features** _list_
> Enable feature flags.

**--health-enabled** _bool_
> Enable health endpoints.

**--metrics-enabled** _bool_
> Enable metrics endpoint.

**--proxy** _mode_
> Proxy mode: edge, reencrypt, passthrough.

**--log-level** _level_
> Log level: fatal, error, warn, info, debug, trace.

**--help**, **-h**
> Display help information.

# DESCRIPTION

**kc.sh** is the CLI for Keycloak, an open-source identity and access management solution. It manages server lifecycle, configuration, and data import/export.

Development mode (**start-dev**) runs with relaxed security for local testing. Production deployments use **start** after running **build** to optimize configuration. The build step creates a quarkus-based optimized distribution.

Keycloak supports SAML 2.0, OpenID Connect, OAuth 2.0, and LDAP/AD integration. It provides features like social login, user federation, fine-grained authorization, and multi-factor authentication.

The **export** and **import** commands transfer realm configurations including clients, roles, users, and authentication flows. Use these for backup, migration, or infrastructure-as-code workflows.

Configuration can be provided via command-line options, environment variables (KC_ prefix), or configuration files.

# CAVEATS

Production mode requires explicit hostname configuration and TLS setup. The build command must run before production start when configuration changes. Some options require restart. Database configuration differs significantly between development (H2) and production deployments.

# HISTORY

Keycloak was created by **Red Hat** and first released in **September 2014**. It originated from PicketLink and became Red Hat's strategic identity solution. The project joined CNCF as an incubating project in **2023**. Version 17 (2022) introduced Quarkus-based architecture replacing WildFly. Keycloak is widely deployed for enterprise SSO, API security, and user management.

# SEE ALSO

[authentik](/man/authentik)(1), [authelia](/man/authelia)(1), [vault](/man/vault)(1)
