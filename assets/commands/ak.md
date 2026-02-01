# TLDR

**Start the server**

```ak server```

**Run database migrations**

```ak migrate```

**Create a superuser**

```ak createsuperuser```

**Export configuration**

```ak export_blueprint```

**Import a blueprint**

```ak import_blueprint [blueprint.yaml]```

**Generate a recovery key**

```ak create_recovery_key [username]```

**Show version**

```ak version```

**Run a worker process**

```ak worker```

# SYNOPSIS

**ak** _command_ [_options_]

# COMMANDS

**server**
> Start the authentik web server.

**worker**
> Start a background worker process.

**migrate**
> Apply database migrations.

**createsuperuser**
> Create an administrative user interactively.

**create_recovery_key** _user_ _duration_
> Generate account recovery link.

**export_blueprint**
> Export current configuration as blueprint YAML.

**import_blueprint** _file_
> Import configuration from blueprint file.

**version**
> Display version information.

**repair**
> Run diagnostic and repair routines.

**shell**
> Open interactive Python shell with authentik context.

**dbshell**
> Open database shell.

# PARAMETERS

**--bind** _address_
> Address for server to listen on.

**--help**
> Display help information.

# DESCRIPTION

**ak** is the command-line interface for authentik, an open-source identity provider. It manages the authentik server, workers, database operations, and configuration import/export.

The **server** command starts the web interface and API server. Background tasks like email sending and LDAP synchronization require a **worker** process running separately.

Blueprints provide declarative configuration management. Export configurations with **export_blueprint** for version control or migration, and apply them with **import_blueprint**.

For account recovery when users are locked out, **create_recovery_key** generates a time-limited recovery URL. This requires access to the server command line.

authentik supports various authentication protocols including SAML, OAuth2/OIDC, LDAP, SCIM, and proxy authentication for applications that don't support SSO natively.

# CAVEATS

Requires Python environment with authentik installed. Database must be configured and accessible. Most administrative tasks are performed through the web interface; CLI is primarily for server operations and emergency recovery.

# HISTORY

authentik was created by **Jens Langhammer** and first released in **2020** as a modern alternative to older identity providers. Built with Django and designed for containerized deployments, it provides comprehensive identity management features. The project gained popularity as a self-hosted alternative to commercial identity providers, offering features like application proxying, multi-factor authentication, and extensive protocol support.

# SEE ALSO

[authelia](/man/authelia)(1), [keycloak](/man/keycloak)(1), [vault](/man/vault)(1)
