# TLDR

**Start CouchDB** server

```couchdb```

**Start in the background**

```couchdb -b```

**Start with a specific configuration** file

```couchdb -c [/path/to/local.ini]```

**Check if CouchDB is running**

```curl http://127.0.0.1:5984/```

**Stop CouchDB** gracefully

```couchdb -d```

**Start with specific Erlang** options

```couchdb -a [erlang_option]```

# SYNOPSIS

**couchdb** [_options_]

# PARAMETERS

**-b**
> Start in background (detached mode).

**-d**
> Shutdown a running CouchDB instance.

**-c** _FILE_
> Use additional configuration file.

**-i**
> Start an interactive Erlang shell.

**-o** _FILE_
> Redirect stdout to the specified file.

**-e** _FILE_
> Redirect stderr to the specified file.

**-p** _FILE_
> Create PID file at the specified path.

**-r** _SECONDS_
> Respawn CouchDB after crash with delay.

**-a** _ARGS_
> Additional Erlang VM arguments.

# DESCRIPTION

**Apache CouchDB** is a document-oriented NoSQL database that uses JSON for documents, JavaScript for MapReduce queries, and HTTP for its API. The **couchdb** command starts the database server.

CouchDB is designed for reliability with Multi-Version Concurrency Control (MVCC), ensuring data integrity without locking. It features built-in replication for distributed deployments, making it suitable for offline-first applications that sync when connectivity is available.

The database provides a RESTful HTTP API for all operations, from creating databases and documents to running queries. The built-in web interface, Fauxton, allows administration and querying through a browser at http://localhost:5984/_utils/.

# CAVEATS

Default installation binds to localhost only. For remote access, configuration changes are required in local.ini. The admin party mode (no authentication) is insecure for production. Compaction should be run periodically to reclaim disk space.

# HISTORY

CouchDB was created by Damien Katz, who began the project in **2005** using C++, then rewrote it in Erlang in **2008**. It became an Apache project in **2008** and graduated to top-level project status in **2010**. The name refers to sitting on your "couch" and relaxing.

# SEE ALSO

[curl](/man/curl)(1), [mongod](/man/mongod)(1), [redis-server](/man/redis-server)(1)
