# TAGLINE

Manage entities in Azure Table Storage

# TLDR

**Insert an entity** into a table

```az storage entity insert --table-name [MyTable] --entity PartitionKey=[pk] RowKey=[rk] Property=[value] --account-name [mystorageaccount]```

**Query entities** from a table

```az storage entity query --table-name [MyTable] --account-name [mystorageaccount]```

**Query with filter**

```az storage entity query --table-name [MyTable] --filter "PartitionKey eq 'pk'" --account-name [mystorageaccount]```

**Show a specific entity**

```az storage entity show --table-name [MyTable] --partition-key [pk] --row-key [rk] --account-name [mystorageaccount]```

**Delete an entity**

```az storage entity delete --table-name [MyTable] --partition-key [pk] --row-key [rk] --account-name [mystorageaccount]```

**Replace an entity**

```az storage entity replace --table-name [MyTable] --entity PartitionKey=[pk] RowKey=[rk] Property=[newvalue] --account-name [mystorageaccount]```

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

**--table-name** **-t**
> Name of the table.

**--account-name**
> Storage account name.

**--entity** **-e**
> Entity properties as key=value pairs.

**--partition-key**
> Partition key of the entity.

**--row-key**
> Row key of the entity.

**--filter**
> OData filter expression.

# DESCRIPTION

**az storage entity** manages entities in Azure Table Storage. Table Storage is a NoSQL key-value store for structured data. Entities are items stored in tables, similar to rows in a database, identified by PartitionKey and RowKey.

This command works with both Azure Storage accounts and Azure Cosmos DB Table API.

# CAVEATS

Requires Azure CLI and valid storage credentials. Entity properties have type limits. Queries are limited to 1000 entities per request by default.

# SEE ALSO

[az-storage-table](/man/az-storage-table)(1), [az-storage-queue](/man/az-storage-queue)(1), [az](/man/az)(1)
