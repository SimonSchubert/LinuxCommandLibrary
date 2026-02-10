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

**Use specific shell**

```mongosh --nodb```

**Quiet mode**

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

**--help**
> Display help information.

# DESCRIPTION

**mongosh** is the modern MongoDB shell. It provides JavaScript interface with enhanced features.

The tool replaces legacy mongo shell. Includes syntax highlighting, autocomplete, and snippets.

# CAVEATS

Requires Node.js runtime. MongoDB 5.0+ recommended. Different API from legacy mongo.

# HISTORY

mongosh was released by **MongoDB** in 2020 as the next-generation shell replacement for the legacy mongo shell.

# SEE ALSO

[mongo](/man/mongo)(1), [mongod](/man/mongod)(1), [mongoimport](/man/mongoimport)(1)

