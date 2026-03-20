# TAGLINE

Local Azure Storage emulator for development and testing.

# TLDR

**Start** Azurite (all services)

```azurite```

Start **blob service** only

```azurite-blob```

Start on **custom ports**

```azurite --blobPort [10000] --queuePort [10001] --tablePort [10002]```

Use **custom location**

```azurite --location [/path/to/data]```

**Silent** mode

```azurite --silent```

# SYNOPSIS

**azurite** [_options_]

# DESCRIPTION

**azurite** is an open-source Azure Storage API compatible server emulator. It provides local development and testing environments for Azure Blob, Queue, and Table storage without requiring an Azure account.

The tool is officially maintained by Microsoft and replaces the deprecated Azure Storage Emulator.

# PARAMETERS

**--blobPort** _port_
> Blob service port (default: 10000)

**--queuePort** _port_
> Queue service port (default: 10001)

**--tablePort** _port_
> Table service port (default: 10002)

**--location**, **-l** _path_
> Data storage location

**--silent**, **-s**
> Silent mode (no logging)

**--debug** _path_
> Debug log file path

**--loose**
> Loose mode (permissive validation)

**--cert** _path_
> HTTPS certificate path

**--key** _path_
> HTTPS key path

**--oauth** _level_
> OAuth authentication level (e.g., basic)

**--blobHost** _addr_
> Blob service listening address (default: 127.0.0.1)

**--queueHost** _addr_
> Queue service listening address (default: 127.0.0.1)

**--tableHost** _addr_
> Table service listening address (default: 127.0.0.1)

**--inMemoryPersistence**
> Store all data in memory only (data lost on exit)

**--disableProductStyleUrl**
> Force account name parsing from URI path instead of hostname

# SERVICES

**azurite**
> All services (Blob, Queue, Table)

**azurite-blob**
> Blob service only

**azurite-queue**
> Queue service only

**azurite-table**
> Table service only

# CONNECTION STRINGS

Default development connection string:
```
DefaultEndpointsProtocol=http;AccountName=devstoreaccount1;AccountKey=Eby8vdM02xNOcqFlqUwJPLlmEtlCDXJ1OUzFT50uSRZ6IFsuFq2UVErCz4I6tq/K1SZFPTOtr/KBHBeksoGMGw==;BlobEndpoint=http://127.0.0.1:10000/devstoreaccount1;QueueEndpoint=http://127.0.0.1:10001/devstoreaccount1;TableEndpoint=http://127.0.0.1:10002/devstoreaccount1;
```

# CAVEATS

Not all Azure Storage features are supported. Some API behaviors differ from production. Data persists between runs unless --inMemoryPersistence is used. Not for production use. Requires Node.js to install via npm.

# HISTORY

**Azurite** was created by Xiao Ning Guo and adopted by Microsoft in **2019** as the official replacement for the Windows-only Azure Storage Emulator, providing cross-platform support.

# SEE ALSO

[az-storage](/man/az-storage)(1), [docker](/man/docker)(1), [node](/man/node)(1), [npm](/man/npm)(1)
