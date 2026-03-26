# TAGLINE

manage database cluster users

# TLDR

**List database users**

```doctl databases user list [cluster_id]```

**Create a user**

```doctl databases user create [cluster_id] [username]```

**Get user info**

```doctl databases user get [cluster_id] [username]```

**Reset user auth** password or MySQL auth plugin

```doctl databases user reset [cluster_id] [username] [new_auth_mode]```

**Create a user** with a specific MySQL auth plugin

```doctl databases user create [cluster_id] [username] --mysql-auth-plugin [caching_sha2_password]```

**List users** with custom output format

```doctl databases user list [cluster_id] --format Name,Role```

**Delete a user**

```doctl databases user delete [cluster_id] [username]```

# SYNOPSIS

**doctl** **databases** **user** _command_ [_options_]

# SUBCOMMANDS

**list**
> Retrieve a list of database users.

**create**
> Create a database user. New users are given a role of normal and an automatically-generated password.

**get**
> Retrieve details about a database user.

**delete**
> Delete a database user.

**reset**
> Reset the auth password or the MySQL authorization plugin for a given user and return new credentials.

# PARAMETERS

**--mysql-auth-plugin** _PLUGIN_
> Set MySQL authorization plugin (caching_sha2_password or mysql_native_password). Used with create.

**--acl** _RULES_
> Comma-separated Kafka ACL rules in topic:permission format. Used with create.

**--opensearch-acl** _RULES_
> Comma-separated OpenSearch ACL rules in index:permission format. Used with create.

**--format** _COLUMNS_
> Columns for output (e.g., Name,Role).

**--no-header**
> Omit the header row from output.

**--output** _FORMAT_
> Output format: text or json (default: text).

# DESCRIPTION

**doctl databases user** manages users for DigitalOcean managed database clusters. Users represent authentication credentials that applications and administrators use to connect to databases.

Each user has associated credentials (username and password) and potentially different privileges depending on the database engine. User management includes creating users for different applications or services, rotating credentials via password reset, and removing users when access is no longer needed.

Proper user management follows security best practices: creating dedicated users for each application, regularly rotating credentials, and removing unused accounts to minimize security exposure.

# SEE ALSO

[doctl-databases](/man/doctl-databases)(1), [doctl-databases-pool](/man/doctl-databases-pool)(1), [doctl-databases-db](/man/doctl-databases-db)(1), [doctl-databases-firewalls](/man/doctl-databases-firewalls)(1)
