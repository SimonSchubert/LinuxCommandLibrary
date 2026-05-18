# TAGLINE

legacy MongoDB shell

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

**mongo** is the original interactive shell shipped with the **MongoDB** server up through release **4.4**. It is a JavaScript REPL that connects to a **mongod** or **mongos** process via the MongoDB wire protocol and exposes the database as a tree of JavaScript objects: **db**, **db.collection**, and helper methods like **find()**, **insertOne()**, and **aggregate()**.

Connections accept a MongoDB URI (**mongodb://** or **mongodb+srv://**) or individual flags such as **--host**, **--port**, **-u** / **-p** / **--authenticationDatabase** for authentication, and **--tls** / **--ssl** for encrypted transports. A trailing JavaScript file plus **--eval** lets the shell be used in scripts, returning the result of the last expression on stdout.

Beyond the shell, **mongo** is widely used for administrative tasks: creating users, configuring replica sets, sharding, and inspecting server status with **db.serverStatus()**.

# CAVEATS

Deprecated and removed from official MongoDB distributions starting with **MongoDB 6.0**; new installations ship only **mongosh**, which speaks the same protocol but uses Node.js as its runtime and supports newer features such as advanced text formatting, snippets, and improved auto-completion. Some legacy administrative scripts still target **mongo**'s specific JavaScript environment (SpiderMonkey) and may need minor changes to run under **mongosh**.

# HISTORY

The **mongo** shell appeared with the very first public MongoDB releases in **2009**. It was officially deprecated when **mongosh** entered general availability in **MongoDB 5.0** (July 2021) and was dropped from MongoDB Server **6.0** packages in **2022**.

# SEE ALSO

[mongosh](/man/mongosh)(1), [mongod](/man/mongod)(1), [mongoimport](/man/mongoimport)(1)

