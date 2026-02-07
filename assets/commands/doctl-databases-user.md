# TAGLINE

manage database cluster users

# TLDR

**List database users**

```doctl databases user list [cluster_id]```

**Create a user**

```doctl databases user create [cluster_id] [username]```

**Get user info**

```doctl databases user get [cluster_id] [username]```

**Reset user password**

```doctl databases user reset [cluster_id] [username]```

**Delete a user**

```doctl databases user delete [cluster_id] [username]```

# SYNOPSIS

**doctl** **databases** **user** _command_ [_options_]

# SUBCOMMANDS

**list**
> List database users.

**create**
> Create a database user.

**get**
> Get user details.

**delete**
> Delete a user.

**reset**
> Reset user authentication.

# DESCRIPTION

**doctl databases user** manages users for DigitalOcean managed database clusters. Users represent authentication credentials that applications and administrators use to connect to databases.

Each user has associated credentials (username and password) and potentially different privileges depending on the database engine. User management includes creating users for different applications or services, rotating credentials via password reset, and removing users when access is no longer needed.

Proper user management follows security best practices: creating dedicated users for each application, regularly rotating credentials, and removing unused accounts to minimize security exposure.

# SEE ALSO

[doctl-databases](/man/doctl-databases)(1), [doctl-databases-pool](/man/doctl-databases-pool)(1)
