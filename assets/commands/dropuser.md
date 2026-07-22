# TAGLINE

PostgreSQL user removal utility

# TLDR

**Drop a user**

```dropuser [username]```

**Drop with confirmation**

```dropuser -i [username]```

**Drop on remote** host

```dropuser -h [hostname] [username]```

**Drop as specific** admin user

```dropuser -U [admin_user] [username]```

**Drop if exists**

```dropuser --if-exists [username]```

# SYNOPSIS

**dropuser** [_options_] _username_

# PARAMETERS

_USERNAME_
> PostgreSQL role/user to drop.

**-h**, **--host** _HOST_
> Server hostname.

**-p**, **--port** _PORT_
> Server port.

**-U**, **--username** _USER_
> Connect as this user.

**-i**, **--interactive**
> Prompt for confirmation before dropping.

**--if-exists**
> Do not raise an error if the role does not exist.

**-e**, **--echo**
> Print the SQL command that is being sent to the server.

**-w**, **--no-password**
> Never prompt for a password. Useful in scripts, where the password must come from `~/.pgpass` or the environment.

**-W**, **--password**
> Force a password prompt.

**--maintenance-db**=_dbname_
> Database to connect to in order to issue the command. Defaults to `postgres`.

**-V**, **--version**
> Print the version and exit.

**--help**
> Display help information.

# DESCRIPTION

**dropuser** removes a PostgreSQL role. It is a thin wrapper around the `DROP ROLE` SQL statement, provided so that user management can be scripted from the shell without invoking `psql`.

In PostgreSQL, users and groups are the same thing: a **role**. `dropuser` and `createuser` are historical names kept for familiarity, and the distinction between a "user" and a "role" is only whether the role has the LOGIN attribute.

To run it you must be a superuser, or hold CREATEROLE and have been granted membership in the role you are dropping.

# CAVEATS

**A role cannot be dropped while it still owns anything.** PostgreSQL refuses with a dependency error listing the objects, and the fix is to reassign or remove them first:

```REASSIGN OWNED BY [olduser] TO [newuser]```

```DROP OWNED BY [olduser]```

`DROP OWNED` also removes the role's privileges on objects it does not own, which `REASSIGN OWNED` leaves behind. Both must be run in **every database** where the role owns something, since ownership is per-database and `dropuser` connects to only one.

Dropping a role does not terminate its open sessions, and it does not touch objects in other databases that you have not cleaned up. The role also cannot be the one you are currently connected as.

# HISTORY

dropuser is one of PostgreSQL's original client wrapper scripts, dating from a time when they really were shell scripts around `psql`; they are C programs now, but the interface is unchanged. The name predates the unification of users and groups into roles in **PostgreSQL 8.1** (2005), which is why the tool is called `dropuser` while the SQL it emits says `DROP ROLE`.

# INSTALL

```apk: sudo apk add postgresql17-client```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[createuser](/man/createuser)(1), [psql](/man/psql)(1), [dropdb](/man/dropdb)(1), [createdb](/man/createdb)(1)

# RESOURCES

```[Source code](https://git.postgresql.org/gitweb/?p=postgresql.git)```

```[Homepage](https://www.postgresql.org)```

```[Documentation](https://www.postgresql.org/docs/current/app-dropuser.html)```

<!-- verified: 2026-07-14 -->

