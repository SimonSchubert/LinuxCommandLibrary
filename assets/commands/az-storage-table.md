# TLDR

**Create a table**

```az storage table create --name [mytable] --account-name [mystorageaccount]```

**List all tables**

```az storage table list --account-name [mystorageaccount]```

**Delete a table**

```az storage table delete --name [mytable] --account-name [mystorageaccount]```

**Check if table exists**

```az storage table exists --name [mytable] --account-name [mystorageaccount]```

**Generate a SAS token** for a table

```az storage table generate-sas --name [mytable] --permissions [raud] --expiry [2024-12-31] --account-name [mystorageaccount]```

**Show table policy**

```az storage table policy list --table-name [mytable] --account-name [mystorageaccount]```

# SYNOPSIS

**az** **storage** **table** _subcommand_ [_options_]

# SUBCOMMANDS

**create**
> Create a table.

**delete**
> Delete a table.

**list**
> List tables in a storage account.

**exists**
> Check if a table exists.

**generate-sas**
> Generate a shared access signature for a table.

**policy create**
> Create a stored access policy.

**policy delete**
> Delete a stored access policy.

**policy list**
> List stored access policies.

**stats**
> Get table statistics (geo-replication).

# PARAMETERS

**--name** **-n**
> Name of the table.

**--account-name**
> Storage account name.

**--account-key**
> Storage account key.

**--permissions**
> SAS permissions (r=read, a=add, u=update, d=delete).

# DESCRIPTION

**az storage table** manages Azure Table Storage tables. Table Storage is a NoSQL key-value store suitable for storing structured, non-relational data. Tables contain entities (rows) with properties (columns).

Use **az storage entity** commands to manage the data within tables.

# CAVEATS

Requires Azure CLI and valid storage credentials. Table names must follow Azure naming conventions. Tables cannot be renamed; must delete and recreate.

# SEE ALSO

[az-storage-entity](/man/az-storage-entity)(1), [az-storage-queue](/man/az-storage-queue)(1), [az](/man/az)(1)
