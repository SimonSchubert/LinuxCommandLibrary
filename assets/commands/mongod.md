# TAGLINE

MongoDB database server daemon

# TLDR

**Start MongoDB server**

```mongod```

**Specify data directory**

```mongod --dbpath [/data/db]```

**Specify port**

```mongod --port [27017]```

**Bind to all interfaces**

```mongod --bind_ip_all```

**Enable authentication**

```mongod --auth```

**Use config file**

```mongod --config [/etc/mongod.conf]```

**Run as replica set**

```mongod --replSet [rs0]```

**Run as a daemon with logging**

```mongod --fork --logpath [/var/log/mongod.log]```

**Require TLS for all connections**

```mongod --tlsMode requireTLS --tlsCertificateKeyFile [/etc/ssl/mongodb.pem]```

**Cleanly stop the server** (Linux only)

```mongod --shutdown --dbpath [/data/db]```

# SYNOPSIS

**mongod** [_options_]

# PARAMETERS

**-f**, **--config** _FILE_
> Configuration file path.

**--dbpath** _PATH_
> Database directory path (default: /data/db, or \data\db on Windows).

**--port** _PORT_
> Listening port number (default: 27017).

**--bind_ip** _IP_
> Comma-separated list of hostnames or IP addresses to bind (default: localhost).

**--bind_ip_all**
> Bind to all IPv4 addresses, and IPv6 with **--ipv6**.

**--ipv6**
> Enable IPv6 support.

**--auth**
> Enable authorization.

**--keyFile** _FILE_
> Path to shared key file for replica set or sharded cluster authentication. Implies **--auth**.

**--replSet** _NAME_
> Replica set name.

**--oplogSize** _MB_
> Maximum size of the oplog in megabytes.

**--shardsvr**
> Run as a shard in a sharded cluster (default port 27018). Requires **--replSet**.

**--configsvr**
> Run as a config server (default port 27019, default dbpath /data/configdb).

**--logpath** _FILE_
> Send diagnostic logging to a file instead of standard output.

**--logappend**
> Append to the existing log file on restart instead of rotating it.

**--syslog**
> Send logging to the system syslog. Not supported on Windows.

**--fork**
> Run the server as a background daemon. Requires **--logpath** or **--syslog**. Not supported on Windows.

**--pidfilepath** _FILE_
> Write the process ID to this file.

**--tlsMode** _MODE_
> TLS use: disabled, allowTLS, preferTLS or requireTLS.

**--storageEngine** _ENGINE_
> Storage engine to use (default: wiredTiger).

**--wiredTigerCacheSizeGB** _SIZE_
> Maximum size of the WiredTiger internal cache in GB.

**--directoryperdb**
> Store each database in its own directory.

**--repair**
> Rebuild all collections and indexes from a standalone instance's data files.

**--shutdown**
> Cleanly terminate the running **mongod**. Requires **--dbpath**. Linux only.

**--quiet**
> Limit log output.

**-v**, **--verbose**
> Increase verbosity. Repeat for more, up to **-vvvvv**.

**--version**
> Display version information.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**mongod** is the primary daemon process of MongoDB. It handles data requests, manages data access, and performs background management operations.

It supports replication, sharding and authentication, and uses the WiredTiger storage engine by default. Most deployments configure it through a YAML file passed with **--config**.

# CAVEATS

Packaged installs ship a config file whose **storage.dbPath** differs from the /data/db default. Before binding to a public address, enable authentication and harden network access. **--bind_ip** and **--bind_ip_all** are mutually exclusive. **--oplogSize** only applies when the oplog is first created.

# HISTORY

**mongod** is the server process of **MongoDB**, first released by 10gen (now MongoDB, Inc.) in **2009**. Since 2018 new releases are licensed under the SSPL.

# SEE ALSO

[mongosh](/man/mongosh)(1), [mongo](/man/mongo)(1), [mongoimport](/man/mongoimport)(1), [mongodump](/man/mongodump)(1), [mongorestore](/man/mongorestore)(1)

# RESOURCES

```[Homepage](https://www.mongodb.com/)```

```[Source code](https://github.com/mongodb/mongo)```

```[Documentation](https://www.mongodb.com/docs/manual/reference/program/mongod/)```

<!-- verified: 2026-11-09 -->
