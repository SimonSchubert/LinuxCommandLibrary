# TAGLINE

modern MongoDB shell

# TLDR

**Connect to local database**

```mongosh```

**Connect to specific database**

```mongosh [mongodb://host:27017/dbname]```

**Connect with authentication**

```mongosh -u [user] -p [password] [dbname]```

**Execute script file**

```mongosh [dbname] [script.js]```

**Evaluate expression**

```mongosh --eval "[db.collection.find()]"```

**Start shell without** connecting to a database

```mongosh --nodb```

**Connect with TLS** to a remote host

```mongosh --tls "mongodb://[host]:27017/[dbname]"```

**Quiet mode** (suppress startup messages)

```mongosh --quiet [script.js]```

# SYNOPSIS

**mongosh** [_options_] [_connection_string_] [_file_names_]

# PARAMETERS

_CONNECTION_STRING_
> MongoDB connection URI.

**-u** _USER_
> Username for authentication.

**-p** _PASSWORD_
> Password for authentication.

**--eval** _EXPR_
> Evaluate JavaScript expression.

**--nodb**
> Start without database connection.

**--quiet**
> Silence non-essential output.

**--host** _HOST_
> Server hostname (default: localhost).

**--port** _PORT_
> Server port (default: 27017).

**--authenticationDatabase** _DB_
> Authentication database (default: admin).

**--tls**
> Enable TLS/SSL connection.

**--shell**
> Force interactive shell after running files/eval.

**--help**
> Display help information.

# DESCRIPTION

**mongosh** is the modern MongoDB shell, providing a fully functional JavaScript and Node.js REPL environment for interacting with MongoDB deployments.

It replaces the legacy **mongo** shell with improvements including syntax highlighting, intelligent autocomplete, inline help, and extensible snippets. It supports all CRUD operations, aggregation pipelines, database administration, and Atlas connectivity.

# CAVEATS

Bundles its own Node.js runtime since version 1.0. Compatible with MongoDB 4.0+, though some features require MongoDB 5.0+. Has a different driver API from the legacy mongo shell; scripts may need updating.

# HISTORY

mongosh was released by **MongoDB** in 2020 as the next-generation shell replacement for the legacy mongo shell.

# SEE ALSO

[mongo](/man/mongo)(1), [mongod](/man/mongod)(1), [mongoimport](/man/mongoimport)(1), [mongoexport](/man/mongoexport)(1), [mongodump](/man/mongodump)(1)

