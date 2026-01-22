# TLDR

**Connect to local database**

```mongo```

**Connect to remote database**

```mongo [mongodb://host:27017/dbname]```

**Connect with authentication**

```mongo -u [user] -p [password] [dbname]```

**Execute JavaScript file**

```mongo [dbname] [script.js]```

**Evaluate expression**

```mongo --eval "[db.collection.find()]"```

**Connect with SSL**

```mongo --ssl --host [host]```

# SYNOPSIS

**mongo** [_options_] [_db_address_] [_file_names_]

# PARAMETERS

_DB_ADDRESS_
> Database connection string.

**-u** _USER_
> Username for authentication.

**-p** _PASSWORD_
> Password for authentication.

**--eval** _EXPR_
> Evaluate JavaScript expression.

**--ssl**
> Use SSL connection.

**--host** _HOST_
> Server hostname.

**--help**
> Display help information.

# DESCRIPTION

**mongo** is the legacy MongoDB shell. It provides interactive JavaScript interface to MongoDB.

The tool connects to mongod instances. Supports queries, administration, and scripting.

mongo is legacy MongoDB shell.

# CAVEATS

Deprecated in favor of mongosh. MongoDB 4.4 and earlier. JavaScript-based.

# HISTORY

mongo was the original **MongoDB** shell, now replaced by mongosh for MongoDB 5.0+.

# SEE ALSO

[mongosh](/man/mongosh)(1), [mongod](/man/mongod)(1), [mongoimport](/man/mongoimport)(1)

