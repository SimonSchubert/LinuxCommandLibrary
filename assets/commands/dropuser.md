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
> Prompt for confirmation.

**--if-exists**
> Don't error if user doesn't exist.

**-e**, **--echo**
> Show SQL command executed.

**--help**
> Display help information.

# DESCRIPTION

**dropuser** removes a PostgreSQL user (role). It's a command-line wrapper around the DROP ROLE SQL statement, simplifying user management without requiring psql.

The role being dropped must not own any databases or have dependencies. Objects owned by the role should be reassigned or dropped before removing the user.

Only superusers and roles with CREATEROLE privilege can drop other roles.

# CAVEATS

Cannot drop role with dependencies. Role must not own objects. Requires appropriate privileges. Cannot drop current user or superuser without superuser rights.

# HISTORY

dropuser is part of **PostgreSQL** client utilities, complementing createuser for command-line user management. It has been available since early PostgreSQL versions.

# SEE ALSO

[createuser](/man/createuser)(1), [psql](/man/psql)(1), [dropdb](/man/dropdb)(1)
