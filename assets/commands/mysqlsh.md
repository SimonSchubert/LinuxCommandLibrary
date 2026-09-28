# TAGLINE

mySQL Shell client

# TLDR

**Start MySQL Shell**

```mysqlsh```

**Connect to server** (prompts for the password)

```mysqlsh -u [username] -h [hostname] -P [3306]```

**Connect with URI**

```mysqlsh [user]@[host]:[3306]/[database]```

**Execute a SQL statement** and exit

```mysqlsh --sql [user]@[host] -e "[SELECT VERSION()]"```

Start in **JavaScript** or **Python** mode

```mysqlsh --js [user]@[host]```

```mysqlsh --py [user]@[host]```

**Run a script** file

```mysqlsh [user]@[host] -f [script.sql]```

**Dump a whole instance** with the parallel dump utility

```mysqlsh [user]@[host] -- util dump-instance [/path/to/dump]```

**Load a dump** into a server

```mysqlsh [user]@[host] -- util load-dump [/path/to/dump]```

Check a server before **upgrading** it

```mysqlsh -- util check-for-server-upgrade [user]@[host]```

# SYNOPSIS

**mysqlsh** [_options_] [_URI_]

**mysqlsh** [_options_] [_URI_] **--** _object_ _method_ [_arguments_]

# PARAMETERS

_URI_
> Connection string, e.g. **user@host:port/schema** or **mysql://user@host**.

**-u**, **--user** _USER_
> Username.

**-h**, **--host** _HOST_
> Hostname.

**-P**, **--port** _PORT_
> TCP port (3306 classic protocol, 33060 X Protocol).

**-S**, **--socket** _PATH_
> Unix socket file.

**-p**, **--password**[=_PASS_]
> Password; prompts if no value is given.

**-D**, **--schema** _NAME_
> Default schema.

**--sql**, **--js**, **--py**
> Start in SQL, JavaScript or Python mode.

**--sqlc**
> SQL mode using the classic MySQL protocol.

**--mysql**, **-mc** / **--mysqlx**, **-mx**
> Force a classic or X Protocol session.

**-e**, **--execute** _CODE_
> Execute code in the active language and quit.

**-f**, **--file** _FILE_
> Process a file in batch mode.

**--json**[=**pretty**|**raw**]
> Print output as JSON.

**--result-format** _FORMAT_
> Output format: table, tabbed, vertical, json, ndjson, json/raw.

**--ssl-mode** _MODE_
> TLS requirement: DISABLED, PREFERRED, REQUIRED, VERIFY_CA, VERIFY_IDENTITY.

**--log-level** _LEVEL_
> Logging level (1 to 8 or none, internal, error, warning, info, debug...).

**--cluster**, **--replicaset**
> Ensure the connection target is part of an InnoDB Cluster or ReplicaSet.

**--help**
> Display help information.

# DESCRIPTION

**mysqlsh** is MySQL Shell, an advanced client and code editor for MySQL. It works in SQL, JavaScript and Python modes, switchable at runtime with **\sql**, **\js** and **\py**.

Beyond queries it bundles the **AdminAPI** (**dba** object) for deploying and managing InnoDB Cluster, ClusterSet and ReplicaSet, the **X DevAPI** for document store access, and the **util** object with parallel dump/load, upgrade checker and import utilities. Anything after **--** on the command line is mapped to these API calls, which makes them scriptable.

# CAVEATS

MySQL Shell is versioned together with MySQL Server; use a Shell release equal to or newer than the servers it manages. The classic **mysql** client remains separate. Credentials may be stored in a secret store; see **--save-passwords**.

# HISTORY

MySQL Shell was introduced in **2016** alongside the MySQL 5.7 Document Store and X Protocol, and became the recommended administration client with **MySQL 8.0**.

# SEE ALSO

[mysql](/man/mysql)(1), [mysqladmin](/man/mysqladmin)(1), [mysqldump](/man/mysqldump)(1), [mycli](/man/mycli)(1)

# RESOURCES

```[Source code](https://github.com/mysql/mysql-shell)```

```[Documentation](https://dev.mysql.com/doc/mysql-shell/en/)```

<!-- verified: 2026-09-29 -->
