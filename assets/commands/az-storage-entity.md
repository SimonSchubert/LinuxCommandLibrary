# TAGLINE

Manage entities in Azure Table Storage

# TLDR

**Insert an entity** into a table

```az storage entity insert --table-name [MyTable] --entity PartitionKey=[pk] RowKey=[rk] Property=[value] --account-name [mystorageaccount]```

**Insert with conflict handling** (fail, merge, or replace)

```az storage entity insert --table-name [MyTable] --entity PartitionKey=[pk] RowKey=[rk] Property=[value] --if-exists [merge] --connection-string [$CS]```

**Query entities** from a table

```az storage entity query --table-name [MyTable] --account-name [mystorageaccount]```

**Query with OData filter**

```az storage entity query --table-name [MyTable] --filter "PartitionKey eq 'pk'" --account-name [mystorageaccount]```

**Show a specific entity**

```az storage entity show --table-name [MyTable] --partition-key [pk] --row-key [rk] --account-name [mystorageaccount]```

**Merge entity properties**

```az storage entity merge --table-name [MyTable] --entity PartitionKey=[pk] RowKey=[rk] Property=[newvalue] --account-name [mystorageaccount]```

**Replace an entity**

```az storage entity replace --table-name [MyTable] --entity PartitionKey=[pk] RowKey=[rk] Property=[newvalue] --account-name [mystorageaccount]```

**Delete an entity**

```az storage entity delete --table-name [MyTable] --partition-key [pk] --row-key [rk] --account-name [mystorageaccount]```

# SYNOPSIS

**az** **storage** **entity** _subcommand_ [_options_]

# SUBCOMMANDS

**insert**
> Insert an entity into a table.

**delete**
> Delete an entity from a table.

**merge**
> Update an entity by merging properties.

**replace**
> Update an entity by replacing it entirely.

**query**
> List entities matching a query.

**show**
> Get a single entity from a table.

# PARAMETERS

**-t**, **--table-name** _NAME_
> Name of the table.

**-e**, **--entity** _KEY=VAL ..._
> Space-separated `key=value` pairs. Must include `PartitionKey` and `RowKey`. Append `key@odata.type=<EdmType>` to set explicit Edm types (Edm.String, Edm.Int32, Edm.Int64, Edm.Double, Edm.Boolean, Edm.DateTime, Edm.Guid, Edm.Binary).

**--partition-key** _PK_
> Partition key of the entity.

**--row-key** _RK_
> Row key of the entity.

**--filter** _EXPR_
> OData filter expression for `query`.

**--select** _PROPS_
> Space-separated list of properties to return.

**--num-results** _N_
> Number of entities returned per service request.

**--marker** _NEXTPK=... NEXTRK=..._
> Continuation marker for paged queries.

**--if-exists** _BEHAVIOR_
> Behavior when an entity already exists: `fail` (default), `merge`, or `replace` (insert only).

**--if-match** _ETAG_
> Perform the operation only if the entity's ETag matches. Default `*`.

**--account-name** _NAME_
> Storage account name. Env: `AZURE_STORAGE_ACCOUNT`.

**--account-key** _KEY_
> Storage account key. Env: `AZURE_STORAGE_KEY`.

**--connection-string** _CS_
> Storage account connection string. Env: `AZURE_STORAGE_CONNECTION_STRING`.

**--sas-token** _TOKEN_
> Shared Access Signature token. Env: `AZURE_STORAGE_SAS_TOKEN`.

**--auth-mode** _MODE_
> Authentication mode: `key` (legacy) or `login` (Azure AD).

**--table-endpoint** _URL_
> Custom service endpoint, useful for Cosmos DB Table API.

# DESCRIPTION

**az storage entity** manages entities in Azure Table Storage. Table Storage is a NoSQL key-value store for structured data. Entities are items stored in tables, similar to rows in a database, uniquely identified by `PartitionKey` and `RowKey`.

This command works with both Azure Storage accounts and Azure Cosmos DB Table API (via `--table-endpoint`).

# CAVEATS

Requires Azure CLI and valid storage credentials. Property types are limited to the Edm type system. Queries return up to 1000 entities per request; use `--marker` for pagination. The PartitionKey and RowKey may be up to 64KB each.

# SEE ALSO

[az-storage-table](/man/az-storage-table)(1), [az-storage-queue](/man/az-storage-queue)(1), [az](/man/az)(1)
