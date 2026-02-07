# TAGLINE

JDBC command-line client for Apache Hive

# TLDR

**Connect to HiveServer2**

```beeline -u jdbc:hive2://[localhost]:10000/[default]```

**Connect with username and password**

```beeline -u jdbc:hive2://[localhost]:10000/[default] -n [username] -p [password]```

**Execute a query** directly

```beeline -u jdbc:hive2://[localhost]:10000 -e "[SELECT * FROM table_name]"```

**Execute queries from a file**

```beeline -u jdbc:hive2://[localhost]:10000 -f [path/to/script.sql]```

**Connect with output in CSV format**

```beeline -u jdbc:hive2://[localhost]:10000 --outputformat=csv2```

**Reconnect** to previously used URL

```beeline -r```

# SYNOPSIS

**beeline** [_OPTIONS_] [_QUERY_]

# PARAMETERS

**-u** _URL_
> JDBC connection URL (e.g., jdbc:hive2://localhost:10000/default).

**-n** _USERNAME_
> Username for authentication.

**-p** _PASSWORD_
> Password for authentication.

**-w** _FILE_
> Path to file containing password.

**-d** _DRIVER_
> JDBC driver class to use.

**-e** _QUERY_
> Execute query string. Multiple statements can be separated by semicolons.

**-f** _FILE_
> Execute SQL script from file.

**-i**, **--init** _FILE_
> Run initialization file before executing commands.

**-r**
> Reconnect to previously used URL (since Hive 2.1.0).

**--outputformat** _FORMAT_
> Output format: table, vertical, csv, tsv, dsv, csv2, tsv2, json, jsonfile.

**--showHeader**
> Display column names in output (default: true).

**--silent**
> Suppress informational messages and query logs.

**--verbose**
> Show debug information and error details.

**--hiveconf** _KEY_=_VALUE_
> Set Hive configuration property.

**--hivevar** _KEY_=_VALUE_
> Define Hive session variable.

**--force**
> Continue script execution despite errors.

**--incremental**
> Display rows immediately as fetched.

**--help**
> Display usage message.

# DESCRIPTION

**Beeline** is a JDBC command-line client for HiveServer2, based on SQLLine CLI. It provides an interface to execute Hive queries against a HiveServer2 instance, supporting both embedded mode (running an embedded Hive) and remote mode (connecting over Thrift).

Remote mode is recommended for production use as it is more secure and does not require direct HDFS or metastore access. Beeline connects to HiveServer2 which runs on port 10000 by default. The client supports various authentication methods including Kerberos, LDAP, and custom authentication.

Connection URLs can include session variables, Hive configuration parameters, and connection properties. Beeline supports ZooKeeper-based service discovery, SSL/TLS connections, and HTTP transport mode for firewall-friendly deployments.

# CAVEATS

Beeline replaces the deprecated Hive CLI. Some older CLI-specific commands may behave differently. Connection URLs must be properly formatted with correct escaping of special characters. When using Kerberos authentication, proper keytab and principal configuration is required.

# HISTORY

Beeline was introduced as the recommended HiveServer2 client to replace the original Hive CLI. It is based on SQLLine, an open-source JDBC command-line tool. The Hive CLI was deprecated because it required direct access to Hadoop and Hive libraries, while Beeline provides a thin client model that connects through JDBC, improving security and deployment flexibility.

# SEE ALSO

[hive](/man/hive)(1), [spark-sql](/man/spark-sql)(1), [impala-shell](/man/impala-shell)(1), [presto](/man/presto)(1)
