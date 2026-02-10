# TAGLINE

mongoDB database server daemon

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

# SYNOPSIS

**mongod** [_options_]

# PARAMETERS

**--dbpath** _PATH_
> Database directory path.

**--port** _PORT_
> Listening port number.

**--bind_ip** _IP_
> IP addresses to bind.

**--auth**
> Enable authentication.

**--config** _FILE_
> Configuration file.

**--replSet** _NAME_
> Replica set name.

**--help**
> Display help information.

# DESCRIPTION

**mongod** is the MongoDB database server daemon. It handles data requests and manages data storage.

The tool is the core database process. Supports replication, sharding, and authentication.

# CAVEATS

Requires proper storage configuration. Resource intensive. Needs careful security setup.

# HISTORY

mongod is the **MongoDB** server process, the core component of MongoDB since its initial release in 2009.

# SEE ALSO

[mongosh](/man/mongosh)(1), [mongo](/man/mongo)(1), [mongoimport](/man/mongoimport)(1)

