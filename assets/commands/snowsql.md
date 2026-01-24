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

**Output format**

```snowsql -a [account] -u [user] -o output_format=[csv]```

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

**-o** _OPTION=VALUE_
> Set option.

# DESCRIPTION

**snowsql** is Snowflake's command-line client. It connects to Snowflake cloud data warehouse.

Connection requires account and credentials. Password prompted or stored in config.

SQL execution runs queries directly. Results display in terminal.

File execution runs SQL scripts. Batch processing and automation.

Output formats include CSV, TSV, and table. Export data directly.

# CAVEATS

Requires Snowflake account. Large results may be slow. MFA may be required.

# HISTORY

**SnowSQL** is the official CLI for **Snowflake** cloud data warehouse. It provides terminal-based access to Snowflake's SQL engine.

# SEE ALSO

[psql](/man/psql)(1), [mysql](/man/mysql)(1), [bq](/man/bq)(1)
