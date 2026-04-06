# TAGLINE

Snowflake cloud data warehouse CLI client

# TLDR

**Connect to Snowflake**

```snowsql -a [account] -u [username]```

**Execute query**

```snowsql -a [account] -u [user] -q "[SELECT * FROM table]"```

**Run SQL file**

```snowsql -a [account] -u [user] -f [script.sql]```

**Specify database**

```snowsql -a [account] -u [user] -d [database]```

**Specify warehouse**

```snowsql -a [account] -u [user] -w [warehouse]```

**Specify role**

```snowsql -a [account] -u [user] -r [role]```

**Output in CSV format**

```snowsql -a [account] -u [user] -o output_format=[csv]```

**Use a named connection from config**

```snowsql -c [connection_name]```

# SYNOPSIS

**snowsql** [_-a account_] [_-u user_] [_-d database_] [_options_]

# PARAMETERS

**-a**, **--accountname** _ACCOUNT_
> Snowflake account.

**-u**, **--username** _USER_
> Username.

**-d**, **--dbname** _DB_
> Database.

**-w**, **--warehouse** _WH_
> Warehouse.

**-s**, **--schemaname** _SCHEMA_
> Schema.

**-q**, **--query** _SQL_
> Execute query.

**-f**, **--filename** _FILE_
> Run SQL file.

**-r**, **--rolename** _ROLE_
> Default role to use.

**-c**, **--connection** _NAME_
> Use a named connection from config file.

**-D**, **--variable** _KEY=VALUE_
> Define a variable (referenced as &KEY in queries).

**-o** _OPTION=VALUE_
> Set option (e.g., output_format=csv, quiet=true, friendly=false).

**--version**
> Display SnowSQL version.

**--upgrade**
> Force upgrade to latest SnowSQL version.

**--config** _FILE_
> Path to configuration file.

# DESCRIPTION

**snowsql** is the official command-line client for Snowflake, a cloud-based data warehouse platform. It provides an interactive SQL shell for querying, managing databases, and performing administrative tasks on Snowflake accounts.

Connections require a Snowflake account name and credentials, which can be provided on the command line, entered interactively, or stored in a configuration file. The client supports specifying database, schema, warehouse, and role context at connection time.

SQL queries can be executed interactively in the shell, passed directly via **-q**, or run from script files with **-f** for batch automation. Output can be formatted as tables, CSV, TSV, or other formats using the **-o output_format** option, making it useful for data export and pipeline integration.

# CONFIGURATION

**~/.snowsql/config**
> Connection profiles, default settings, and stored credentials for SnowSQL sessions.

**SNOWSQL_ACCOUNT**
> Environment variable specifying the default Snowflake account name.

**SNOWSQL_PWD**
> Environment variable specifying the default password.

**SNOWSQL_ROLE**
> Environment variable specifying the default role.

# CAVEATS

Requires Snowflake account. Large results may be slow. MFA may be required.

# HISTORY

**SnowSQL** is the official CLI for **Snowflake** cloud data warehouse. It provides terminal-based access to Snowflake's SQL engine.

# SEE ALSO

[psql](/man/psql)(1), [mysql](/man/mysql)(1), [bq](/man/bq)(1)
