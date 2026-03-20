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

# SYNOPSIS

**mongod** [_options_]

# PARAMETERS

**-f**, **--config** _FILE_
> Configuration file path.

**--dbpath** _PATH_
> Database directory path (default: /data/db).

**--port** _PORT_
> Listening port number (default: 27017).

**--bind_ip** _IP_
> Comma-separated list of IP addresses to bind.

**--bind_ip_all**
> Bind to all IP addresses.

**--auth**
> Enable authentication.

**--replSet** _NAME_
> Replica set name.

**--logpath** _FILE_
> Path for the log file. Required when using --fork.

**--fork**
> Run the server as a background daemon.

**--keyFile** _FILE_
> Path to shared key file for replica set/sharded cluster authentication. Implies --auth.

**--wiredTigerCacheSizeGB** _SIZE_
> Maximum size of the WiredTiger internal cache in GB.

**--help**
> Display help information.

# DESCRIPTION

**mongod** is the MongoDB database server daemon. It handles data requests, manages data storage, and performs background management operations.

The tool is the core database process. Supports replication, sharding, and authentication. Uses the WiredTiger storage engine by default.

# CAVEATS

Requires proper storage configuration. Resource intensive. Needs careful security setup. When using --fork, --logpath must also be specified.

# HISTORY

mongod is the **MongoDB** server process, the core component of MongoDB since its initial release in 2009.

# SEE ALSO

[mongosh](/man/mongosh)(1), [mongo](/man/mongo)(1), [mongoimport](/man/mongoimport)(1), [mongodump](/man/mongodump)(1), [mongorestore](/man/mongorestore)(1)

