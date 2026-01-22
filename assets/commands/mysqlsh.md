# TLDR

**Start MySQL Shell**

```mysqlsh```

**Connect to server**

```mysqlsh -u [username] -h [hostname]```

**Connect with URI**

```mysqlsh [mysql://user@host:3306/database]```

**Execute SQL mode**

```mysqlsh --sql -u [user] -e "[SELECT 1]"```

**JavaScript mode**

```mysqlsh --js```

**Python mode**

```mysqlsh --py```

**Run script**

```mysqlsh -f [script.js]```

# SYNOPSIS

**mysqlsh** [_options_] [_uri_]

# PARAMETERS

_URI_
> Connection URI.

**-u** _USER_
> Username.

**-h** _HOST_
> Hostname.

**--sql**
> SQL mode.

**--js**
> JavaScript mode.

**--py**
> Python mode.

**-f** _FILE_
> Execute script file.

**--help**
> Display help information.

# DESCRIPTION

**mysqlsh** is the MySQL Shell client. It provides SQL, JavaScript, and Python interfaces.

The tool supports MySQL 8.0 features. Includes AdminAPI for cluster management.

mysqlsh is modern MySQL client.

# CAVEATS

Requires MySQL 8.0+. Three language modes. Replaces legacy mysql for new features.

# HISTORY

MySQL Shell was introduced with **MySQL 8.0** as a modern client supporting multiple scripting languages.

# SEE ALSO

[mysql](/man/mysql)(1), [mysqladmin](/man/mysqladmin)(1), [mycli](/man/mycli)(1)

